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
import java.nio.file.Files;

public class CsGoTranspiler {
    public static final String GLOBALS_DECLARATIONS_FORMAT =
            "package %s\n" +
                    "\n" +
                    "import (\n" +
                    "\t\"github.com/consensys/gnark/frontend\"\n" +
                    ")\n" +
                    "\n" +
                    "var api frontend.API\n" +
                    "\n" +
                    "func Configure(a frontend.API) {\n" +
                    "\tapi = a\n" +
                    "}\n";
    public static final String GLOBALS_FILE_NAME = "globals.go";

    private final MessageReporter reporter;


    public CsGoTranspiler(MessageReporter reporter) {
        this.reporter = reporter;
    }

    public boolean transpileFile(File input, File output) throws IOException {
        Files.createDirectories(output.getParentFile().toPath());
        try (PrintWriter writer = new PrintWriter(output)) {
            reporter.generalMessage("Parsing " + input + "...");

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

            var globalsFile = new File(output.getParentFile(), GLOBALS_FILE_NAME);
            if (!globalsFile.exists()) {
                reporter.generalMessage("creating " + globalsFile);
                try (var wr = new PrintWriter(globalsFile)) {
                    wr.printf(GLOBALS_DECLARATIONS_FORMAT, listener.packageName);
                }
            }

            reporter.generalMessage("writing to " + output);
            writer.printf("// generated from %s%n%n", input.getName());
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
    private static final String IMPORTS = "import \"github.com/consensys/gnark/frontend\"";
    String packageName;
    TokenStreamRewriter rewriter;
    ParseTreeProperty<String> convertedExpr = new ParseTreeProperty<String>();

    public MainTranspilerListener(TokenStream tokens) {
        rewriter = new TokenStreamRewriter(tokens);
    }

    @Override
    public void enterPackageClause(CsGoParser.PackageClauseContext ctx) {
        packageName = ctx.IDENTIFIER().getText();
        rewriter.insertAfter(ctx.stop, String.format("%n%n%s", IMPORTS));
    }

    @Override
    public void enterTypeName(CsGoParser.TypeNameContext ctx) {
        if (ctx.IDENTIFIER() != null && ctx.IDENTIFIER().getText().equals("csv")) {
            rewriter.replace(ctx.start, ctx.stop, "frontend.Variable");
        }
    }

    @Override
    public void enterAliasType(CsGoParser.AliasTypeContext ctx) {
        rewriter.delete(ctx.AMPERSAND().getSymbol());
    }

    @Override
    public void exitConstraintDecl(CsGoParser.ConstraintDeclContext ctx) {
        var lhs = convertedExpr.get(ctx.expression(0));
        var rhs = convertedExpr.get(ctx.expression(1));
        rewriter.replace(ctx.start, ctx.stop,
                String.format("api.AssertIsEqual(%s, %s)", lhs, rhs));
    }

    @Override
    public void exitAliasing(CsGoParser.AliasingContext ctx) {
        var rhs = convertedExpr.get(ctx.expression());
        rewriter.replace(ctx.ALIAS_ASSIGN().getSymbol(), "=");
        rewriter.replace(ctx.expression().start, ctx.expression().stop, rhs);
    }

    @Override
    public void exitShortAliasDecl(CsGoParser.ShortAliasDeclContext ctx) {
        rewriter.replace(ctx.DECLARE_ALIAS().getSymbol(), ":=");
        for (CsGoParser.ExpressionContext expression : ctx.expressionList().expression()) {
            rewriter.replace(expression.start, expression.stop, convertedExpr.get(expression));
        }
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
        var args = ctx.primaryExpr().templateAndArgs();
        if (operand != null) {
            convertedExpr.put(ctx, convertedExpr.get(operand));
        } else if (args != null) {
            convertedExpr.put(ctx, String.format("%s(%s)",
                    ctx.primaryExpr().primaryExpr().getText(), convertedExpr.get(args)));
        } else {
            convertedExpr.put(ctx, ctx.getText());
        }
    }

    @Override
    public void exitTemplateAndArgs(CsGoParser.TemplateAndArgsContext ctx) {
        if (ctx.templates() == null) {
            convertedExpr.put(ctx, ctx.getText());
            return;
        }

        var templateArgs = ctx.templates().argList();
        var args = ctx.arguments().argList();
        String converted;
        if (templateArgs != null && args != null) {
            converted = String.format("%s, %s", templateArgs.getText(), args.getText());
        } else if (templateArgs != null) {
            converted = templateArgs.getText();
        } else if (args != null) {
            converted = args.getText();
        } else {
            converted = "";
        }
        convertedExpr.put(ctx, converted);
        // we need to also rewrite, in case convertedExpr is not used at upper nodes.
        rewriter.replace(ctx.start, ctx.stop, String.format("(%s)", converted));
    }

    @Override
    public void exitRelationDecl(CsGoParser.RelationDeclContext ctx) {
        rewriter.replace(ctx.REL().getSymbol(), "func");
        rewriter.insertAfter(ctx.IDENTIFIER().getSymbol(), "(");
        if (ctx.templateParams() != null) {
            rewriter.delete(ctx.templateParams().LESS().getSymbol());
            rewriter.replace(ctx.templateParams().GREATER().getSymbol(), ", ");
        }
        rewriter.delete(ctx.parameters().L_PAREN().getSymbol());
    }

    @Override
    public void exitHintCall(CsGoParser.HintCallContext ctx) {
        rewriter.replace(ctx.start, ctx.stop,
                String.format("%s, _ = api.Compiler().NewHint(%s, %s)",
                        ctx.identifierList().getText(),
                        ctx.IDENTIFIER().getText(),
                        convertedExpr.get(ctx.templateAndArgs())
                )
        );
    }
}
