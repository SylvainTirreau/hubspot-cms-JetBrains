// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package org.intellij.sdk.language;

import com.intellij.application.options.CodeStyle;
import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.codeInsight.documentation.DocumentationManager;
import com.intellij.codeInsight.generation.actions.CommentByLineCommentAction;
import com.intellij.lang.documentation.DocumentationProvider;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.codeStyle.CodeStyleManager;
import com.intellij.testFramework.fixtures.LightJavaCodeInsightFixtureTestCase;
import com.intellij.usageView.UsageInfo;
import org.intellij.sdk.language.psi.HublProperty;

import java.util.Collection;
import java.util.List;

public class HublCodeInsightTest extends LightJavaCodeInsightFixtureTestCase {

  /**
   * @return path to test data file directory relative to working directory in the run configuration for this test.
   */
  @Override
  protected String getTestDataPath() {
    return "src/test/testData";
  }

  public void testCompletion() {
    myFixture.configureByFiles("CompleteTestData.java", "DefaultTestData.Hubl");
    myFixture.complete(CompletionType.BASIC);
    List<String> lookupElementStrings = myFixture.getLookupElementStrings();
    assertNotNull(lookupElementStrings);
    assertSameElements(lookupElementStrings, "key with spaces", "language", "message", "tab", "website");
  }

  public void testAnnotator() {
    myFixture.configureByFiles("AnnotatorTestData.java", "DefaultTestData.Hubl");
    myFixture.checkHighlighting(false, false, true, true);
  }

  public void testFormatter() {
    myFixture.configureByFile("FormatterTestData.Hubl");
    CodeStyle.getLanguageSettings(myFixture.getFile()).SPACE_AROUND_ASSIGNMENT_OPERATORS = true;
    CodeStyle.getLanguageSettings(myFixture.getFile()).KEEP_BLANK_LINES_IN_CODE = 2;
    WriteCommandAction.writeCommandAction(getProject()).run(() ->
        CodeStyleManager.getInstance(getProject()).reformatText(
            myFixture.getFile(),
            List.of(myFixture.getFile().getTextRange())
        )
    );
    myFixture.checkResultByFile("DefaultTestData.Hubl");
  }

  public void testRename() {
    myFixture.configureByFiles("RenameTestData.java", "RenameTestData.Hubl");
    myFixture.renameElementAtCaret("websiteUrl");
    myFixture.checkResultByFile("RenameTestData.Hubl", "RenameTestDataAfter.Hubl", false);
  }

  public void testFolding() {
    myFixture.configureByFile("DefaultTestData.Hubl");
    myFixture.testFolding(getTestDataPath() + "/FoldingTestData.java");
  }

  public void testFindUsages() {
    Collection<UsageInfo> usageInfos = myFixture.testFindUsages("FindUsagesTestData.Hubl", "FindUsagesTestData.java");
    assertEquals(1, usageInfos.size());
  }

  public void testCommenter() {
    myFixture.configureByText(HublFileType.INSTANCE, "<caret>website = https://en.wikipedia.org/");
    CommentByLineCommentAction commentAction = new CommentByLineCommentAction();
    commentAction.actionPerformedImpl(getProject(), myFixture.getEditor());
    myFixture.checkResult("#website = https://en.wikipedia.org/");
    commentAction.actionPerformedImpl(getProject(), myFixture.getEditor());
    myFixture.checkResult("website = https://en.wikipedia.org/");
  }

  public void testReference() {
    PsiReference referenceAtCaret =
        myFixture.getReferenceAtCaretPositionWithAssertion("ReferenceTestData.java", "DefaultTestData.Hubl");
    final HublProperty resolvedHublProperty = assertInstanceOf(referenceAtCaret.resolve(), HublProperty.class);
    assertEquals("https://en.wikipedia.org/", resolvedHublProperty.getValue());
  }

  public void testDocumentation() {
    myFixture.configureByFiles("DocumentationTestData.java", "DocumentationTestData.Hubl");
    final PsiElement originalElement = myFixture.getElementAtCaret();
    PsiElement element = DocumentationManager
        .getInstance(getProject())
        .findTargetElement(myFixture.getEditor(), originalElement.getContainingFile(), originalElement);

    if (element == null) {
      element = originalElement;
    }

    final DocumentationProvider documentationProvider = DocumentationManager.getProviderFromElement(element);
    final String generateDoc = documentationProvider.generateDoc(element, originalElement);
    assertNotNull(generateDoc);
    assertSameLinesWithFile(getTestDataPath() + "/" + "DocumentationTest.html.expected", generateDoc);
  }

}
