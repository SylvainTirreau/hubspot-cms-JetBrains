// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package org.intellij.sdk.language.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.intellij.sdk.language.psi.HublElementFactory;
import org.intellij.sdk.language.psi.HublProperty;
import org.intellij.sdk.language.psi.HublTypes;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class HublPsiImplUtil {

  public static String getKey(HublProperty element) {
    ASTNode keyNode = element.getNode().findChildByType(HublTypes.KEY);
    if (keyNode != null) {
      // IMPORTANT: Convert embedded escaped spaces to Hubl spaces
      return keyNode.getText().replaceAll("\\\\ ", " ");
    } else {
      return null;
    }
  }

  public static String getValue(HublProperty element) {
    ASTNode valueNode = element.getNode().findChildByType(HublTypes.VALUE);
    if (valueNode != null) {
      return valueNode.getText();
    } else {
      return null;
    }
  }

  public static String getName(HublProperty element) {
    return getKey(element);
  }

  public static PsiElement setName(HublProperty element, String newName) {
    ASTNode keyNode = element.getNode().findChildByType(HublTypes.KEY);
    if (keyNode != null) {
      HublProperty property = HublElementFactory.createProperty(element.getProject(), newName);
      ASTNode newKeyNode = property.getFirstChild().getNode();
      element.getNode().replaceChild(keyNode, newKeyNode);
    }
    return element;
  }

  public static PsiElement getNameIdentifier(HublProperty element) {
    ASTNode keyNode = element.getNode().findChildByType(HublTypes.KEY);
    if (keyNode != null) {
      return keyNode.getPsi();
    } else {
      return null;
    }
  }

  public static ItemPresentation getPresentation(final HublProperty element) {
    return new ItemPresentation() {
      @Nullable
      @Override
      public String getPresentableText() {
        return element.getKey();
      }

      @Nullable
      @Override
      public String getLocationString() {
        PsiFile containingFile = element.getContainingFile();
        return containingFile == null ? null : containingFile.getName();
      }

      @Override
      public Icon getIcon(boolean unused) {
        return element.getIcon(0);
      }
    };
  }

}
