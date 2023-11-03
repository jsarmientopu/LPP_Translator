import javax.print.DocFlavor;

public class MyListenersXOXO extends LPPLenguageBaseListener {

    private final StringBuilder identacion = new StringBuilder();
    private String identificador = "";
    @Override
    public void enterRegister (LPPLenguageParser.RegisterContext ctx) {
        System.out.print("class ");
        String name = ctx.ID().getText();
        System.out.println(name + ":");
        identacion.append('\t');
    }

    public void exitRegister (LPPLenguageParser.RegisterContext ctx) {
        identacion.deleteCharAt(identacion.length() - 1);
    }

    @Override
    public void enterDeclaration (LPPLenguageParser.DeclarationContext ctx) {
        System.out.print(identacion.toString());
        if (ctx.TYPE() != null) {
            String tipo = ctx.TYPE().getText();
            String name = ctx.ID(0).getText();

            if (!ctx.arr_cad().isEmpty()) {
                System.out.println(name + " = list()");
            }
            else {
                switch (tipo) {
                    case "entero":
                        System.out.println(name + " = 0");
                        break;

                    case "real":
                        System.out.println(name + "= 0.0");
                        break;

                    case "booleano":
                        System.out.println(name + "= False");
                        break;

                    case "caracter", "cadena":
                        System.out.println(name + "= ''");
                        break;
                }
            }
            for (int i = 0; i < ctx.COMMA().size(); i++) {
                name = ctx.ID(i + 1).getText();
                switch (tipo) {
                    case "entero":
                        System.out.println(name + " = 0");
                        break;

                    case "real":
                        System.out.println(name + "= 0.0");
                        break;

                    case "booleano":
                        System.out.println(name + "= False");
                        break;

                    case "caracter", "cadena":
                        System.out.println(name + "= ''");
                        break;
                }
            }
        }
        else {
            String tipo = ctx.ID(0).getText();
            String name = ctx.ID(1).getText();
            System.out.println(name + tipo + "()");

            for (int i = 0;i < ctx.COMMA().size(); i++) {
                name = ctx.ID(i + 2).getText();
                System.out.println(name + tipo + "()");
            }
        }
    }

    @Override
    public void enterProcedure (LPPLenguageParser.ProcedureContext ctx) {
        String name = ctx.ID().getText();
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
        params.append(ctx.ID().getText());
        System.out.print("(" + params.toString());
    }

    @Override
    public void exitProc_declaration (LPPLenguageParser.Proc_declarationContext ctx) {
        System.out.println("):");
    }

    @Override
    public void enterProc_params (LPPLenguageParser.Proc_paramsContext ctx) {
        System.out.print(", " + (ctx.VAR() != null ? "global" : "") + ctx.ID().getText());
    }


    @Override
    public void enterArr_cad (LPPLenguageParser.Arr_cadContext ctx) {
        System.out.print("[" + ctx.INT(0).getText() + "]");
        for (int i = 1;i < ctx.INT().size(); i++) {
            System.out.print("[" + ctx.INT(1).getText() + "]");
        }
    }

    @Override
    public void enterFunction (LPPLenguageParser.FunctionContext ctx) {
        String name = ctx.ID().getText();
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
        System.out.print(ctx.ID().getText() + " = ");
    }

    @Override
    public void enterCase (LPPLenguageParser.CaseContext ctx) {
        System.out.print(identacion.toString());
        StringBuilder values = new StringBuilder();
        values.append(ctx.ID().getText() + " == " + ctx.val(0).getText());
        for (int i = 1; i < ctx.val().size(); i++) {
            values.append(" or ").append(ctx.ID().getText()).append(" == ").append(ctx.val(i).getText());
        }
        System.out.println("if " + values + ":");
        identificador = ctx.ID().getText();
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
        values.append(identificador).append(" == ").append(ctx.val(0).getText());
        for (int i = 1; i < ctx.val().size(); i++) {
            values.append(" or ").append(identificador).append(" == ").append(ctx.val(i).getText());
        }
        System.out.println("elif " + values + ":");
        identacion.append('\t');
    }

    @Override
    public void enterWhile (LPPLenguageParser.WhileContext ctx) {
        System.out.print("while ");
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
        String name = ctx.ID().getText();
        String n1 = ctx.INT(0).getText();
        String n2 = ctx.INT(1).getText();
        System.out.print(identacion.toString());
        System.out.println("for " + name + "in range(" + n1 + "," + n2 +"):");
        identacion.append("\t");
    }

    @Override
    public void exitFor (LPPLenguageParser.ForContext ctx) {
        identacion.deleteCharAt(identacion.length() - 1);
    }

    @Override
    public void enterRead (LPPLenguageParser.ReadContext ctx) {
        System.out.print(identacion.toString());
        System.out.println(ctx.ID(0).getText() + " = input()");
        for (int i = 1;i < ctx.ID().size(); i++) {
            System.out.println(ctx.ID(i).getText() + " = input()");
        }
    }

    @Override
    public void enterWrite (LPPLenguageParser.WriteContext ctx) {
        System.out.print(identacion.toString());
        System.out.print("print(");
    }

    @Override
    public void exitWrite (LPPLenguageParser.WriteContext ctx) {
        System.out.println(",sep = '')");
    }

    @Override
    public void enterLineBreak (LPPLenguageParser.LineBreakContext ctx) {
        System.out.print(identacion);
        System.out.println("print()");
    }
    //FIN COMMANDS

    @Override
    public void exitExpArt (LPPLenguageParser.ExpArtContext ctx) {
        System.out.println();
    }

    @Override
    public void enterExpArt_ (LPPLenguageParser.ExpArt_Context ctx) {
        if (ctx.val() != null) {
            System.out.print(ctx.val().getText());
        }
    }


    @Override
    public void enterExpArtAux (LPPLenguageParser.ExpArtAuxContext ctx) {
        String operator = ctx.ARTOP().getText();
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
        String operator = ctx.LOGOP().getText();
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
        String operator = ctx.RELOP().getText();
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
