// Generated from java-escape by ANTLR 4.11.1
package org.argennon.csgot.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CsGoParser}.
 */
public interface CsGoParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CsGoParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void enterSourceFile(CsGoParser.SourceFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void exitSourceFile(CsGoParser.SourceFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#packageClause}.
	 * @param ctx the parse tree
	 */
	void enterPackageClause(CsGoParser.PackageClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#packageClause}.
	 * @param ctx the parse tree
	 */
	void exitPackageClause(CsGoParser.PackageClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void enterImportDecl(CsGoParser.ImportDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void exitImportDecl(CsGoParser.ImportDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#importSpec}.
	 * @param ctx the parse tree
	 */
	void enterImportSpec(CsGoParser.ImportSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#importSpec}.
	 * @param ctx the parse tree
	 */
	void exitImportSpec(CsGoParser.ImportSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#importPath}.
	 * @param ctx the parse tree
	 */
	void enterImportPath(CsGoParser.ImportPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#importPath}.
	 * @param ctx the parse tree
	 */
	void exitImportPath(CsGoParser.ImportPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CsGoParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CsGoParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(CsGoParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(CsGoParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#constSpec}.
	 * @param ctx the parse tree
	 */
	void enterConstSpec(CsGoParser.ConstSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#constSpec}.
	 * @param ctx the parse tree
	 */
	void exitConstSpec(CsGoParser.ConstSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(CsGoParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(CsGoParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(CsGoParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(CsGoParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void enterTypeDecl(CsGoParser.TypeDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void exitTypeDecl(CsGoParser.TypeDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpec(CsGoParser.TypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpec(CsGoParser.TypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(CsGoParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(CsGoParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(CsGoParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(CsGoParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#receiver}.
	 * @param ctx the parse tree
	 */
	void enterReceiver(CsGoParser.ReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#receiver}.
	 * @param ctx the parse tree
	 */
	void exitReceiver(CsGoParser.ReceiverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(CsGoParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(CsGoParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#varSpec}.
	 * @param ctx the parse tree
	 */
	void enterVarSpec(CsGoParser.VarSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#varSpec}.
	 * @param ctx the parse tree
	 */
	void exitVarSpec(CsGoParser.VarSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CsGoParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CsGoParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(CsGoParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(CsGoParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CsGoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CsGoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStmt(CsGoParser.SimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStmt(CsGoParser.SimpleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#constraintDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstraintDecl(CsGoParser.ConstraintDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#constraintDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstraintDecl(CsGoParser.ConstraintDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#expressionStmt}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStmt(CsGoParser.ExpressionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#expressionStmt}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStmt(CsGoParser.ExpressionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#sendStmt}.
	 * @param ctx the parse tree
	 */
	void enterSendStmt(CsGoParser.SendStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#sendStmt}.
	 * @param ctx the parse tree
	 */
	void exitSendStmt(CsGoParser.SendStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#incDecStmt}.
	 * @param ctx the parse tree
	 */
	void enterIncDecStmt(CsGoParser.IncDecStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#incDecStmt}.
	 * @param ctx the parse tree
	 */
	void exitIncDecStmt(CsGoParser.IncDecStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CsGoParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CsGoParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterAssign_op(CsGoParser.Assign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitAssign_op(CsGoParser.Assign_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#shortVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterShortVarDecl(CsGoParser.ShortVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#shortVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitShortVarDecl(CsGoParser.ShortVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#emptyStmt}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStmt(CsGoParser.EmptyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#emptyStmt}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStmt(CsGoParser.EmptyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#labeledStmt}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStmt(CsGoParser.LabeledStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#labeledStmt}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStmt(CsGoParser.LabeledStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(CsGoParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(CsGoParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(CsGoParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(CsGoParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(CsGoParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(CsGoParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#gotoStmt}.
	 * @param ctx the parse tree
	 */
	void enterGotoStmt(CsGoParser.GotoStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#gotoStmt}.
	 * @param ctx the parse tree
	 */
	void exitGotoStmt(CsGoParser.GotoStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#fallthroughStmt}.
	 * @param ctx the parse tree
	 */
	void enterFallthroughStmt(CsGoParser.FallthroughStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#fallthroughStmt}.
	 * @param ctx the parse tree
	 */
	void exitFallthroughStmt(CsGoParser.FallthroughStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#deferStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeferStmt(CsGoParser.DeferStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#deferStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeferStmt(CsGoParser.DeferStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(CsGoParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(CsGoParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#switchStmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStmt(CsGoParser.SwitchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#switchStmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStmt(CsGoParser.SwitchStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#exprSwitchStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprSwitchStmt(CsGoParser.ExprSwitchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#exprSwitchStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprSwitchStmt(CsGoParser.ExprSwitchStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#exprCaseClause}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseClause(CsGoParser.ExprCaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#exprCaseClause}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseClause(CsGoParser.ExprCaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#exprSwitchCase}.
	 * @param ctx the parse tree
	 */
	void enterExprSwitchCase(CsGoParser.ExprSwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#exprSwitchCase}.
	 * @param ctx the parse tree
	 */
	void exitExprSwitchCase(CsGoParser.ExprSwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#typeSwitchStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeSwitchStmt(CsGoParser.TypeSwitchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#typeSwitchStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeSwitchStmt(CsGoParser.TypeSwitchStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#typeSwitchGuard}.
	 * @param ctx the parse tree
	 */
	void enterTypeSwitchGuard(CsGoParser.TypeSwitchGuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#typeSwitchGuard}.
	 * @param ctx the parse tree
	 */
	void exitTypeSwitchGuard(CsGoParser.TypeSwitchGuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#typeCaseClause}.
	 * @param ctx the parse tree
	 */
	void enterTypeCaseClause(CsGoParser.TypeCaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#typeCaseClause}.
	 * @param ctx the parse tree
	 */
	void exitTypeCaseClause(CsGoParser.TypeCaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#typeSwitchCase}.
	 * @param ctx the parse tree
	 */
	void enterTypeSwitchCase(CsGoParser.TypeSwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#typeSwitchCase}.
	 * @param ctx the parse tree
	 */
	void exitTypeSwitchCase(CsGoParser.TypeSwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(CsGoParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(CsGoParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectStmt(CsGoParser.SelectStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectStmt(CsGoParser.SelectStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#commClause}.
	 * @param ctx the parse tree
	 */
	void enterCommClause(CsGoParser.CommClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#commClause}.
	 * @param ctx the parse tree
	 */
	void exitCommClause(CsGoParser.CommClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#commCase}.
	 * @param ctx the parse tree
	 */
	void enterCommCase(CsGoParser.CommCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#commCase}.
	 * @param ctx the parse tree
	 */
	void exitCommCase(CsGoParser.CommCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#recvStmt}.
	 * @param ctx the parse tree
	 */
	void enterRecvStmt(CsGoParser.RecvStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#recvStmt}.
	 * @param ctx the parse tree
	 */
	void exitRecvStmt(CsGoParser.RecvStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(CsGoParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(CsGoParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(CsGoParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(CsGoParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#rangeClause}.
	 * @param ctx the parse tree
	 */
	void enterRangeClause(CsGoParser.RangeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#rangeClause}.
	 * @param ctx the parse tree
	 */
	void exitRangeClause(CsGoParser.RangeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#goStmt}.
	 * @param ctx the parse tree
	 */
	void enterGoStmt(CsGoParser.GoStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#goStmt}.
	 * @param ctx the parse tree
	 */
	void exitGoStmt(CsGoParser.GoStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_(CsGoParser.Type_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_(CsGoParser.Type_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(CsGoParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(CsGoParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#typeLit}.
	 * @param ctx the parse tree
	 */
	void enterTypeLit(CsGoParser.TypeLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#typeLit}.
	 * @param ctx the parse tree
	 */
	void exitTypeLit(CsGoParser.TypeLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(CsGoParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(CsGoParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void enterArrayLength(CsGoParser.ArrayLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void exitArrayLength(CsGoParser.ArrayLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#elementType}.
	 * @param ctx the parse tree
	 */
	void enterElementType(CsGoParser.ElementTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#elementType}.
	 * @param ctx the parse tree
	 */
	void exitElementType(CsGoParser.ElementTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void enterPointerType(CsGoParser.PointerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void exitPointerType(CsGoParser.PointerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(CsGoParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(CsGoParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#sliceType}.
	 * @param ctx the parse tree
	 */
	void enterSliceType(CsGoParser.SliceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#sliceType}.
	 * @param ctx the parse tree
	 */
	void exitSliceType(CsGoParser.SliceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#mapType}.
	 * @param ctx the parse tree
	 */
	void enterMapType(CsGoParser.MapTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#mapType}.
	 * @param ctx the parse tree
	 */
	void exitMapType(CsGoParser.MapTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#channelType}.
	 * @param ctx the parse tree
	 */
	void enterChannelType(CsGoParser.ChannelTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#channelType}.
	 * @param ctx the parse tree
	 */
	void exitChannelType(CsGoParser.ChannelTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#methodSpec}.
	 * @param ctx the parse tree
	 */
	void enterMethodSpec(CsGoParser.MethodSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#methodSpec}.
	 * @param ctx the parse tree
	 */
	void exitMethodSpec(CsGoParser.MethodSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(CsGoParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(CsGoParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(CsGoParser.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(CsGoParser.SignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(CsGoParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(CsGoParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(CsGoParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(CsGoParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#parameterDecl}.
	 * @param ctx the parse tree
	 */
	void enterParameterDecl(CsGoParser.ParameterDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#parameterDecl}.
	 * @param ctx the parse tree
	 */
	void exitParameterDecl(CsGoParser.ParameterDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link CsGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(CsGoParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link CsGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(CsGoParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link CsGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMul(CsGoParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link CsGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMul(CsGoParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Primary}
	 * labeled alternative in {@link CsGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(CsGoParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Primary}
	 * labeled alternative in {@link CsGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(CsGoParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Dc}
	 * labeled alternative in {@link CsGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDc(CsGoParser.DcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Dc}
	 * labeled alternative in {@link CsGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDc(CsGoParser.DcContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(CsGoParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(CsGoParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#conversion}.
	 * @param ctx the parse tree
	 */
	void enterConversion(CsGoParser.ConversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#conversion}.
	 * @param ctx the parse tree
	 */
	void exitConversion(CsGoParser.ConversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#nonNamedType}.
	 * @param ctx the parse tree
	 */
	void enterNonNamedType(CsGoParser.NonNamedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#nonNamedType}.
	 * @param ctx the parse tree
	 */
	void exitNonNamedType(CsGoParser.NonNamedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(CsGoParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(CsGoParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CsGoParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CsGoParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#basicLit}.
	 * @param ctx the parse tree
	 */
	void enterBasicLit(CsGoParser.BasicLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#basicLit}.
	 * @param ctx the parse tree
	 */
	void exitBasicLit(CsGoParser.BasicLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(CsGoParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(CsGoParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#operandName}.
	 * @param ctx the parse tree
	 */
	void enterOperandName(CsGoParser.OperandNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#operandName}.
	 * @param ctx the parse tree
	 */
	void exitOperandName(CsGoParser.OperandNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedIdent(CsGoParser.QualifiedIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedIdent(CsGoParser.QualifiedIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#compositeLit}.
	 * @param ctx the parse tree
	 */
	void enterCompositeLit(CsGoParser.CompositeLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#compositeLit}.
	 * @param ctx the parse tree
	 */
	void exitCompositeLit(CsGoParser.CompositeLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#literalType}.
	 * @param ctx the parse tree
	 */
	void enterLiteralType(CsGoParser.LiteralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#literalType}.
	 * @param ctx the parse tree
	 */
	void exitLiteralType(CsGoParser.LiteralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#literalValue}.
	 * @param ctx the parse tree
	 */
	void enterLiteralValue(CsGoParser.LiteralValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#literalValue}.
	 * @param ctx the parse tree
	 */
	void exitLiteralValue(CsGoParser.LiteralValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(CsGoParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(CsGoParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#keyedElement}.
	 * @param ctx the parse tree
	 */
	void enterKeyedElement(CsGoParser.KeyedElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#keyedElement}.
	 * @param ctx the parse tree
	 */
	void exitKeyedElement(CsGoParser.KeyedElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(CsGoParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(CsGoParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(CsGoParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(CsGoParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#structType}.
	 * @param ctx the parse tree
	 */
	void enterStructType(CsGoParser.StructTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#structType}.
	 * @param ctx the parse tree
	 */
	void exitStructType(CsGoParser.StructTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterFieldDecl(CsGoParser.FieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitFieldDecl(CsGoParser.FieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#string_}.
	 * @param ctx the parse tree
	 */
	void enterString_(CsGoParser.String_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#string_}.
	 * @param ctx the parse tree
	 */
	void exitString_(CsGoParser.String_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#embeddedField}.
	 * @param ctx the parse tree
	 */
	void enterEmbeddedField(CsGoParser.EmbeddedFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#embeddedField}.
	 * @param ctx the parse tree
	 */
	void exitEmbeddedField(CsGoParser.EmbeddedFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#functionLit}.
	 * @param ctx the parse tree
	 */
	void enterFunctionLit(CsGoParser.FunctionLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#functionLit}.
	 * @param ctx the parse tree
	 */
	void exitFunctionLit(CsGoParser.FunctionLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(CsGoParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(CsGoParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#slice_}.
	 * @param ctx the parse tree
	 */
	void enterSlice_(CsGoParser.Slice_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#slice_}.
	 * @param ctx the parse tree
	 */
	void exitSlice_(CsGoParser.Slice_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#typeAssertion}.
	 * @param ctx the parse tree
	 */
	void enterTypeAssertion(CsGoParser.TypeAssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#typeAssertion}.
	 * @param ctx the parse tree
	 */
	void exitTypeAssertion(CsGoParser.TypeAssertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(CsGoParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(CsGoParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#methodExpr}.
	 * @param ctx the parse tree
	 */
	void enterMethodExpr(CsGoParser.MethodExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#methodExpr}.
	 * @param ctx the parse tree
	 */
	void exitMethodExpr(CsGoParser.MethodExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#receiverType}.
	 * @param ctx the parse tree
	 */
	void enterReceiverType(CsGoParser.ReceiverTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#receiverType}.
	 * @param ctx the parse tree
	 */
	void exitReceiverType(CsGoParser.ReceiverTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsGoParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(CsGoParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsGoParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(CsGoParser.EosContext ctx);
}