// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.intellij.sdk.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.sdk.language.psi.HublNamedElement;
import org.jetbrains.annotations.NotNull;

public abstract class HublNamedElementImpl extends ASTWrapperPsiElement implements HublNamedElement {

  public HublNamedElementImpl(@NotNull ASTNode node) {
    super(node);
  }

}
