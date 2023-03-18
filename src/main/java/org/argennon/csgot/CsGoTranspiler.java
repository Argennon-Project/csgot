package org.argennon.csgot;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
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

            // create standard walker
            ParseTreeWalker walker = new ParseTreeWalker();
            var listener = new MainTranspilerListener(tokens);
            // initiate walk of tree with listener
            walker.walk(listener, tree);

            writer.println("// generated from " + input.getName());
            // print back ALTERED stream
            writer.println(listener.rewriter.getText());
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

class MainTranspilerListener extends CsGoParserBaseListener {
    TokenStreamRewriter rewriter;
    ParseTreeProperty<String> convertedExpr = new ParseTreeProperty<String>();

    public MainTranspilerListener(TokenStream tokens) {
        rewriter = new TokenStreamRewriter(tokens);
    }

    @Override
    public void enterTypeName(CsGoParser.TypeNameContext ctx) {
        if (ctx.IDENTIFIER() != null && ctx.IDENTIFIER().getText().equals("csv")) {
            rewriter.replace(ctx.start, ctx.stop, "frontend.Variable");
        }
    }

    @Override
    public void exitConstraintDecl(CsGoParser.ConstraintDeclContext ctx) {
        var lhs = convertedExpr.get(ctx.expression(0));
        var rhs = convertedExpr.get(ctx.expression(1));
        rewriter.replace(ctx.start, ctx.stop,
                String.format("api.AssertIsEqual(%s, %s)", lhs, rhs));
    }

    @Override
    public void exitAdd(CsGoParser.AddContext ctx) {
        var lhs = convertedExpr.get(ctx.expression(0));
        var rhs = convertedExpr.get(ctx.expression(1));

        if (ctx.add_op.getType() == CsGoParser.PLUS) {
            convertedExpr.put(ctx, String.format("api.Add(%s, %s)", lhs, rhs));
        } else if (ctx.add_op.getType() == CsGoParser.MINUS) {
            convertedExpr.put(ctx, String.format("api.Sub(%s, %s)", lhs, rhs));
        }
    }

    @Override
    public void exitMul(CsGoParser.MulContext ctx) {
        var lhs = convertedExpr.get(ctx.expression(0));
        var rhs = convertedExpr.get(ctx.expression(1));
        if (ctx.mul_op.getType() == CsGoParser.STAR)
            convertedExpr.put(ctx, String.format("api.Mul(%s, %s)", lhs, rhs));
    }

    @Override
    public void exitOperand(CsGoParser.OperandContext ctx) {
        var expr = ctx.expression();
        if (expr != null) {
            convertedExpr.put(ctx, convertedExpr.get(expr));
        } else {
            convertedExpr.put(ctx, ctx.getText());
        }
    }

    @Override
    public void exitPrimary(CsGoParser.PrimaryContext ctx) {
        var operand = ctx.primaryExpr().operand();
        if (operand != null) {
            convertedExpr.put(ctx, convertedExpr.get(operand));
        } else {
            convertedExpr.put(ctx, ctx.getText());
        }
    }

    @Override
    public void exitRelationDecl(CsGoParser.RelationDeclContext ctx) {
        rewriter.replace(ctx.REL().getSymbol(), "func");
        rewriter.replace(ctx.templates().LESS().getSymbol(), "(");
        rewriter.delete(ctx.templates().GREATER().getSymbol());
        rewriter.replace(ctx.parameters().L_PAREN().getSymbol(), ", ");
    }
}
