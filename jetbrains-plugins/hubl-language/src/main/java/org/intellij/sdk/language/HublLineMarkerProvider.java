// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package org.intellij.sdk.language;

import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo;
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerProvider;
import com.intellij.codeInsight.navigation.NavigationGutterIconBuilder;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLiteralExpression;
import com.intellij.psi.impl.source.tree.java.PsiJavaTokenImpl;
import org.intellij.sdk.language.psi.HublProperty;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;

final class HublLineMarkerProvider extends RelatedItemLineMarkerProvider {

  @Override
  protected void collectNavigationMarkers(@NotNull PsiElement element,
                                          @NotNull Collection<? super RelatedItemLineMarkerInfo<?>> result) {
    // This must be an element with a literal expression as a parent
    if (!(element instanceof PsiJavaTokenImpl) || !(element.getParent() instanceof PsiLiteralExpression literalExpression)) {
      return;
    }

    // The literal expression must start with the Hubl language literal expression
    String value = literalExpression.getValue() instanceof String ? (String) literalExpression.getValue() : null;
    if ((value == null) ||
        !value.startsWith(HublAnnotator.Hubl_PREFIX_STR + HublAnnotator.Hubl_SEPARATOR_STR)) {
      return;
    }

    // Get the Hubl language property usage
    Project project = element.getProject();
    String possibleProperties = value.substring(
        HublAnnotator.Hubl_PREFIX_STR.length() + HublAnnotator.Hubl_SEPARATOR_STR.length()
    );
    final List<HublProperty> properties = HublUtil.findProperties(project, possibleProperties);
    if (!properties.isEmpty()) {
      // Add the property to a collection of line marker info
      NavigationGutterIconBuilder<PsiElement> builder =
          NavigationGutterIconBuilder.create(HublIcons.FILE)
              .setTargets(properties)
              .setTooltipText("Navigate to Hubl language property");
      result.add(builder.createLineMarkerInfo(element));
    }
  }

}
