// Generated from C:/Users/Juan carlos/IdeaProjects/LPP_Translator/grammar/LPPLenguage.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link LPPLenguageParser#register}.
	 * @param ctx the parse tree
	 */
	void enterRegister(LPPLenguageParser.RegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#register}.
	 * @param ctx the parse tree
	 */
	void exitRegister(LPPLenguageParser.RegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(LPPLenguageParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(LPPLenguageParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(LPPLenguageParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(LPPLenguageParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#proc_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProc_declaration(LPPLenguageParser.Proc_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#proc_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProc_declaration(LPPLenguageParser.Proc_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#proc_params}.
	 * @param ctx the parse tree
	 */
	void enterProc_params(LPPLenguageParser.Proc_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#proc_params}.
	 * @param ctx the parse tree
	 */
	void exitProc_params(LPPLenguageParser.Proc_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(LPPLenguageParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(LPPLenguageParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#arr_cad_aux}.
	 * @param ctx the parse tree
	 */
	void enterArr_cad_aux(LPPLenguageParser.Arr_cad_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#arr_cad_aux}.
	 * @param ctx the parse tree
	 */
	void exitArr_cad_aux(LPPLenguageParser.Arr_cad_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#arr_cad}.
	 * @param ctx the parse tree
	 */
	void enterArr_cad(LPPLenguageParser.Arr_cadContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#arr_cad}.
	 * @param ctx the parse tree
	 */
	void exitArr_cad(LPPLenguageParser.Arr_cadContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(LPPLenguageParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(LPPLenguageParser.FunctionContext ctx);
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
	 * Enter a parse tree produced by {@link LPPLenguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(LPPLenguageParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(LPPLenguageParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(LPPLenguageParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(LPPLenguageParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#case}.
	 * @param ctx the parse tree
	 */
	void enterCase(LPPLenguageParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#case}.
	 * @param ctx the parse tree
	 */
	void exitCase(LPPLenguageParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#case__}.
	 * @param ctx the parse tree
	 */
	void enterCase__(LPPLenguageParser.Case__Context ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#case__}.
	 * @param ctx the parse tree
	 */
	void exitCase__(LPPLenguageParser.Case__Context ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(LPPLenguageParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(LPPLenguageParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(LPPLenguageParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(LPPLenguageParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#until}.
	 * @param ctx the parse tree
	 */
	void enterUntil(LPPLenguageParser.UntilContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#until}.
	 * @param ctx the parse tree
	 */
	void exitUntil(LPPLenguageParser.UntilContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(LPPLenguageParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(LPPLenguageParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(LPPLenguageParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(LPPLenguageParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LPPLenguageParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LPPLenguageParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(LPPLenguageParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(LPPLenguageParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#llamar}.
	 * @param ctx the parse tree
	 */
	void enterLlamar(LPPLenguageParser.LlamarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#llamar}.
	 * @param ctx the parse tree
	 */
	void exitLlamar(LPPLenguageParser.LlamarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#lineBreak}.
	 * @param ctx the parse tree
	 */
	void enterLineBreak(LPPLenguageParser.LineBreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#lineBreak}.
	 * @param ctx the parse tree
	 */
	void exitLineBreak(LPPLenguageParser.LineBreakContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#expArt}.
	 * @param ctx the parse tree
	 */
	void enterExpArt(LPPLenguageParser.ExpArtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#expArt}.
	 * @param ctx the parse tree
	 */
	void exitExpArt(LPPLenguageParser.ExpArtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#expArt_}.
	 * @param ctx the parse tree
	 */
	void enterExpArt_(LPPLenguageParser.ExpArt_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#expArt_}.
	 * @param ctx the parse tree
	 */
	void exitExpArt_(LPPLenguageParser.ExpArt_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#expArtAux}.
	 * @param ctx the parse tree
	 */
	void enterExpArtAux(LPPLenguageParser.ExpArtAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#expArtAux}.
	 * @param ctx the parse tree
	 */
	void exitExpArtAux(LPPLenguageParser.ExpArtAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#expRel}.
	 * @param ctx the parse tree
	 */
	void enterExpRel(LPPLenguageParser.ExpRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#expRel}.
	 * @param ctx the parse tree
	 */
	void exitExpRel(LPPLenguageParser.ExpRelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#expRel_}.
	 * @param ctx the parse tree
	 */
	void enterExpRel_(LPPLenguageParser.ExpRel_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#expRel_}.
	 * @param ctx the parse tree
	 */
	void exitExpRel_(LPPLenguageParser.ExpRel_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#lpar}.
	 * @param ctx the parse tree
	 */
	void enterLpar(LPPLenguageParser.LparContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#lpar}.
	 * @param ctx the parse tree
	 */
	void exitLpar(LPPLenguageParser.LparContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#rpar}.
	 * @param ctx the parse tree
	 */
	void enterRpar(LPPLenguageParser.RparContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#rpar}.
	 * @param ctx the parse tree
	 */
	void exitRpar(LPPLenguageParser.RparContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#expRelAux}.
	 * @param ctx the parse tree
	 */
	void enterExpRelAux(LPPLenguageParser.ExpRelAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#expRelAux}.
	 * @param ctx the parse tree
	 */
	void exitExpRelAux(LPPLenguageParser.ExpRelAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#expComp}.
	 * @param ctx the parse tree
	 */
	void enterExpComp(LPPLenguageParser.ExpCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#expComp}.
	 * @param ctx the parse tree
	 */
	void exitExpComp(LPPLenguageParser.ExpCompContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#expComp_}.
	 * @param ctx the parse tree
	 */
	void enterExpComp_(LPPLenguageParser.ExpComp_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#expComp_}.
	 * @param ctx the parse tree
	 */
	void exitExpComp_(LPPLenguageParser.ExpComp_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(LPPLenguageParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(LPPLenguageParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPPLenguageParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(LPPLenguageParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPPLenguageParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(LPPLenguageParser.ValContext ctx);
}