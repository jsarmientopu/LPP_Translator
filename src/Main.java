import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;


public class Main {
    public static void main(String[] args) throws Exception{
        LPPLenguageLexer lexer;
        if (args.length > 0 ) {
            lexer = new LPPLenguageLexer(CharStreams.fromFileName(args[0]));
        }
        else {
            lexer = new LPPLenguageLexer(CharStreams.fromStream(System.in));
        }
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LPPLenguageParser parser = new LPPLenguageParser(tokens);
        ParseTree tree = parser.init();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new MyListenersXOXO(), tree);
        System.out.println();
    }
}