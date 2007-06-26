// $ANTLR 3.0 C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g 2007-06-25 20:26:50
package asml;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ASMLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INCLUDE", "STRING", "SEMI", "FUN", "TYPE", "ID", "LPARENS", "RPARENS", "END", "IF", "ELSE", "WHILE", "FOR", "RETURN", "PRINT", "COMMA", "CONST", "AT", "NUMBER", "ASSIGN", "LOG_OP", "REL_OP", "ADD_OP", "SUB_OP", "MULT_OP", "DIV_OP", "MOD_OP", "COMMENT", "LETTER", "DIGIT", "INTEGER", "FRAC", "WS", "'!'"
    };
    public static final int ADD_OP=26;
    public static final int CONST=20;
    public static final int COMMA=19;
    public static final int TYPE=8;
    public static final int LETTER=32;
    public static final int LOG_OP=24;
    public static final int END=12;
    public static final int WHILE=15;
    public static final int WS=36;
    public static final int NUMBER=22;
    public static final int STRING=5;
    public static final int FUN=7;
    public static final int COMMENT=31;
    public static final int RPARENS=11;
    public static final int SEMI=6;
    public static final int INTEGER=34;
    public static final int PRINT=18;
    public static final int ELSE=14;
    public static final int INCLUDE=4;
    public static final int RETURN=17;
    public static final int IF=13;
    public static final int FRAC=35;
    public static final int EOF=-1;
    public static final int ASSIGN=23;
    public static final int DIV_OP=29;
    public static final int FOR=16;
    public static final int REL_OP=25;
    public static final int MOD_OP=30;
    public static final int DIGIT=33;
    public static final int MULT_OP=28;
    public static final int SUB_OP=27;
    public static final int LPARENS=10;
    public static final int AT=21;
    public static final int ID=9;

        public ASMLParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g"; }

    
    	public boolean hasError = false;
    @Override
    	public void reportError(RecognitionException e){
    		super.reportError(e);
    		hasError = true;
    	}



    // $ANTLR start program
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:13:1: program : ( include_expr )* ( fun_decl )+ ;
    public final void program() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:13:11: ( ( include_expr )* ( fun_decl )+ )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:13:11: ( include_expr )* ( fun_decl )+
            {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:13:11: ( include_expr )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==INCLUDE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:13:12: include_expr
            	    {
            	    pushFollow(FOLLOW_include_expr_in_program28);
            	    include_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:13:26: ( fun_decl )+
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
            	    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:13:27: fun_decl
            	    {
            	    pushFollow(FOLLOW_fun_decl_in_program32);
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
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:15:1: include_expr : INCLUDE STRING SEMI ;
    public final void include_expr() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:16:5: ( INCLUDE STRING SEMI )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:16:5: INCLUDE STRING SEMI
            {
            match(input,INCLUDE,FOLLOW_INCLUDE_in_include_expr44); 
            match(input,STRING,FOLLOW_STRING_in_include_expr46); 
            match(input,SEMI,FOLLOW_SEMI_in_include_expr48); 

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
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:17:1: fun_decl : FUN TYPE ID LPARENS ( decls )? RPARENS block FUN ;
    public final void fun_decl() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:17:11: ( FUN TYPE ID LPARENS ( decls )? RPARENS block FUN )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:17:11: FUN TYPE ID LPARENS ( decls )? RPARENS block FUN
            {
            match(input,FUN,FOLLOW_FUN_in_fun_decl54); 
            match(input,TYPE,FOLLOW_TYPE_in_fun_decl56); 
            match(input,ID,FOLLOW_ID_in_fun_decl58); 
            match(input,LPARENS,FOLLOW_LPARENS_in_fun_decl60); 
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:17:31: ( decls )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TYPE||LA3_0==CONST) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:17:31: decls
                    {
                    pushFollow(FOLLOW_decls_in_fun_decl62);
                    decls();
                    _fsp--;


                    }
                    break;

            }

            match(input,RPARENS,FOLLOW_RPARENS_in_fun_decl65); 
            pushFollow(FOLLOW_block_in_fun_decl67);
            block();
            _fsp--;

            match(input,FUN,FOLLOW_FUN_in_fun_decl69); 

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
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:19:1: block : stmts END ;
    public final void block() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:19:9: ( stmts END )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:19:9: stmts END
            {
            pushFollow(FOLLOW_stmts_in_block77);
            stmts();
            _fsp--;

            match(input,END,FOLLOW_END_in_block79); 

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
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:21:1: stmts : ( stmt stmts )? ;
    public final void stmts() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:21:10: ( ( stmt stmts )? )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:21:10: ( stmt stmts )?
            {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:21:10: ( stmt stmts )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=TYPE && LA4_0<=LPARENS)||LA4_0==IF||(LA4_0>=WHILE && LA4_0<=PRINT)||LA4_0==CONST||LA4_0==NUMBER||LA4_0==SUB_OP||LA4_0==37) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:21:11: stmt stmts
                    {
                    pushFollow(FOLLOW_stmt_in_stmts89);
                    stmt();
                    _fsp--;

                    pushFollow(FOLLOW_stmts_in_stmts91);
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
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:22:1: stmt : ( decl SEMI | expr SEMI | if_stmt | while_stmt | for_stmt | print_stmt | return_stmt );
    public final void stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:22:8: ( decl SEMI | expr SEMI | if_stmt | while_stmt | for_stmt | print_stmt | return_stmt )
            int alt5=7;
            switch ( input.LA(1) ) {
            case TYPE:
            case CONST:
                {
                alt5=1;
                }
                break;
            case ID:
            case LPARENS:
            case NUMBER:
            case SUB_OP:
            case 37:
                {
                alt5=2;
                }
                break;
            case IF:
                {
                alt5=3;
                }
                break;
            case WHILE:
                {
                alt5=4;
                }
                break;
            case FOR:
                {
                alt5=5;
                }
                break;
            case PRINT:
                {
                alt5=6;
                }
                break;
            case RETURN:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("22:1: stmt : ( decl SEMI | expr SEMI | if_stmt | while_stmt | for_stmt | print_stmt | return_stmt );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:22:8: decl SEMI
                    {
                    pushFollow(FOLLOW_decl_in_stmt100);
                    decl();
                    _fsp--;

                    match(input,SEMI,FOLLOW_SEMI_in_stmt102); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:23:4: expr SEMI
                    {
                    pushFollow(FOLLOW_expr_in_stmt107);
                    expr();
                    _fsp--;

                    match(input,SEMI,FOLLOW_SEMI_in_stmt109); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:24:4: if_stmt
                    {
                    pushFollow(FOLLOW_if_stmt_in_stmt114);
                    if_stmt();
                    _fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:25:4: while_stmt
                    {
                    pushFollow(FOLLOW_while_stmt_in_stmt119);
                    while_stmt();
                    _fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:26:4: for_stmt
                    {
                    pushFollow(FOLLOW_for_stmt_in_stmt124);
                    for_stmt();
                    _fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:27:4: print_stmt
                    {
                    pushFollow(FOLLOW_print_stmt_in_stmt129);
                    print_stmt();
                    _fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:28:4: return_stmt
                    {
                    pushFollow(FOLLOW_return_stmt_in_stmt134);
                    return_stmt();
                    _fsp--;


                    }
                    break;

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


    // $ANTLR start if_stmt
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:30:1: if_stmt : IF LPARENS rel_expr RPARENS block ( ELSE block )? IF ;
    public final void if_stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:30:11: ( IF LPARENS rel_expr RPARENS block ( ELSE block )? IF )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:30:11: IF LPARENS rel_expr RPARENS block ( ELSE block )? IF
            {
            match(input,IF,FOLLOW_IF_in_if_stmt142); 
            match(input,LPARENS,FOLLOW_LPARENS_in_if_stmt144); 
            pushFollow(FOLLOW_rel_expr_in_if_stmt146);
            rel_expr();
            _fsp--;

            match(input,RPARENS,FOLLOW_RPARENS_in_if_stmt148); 
            pushFollow(FOLLOW_block_in_if_stmt150);
            block();
            _fsp--;

            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:30:45: ( ELSE block )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ELSE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:30:46: ELSE block
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_if_stmt153); 
                    pushFollow(FOLLOW_block_in_if_stmt155);
                    block();
                    _fsp--;


                    }
                    break;

            }

            match(input,IF,FOLLOW_IF_in_if_stmt159); 

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
    // $ANTLR end if_stmt


    // $ANTLR start while_stmt
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:31:1: while_stmt : WHILE LPARENS rel_expr RPARENS block WHILE ;
    public final void while_stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:32:4: ( WHILE LPARENS rel_expr RPARENS block WHILE )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:32:4: WHILE LPARENS rel_expr RPARENS block WHILE
            {
            match(input,WHILE,FOLLOW_WHILE_in_while_stmt167); 
            match(input,LPARENS,FOLLOW_LPARENS_in_while_stmt169); 
            pushFollow(FOLLOW_rel_expr_in_while_stmt171);
            rel_expr();
            _fsp--;

            match(input,RPARENS,FOLLOW_RPARENS_in_while_stmt173); 
            pushFollow(FOLLOW_block_in_while_stmt175);
            block();
            _fsp--;

            match(input,WHILE,FOLLOW_WHILE_in_while_stmt177); 

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
    // $ANTLR end while_stmt


    // $ANTLR start for_stmt
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:33:1: for_stmt : FOR LPARENS expr SEMI rel_expr SEMI expr RPARENS block FOR ;
    public final void for_stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:33:11: ( FOR LPARENS expr SEMI rel_expr SEMI expr RPARENS block FOR )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:33:11: FOR LPARENS expr SEMI rel_expr SEMI expr RPARENS block FOR
            {
            match(input,FOR,FOLLOW_FOR_in_for_stmt183); 
            match(input,LPARENS,FOLLOW_LPARENS_in_for_stmt185); 
            pushFollow(FOLLOW_expr_in_for_stmt187);
            expr();
            _fsp--;

            match(input,SEMI,FOLLOW_SEMI_in_for_stmt189); 
            pushFollow(FOLLOW_rel_expr_in_for_stmt191);
            rel_expr();
            _fsp--;

            match(input,SEMI,FOLLOW_SEMI_in_for_stmt193); 
            pushFollow(FOLLOW_expr_in_for_stmt195);
            expr();
            _fsp--;

            match(input,RPARENS,FOLLOW_RPARENS_in_for_stmt197); 
            pushFollow(FOLLOW_block_in_for_stmt199);
            block();
            _fsp--;

            match(input,FOR,FOLLOW_FOR_in_for_stmt201); 

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
    // $ANTLR end for_stmt


    // $ANTLR start return_stmt
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:34:1: return_stmt : RETURN expr SEMI ;
    public final void return_stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:35:4: ( RETURN expr SEMI )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:35:4: RETURN expr SEMI
            {
            match(input,RETURN,FOLLOW_RETURN_in_return_stmt209); 
            pushFollow(FOLLOW_expr_in_return_stmt211);
            expr();
            _fsp--;

            match(input,SEMI,FOLLOW_SEMI_in_return_stmt213); 

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
    // $ANTLR end return_stmt


    // $ANTLR start print_stmt
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:36:1: print_stmt : PRINT STRING SEMI ;
    public final void print_stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:36:13: ( PRINT STRING SEMI )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:36:13: PRINT STRING SEMI
            {
            match(input,PRINT,FOLLOW_PRINT_in_print_stmt219); 
            match(input,STRING,FOLLOW_STRING_in_print_stmt221); 
            match(input,SEMI,FOLLOW_SEMI_in_print_stmt223); 

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
    // $ANTLR end print_stmt


    // $ANTLR start decls
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:39:1: decls : decl declsp ;
    public final void decls() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:39:9: ( decl declsp )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:39:9: decl declsp
            {
            pushFollow(FOLLOW_decl_in_decls233);
            decl();
            _fsp--;

            pushFollow(FOLLOW_declsp_in_decls235);
            declsp();
            _fsp--;


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
    // $ANTLR end decls


    // $ANTLR start declsp
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:40:1: declsp : ( COMMA decls | );
    public final void declsp() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:40:10: ( COMMA decls | )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==COMMA) ) {
                alt7=1;
            }
            else if ( (LA7_0==RPARENS) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("40:1: declsp : ( COMMA decls | );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:40:10: COMMA decls
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_declsp242); 
                    pushFollow(FOLLOW_decls_in_declsp244);
                    decls();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:40:35: 
                    {
                    }
                    break;

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
    // $ANTLR end declsp


    // $ANTLR start decl
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:41:1: decl : ( CONST )? TYPE expr ;
    public final void decl() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:41:8: ( ( CONST )? TYPE expr )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:41:8: ( CONST )? TYPE expr
            {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:41:8: ( CONST )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==CONST) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:41:8: CONST
                    {
                    match(input,CONST,FOLLOW_CONST_in_decl255); 

                    }
                    break;

            }

            match(input,TYPE,FOLLOW_TYPE_in_decl258); 
            pushFollow(FOLLOW_expr_in_decl260);
            expr();
            _fsp--;


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
    // $ANTLR end decl


    // $ANTLR start expr_list
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:43:1: expr_list : expr expr_listp ;
    public final void expr_list() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:44:4: ( expr expr_listp )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:44:4: expr expr_listp
            {
            pushFollow(FOLLOW_expr_in_expr_list269);
            expr();
            _fsp--;

            pushFollow(FOLLOW_expr_listp_in_expr_list271);
            expr_listp();
            _fsp--;


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
    // $ANTLR end expr_list


    // $ANTLR start expr_listp
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:45:1: expr_listp : ( COMMA expr_list | );
    public final void expr_listp() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:46:4: ( COMMA expr_list | )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==COMMA) ) {
                alt9=1;
            }
            else if ( (LA9_0==RPARENS) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("45:1: expr_listp : ( COMMA expr_list | );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:46:4: COMMA expr_list
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_expr_listp279); 
                    pushFollow(FOLLOW_expr_list_in_expr_listp281);
                    expr_list();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:46:33: 
                    {
                    }
                    break;

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
    // $ANTLR end expr_listp


    // $ANTLR start expr
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:47:1: expr : ( ( ID | ID AT ( ID | NUMBER ) ) ASSIGN log_expr | log_expr );
    public final void expr() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:47:8: ( ( ID | ID AT ( ID | NUMBER ) ) ASSIGN log_expr | log_expr )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                switch ( input.LA(2) ) {
                case SEMI:
                case LPARENS:
                case RPARENS:
                case COMMA:
                case LOG_OP:
                case REL_OP:
                case ADD_OP:
                case SUB_OP:
                case MULT_OP:
                case DIV_OP:
                case MOD_OP:
                    {
                    alt11=2;
                    }
                    break;
                case AT:
                    {
                    switch ( input.LA(3) ) {
                    case ID:
                        {
                        int LA11_5 = input.LA(4);

                        if ( (LA11_5==SEMI||(LA11_5>=LPARENS && LA11_5<=RPARENS)||LA11_5==COMMA||LA11_5==AT||(LA11_5>=LOG_OP && LA11_5<=MOD_OP)) ) {
                            alt11=2;
                        }
                        else if ( (LA11_5==ASSIGN) ) {
                            alt11=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("47:1: expr : ( ( ID | ID AT ( ID | NUMBER ) ) ASSIGN log_expr | log_expr );", 11, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NUMBER:
                        {
                        int LA11_6 = input.LA(4);

                        if ( (LA11_6==ASSIGN) ) {
                            alt11=1;
                        }
                        else if ( (LA11_6==SEMI||LA11_6==RPARENS||LA11_6==COMMA||LA11_6==AT||(LA11_6>=LOG_OP && LA11_6<=MOD_OP)) ) {
                            alt11=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("47:1: expr : ( ( ID | ID AT ( ID | NUMBER ) ) ASSIGN log_expr | log_expr );", 11, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPARENS:
                        {
                        alt11=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("47:1: expr : ( ( ID | ID AT ( ID | NUMBER ) ) ASSIGN log_expr | log_expr );", 11, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case ASSIGN:
                    {
                    alt11=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("47:1: expr : ( ( ID | ID AT ( ID | NUMBER ) ) ASSIGN log_expr | log_expr );", 11, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA11_0==LPARENS||LA11_0==NUMBER||LA11_0==SUB_OP||LA11_0==37) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("47:1: expr : ( ( ID | ID AT ( ID | NUMBER ) ) ASSIGN log_expr | log_expr );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:47:8: ( ID | ID AT ( ID | NUMBER ) ) ASSIGN log_expr
                    {
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:47:8: ( ID | ID AT ( ID | NUMBER ) )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ID) ) {
                        int LA10_1 = input.LA(2);

                        if ( (LA10_1==AT) ) {
                            alt10=2;
                        }
                        else if ( (LA10_1==ASSIGN) ) {
                            alt10=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("47:8: ( ID | ID AT ( ID | NUMBER ) )", 10, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("47:8: ( ID | ID AT ( ID | NUMBER ) )", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:47:9: ID
                            {
                            match(input,ID,FOLLOW_ID_in_expr293); 

                            }
                            break;
                        case 2 :
                            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:47:14: ID AT ( ID | NUMBER )
                            {
                            match(input,ID,FOLLOW_ID_in_expr297); 
                            match(input,AT,FOLLOW_AT_in_expr299); 
                            if ( input.LA(1)==ID||input.LA(1)==NUMBER ) {
                                input.consume();
                                errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_expr301);    throw mse;
                            }


                            }
                            break;

                    }

                    match(input,ASSIGN,FOLLOW_ASSIGN_in_expr310); 
                    pushFollow(FOLLOW_log_expr_in_expr312);
                    log_expr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:47:53: log_expr
                    {
                    pushFollow(FOLLOW_log_expr_in_expr316);
                    log_expr();
                    _fsp--;


                    }
                    break;

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
    // $ANTLR end expr


    // $ANTLR start log_expr
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:48:1: log_expr : rel_expr log_exprp ;
    public final void log_expr() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:48:11: ( rel_expr log_exprp )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:48:11: rel_expr log_exprp
            {
            pushFollow(FOLLOW_rel_expr_in_log_expr322);
            rel_expr();
            _fsp--;

            pushFollow(FOLLOW_log_exprp_in_log_expr324);
            log_exprp();
            _fsp--;


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
    // $ANTLR end log_expr


    // $ANTLR start log_exprp
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:49:1: log_exprp : ( LOG_OP log_expr | );
    public final void log_exprp() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:50:4: ( LOG_OP log_expr | )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==LOG_OP) ) {
                alt12=1;
            }
            else if ( (LA12_0==SEMI||LA12_0==RPARENS||LA12_0==COMMA) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("49:1: log_exprp : ( LOG_OP log_expr | );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:50:4: LOG_OP log_expr
                    {
                    match(input,LOG_OP,FOLLOW_LOG_OP_in_log_exprp332); 
                    pushFollow(FOLLOW_log_expr_in_log_exprp334);
                    log_expr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:50:34: 
                    {
                    }
                    break;

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
    // $ANTLR end log_exprp


    // $ANTLR start rel_expr
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:51:1: rel_expr : add_expr rel_exprp ;
    public final void rel_expr() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:51:11: ( add_expr rel_exprp )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:51:11: add_expr rel_exprp
            {
            pushFollow(FOLLOW_add_expr_in_rel_expr344);
            add_expr();
            _fsp--;

            pushFollow(FOLLOW_rel_exprp_in_rel_expr346);
            rel_exprp();
            _fsp--;


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
    // $ANTLR end rel_expr


    // $ANTLR start rel_exprp
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:52:1: rel_exprp : ( REL_OP rel_expr | );
    public final void rel_exprp() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:53:4: ( REL_OP rel_expr | )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==REL_OP) ) {
                alt13=1;
            }
            else if ( (LA13_0==SEMI||LA13_0==RPARENS||LA13_0==COMMA||LA13_0==LOG_OP) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("52:1: rel_exprp : ( REL_OP rel_expr | );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:53:4: REL_OP rel_expr
                    {
                    match(input,REL_OP,FOLLOW_REL_OP_in_rel_exprp354); 
                    pushFollow(FOLLOW_rel_expr_in_rel_exprp356);
                    rel_expr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:53:34: 
                    {
                    }
                    break;

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
    // $ANTLR end rel_exprp


    // $ANTLR start add_expr
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:54:1: add_expr : mult_expr add_exprp ;
    public final void add_expr() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:54:11: ( mult_expr add_exprp )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:54:11: mult_expr add_exprp
            {
            pushFollow(FOLLOW_mult_expr_in_add_expr366);
            mult_expr();
            _fsp--;

            pushFollow(FOLLOW_add_exprp_in_add_expr368);
            add_exprp();
            _fsp--;


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
    // $ANTLR end add_expr


    // $ANTLR start add_exprp
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:55:1: add_exprp : ( ADD_OP add_expr | SUB_OP add_expr | );
    public final void add_exprp() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:56:4: ( ADD_OP add_expr | SUB_OP add_expr | )
            int alt14=3;
            switch ( input.LA(1) ) {
            case ADD_OP:
                {
                alt14=1;
                }
                break;
            case SUB_OP:
                {
                alt14=2;
                }
                break;
            case SEMI:
            case RPARENS:
            case COMMA:
            case LOG_OP:
            case REL_OP:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("55:1: add_exprp : ( ADD_OP add_expr | SUB_OP add_expr | );", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:56:4: ADD_OP add_expr
                    {
                    match(input,ADD_OP,FOLLOW_ADD_OP_in_add_exprp376); 
                    pushFollow(FOLLOW_add_expr_in_add_exprp378);
                    add_expr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:56:22: SUB_OP add_expr
                    {
                    match(input,SUB_OP,FOLLOW_SUB_OP_in_add_exprp382); 
                    pushFollow(FOLLOW_add_expr_in_add_exprp384);
                    add_expr();
                    _fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:56:52: 
                    {
                    }
                    break;

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
    // $ANTLR end add_exprp


    // $ANTLR start mult_expr
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:57:1: mult_expr : unary_expr mult_exprp ;
    public final void mult_expr() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:58:4: ( unary_expr mult_exprp )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:58:4: unary_expr mult_exprp
            {
            pushFollow(FOLLOW_unary_expr_in_mult_expr395);
            unary_expr();
            _fsp--;

            pushFollow(FOLLOW_mult_exprp_in_mult_expr397);
            mult_exprp();
            _fsp--;


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
    // $ANTLR end mult_expr


    // $ANTLR start mult_exprp
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:59:1: mult_exprp : ( MULT_OP mult_expr | DIV_OP mult_expr | MOD_OP | );
    public final void mult_exprp() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:60:4: ( MULT_OP mult_expr | DIV_OP mult_expr | MOD_OP | )
            int alt15=4;
            switch ( input.LA(1) ) {
            case MULT_OP:
                {
                alt15=1;
                }
                break;
            case DIV_OP:
                {
                alt15=2;
                }
                break;
            case MOD_OP:
                {
                alt15=3;
                }
                break;
            case SEMI:
            case RPARENS:
            case COMMA:
            case LOG_OP:
            case REL_OP:
            case ADD_OP:
            case SUB_OP:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("59:1: mult_exprp : ( MULT_OP mult_expr | DIV_OP mult_expr | MOD_OP | );", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:60:4: MULT_OP mult_expr
                    {
                    match(input,MULT_OP,FOLLOW_MULT_OP_in_mult_exprp405); 
                    pushFollow(FOLLOW_mult_expr_in_mult_exprp407);
                    mult_expr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:60:24: DIV_OP mult_expr
                    {
                    match(input,DIV_OP,FOLLOW_DIV_OP_in_mult_exprp411); 
                    pushFollow(FOLLOW_mult_expr_in_mult_exprp413);
                    mult_expr();
                    _fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:60:43: MOD_OP
                    {
                    match(input,MOD_OP,FOLLOW_MOD_OP_in_mult_exprp417); 

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:60:63: 
                    {
                    }
                    break;

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
    // $ANTLR end mult_exprp


    // $ANTLR start unary_expr
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:61:1: unary_expr : ( '!' at_expr | '-' at_expr | at_expr );
    public final void unary_expr() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:62:4: ( '!' at_expr | '-' at_expr | at_expr )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt16=1;
                }
                break;
            case SUB_OP:
                {
                alt16=2;
                }
                break;
            case ID:
            case LPARENS:
            case NUMBER:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("61:1: unary_expr : ( '!' at_expr | '-' at_expr | at_expr );", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:62:4: '!' at_expr
                    {
                    match(input,37,FOLLOW_37_in_unary_expr429); 
                    pushFollow(FOLLOW_at_expr_in_unary_expr430);
                    at_expr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:62:17: '-' at_expr
                    {
                    match(input,SUB_OP,FOLLOW_SUB_OP_in_unary_expr434); 
                    pushFollow(FOLLOW_at_expr_in_unary_expr435);
                    at_expr();
                    _fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:62:30: at_expr
                    {
                    pushFollow(FOLLOW_at_expr_in_unary_expr439);
                    at_expr();
                    _fsp--;


                    }
                    break;

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
    // $ANTLR end unary_expr


    // $ANTLR start at_expr
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:63:1: at_expr : fun_call at_exprp ;
    public final void at_expr() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:63:11: ( fun_call at_exprp )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:63:11: fun_call at_exprp
            {
            pushFollow(FOLLOW_fun_call_in_at_expr446);
            fun_call();
            _fsp--;

            pushFollow(FOLLOW_at_exprp_in_at_expr448);
            at_exprp();
            _fsp--;


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
    // $ANTLR end at_expr


    // $ANTLR start at_exprp
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:64:1: at_exprp : ( AT at_expr | );
    public final void at_exprp() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:64:11: ( AT at_expr | )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==AT) ) {
                alt17=1;
            }
            else if ( (LA17_0==SEMI||LA17_0==RPARENS||LA17_0==COMMA||(LA17_0>=LOG_OP && LA17_0<=MOD_OP)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("64:1: at_exprp : ( AT at_expr | );", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:64:11: AT at_expr
                    {
                    match(input,AT,FOLLOW_AT_in_at_exprp454); 
                    pushFollow(FOLLOW_at_expr_in_at_exprp456);
                    at_expr();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:64:35: 
                    {
                    }
                    break;

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
    // $ANTLR end at_exprp


    // $ANTLR start fun_call
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:65:1: fun_call options {greedy=false; } : ( ID LPARENS ( expr_list )? RPARENS | top_expr );
    public final void fun_call() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:65:36: ( ID LPARENS ( expr_list )? RPARENS | top_expr )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==LPARENS) ) {
                    alt19=1;
                }
                else if ( (LA19_1==SEMI||LA19_1==RPARENS||LA19_1==COMMA||LA19_1==AT||(LA19_1>=LOG_OP && LA19_1<=MOD_OP)) ) {
                    alt19=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("65:1: fun_call options {greedy=false; } : ( ID LPARENS ( expr_list )? RPARENS | top_expr );", 19, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA19_0==LPARENS||LA19_0==NUMBER) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("65:1: fun_call options {greedy=false; } : ( ID LPARENS ( expr_list )? RPARENS | top_expr );", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:65:36: ID LPARENS ( expr_list )? RPARENS
                    {
                    match(input,ID,FOLLOW_ID_in_fun_call475); 
                    match(input,LPARENS,FOLLOW_LPARENS_in_fun_call477); 
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:65:47: ( expr_list )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( ((LA18_0>=ID && LA18_0<=LPARENS)||LA18_0==NUMBER||LA18_0==SUB_OP||LA18_0==37) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:65:47: expr_list
                            {
                            pushFollow(FOLLOW_expr_list_in_fun_call479);
                            expr_list();
                            _fsp--;


                            }
                            break;

                    }

                    match(input,RPARENS,FOLLOW_RPARENS_in_fun_call482); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:65:68: top_expr
                    {
                    pushFollow(FOLLOW_top_expr_in_fun_call486);
                    top_expr();
                    _fsp--;


                    }
                    break;

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
    // $ANTLR end fun_call


    // $ANTLR start top_expr
    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:66:1: top_expr : ( LPARENS expr RPARENS | ID | NUMBER );
    public final void top_expr() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:66:11: ( LPARENS expr RPARENS | ID | NUMBER )
            int alt20=3;
            switch ( input.LA(1) ) {
            case LPARENS:
                {
                alt20=1;
                }
                break;
            case ID:
                {
                alt20=2;
                }
                break;
            case NUMBER:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("66:1: top_expr : ( LPARENS expr RPARENS | ID | NUMBER );", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:66:11: LPARENS expr RPARENS
                    {
                    match(input,LPARENS,FOLLOW_LPARENS_in_top_expr492); 
                    pushFollow(FOLLOW_expr_in_top_expr494);
                    expr();
                    _fsp--;

                    match(input,RPARENS,FOLLOW_RPARENS_in_top_expr496); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:66:34: ID
                    {
                    match(input,ID,FOLLOW_ID_in_top_expr500); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:66:39: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_top_expr504); 

                    }
                    break;

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
    // $ANTLR end top_expr


 

    public static final BitSet FOLLOW_include_expr_in_program28 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_fun_decl_in_program32 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_INCLUDE_in_include_expr44 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_in_include_expr46 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_include_expr48 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUN_in_fun_decl54 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TYPE_in_fun_decl56 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_fun_decl58 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPARENS_in_fun_decl60 = new BitSet(new long[]{0x0000000000100900L});
    public static final BitSet FOLLOW_decls_in_fun_decl62 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RPARENS_in_fun_decl65 = new BitSet(new long[]{0x000000200857B700L});
    public static final BitSet FOLLOW_block_in_fun_decl67 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_FUN_in_fun_decl69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmts_in_block77 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_END_in_block79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmts89 = new BitSet(new long[]{0x000000200857A700L});
    public static final BitSet FOLLOW_stmts_in_stmts91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_stmt100 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_stmt102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt107 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_stmt109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_stmt114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_stmt119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_stmt124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_stmt_in_stmt129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_stmt134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_stmt142 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPARENS_in_if_stmt144 = new BitSet(new long[]{0x0000002008400600L});
    public static final BitSet FOLLOW_rel_expr_in_if_stmt146 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RPARENS_in_if_stmt148 = new BitSet(new long[]{0x000000200857B700L});
    public static final BitSet FOLLOW_block_in_if_stmt150 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ELSE_in_if_stmt153 = new BitSet(new long[]{0x000000200857B700L});
    public static final BitSet FOLLOW_block_in_if_stmt155 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_IF_in_if_stmt159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt167 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPARENS_in_while_stmt169 = new BitSet(new long[]{0x0000002008400600L});
    public static final BitSet FOLLOW_rel_expr_in_while_stmt171 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RPARENS_in_while_stmt173 = new BitSet(new long[]{0x000000200857B700L});
    public static final BitSet FOLLOW_block_in_while_stmt175 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt183 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPARENS_in_for_stmt185 = new BitSet(new long[]{0x0000002008400600L});
    public static final BitSet FOLLOW_expr_in_for_stmt187 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_for_stmt189 = new BitSet(new long[]{0x0000002008400600L});
    public static final BitSet FOLLOW_rel_expr_in_for_stmt191 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_for_stmt193 = new BitSet(new long[]{0x0000002008400600L});
    public static final BitSet FOLLOW_expr_in_for_stmt195 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RPARENS_in_for_stmt197 = new BitSet(new long[]{0x000000200857B700L});
    public static final BitSet FOLLOW_block_in_for_stmt199 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FOR_in_for_stmt201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt209 = new BitSet(new long[]{0x0000002008400600L});
    public static final BitSet FOLLOW_expr_in_return_stmt211 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_return_stmt213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print_stmt219 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_in_print_stmt221 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_print_stmt223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_decls233 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_declsp_in_decls235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_declsp242 = new BitSet(new long[]{0x0000000000100100L});
    public static final BitSet FOLLOW_decls_in_declsp244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_decl255 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TYPE_in_decl258 = new BitSet(new long[]{0x0000002008400600L});
    public static final BitSet FOLLOW_expr_in_decl260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list269 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_expr_listp_in_expr_list271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_expr_listp279 = new BitSet(new long[]{0x0000002008400600L});
    public static final BitSet FOLLOW_expr_list_in_expr_listp281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr293 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_expr297 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_AT_in_expr299 = new BitSet(new long[]{0x0000000000400200L});
    public static final BitSet FOLLOW_set_in_expr301 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ASSIGN_in_expr310 = new BitSet(new long[]{0x0000002008400600L});
    public static final BitSet FOLLOW_log_expr_in_expr312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_log_expr_in_expr316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rel_expr_in_log_expr322 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_log_exprp_in_log_expr324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOG_OP_in_log_exprp332 = new BitSet(new long[]{0x0000002008400600L});
    public static final BitSet FOLLOW_log_expr_in_log_exprp334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_expr_in_rel_expr344 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rel_exprp_in_rel_expr346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REL_OP_in_rel_exprp354 = new BitSet(new long[]{0x0000002008400600L});
    public static final BitSet FOLLOW_rel_expr_in_rel_exprp356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr366 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_add_exprp_in_add_expr368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_OP_in_add_exprp376 = new BitSet(new long[]{0x0000002008400600L});
    public static final BitSet FOLLOW_add_expr_in_add_exprp378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_OP_in_add_exprp382 = new BitSet(new long[]{0x0000002008400600L});
    public static final BitSet FOLLOW_add_expr_in_add_exprp384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr395 = new BitSet(new long[]{0x0000000070000002L});
    public static final BitSet FOLLOW_mult_exprp_in_mult_expr397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MULT_OP_in_mult_exprp405 = new BitSet(new long[]{0x0000002008400600L});
    public static final BitSet FOLLOW_mult_expr_in_mult_exprp407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_OP_in_mult_exprp411 = new BitSet(new long[]{0x0000002008400600L});
    public static final BitSet FOLLOW_mult_expr_in_mult_exprp413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_OP_in_mult_exprp417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_unary_expr429 = new BitSet(new long[]{0x0000000000400600L});
    public static final BitSet FOLLOW_at_expr_in_unary_expr430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_OP_in_unary_expr434 = new BitSet(new long[]{0x0000000000400600L});
    public static final BitSet FOLLOW_at_expr_in_unary_expr435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_at_expr_in_unary_expr439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_call_in_at_expr446 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_at_exprp_in_at_expr448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_at_exprp454 = new BitSet(new long[]{0x0000000000400600L});
    public static final BitSet FOLLOW_at_expr_in_at_exprp456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fun_call475 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPARENS_in_fun_call477 = new BitSet(new long[]{0x0000002008400E00L});
    public static final BitSet FOLLOW_expr_list_in_fun_call479 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RPARENS_in_fun_call482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_top_expr_in_fun_call486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_top_expr492 = new BitSet(new long[]{0x0000002008400600L});
    public static final BitSet FOLLOW_expr_in_top_expr494 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RPARENS_in_top_expr496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_top_expr500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_top_expr504 = new BitSet(new long[]{0x0000000000000002L});

}