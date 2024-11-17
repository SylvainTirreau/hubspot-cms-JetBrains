// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package org.intellij.sdk.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public final class HublFileType extends LanguageFileType {

  public static final HublFileType INSTANCE = new HublFileType();

  private HublFileType() {
    super(HublLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public String getName() {
    return "Hubl File";
  }

  @NotNull
  @Override
  public String getDescription() {
    return "Hubl language file";
  }

  @NotNull
  @Override
  public String getDefaultExtension() {
    return "Hubl";
  }

  @Override
  public Icon getIcon() {
    return HublIcons.FILE;
  }

}
