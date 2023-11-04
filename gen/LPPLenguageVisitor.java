// Generated from /Users/edilberto/Documents/Lenguajes/LPP_Translator/grammar/LPPLenguage.g4 by ANTLR 4.13.1
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
	 * Visit a parse tree produced by {@link LPPLenguageParser#type_arr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_arr(LPPLenguageParser.Type_arrContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#dim_arr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDim_arr(LPPLenguageParser.Dim_arrContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(LPPLenguageParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#proc_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_declaration(LPPLenguageParser.Proc_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#proc_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_params(LPPLenguageParser.Proc_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(LPPLenguageParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#arr_cad_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr_cad_aux(LPPLenguageParser.Arr_cad_auxContext ctx);
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
	 * Visit a parse tree produced by {@link LPPLenguageParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(LPPLenguageParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#val_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal_return(LPPLenguageParser.Val_returnContext ctx);
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
	 * Visit a parse tree produced by {@link LPPLenguageParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(LPPLenguageParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(LPPLenguageParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase(LPPLenguageParser.CaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#case__}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase__(LPPLenguageParser.Case__Context ctx);
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
	 * Visit a parse tree produced by {@link LPPLenguageParser#until}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntil(LPPLenguageParser.UntilContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(LPPLenguageParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#init_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_for(LPPLenguageParser.Init_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#end_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_for(LPPLenguageParser.End_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(LPPLenguageParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(LPPLenguageParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#index_arr_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_arr_assign(LPPLenguageParser.Index_arr_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#exp_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_assign(LPPLenguageParser.Exp_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(LPPLenguageParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#llamar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamar(LPPLenguageParser.LlamarContext ctx);
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
	 * Visit a parse tree produced by {@link LPPLenguageParser#expArt_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpArt_(LPPLenguageParser.ExpArt_Context ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#expArtAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpArtAux(LPPLenguageParser.ExpArtAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#expRel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpRel(LPPLenguageParser.ExpRelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#expRel_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpRel_(LPPLenguageParser.ExpRel_Context ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#index_arr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_arr(LPPLenguageParser.Index_arrContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#lpar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLpar(LPPLenguageParser.LparContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#rpar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpar(LPPLenguageParser.RparContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#lbra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLbra(LPPLenguageParser.LbraContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#rbra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRbra(LPPLenguageParser.RbraContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#expRelAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpRelAux(LPPLenguageParser.ExpRelAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#expComp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpComp(LPPLenguageParser.ExpCompContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#expComp_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpComp_(LPPLenguageParser.ExpComp_Context ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma(LPPLenguageParser.CommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPPLenguageParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(LPPLenguageParser.ValContext ctx);
}