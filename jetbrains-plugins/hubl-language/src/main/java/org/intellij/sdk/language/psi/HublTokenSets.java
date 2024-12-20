// Copyright 2000-2022 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.TokenSet;

public interface HublTokenSets {

  TokenSet IDENTIFIERS = TokenSet.create(HublTypes.KEY);

  TokenSet COMMENTS = TokenSet.create(HublTypes.COMMENT);

}
