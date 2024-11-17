// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.sdk.language.psi.impl.*;

public interface HublTypes {

  IElementType PROPERTY = new HublElementType("PROPERTY");

  IElementType COMMENT = new HublTokenType("COMMENT");
  IElementType CRLF = new HublTokenType("CRLF");
  IElementType KEY = new HublTokenType("KEY");
  IElementType SEPARATOR = new HublTokenType("SEPARATOR");
  IElementType VALUE = new HublTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new HublPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
