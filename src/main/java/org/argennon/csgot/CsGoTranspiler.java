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
import java.util.ArrayList;
import java.util.List;

public class CsGoTranspiler {
    private static final String COMMON_IMPORTS = "" +
            "\t\"apm/csgo/api\"\n" +     //TODO: this needs to be changed
            "\t\"github.com/consensys/gnark/frontend\"\n";
    private static final String HINT_IMPORT = "\t\"github.com/consensys/gnark/backend/hint\"\n";
    private static final String HINT_REGISTER_FORMAT = "hint.Register(%s)\n";
    public static final String PKG_CONFIG_FILE_NAME = "globals.go";

    private final MessageReporter reporter;
    private String srcRoot, dstRoot;


    public CsGoTranspiler(MessageReporter reporter) {
        this.reporter = reporter;
    }


    public boolean transpileAll(String srcRoot, String dstRoot) throws IOException {
        this.srcRoot = srcRoot;
        this.dstRoot = dstRoot;
        return transpileDir(new File(srcRoot), new File(dstRoot));
    }

    private boolean transpileDir(File srcDir, File dstDir) throws IOException {
        var files = srcDir.listFiles();
        if (files == null) throw new IOException(srcDir + " is not a valid directory");

        boolean error = false;
        for (File f : files) {
            if (f.isDirectory()) {
                error |= transpileDir(f, new File(dstDir, f.getName()));
            } else if (f.isFile() && f.getName().endsWith(".csgo")) {
                error |= transpileFile(
                        f,
                        new File(dstDir, f.getName().replace(".csgo", ".go"))
                );
            }
        }
        return error;
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
            var listener = new MainTranspilerListener(tokens, srcRoot, dstRoot);
            // initiate walk of tree with listener
            walker.walk(listener, tree);

            var pkgConfigFile = new File(output.getParentFile(), PKG_CONFIG_FILE_NAME);
            if (!pkgConfigFile.exists()) {
                reporter.generalMessage("no config: " + pkgConfigFile);
            }

            StringBuilder hintRegistrations = new StringBuilder();
            for (String hint : listener.hints) {
                hintRegistrations.append("\t").append(String.format(HINT_REGISTER_FORMAT, hint));
            }

            reporter.generalMessage("writing to " + output);
            writer.printf("// generated from %s\n\n", input.getName());
            writer.printf("package %s\n\n", listener.packageName);
            writer.printf("import (\n%s%s)",
                    COMMON_IMPORTS,
                    hintRegistrations.length() > 0 ? HINT_IMPORT : ""
            );
            // print back ALTERED stream
            writer.println(listener.rewriter.getText());
            if (hintRegistrations.length() > 0) writer.printf("func init() {\n%s}\n", hintRegistrations);

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
    public static final String EQUAL_FORMAT = "api.AssertIsEqual(%s, %s)";
    public static final String ADD_FORMAT = "api.Add(%s, %s)";
    public static final String SUB_FORMAT = "api.Sub(%s, %s)";
    public static final String MUL_FORMAT = "api.Mul(%s, %s)";
    public static final String HINT_CALL_FORMAT = "%s, _ = api.Compiler().NewHint(%s, %s)";
    public static final String CSV_TYPE = "frontend.Variable";
    String packageName;
    List<String> hints = new ArrayList<>();
    TokenStreamRewriter rewriter;
    private final String srcImportPattern, dstImportPattern;
    ParseTreeProperty<String> convertedExpr = new ParseTreeProperty<>();

    public MainTranspilerListener(TokenStream tokens, String srcImportPattern, String dstImportPattern) {
        rewriter = new TokenStreamRewriter(tokens);
        this.srcImportPattern = srcImportPattern;
        this.dstImportPattern = dstImportPattern;
    }

    @Override
    public void enterPackageClause(CsGoParser.PackageClauseContext ctx) {
        packageName = ctx.IDENTIFIER().getText();
        rewriter.delete(ctx.start, ctx.stop);
    }

    @Override
    public void exitImportPath(CsGoParser.ImportPathContext ctx) {
        rewriter.replace(ctx.start, ctx.stop,
                ctx.string_().getText().replaceFirst(srcImportPattern, dstImportPattern));
    }

    @Override
    public void enterTypeName(CsGoParser.TypeNameContext ctx) {
        if (ctx.IDENTIFIER() != null && ctx.IDENTIFIER().getText().equals("csv")) {
            rewriter.replace(ctx.start, ctx.stop, CSV_TYPE);
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
                String.format(EQUAL_FORMAT, lhs, rhs));
    }

    @Override
    public void exitAliasing(CsGoParser.AliasingContext ctx) {
        var rhs = convertedExpr.get(ctx.expression());
        rewriter.replace(ctx.ALIAS_ASSIGN().getSymbol(), "=");
        rewriter.replace(ctx.expression().start, ctx.expression().stop, rhs);
    }

    @Override
    public void exitCsvInit(CsGoParser.CsvInitContext ctx) {
        rewriter.replace(ctx.ALIAS_ASSIGN().getSymbol(), "=");
        for (var expression : ctx.expressionList().expression()) {
            rewriter.replace(expression.start, expression.stop, convertedExpr.get(expression));
        }
    }

    @Override
    public void exitAdd(CsGoParser.AddContext ctx) {
        var lhs = convertedExpr.get(ctx.expression(0));
        var rhs = convertedExpr.get(ctx.expression(1));

        if (ctx.add_op.getType() == CsGoParser.PLUS) {
            convertedExpr.put(ctx, String.format(ADD_FORMAT, lhs, rhs));
        } else if (ctx.add_op.getType() == CsGoParser.MINUS) {
            convertedExpr.put(ctx, String.format(SUB_FORMAT, lhs, rhs));
        }
    }

    @Override
    public void exitMul(CsGoParser.MulContext ctx) {
        var lhs = convertedExpr.get(ctx.expression(0));
        var rhs = convertedExpr.get(ctx.expression(1));
        if (ctx.mul_op.getType() == CsGoParser.STAR)
            convertedExpr.put(ctx, String.format(MUL_FORMAT, lhs, rhs));
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
    public void exitExpressionList(CsGoParser.ExpressionListContext ctx) {
        var str = new StringBuilder();
        for (var expr : ctx.expression()) {
            if (str.length() != 0) str.append(", ");
            str.append(convertedExpr.get(expr));
        }
        convertedExpr.put(ctx, str.toString());
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

        var converted = new StringBuilder();

        var templateArgs = ctx.templates().argList();
        if (templateArgs != null) {
            converted.append(templateArgs.getText());
        }

        var args = ctx.arguments().argList();
        if (args != null) {
            if (converted.length() != 0) converted.append(", ");
            if (args.ELLIPSIS() != null || args.nonNamedType() != null) {
                converted.append(args.getText());
            } else {
                converted.append(convertedExpr.get(args.expressionList()));
            }
        }
        convertedExpr.put(ctx, converted.toString());
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
    public void exitHintDecl(CsGoParser.HintDeclContext ctx) {
        hints.add(ctx.IDENTIFIER().getText());
        rewriter.replace(ctx.HINT().getSymbol(), "func");
    }

    @Override
    public void exitHintCall(CsGoParser.HintCallContext ctx) {
        rewriter.replace(ctx.start, ctx.stop,
                String.format(HINT_CALL_FORMAT,
                        ctx.identifierList().getText(),
                        ctx.IDENTIFIER().getText(),
                        convertedExpr.get(ctx.templateAndArgs())
                )
        );
    }
}
