# Hubl Language Sample [![JetBrains IntelliJ Platform SDK Docs](https://jb.gg/badges/docs.svg)][docs]
*Reference: [Custom Language Support Tutorial in IntelliJ SDK Docs][docs:custom_language_support_tutorial]*

## Quickstart

Defines a new language, _Hubl language_ with support for syntax highlighting, annotations, code completion, and other features.

### Extension Points

| Name                                          | Implementation                                                                          | Extension Point Class               |
|-----------------------------------------------|-----------------------------------------------------------------------------------------|-------------------------------------|
| `com.intellij.fileType`                       | [HublFileType][file:HublFileType]                                                   | `LanguageFileType`                  |
| `com.intellij.lang.parserDefinition`          | [HublParserDefinition][file:HublParserDefinition]                                   | `ParserDefinition`                  |
| `com.intellij.lang.syntaxHighlighterFactory`  | [HublSyntaxHighlighterFactory][file:HublSyntaxHighlighterFactory]                   | `SyntaxHighlighterFactory`          |
| `com.intellij.colorSettingsPage`              | [HublColorSettingsPage][file:HublColorSettingsPage]                                 | `ColorSettingsPage`                 |
| `com.intellij.annotator`                      | [HublAnnotator][file:HublAnnotator]                                                 | `Annotator`                         |
| `com.intellij.codeInsight.lineMarkerProvider` | [HublLineMarkerProvider][file:HublLineMarkerProvider]                               | `RelatedItemLineMarkerProvider`     |
| `com.intellij.completion.contributor`         | [HublCompletionContributor][file:HublCompletionContributor]                         | `CompletionContributor`             |
| `com.intellij.psi.referenceContributor`       | [HublReferenceContributor][file:HublReferenceContributor]                           | `PsiReferenceContributor`           |
| `com.intellij.lang.refactoringSupport`        | [HublRefactoringSupportProvider][file:HublRefactoringSupportProvider]               | `RefactoringSupportProvider`        |
| `com.intellij.lang.findUsagesProvider`        | [HublFindUsagesProvider][file:HublFindUsagesProvider]                               | `FindUsagesProvider`                |
| `com.intellij.lang.foldingBuilder`            | [HublFoldingBuilder][file:HublFoldingBuilder]                                       | `FoldingBuilderEx`                  |
| `com.intellij.gotoSymbolContributor`          | [HublChooseByNameContributor][file:HublChooseByNameContributor]                     | `ChooseByNameContributor`           |
| `com.intellij.lang.psiStructureViewFactory`   | [HublStructureViewFactory][file:HublStructureViewFactory]                           | `PsiStructureViewFactory`           |
| `com.intellij.lang.formatter`                 | [HublFormattingModelBuilder][file:HublFormattingModelBuilder]                       | `FormattingModelBuilder`            |
| `com.intellij.codeStyleSettingsProvider`      | [HublCodeStyleSettingsProvider][file:HublCodeStyleSettingsProvider]                 | `CodeStyleSettingsProvider`         |
| `com.intellij.langCodeStyleSettingsProvider`  | [HublLanguageCodeStyleSettingsProvider][file:HublLanguageCodeStyleSettingsProvider] | `LanguageCodeStyleSettingsProvider` |
| `com.intellij.lang.commenter`                 | [HublCommenter][file:HublCommenter]                                                 | `Commenter`                         |

*Reference: [Plugin Extension Points in IntelliJ SDK Docs][docs:ep]*


[docs]: https://plugins.jetbrains.com/docs/intellij/
[docs:custom_language_support_tutorial]: https://plugins.jetbrains.com/docs/intellij/custom-language-support-tutorial.html
[docs:ep]: https://plugins.jetbrains.com/docs/intellij/plugin-extensions.html

[file:HublFileType]: ./src/main/java/org/intellij/sdk/language/HublFileType.java
[file:HublParserDefinition]: ./src/main/java/org/intellij/sdk/language/HublParserDefinition.java
[file:HublSyntaxHighlighterFactory]: ./src/main/java/org/intellij/sdk/language/HublSyntaxHighlighterFactory.java
[file:HublColorSettingsPage]: ./src/main/java/org/intellij/sdk/language/HublColorSettingsPage.java
[file:HublAnnotator]: ./src/main/java/org/intellij/sdk/language/HublAnnotator.java
[file:HublLineMarkerProvider]: ./src/main/java/org/intellij/sdk/language/HublLineMarkerProvider.java
[file:HublCompletionContributor]: ./src/main/java/org/intellij/sdk/language/HublCompletionContributor.java
[file:HublReferenceContributor]: ./src/main/java/org/intellij/sdk/language/HublReferenceContributor.java
[file:HublRefactoringSupportProvider]: ./src/main/java/org/intellij/sdk/language/HublRefactoringSupportProvider.java
[file:HublFindUsagesProvider]: ./src/main/java/org/intellij/sdk/language/HublFindUsagesProvider.java
[file:HublFoldingBuilder]: ./src/main/java/org/intellij/sdk/language/HublFoldingBuilder.java
[file:HublChooseByNameContributor]: ./src/main/java/org/intellij/sdk/language/HublChooseByNameContributor.java
[file:HublStructureViewFactory]: ./src/main/java/org/intellij/sdk/language/HublStructureViewFactory.java
[file:HublFormattingModelBuilder]: ./src/main/java/org/intellij/sdk/language/HublFormattingModelBuilder.java
[file:HublCodeStyleSettingsProvider]: ./src/main/java/org/intellij/sdk/language/HublCodeStyleSettingsProvider.java
[file:HublLanguageCodeStyleSettingsProvider]: ./src/main/java/org/intellij/sdk/language/HublLanguageCodeStyleSettingsProvider.java
[file:HublCommenter]: ./src/main/java/org/intellij/sdk/language/HublCommenter.java

