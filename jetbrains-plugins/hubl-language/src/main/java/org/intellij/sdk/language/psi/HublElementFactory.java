// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.intellij.sdk.language.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileFactory;
import org.intellij.sdk.language.HublFileType;

public class HublElementFactory {

  public static HublProperty createProperty(Project project, String name) {
    final HublFile file = createFile(project, name);
    return (HublProperty) file.getFirstChild();
  }

  public static HublFile createFile(Project project, String text) {
    String name = "dummy.Hubl";
    return (HublFile) PsiFileFactory.getInstance(project).createFileFromText(name, HublFileType.INSTANCE, text);
  }

  public static HublProperty createProperty(Project project, String name, String value) {
    final HublFile file = createFile(project, name + " = " + value);
    return (HublProperty) file.getFirstChild();
  }

  public static PsiElement createCRLF(Project project) {
    final HublFile file = createFile(project, "\n");
    return file.getFirstChild();
  }

}
