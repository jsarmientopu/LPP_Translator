import java.util.*;

public class MyListenersXOXO extends LPPLenguageBaseListener {

    private final StringBuilder identacion = new StringBuilder();
    private String identificador = "";

    private Stack<String> dimensions = new Stack<>();

    private Queue<String> names = new LinkedList<>();

    private Map<String, String> dictionary = new HashMap<String, String>();

    private Map<String, String> variables = new HashMap<String, String>();

    // String for making the array assignation after retrieving the corresponding name
    private StringBuilder arrayString = new StringBuilder();
    private Stack<String> arrayDimensions = new Stack<>();
    public void getArrayAssign(){
        // function for building list comprehension string
        int dimSize = arrayDimensions.size();
        for(int i = 0; i < dimSize; i++){
            arrayString.append('[');
        }
        arrayString.append("0] * ");
        arrayString.append(arrayDimensions.pop());
        while(!arrayDimensions.isEmpty()){
            arrayString.append(" for _ in range(");
            arrayString.append(arrayDimensions.pop());
            arrayString.append(")]");
        }
    }

    private boolean arrayDefinition = false;

    @Override
    public void enterInit(LPPLenguageParser.InitContext ctx) { dictionary.put("verdadero", "True"); dictionary.put("falso", "False");; }

    @Override
    public void enterRegister (LPPLenguageParser.RegisterContext ctx) {
        System.out.print("class ");
        String name = ctx.ID().getText().toLowerCase();
        System.out.println(name + ":");
        identacion.append('\t');
        System.out.println(identacion +"def __init__(self):");
        identacion.append("\tself.");
    }

    public void exitRegister (LPPLenguageParser.RegisterContext ctx) {
        identacion.replace(identacion.length() - 7, identacion.length(), "");
    }

    @Override
    public void enterDeclaration (LPPLenguageParser.DeclarationContext ctx) {
        if (ctx.TYPE() != null) {
            System.out.print(identacion.toString());
            String tipo = ctx.TYPE().getText().toLowerCase();
            String name= ctx.ID(0).getText().toLowerCase();
            if(!dimensions.isEmpty()) {
                names.add(name);

            }
            if ((!ctx.arr_cad_aux().isEmpty() && (!tipo.equals("cadena") || ctx.arr_cad_aux(0).getRuleContext().getText().contains(","))) || ctx.arr_cad_aux().size() > 1) {
                System.out.println(name + " = list()");
            }
            else {
                if(!arrayDefinition){
                    switch (tipo) {
                        case "entero":
                            System.out.println(name + " = 0");
                            variables.put(name, "int");
                            break;

                        case "real":
                            System.out.println(name + " = 0.0");
                            variables.put(name, "float");
                            break;

                        case "booleano":
                            System.out.println(name + " = False");
                            variables.put(name, "bool");
                            break;

                        case "caracter", "cadena":
                            System.out.println(name + " = ''");
                            variables.put(name, "str "+ctx.arr_cad_aux(0).INT(0).getText());
                            break;
                    }
                }

            }
            for (int i = 0; i < ctx.COMMA().size(); i++) {
                name = ctx.ID(i + 1).getText().toLowerCase();
                if(!dimensions.isEmpty()){
                    names.add(name);
                    continue;
                }
                switch (tipo) {
                    case "entero":
                        System.out.println(name + " = 0");
                        variables.put(name, "int");
                        break;

                    case "real":
                        System.out.println(name + " = 0.0");
                        variables.put(name, "float");
                        break;

                    case "booleano":
                        System.out.println(name + " = False");
                        variables.put(name, "bool");
                        break;

                    case "caracter", "cadena":
                        System.out.println(name + "= ''");
                        variables.put(name, "str");
                        break;
                }
            }
        }
        else if (ctx.ARREGLO()==null){
            System.out.print(identacion.toString());
            String tipo = ctx.ID(0).getText().toLowerCase();
            String name = ctx.ID(1).getText().toLowerCase();
            System.out.println(name + " = " + tipo + "()");
            variables.put(name, tipo);
            for (int i = 0;i < ctx.COMMA().size(); i++) {
                name = ctx.ID(i + 2).getText().toLowerCase();
                variables.put(name, tipo);
                System.out.println(name + " = " + tipo + "()");
            }
        }
    }

    @Override
    public void enterDim_arr(LPPLenguageParser.Dim_arrContext ctx) {
        arrayDefinition = true;
        for(int i=0; i< ctx.INT().size();i++){
            dimensions.push(ctx.INT(i).getText());
            arrayDimensions.push(ctx.INT(i).getText());

        }
    }

    @Override
    public void exitType_arr(LPPLenguageParser.Type_arrContext ctx) {
        while(!dimensions.isEmpty()){
            dimensions.pop();
        }
        while(!names.isEmpty()){
            getArrayAssign();
            System.out.println(identacion+names.poll()+" = "+ arrayString.toString());
            arrayString.setLength(0);
        }
        arrayDefinition = false;
    }

    @Override
    public void enterProcedure (LPPLenguageParser.ProcedureContext ctx) {
        String name = ctx.ID().getText().toLowerCase();
        System.out.print("def " + name);

        if (ctx.proc_declaration() == null) {
            System.out.println("():");
        }

        if (ctx.commands() == null) {
            System.out.println("\tpass");
        }

        identacion.append('\t');
    }

    @Override
    public void exitProcedure (LPPLenguageParser.ProcedureContext ctx) {
        identacion.deleteCharAt(identacion.length() - 1);
    }

    @Override
    public void enterProc_declaration (LPPLenguageParser.Proc_declarationContext ctx) {
        StringBuilder params = new StringBuilder();
        if (ctx.VAR() != null) {
            params.append("global ");
        }
        params.append(ctx.ID().getText().toLowerCase());
        System.out.print("(" + params.toString());
    }

    @Override
    public void exitProc_declaration (LPPLenguageParser.Proc_declarationContext ctx) {
        System.out.println("):");
    }

    @Override
    public void enterProc_params (LPPLenguageParser.Proc_paramsContext ctx) {
        System.out.print(", " + (ctx.VAR() != null ? "global" : "") + ctx.ID().getText().toLowerCase());
    }


    @Override
    public void enterArr_cad (LPPLenguageParser.Arr_cadContext ctx) {
        System.out.print("[" + ctx.INT(0).getText().toLowerCase() + "]");
        for (int i = 1;i < ctx.INT().size(); i++) {
            System.out.print("[" + ctx.INT(1).getText().toLowerCase() + "]");
        }
    }

    @Override
    public void enterFunction (LPPLenguageParser.FunctionContext ctx) {
        String name = ctx.ID().getText().toLowerCase();
        System.out.print("def " + name);

        if (ctx.proc_declaration() == null) {
            System.out.println("():");
        }

        if (ctx.commands() == null) {
            System.out.println("\tpass");
        }

        identacion.append('\t');
    }

    @Override
    public void exitFunction (LPPLenguageParser.FunctionContext ctx) {
        identacion.deleteCharAt(identacion.length() - 1);
    }

    @Override
    public void enterReturn(LPPLenguageParser.ReturnContext ctx) {
        System.out.print(identacion.toString()+"return ");
    }

    @Override
    public void exitReturn(LPPLenguageParser.ReturnContext ctx) {
        System.out.println();
    }

    //COMMANDS
    @Override
    public void enterIf (LPPLenguageParser.IfContext ctx) {
        System.out.print(identacion.toString());
        System.out.print("if ");
        identacion.append('\t');
    }


    @Override
    public void exitIf (LPPLenguageParser.IfContext ctx) {
        identacion.deleteCharAt(identacion.length() - 1);
    }

    @Override
    public void exitCondition (LPPLenguageParser.ConditionContext ctx) {
        System.out.println(":");
    }

    @Override
    public void enterElse (LPPLenguageParser.ElseContext ctx) {
        identacion.deleteCharAt(identacion.length() - 1);
        System.out.print(identacion.toString());
        System.out.println("else:");
        identacion.append('\t');
    }

    @Override
    public void enterAssign (LPPLenguageParser.AssignContext ctx) {
        System.out.print(identacion.toString());
        System.out.print(ctx.ID().getText().toLowerCase());
        if(ctx.index_arr_assign()==null && ctx.register_val_assign()==null){
            System.out.print("=");
        }
    }

    @Override
    public void exitAssign (LPPLenguageParser.AssignContext ctx) {
        System.out.println();
    }

    @Override
    public void exitIndex_arr_assign(LPPLenguageParser.Index_arr_assignContext ctx) {
        System.out.print("=");
    }

    @Override
    public void enterExp_assign(LPPLenguageParser.Exp_assignContext ctx) {
        System.out.print("[");
    }

    @Override
    public void exitExp_assign(LPPLenguageParser.Exp_assignContext ctx) {
        System.out.print("]");
    }

    @Override
    public void enterRegister_val_assign(LPPLenguageParser.Register_val_assignContext ctx) {
        for(int i=0; i<ctx.ID().size();i++){
            System.out.print("."+ctx.ID(i).getText());
        }
        System.out.print("=");
    }

    @Override
    public void enterRegister_val(LPPLenguageParser.Register_valContext ctx) {
        for(int i=0; i<ctx.ID().size();i++){
            System.out.print("."+ctx.ID(i).getText());
        }
        if(variables.get(ctx.ID(ctx.ID().size()-1).getText())!=null && variables.get(ctx.ID(ctx.ID().size()-1).getText()).split(" ").length>1){
            System.out.print("[0:"+variables.get(ctx.ID(ctx.ID().size()-1).getText()).split(" ")[1]+"]");
        }
    }

    @Override
    public void enterCase (LPPLenguageParser.CaseContext ctx) {
        System.out.print(identacion.toString());
        StringBuilder values = new StringBuilder();
        if (dictionary.get(ctx.val(0).getText().toLowerCase()) == null) {
            values.append(ctx.ID().getText().toLowerCase() + " == " + ctx.val(0).getText().toLowerCase());
        }else{
            values.append(ctx.ID().getText().toLowerCase() + " == " + dictionary.get(ctx.val(0).getText().toLowerCase()));
        }
        values.append(ctx.ID().getText().toLowerCase() + " == " + ctx.val(0).getText().toLowerCase());
        for (int i = 1; i < ctx.val().size(); i++) {
            if (dictionary.get(ctx.val(i).getText().toLowerCase()) == null) {
                values.append(" or ").append(ctx.ID().getText().toLowerCase()).append(" == ").append(ctx.val(i).getText().toLowerCase());
            }else{
                values.append(" or ").append(ctx.ID().getText().toLowerCase()).append(" == ").append(dictionary.get(ctx.val(i).getText().toLowerCase()));
            }
        }
        System.out.println("if " + values + ":");
        identificador = ctx.ID().getText().toLowerCase();
        identacion.append('\t');
    }

    @Override
    public void exitCase (LPPLenguageParser.CaseContext ctx) {
        identacion.deleteCharAt(identacion.length() - 1);
    }

    @Override
    public void enterCase__ (LPPLenguageParser.Case__Context ctx) {
        identacion.deleteCharAt(identacion.length() - 1);
        System.out.print(identacion.toString());
        StringBuilder values = new StringBuilder();
        if (dictionary.get(ctx.val(0).getText().toLowerCase()) == null) {
            values.append(identificador).append(" == ").append(ctx.val(0).getText().toLowerCase());
        }else{
            values.append(identificador).append(" == ").append(dictionary.get(ctx.val(0).getText().toLowerCase()));
        }
        for (int i = 1; i < ctx.val().size(); i++) {
            if (dictionary.get(ctx.val(i).getText().toLowerCase()) == null) {
                values.append(identificador).append(" == ").append(ctx.val(i).getText().toLowerCase());
            }else{
                values.append(identificador).append(" == ").append(dictionary.get(ctx.val(i).getText().toLowerCase()));
            }
        }
        System.out.println("elif " + values + ":");
        identacion.append('\t');
    }

    @Override
    public void enterWhile (LPPLenguageParser.WhileContext ctx) {
        System.out.print(identacion+"while ");
        identacion.append('\t');
    }

    @Override
    public void exitWhile (LPPLenguageParser.WhileContext ctx) {
        identacion.deleteCharAt(identacion.length() - 1);
    }

    @Override
    public void enterRepeat (LPPLenguageParser.RepeatContext ctx) {
        System.out.print(identacion.toString());
        System.out.println("while True:");
        identacion.append('\t');
    }

    @Override
    public void exitRepeat (LPPLenguageParser.RepeatContext ctx)  {
        System.out.print(identacion.toString());
        System.out.println("\tbreak");
        identacion.deleteCharAt(identacion.length() - 1);
    }

    @Override
    public void enterUntil (LPPLenguageParser.UntilContext ctx) {
        System.out.print(identacion.toString());
        System.out.print("if ");
    }

    @Override
    public void enterFor (LPPLenguageParser.ForContext ctx) {
        String name = ctx.ID().getText().toLowerCase();
        //String n1 = ctx.INT(0).getText().toLowerCase();
        //String n2 = ctx.INT(1).getText().toLowerCase();
        System.out.print(identacion.toString());
        //System.out.println("for " + name + " in range(" + n1 + "," + n2 +"):");
        System.out.print("for " + name + " in range (");
        //identacion.append("\t");
    }

    @Override
    public void exitInit_for (LPPLenguageParser.Init_forContext ctx) {
        System.out.print(",");
    }

    @Override
    public void exitEnd_for (LPPLenguageParser.End_forContext ctx) {
        System.out.println("+1):");
        identacion.append("\t");
    }

    @Override
    public void exitFor (LPPLenguageParser.ForContext ctx) {
        identacion.deleteCharAt(identacion.length() - 1);
    }

    @Override
    public void enterRead (LPPLenguageParser.ReadContext ctx) {
        System.out.print(identacion.toString());
        System.out.println(ctx.ID(0).getText().toLowerCase() + " = input()");
        for (int i = 1;i < ctx.ID().size(); i++) {
            System.out.println(ctx.ID(i).getText().toLowerCase() + " = input()");
        }
    }

    @Override
    public void enterWrite (LPPLenguageParser.WriteContext ctx) {
        System.out.print(identacion.toString());
        System.out.print("print(");
    }

    @Override
    public void exitWrite (LPPLenguageParser.WriteContext ctx) {
        System.out.println(",sep = '', end=\"\")");
    }

    @Override
    public void enterLlamar(LPPLenguageParser.LlamarContext ctx) {
        System.out.print(identacion+ctx.ID(0).getText().toLowerCase());
        if(ctx.lpar()==null){
            System.out.print("()");
        }
    }

    @Override
    public void exitLlamar(LPPLenguageParser.LlamarContext ctx) {
        System.out.println();
    }

    @Override
    public void enterLineBreak (LPPLenguageParser.LineBreakContext ctx) {
        System.out.print(identacion);
        System.out.println("print()");
    }
    //FIN COMMANDS

    @Override
    public void exitExpArt (LPPLenguageParser.ExpArtContext ctx) {
        //System.out.println();
    }

    @Override
    public void enterExpArt_ (LPPLenguageParser.ExpArt_Context ctx) {
        if (ctx.val() != null) {
            if(dictionary.get(ctx.val().getText().toLowerCase())==null) {
                if(ctx.val().CHR()!=null || ctx.val().STR()!=null){
                    System.out.print(ctx.val().getText());
                }else if(ctx.val().ID()!=null && variables.get(ctx.val().ID().getText())!=null && ctx.register_val()==null){
                    if(variables.get(ctx.val().ID().getText()).split(" ").length>1){
                        System.out.print(ctx.val().getText()+"[0:"+variables.get(ctx.val().ID().getText()).split(" ")[1]+"]");
                    }else if(variables.get(ctx.val().ID().getText()).equals("int") || variables.get(ctx.val().ID().getText()).equals("float")){
                        System.out.print(variables.get(ctx.val().ID().getText())+"("+ctx.val().getText()+")");
                    }
                }
                else{
                    System.out.print(ctx.val().getText().toLowerCase());
                }
            }else{
                System.out.print(dictionary.get(ctx.val().getText().toLowerCase()));
            }
        }
    }


    @Override
    public void enterExpArtAux (LPPLenguageParser.ExpArtAuxContext ctx) {
        String operator = ctx.ARTOP().getText().toLowerCase();
        if (operator.equals("^")) {
            operator = "**";
        }
        else if (operator.equals("div")) {
            operator = "//";
        }
        else if (operator.equals("mod")) {
            operator = "%";
        }
        System.out.print(" " + operator + " ");
    }

    @Override
    public void exitExpRel (LPPLenguageParser.ExpRelContext ctx) {
        System.out.println();
    }

    @Override
    public void enterLpar (LPPLenguageParser.LparContext ctx) {
        System.out.print("(");
    }

    @Override
    public void enterRpar (LPPLenguageParser.RparContext ctx) {
        System.out.print(")");
    }

    @Override
    public void enterExpRelAux (LPPLenguageParser.ExpRelAuxContext ctx) {
        String operator = ctx.LOGOP().getText().toLowerCase();
        if (operator.equals("y")) {
            operator = "and";
        }
        else {
            operator = "or";
        }
        System.out.print(" " + operator + " ");
    }


    @Override
    public void enterExpComp_ (LPPLenguageParser.ExpComp_Context ctx) {
        String operator = ctx.RELOP().getText().toLowerCase();
        if (operator.equals("=")) {
            operator = "==";
        }
        else if (operator.equals("<>")) {
            operator = "!=";
        }
        System.out.print(" " + operator + " ");
    }

    @Override
    public void enterComma (LPPLenguageParser.CommaContext ctx) {
        System.out.print(" , ");
    }

}
