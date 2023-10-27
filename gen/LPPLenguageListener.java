// Generated from C:/Users/Sebastian Sarmiento/Documents/LENGUAJES/translator/grammar/LPPLenguage.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LPPLenguageParser}.
 */
public interface LPPLenguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(LPPLenguageParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(LPPLenguageParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(LPPLenguageParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(LPPLenguageParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(LPPLenguageParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(LPPLenguageParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(LPPLenguageParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(LPPLenguageParser.ExpContext ctx);
}