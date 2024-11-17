# MEMO FOR DEVELOPERS

## Modify Grammar
We change grammar in the [Hubl.bnf](src/main/java/org/intellij/sdk/language/Hubl.bnf) file. 

When this file is modified, we have to ``Generate parser code`` in the contextual menu (the plugin `Grammar-kit` must be installed). We have to remove content of `src/main/gen/org/intellij/sdk/language` before generate parser code.

## Modify lexical (Lexer)
We change lexical in the [Hubl.flex](src/main/java/org/intellij/sdk/language/Hubl.flex) file.

When this file is modified, we have to ``Run Jflex generator`` in the contextual menu (the plugin `Grammar-kit` must be installed). This must be done after generating parser code.  