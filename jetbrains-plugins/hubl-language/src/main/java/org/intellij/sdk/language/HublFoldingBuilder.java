// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package org.intellij.sdk.language;

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingBuilderEx;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.FoldingGroup;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.psi.JavaRecursiveElementWalkingVisitor;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLiteralExpression;
import com.intellij.psi.util.PsiLiteralUtil;
import com.intellij.util.containers.ContainerUtil;
import org.intellij.sdk.language.psi.HublProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class HublFoldingBuilder extends FoldingBuilderEx implements DumbAware {

  @Override
  public FoldingDescriptor @NotNull [] buildFoldRegions(@NotNull PsiElement root,
                                                        @NotNull Document document,
                                                        boolean quick) {
    // Initialize the group of folding regions that will expand/collapse together.
    FoldingGroup group = FoldingGroup.newGroup(HublAnnotator.Hubl_PREFIX_STR);
    // Initialize the list of folding regions
    List<FoldingDescriptor> descriptors = new ArrayList<>();

    root.accept(new JavaRecursiveElementWalkingVisitor() {

      @Override
      public void visitLiteralExpression(@NotNull PsiLiteralExpression literalExpression) {
        super.visitLiteralExpression(literalExpression);

        String value = PsiLiteralUtil.getStringLiteralContent(literalExpression);
        if (value != null &&
            value.startsWith(HublAnnotator.Hubl_PREFIX_STR + HublAnnotator.Hubl_SEPARATOR_STR)) {
          Project project = literalExpression.getProject();
          String key = value.substring(
              HublAnnotator.Hubl_PREFIX_STR.length() + HublAnnotator.Hubl_SEPARATOR_STR.length()
          );
          // find HublProperty for the given key in the project
          HublProperty HublProperty = ContainerUtil.getOnlyItem(HublUtil.findProperties(project, key));
          if (HublProperty != null) {
            // Add a folding descriptor for the literal expression at this node.
            descriptors.add(new FoldingDescriptor(literalExpression.getNode(),
                new TextRange(literalExpression.getTextRange().getStartOffset() + 1,
                    literalExpression.getTextRange().getEndOffset() - 1),
                group, Collections.singleton(HublProperty)));
          }
        }
      }
    });

    return descriptors.toArray(FoldingDescriptor.EMPTY_ARRAY);
  }

  /**
   * Gets the Hubl Language 'value' string corresponding to the 'key'
   *
   * @param node Node corresponding to PsiLiteralExpression containing a string in the format
   *             Hubl_PREFIX_STR + Hubl_SEPARATOR_STR + Key, where Key is
   *             defined by the Hubl language file.
   */
  @Nullable
  @Override
  public String getPlaceholderText(@NotNull ASTNode node) {
    if (node.getPsi() instanceof PsiLiteralExpression psiLiteralExpression) {
      String text = PsiLiteralUtil.getStringLiteralContent(psiLiteralExpression);
      if (text == null) {
        return null;
      }

      String key = text.substring(HublAnnotator.Hubl_PREFIX_STR.length() +
          HublAnnotator.Hubl_SEPARATOR_STR.length());

      HublProperty HublProperty = ContainerUtil.getOnlyItem(
          HublUtil.findProperties(psiLiteralExpression.getProject(), key)
      );
      if (HublProperty == null) {
        return StringUtil.THREE_DOTS;
      }

      String propertyValue = HublProperty.getValue();
      // IMPORTANT: keys can come with no values, so a test for null is needed
      // IMPORTANT: Convert embedded \n to backslash n, so that the string will look
      // like it has LF embedded in it and embedded " to escaped "
      if (propertyValue == null) {
        return StringUtil.THREE_DOTS;
      }

      return propertyValue
          .replaceAll("\n", "\\n")
          .replaceAll("\"", "\\\\\"");
    }

    return null;
  }

  @Override
  public boolean isCollapsedByDefault(@NotNull ASTNode node) {
    return true;
  }

}
