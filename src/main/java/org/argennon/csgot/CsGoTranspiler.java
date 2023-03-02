package org.argennon.csgot;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.argennon.csgot.parser.CsGoLexer;
import org.argennon.csgot.parser.CsGoParser;
import org.argennon.csgot.parser.CsGoParserBaseListener;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CsGoTranspiler {
    private final MessageReporter reporter;

    public CsGoTranspiler(MessageReporter reporter) {
        this.reporter = reporter;
    }

    public boolean transpileFile(File input, File output) throws IOException {
        reporter.generalMessage("Parsing " + input + "...");
        try (PrintWriter writer = new PrintWriter(output)) {
            // create a lexer that feeds off of input CharStream
            var lexer = new CsGoLexer(CharStreams.fromPath(input.toPath()));
            lexer.addErrorListener(new ErrorTerminator());

            // create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // create a parser that feeds off the tokens buffer
            var parser = new CsGoParser(tokens);
            parser.addErrorListener(new ErrorTerminator());

            // begin parsing at initial rule and store the generated parse tree.
            var tree = parser.sourceFile();

            ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
            var inserter = new InsertNameSpaceListener(tokens);
            walker.walk(inserter, tree); // initiate walk of tree with listener

            writer.println("// generated from " + input.getName());
            // print back ALTERED stream
            writer.println(inserter.rewriter.getText());
            return true;
        } catch (RuntimeException err) {
            System.err.println(err.getMessage() + ".");
            return false;
        }
    }
}

class ErrorTerminator extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                            int charPositionInLine, String msg, RecognitionException e) {
        throw new RuntimeException("syntax or lexical error");
    }
}

class InsertNameSpaceListener extends CsGoParserBaseListener {
    TokenStreamRewriter rewriter;

    public InsertNameSpaceListener(TokenStream tokens) {
        rewriter = new TokenStreamRewriter(tokens);
    }
}