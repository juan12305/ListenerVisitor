// Generated from MiGramatica.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiGramaticaParser}.
 */
public interface MiGramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MiGramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MiGramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(MiGramaticaParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(MiGramaticaParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link MiGramaticaParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(MiGramaticaParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link MiGramaticaParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(MiGramaticaParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#inicializacion}.
	 * @param ctx the parse tree
	 */
	void enterInicializacion(MiGramaticaParser.InicializacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#inicializacion}.
	 * @param ctx the parse tree
	 */
	void exitInicializacion(MiGramaticaParser.InicializacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(MiGramaticaParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(MiGramaticaParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#actualizacion}.
	 * @param ctx the parse tree
	 */
	void enterActualizacion(MiGramaticaParser.ActualizacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#actualizacion}.
	 * @param ctx the parse tree
	 */
	void exitActualizacion(MiGramaticaParser.ActualizacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link MiGramaticaParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAssign(MiGramaticaParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link MiGramaticaParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAssign(MiGramaticaParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link MiGramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MiGramaticaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link MiGramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MiGramaticaParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MiGramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(MiGramaticaParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MiGramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(MiGramaticaParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MiGramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(MiGramaticaParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MiGramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(MiGramaticaParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link MiGramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterParens(MiGramaticaParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link MiGramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitParens(MiGramaticaParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link MiGramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterInt(MiGramaticaParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link MiGramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitInt(MiGramaticaParser.IntContext ctx);
}