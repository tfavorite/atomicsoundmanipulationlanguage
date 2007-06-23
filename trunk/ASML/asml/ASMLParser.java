// $ANTLR 3.0 C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g 2007-06-23 17:16:07
package asml;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ASMLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INCLUDE", "STRING", "SEMI", "FUN", "TYPE", "ID", "LPARENS", "RPARENS", "END", "COMMENT", "ADDSUB_OP", "MULTDIV_OP", "ASSIGN", "REL_OP", "LOG_OP", "COMMA", "LETTER", "DIGIT", "INTEGER", "FRAC", "NUMBER", "WS", "AT", "CONST", "ELSE", "FOR", "IF", "PRINT", "RETURN", "WHILE"
    };
    public static final int INTEGER=22;
    public static final int RPARENS=11;
    public static final int WHILE=33;
    public static final int MULTDIV_OP=15;
    public static final int LETTER=20;
    public static final int CONST=27;
    public static final int ELSE=28;
    public static final int NUMBER=24;
    public static final int LPARENS=10;
    public static final int FOR=29;
    public static final int ID=9;
    public static final int EOF=-1;
    public static final int SEMI=6;
    public static final int PRINT=31;
    public static final int FRAC=23;
    public static final int IF=30;
    public static final int TYPE=8;
    public static final int AT=26;
    public static final int ADDSUB_OP=14;
    public static final int WS=25;
    public static final int REL_OP=17;
    public static final int COMMA=19;
    public static final int INCLUDE=4;
    public static final int RETURN=32;
    public static final int ASSIGN=16;
    public static final int DIGIT=21;
    public static final int LOG_OP=18;
    public static final int FUN=7;
    public static final int END=12;
    public static final int COMMENT=13;
    public static final int STRING=5;

        public ASMLParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g"; }



    // $ANTLR start program
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:5:1: program : ( include_expr )* ( fun_decl )+ ;
    public final void program() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:5:11: ( ( include_expr )* ( fun_decl )+ )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:5:11: ( include_expr )* ( fun_decl )+
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:5:11: ( include_expr )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==INCLUDE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:5:12: include_expr
            	    {
            	    pushFollow(FOLLOW_include_expr_in_program24);
            	    include_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:5:26: ( fun_decl )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==FUN) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:5:27: fun_decl
            	    {
            	    pushFollow(FOLLOW_fun_decl_in_program28);
            	    fun_decl();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end program


    // $ANTLR start include_expr
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:7:1: include_expr : INCLUDE STRING SEMI ;
    public final void include_expr() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:8:5: ( INCLUDE STRING SEMI )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:8:5: INCLUDE STRING SEMI
            {
            match(input,INCLUDE,FOLLOW_INCLUDE_in_include_expr40); 
            match(input,STRING,FOLLOW_STRING_in_include_expr42); 
            match(input,SEMI,FOLLOW_SEMI_in_include_expr44); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end include_expr


    // $ANTLR start fun_decl
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:9:1: fun_decl : FUN TYPE ID LPARENS RPARENS block FUN ;
    public final void fun_decl() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:9:11: ( FUN TYPE ID LPARENS RPARENS block FUN )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:9:11: FUN TYPE ID LPARENS RPARENS block FUN
            {
            match(input,FUN,FOLLOW_FUN_in_fun_decl50); 
            match(input,TYPE,FOLLOW_TYPE_in_fun_decl52); 
            match(input,ID,FOLLOW_ID_in_fun_decl54); 
            match(input,LPARENS,FOLLOW_LPARENS_in_fun_decl56); 
            match(input,RPARENS,FOLLOW_RPARENS_in_fun_decl58); 
            pushFollow(FOLLOW_block_in_fun_decl60);
            block();
            _fsp--;

            match(input,FUN,FOLLOW_FUN_in_fun_decl62); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end fun_decl


    // $ANTLR start block
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:11:1: block : stmts END ;
    public final void block() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:11:9: ( stmts END )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:11:9: stmts END
            {
            pushFollow(FOLLOW_stmts_in_block70);
            stmts();
            _fsp--;

            match(input,END,FOLLOW_END_in_block72); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end block


    // $ANTLR start stmts
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:13:1: stmts : ( stmt stmts )? ;
    public final void stmts() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:13:10: ( ( stmt stmts )? )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:13:10: ( stmt stmts )?
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:13:10: ( stmt stmts )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:13:11: stmt stmts
                    {
                    pushFollow(FOLLOW_stmt_in_stmts82);
                    stmt();
                    _fsp--;

                    pushFollow(FOLLOW_stmts_in_stmts84);
                    stmts();
                    _fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end stmts


    // $ANTLR start stmt
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:14:1: stmt : ID SEMI ;
    public final void stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:14:8: ( ID SEMI )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:14:8: ID SEMI
            {
            match(input,ID,FOLLOW_ID_in_stmt93); 
            match(input,SEMI,FOLLOW_SEMI_in_stmt95); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end stmt


 

    public static final BitSet FOLLOW_include_expr_in_program24 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_fun_decl_in_program28 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_INCLUDE_in_include_expr40 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_in_include_expr42 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_include_expr44 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUN_in_fun_decl50 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TYPE_in_fun_decl52 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_fun_decl54 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPARENS_in_fun_decl56 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RPARENS_in_fun_decl58 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_block_in_fun_decl60 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_FUN_in_fun_decl62 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmts_in_block70 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_END_in_block72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmts82 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_stmts_in_stmts84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stmt93 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_stmt95 = new BitSet(new long[]{0x0000000000000002L});

}