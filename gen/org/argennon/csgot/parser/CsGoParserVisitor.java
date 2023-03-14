// Generated from java-escape by ANTLR 4.11.1
package org.argennon.csgot.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CsGoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CsGoParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CsGoParser#sourceFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceFile(CsGoParser.SourceFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#packageClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageClause(CsGoParser.PackageClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#importDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDecl(CsGoParser.ImportDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#importSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSpec(CsGoParser.ImportSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#importPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportPath(CsGoParser.ImportPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CsGoParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(CsGoParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#constSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstSpec(CsGoParser.ConstSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(CsGoParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(CsGoParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#typeDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDecl(CsGoParser.TypeDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#typeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpec(CsGoParser.TypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(CsGoParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(CsGoParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#receiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiver(CsGoParser.ReceiverContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(CsGoParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#varSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSpec(CsGoParser.VarSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CsGoParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(CsGoParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CsGoParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStmt(CsGoParser.SimpleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#constraintDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintDecl(CsGoParser.ConstraintDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#expressionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStmt(CsGoParser.ExpressionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#sendStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendStmt(CsGoParser.SendStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#incDecStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecStmt(CsGoParser.IncDecStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CsGoParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#assign_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_op(CsGoParser.Assign_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#shortVarDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortVarDecl(CsGoParser.ShortVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#emptyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStmt(CsGoParser.EmptyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#labeledStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStmt(CsGoParser.LabeledStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(CsGoParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#breakStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(CsGoParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#continueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(CsGoParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#gotoStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStmt(CsGoParser.GotoStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#fallthroughStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFallthroughStmt(CsGoParser.FallthroughStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#deferStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferStmt(CsGoParser.DeferStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(CsGoParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#switchStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStmt(CsGoParser.SwitchStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#exprSwitchStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSwitchStmt(CsGoParser.ExprSwitchStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#exprCaseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseClause(CsGoParser.ExprCaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#exprSwitchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSwitchCase(CsGoParser.ExprSwitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#typeSwitchStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSwitchStmt(CsGoParser.TypeSwitchStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#typeSwitchGuard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSwitchGuard(CsGoParser.TypeSwitchGuardContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#typeCaseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCaseClause(CsGoParser.TypeCaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#typeSwitchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSwitchCase(CsGoParser.TypeSwitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(CsGoParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#selectStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStmt(CsGoParser.SelectStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#commClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommClause(CsGoParser.CommClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#commCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommCase(CsGoParser.CommCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#recvStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecvStmt(CsGoParser.RecvStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(CsGoParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(CsGoParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#rangeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeClause(CsGoParser.RangeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#goStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoStmt(CsGoParser.GoStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#type_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_(CsGoParser.Type_Context ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(CsGoParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#typeLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeLit(CsGoParser.TypeLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(CsGoParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#arrayLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLength(CsGoParser.ArrayLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#elementType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementType(CsGoParser.ElementTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#pointerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerType(CsGoParser.PointerTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(CsGoParser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#sliceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceType(CsGoParser.SliceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#mapType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapType(CsGoParser.MapTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#channelType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelType(CsGoParser.ChannelTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#methodSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodSpec(CsGoParser.MethodSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(CsGoParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature(CsGoParser.SignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(CsGoParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(CsGoParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#parameterDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDecl(CsGoParser.ParameterDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link CsGoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(CsGoParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link CsGoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(CsGoParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Primary}
	 * labeled alternative in {@link CsGoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(CsGoParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Dc}
	 * labeled alternative in {@link CsGoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDc(CsGoParser.DcContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(CsGoParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#conversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversion(CsGoParser.ConversionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#nonNamedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonNamedType(CsGoParser.NonNamedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(CsGoParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CsGoParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#basicLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicLit(CsGoParser.BasicLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(CsGoParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#operandName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperandName(CsGoParser.OperandNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedIdent(CsGoParser.QualifiedIdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#compositeLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompositeLit(CsGoParser.CompositeLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#literalType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralType(CsGoParser.LiteralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#literalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralValue(CsGoParser.LiteralValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(CsGoParser.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#keyedElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyedElement(CsGoParser.KeyedElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(CsGoParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(CsGoParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#structType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructType(CsGoParser.StructTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#fieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecl(CsGoParser.FieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#string_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_(CsGoParser.String_Context ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#embeddedField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmbeddedField(CsGoParser.EmbeddedFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#functionLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionLit(CsGoParser.FunctionLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(CsGoParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#slice_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlice_(CsGoParser.Slice_Context ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#typeAssertion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAssertion(CsGoParser.TypeAssertionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(CsGoParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#methodExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodExpr(CsGoParser.MethodExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#receiverType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverType(CsGoParser.ReceiverTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsGoParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(CsGoParser.EosContext ctx);
}