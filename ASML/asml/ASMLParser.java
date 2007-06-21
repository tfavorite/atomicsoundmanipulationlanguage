package asml;
// $ANTLR 3.0 C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g 2007-06-20 21:44:05

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ASMLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NONCOMMENT", "COMMENT", "ADDSUB_OP", "MULTDIV_OP", "ASSIGN", "PARENS", "SEMI", "LETTER", "DIGIT", "ID", "STRING", "WS", "TYPE"
    };
    public static final int PARENS=9;
    public static final int NONCOMMENT=4;
    public static final int ADDSUB_OP=6;
    public static final int WS=15;
    public static final int MULTDIV_OP=7;
    public static final int LETTER=11;
    public static final int ASSIGN=8;
    public static final int DIGIT=12;
    public static final int ID=13;
    public static final int COMMENT=5;
    public static final int EOF=-1;
    public static final int SEMI=10;
    public static final int TYPE=16;
    public static final int STRING=14;

        public ASMLParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g"; }




 

}