// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.intellij.sdk.language;

import com.google.common.collect.Lists;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiComment;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiManager;
import com.intellij.psi.PsiWhiteSpace;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import org.intellij.sdk.language.psi.HublFile;
import org.intellij.sdk.language.psi.HublProperty;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class HublUtil {

  /**
   * Searches the entire project for Hubl language files with instances of the Hubl property with the given key.
   *
   * @param project current project
   * @param key     to check
   * @return matching properties
   */
  public static List<HublProperty> findProperties(Project project, String key) {
    List<HublProperty> result = new ArrayList<>();
    Collection<VirtualFile> virtualFiles =
        FileTypeIndex.getFiles(HublFileType.INSTANCE, GlobalSearchScope.allScope(project));
    for (VirtualFile virtualFile : virtualFiles) {
      HublFile HublFile = (HublFile) PsiManager.getInstance(project).findFile(virtualFile);
      if (HublFile != null) {
        HublProperty[] properties = PsiTreeUtil.getChildrenOfType(HublFile, HublProperty.class);
        if (properties != null) {
          for (HublProperty property : properties) {
            if (key.equals(property.getKey())) {
              result.add(property);
            }
          }
        }
      }
    }
    return result;
  }

  public static List<HublProperty> findProperties(Project project) {
    List<HublProperty> result = new ArrayList<>();
    Collection<VirtualFile> virtualFiles =
        FileTypeIndex.getFiles(HublFileType.INSTANCE, GlobalSearchScope.allScope(project));
    for (VirtualFile virtualFile : virtualFiles) {
      HublFile HublFile = (HublFile) PsiManager.getInstance(project).findFile(virtualFile);
      if (HublFile != null) {
        HublProperty[] properties = PsiTreeUtil.getChildrenOfType(HublFile, HublProperty.class);
        if (properties != null) {
          Collections.addAll(result, properties);
        }
      }
    }
    return result;
  }

  /**
   * Attempts to collect any comment elements above the Hubl key/value pair.
   */
  public static @NotNull String findDocumentationComment(HublProperty property) {
    List<String> result = new LinkedList<>();
    PsiElement element = property.getPrevSibling();
    while (element instanceof PsiComment || element instanceof PsiWhiteSpace) {
      if (element instanceof PsiComment) {
        String commentText = element.getText().replaceFirst("[!# ]+", "");
        result.add(commentText);
      }
      element = element.getPrevSibling();
    }
    return StringUtil.join(Lists.reverse(result), "\n ");
  }

}
