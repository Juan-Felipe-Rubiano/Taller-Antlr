// Generated from Milenguaje.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MilenguajeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MilenguajeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MilenguajeParser#codigo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodigo(MilenguajeParser.CodigoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(MilenguajeParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilenguajeParser#declrVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclrVar(MilenguajeParser.DeclrVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilenguajeParser#asigVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigVar(MilenguajeParser.AsigVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilenguajeParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(MilenguajeParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilenguajeParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(MilenguajeParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilenguajeParser#instrIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrIf(MilenguajeParser.InstrIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilenguajeParser#instrFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrFor(MilenguajeParser.InstrForContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilenguajeParser#instrWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrWhile(MilenguajeParser.InstrWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilenguajeParser#instrReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrReturn(MilenguajeParser.InstrReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilenguajeParser#declrFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclrFun(MilenguajeParser.DeclrFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilenguajeParser#llamarFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamarFun(MilenguajeParser.LlamarFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(MilenguajeParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilenguajeParser#exprLogico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogico(MilenguajeParser.ExprLogicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilenguajeParser#exprAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd(MilenguajeParser.ExprAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilenguajeParser#exprIgualdad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIgualdad(MilenguajeParser.ExprIgualdadContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilenguajeParser#exprRel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRel(MilenguajeParser.ExprRelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilenguajeParser#exprSuma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSuma(MilenguajeParser.ExprSumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilenguajeParser#exprMult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMult(MilenguajeParser.ExprMultContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilenguajeParser#exprPot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPot(MilenguajeParser.ExprPotContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilenguajeParser#exprUn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUn(MilenguajeParser.ExprUnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilenguajeParser#exprResto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprResto(MilenguajeParser.ExprRestoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilenguajeParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(MilenguajeParser.TipoContext ctx);
}