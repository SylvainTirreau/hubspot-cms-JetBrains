// Copyright 2000-2023 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.intellij.sdk.language;

import com.intellij.codeInspection.ProblemHighlightType;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLiteralExpression;
import org.intellij.sdk.language.psi.HublProperty;
import org.jetbrains.annotations.NotNull;

import java.util.List;

final class HublAnnotator implements Annotator {

  // Define strings for the Hubl language prefix - used for annotations, line markers, etc.
  public static final String Hubl_PREFIX_STR = "Hubl";
  public static final String Hubl_SEPARATOR_STR = ":";

  @Override
  public void annotate(@NotNull final PsiElement element, @NotNull AnnotationHolder holder) {
    // Ensure the PSI Element is an expression
    if (!(element instanceof PsiLiteralExpression literalExpression)) {
      return;
    }

    // Ensure the PSI element contains a string that starts with the prefix and separator
    String value = literalExpression.getValue() instanceof String ? (String) literalExpression.getValue() : null;
    if (value == null || !value.startsWith(Hubl_PREFIX_STR + Hubl_SEPARATOR_STR)) {
      return;
    }

    // Define the text ranges (start is inclusive, end is exclusive)
    // "Hubl:key"
    //  01234567890
    TextRange prefixRange = TextRange.from(element.getTextRange().getStartOffset(), Hubl_PREFIX_STR.length() + 1);
    TextRange separatorRange = TextRange.from(prefixRange.getEndOffset(), Hubl_SEPARATOR_STR.length());
    TextRange keyRange = new TextRange(separatorRange.getEndOffset(), element.getTextRange().getEndOffset() - 1);

    // highlight "Hubl" prefix and ":" separator
    holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
        .range(prefixRange).textAttributes(DefaultLanguageHighlighterColors.KEYWORD).create();
    holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
        .range(separatorRange).textAttributes(HublSyntaxHighlighter.SEPARATOR).create();


    // Get the list of properties for given key
    String key = value.substring(Hubl_PREFIX_STR.length() + Hubl_SEPARATOR_STR.length());
    List<HublProperty> properties = HublUtil.findProperties(element.getProject(), key);
    if (properties.isEmpty()) {
      holder.newAnnotation(HighlightSeverity.ERROR, "Unresolved property")
          .range(keyRange)
          .highlightType(ProblemHighlightType.LIKE_UNKNOWN_SYMBOL)
          // ** Tutorial step 19. - Add a quick fix for the string containing possible properties
          .withFix(new HublCreatePropertyQuickFix(key))
          .create();
    } else {
      // Found at least one property, force the text attributes to Hubl syntax value character
      holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
          .range(keyRange).textAttributes(HublSyntaxHighlighter.VALUE).create();
    }
  }

}
