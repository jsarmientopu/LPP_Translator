// Generated from C:/Users/Sebastian Sarmiento/Documents/LENGUAJES/translator/grammar/LPPLenguage.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LPPLenguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LPPLenguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(LPPLenguageParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(LPPLenguageParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(LPPLenguageParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(LPPLenguageParser.ExpContext ctx);
}