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
	 * Visit a parse tree produced by {@link LPPLenguageParser#register}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegister(LPPLenguageParser.RegisterContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(LPPLenguageParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(LPPLenguageParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#proc_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_params(LPPLenguageParser.Proc_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#arr_cad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr_cad(LPPLenguageParser.Arr_cadContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(LPPLenguageParser.FunctionContext ctx);
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
	 * Visit a parse tree produced by {@link LPPLenguageParser#case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase(LPPLenguageParser.CaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(LPPLenguageParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(LPPLenguageParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(LPPLenguageParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(LPPLenguageParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(LPPLenguageParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(LPPLenguageParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#lineBreak}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineBreak(LPPLenguageParser.LineBreakContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(LPPLenguageParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#expArt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpArt(LPPLenguageParser.ExpArtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#expRel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpRel(LPPLenguageParser.ExpRelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#expComp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpComp(LPPLenguageParser.ExpCompContext ctx);
}