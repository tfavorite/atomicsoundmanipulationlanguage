// $ANTLR 3.0 C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g 2007-07-28 18:59:17

package asml;
import asml.walker.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ASMLWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DECLRT", "PARAMRT", "CALLRT", "BLOCKRT", "INCLUDE", "STRING", "SEMI", "FUN", "TYPE", "ID", "LPARENS", "RPARENS", "END", "IF", "ELSE", "FOR", "WHILE", "RETURN", "PRINT", "COMMA", "CONST", "ASSIGN", "LOG_OP", "REL_OP", "ADD_OP", "SUB_OP", "MULT_OP", "DIV_OP", "MOD_OP", "AMPLOF", "AT", "TO", "NUMBER", "COMMENT", "LETTER", "DIGIT", "INTEGER", "FRAC", "STR_CONTENT", "WS", "'!'"
    };
    public static final int BLOCKRT=7;
    public static final int WHILE=20;
    public static final int DECLRT=4;
    public static final int AMPLOF=33;
    public static final int DIV_OP=31;
    public static final int LETTER=38;
    public static final int CONST=24;
    public static final int FOR=19;
    public static final int ID=13;
    public static final int EOF=-1;
    public static final int FRAC=41;
    public static final int TYPE=12;
    public static final int IF=17;
    public static final int AT=34;
    public static final int REL_OP=27;
    public static final int COMMA=23;
    public static final int INCLUDE=8;
    public static final int RETURN=21;
    public static final int LOG_OP=26;
    public static final int DIGIT=39;
    public static final int COMMENT=37;
    public static final int INTEGER=40;
    public static final int RPARENS=15;
    public static final int MULT_OP=30;
    public static final int TO=35;
    public static final int ELSE=18;
    public static final int ADD_OP=28;
    public static final int NUMBER=36;
    public static final int LPARENS=14;
    public static final int STR_CONTENT=42;
    public static final int CALLRT=6;
    public static final int SEMI=10;
    public static final int PRINT=22;
    public static final int PARAMRT=5;
    public static final int WS=43;
    public static final int SUB_OP=29;
    public static final int ASSIGN=25;
    public static final int END=16;
    public static final int FUN=11;
    public static final int MOD_OP=32;
    public static final int STRING=9;

        public ASMLWalker(TreeNodeStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g"; }



    // $ANTLR start program
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:12:1: program : ( include_stmt )* ( fun_decl )+ ;
    public final void program() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:13:2: ( ( include_stmt )* ( fun_decl )+ )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:13:2: ( include_stmt )* ( fun_decl )+
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:13:2: ( include_stmt )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==INCLUDE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:13:3: include_stmt
            	    {
            	    pushFollow(FOLLOW_include_stmt_in_program37);
            	    include_stmt();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:13:17: ( fun_decl )+
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
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:13:18: fun_decl
            	    {
            	    pushFollow(FOLLOW_fun_decl_in_program41);
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


    // $ANTLR start include_stmt
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:15:1: include_stmt : ^( INCLUDE STRING ) ;
    public final void include_stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:16:2: ( ^( INCLUDE STRING ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:16:2: ^( INCLUDE STRING )
            {
            match(input,INCLUDE,FOLLOW_INCLUDE_in_include_stmt55); 

            match(input, Token.DOWN, null); 
            match(input,STRING,FOLLOW_STRING_in_include_stmt57); 

            match(input, Token.UP, null); 

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
    // $ANTLR end include_stmt


    // $ANTLR start fun_decl
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:18:1: fun_decl : ^( FUN TYPE ID ( params )? block ) ;
    public final void fun_decl() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:19:2: ( ^( FUN TYPE ID ( params )? block ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:19:2: ^( FUN TYPE ID ( params )? block )
            {
            match(input,FUN,FOLLOW_FUN_in_fun_decl68); 

            match(input, Token.DOWN, null); 
            match(input,TYPE,FOLLOW_TYPE_in_fun_decl70); 
            match(input,ID,FOLLOW_ID_in_fun_decl72); 
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:19:16: ( params )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==PARAMRT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:19:16: params
                    {
                    pushFollow(FOLLOW_params_in_fun_decl74);
                    params();
                    _fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_block_in_fun_decl77);
            block();
            _fsp--;


            match(input, Token.UP, null); 

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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:21:1: block : ^( BLOCKRT ( stmt )* ) ;
    public final void block() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:22:2: ( ^( BLOCKRT ( stmt )* ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:22:2: ^( BLOCKRT ( stmt )* )
            {
            match(input,BLOCKRT,FOLLOW_BLOCKRT_in_block89); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:22:12: ( stmt )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==DECLRT||LA4_0==CALLRT||LA4_0==STRING||LA4_0==ID||LA4_0==IF||(LA4_0>=FOR && LA4_0<=PRINT)||(LA4_0>=ASSIGN && LA4_0<=AT)||LA4_0==NUMBER) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:22:12: stmt
                	    {
                	    pushFollow(FOLLOW_stmt_in_block91);
                	    stmt();
                	    _fsp--;


                	    }
                	    break;

                	default :
                	    break loop4;
                    }
                } while (true);


                match(input, Token.UP, null); 
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
    // $ANTLR end block


    // $ANTLR start stmt
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:24:1: stmt : ( decl | expr | if_stmt | while_stmt | for_stmt | print_stmt | return_stmt );
    public final void stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:25:4: ( decl | expr | if_stmt | while_stmt | for_stmt | print_stmt | return_stmt )
            int alt5=7;
            switch ( input.LA(1) ) {
            case DECLRT:
                {
                alt5=1;
                }
                break;
            case CALLRT:
            case STRING:
            case ID:
            case ASSIGN:
            case LOG_OP:
            case REL_OP:
            case ADD_OP:
            case SUB_OP:
            case MULT_OP:
            case DIV_OP:
            case MOD_OP:
            case AMPLOF:
            case AT:
            case NUMBER:
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
                    new NoViableAltException("24:1: stmt : ( decl | expr | if_stmt | while_stmt | for_stmt | print_stmt | return_stmt );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:25:4: decl
                    {
                    pushFollow(FOLLOW_decl_in_stmt105);
                    decl();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:26:4: expr
                    {
                    pushFollow(FOLLOW_expr_in_stmt110);
                    expr();
                    _fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:27:4: if_stmt
                    {
                    pushFollow(FOLLOW_if_stmt_in_stmt115);
                    if_stmt();
                    _fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:28:4: while_stmt
                    {
                    pushFollow(FOLLOW_while_stmt_in_stmt120);
                    while_stmt();
                    _fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:29:4: for_stmt
                    {
                    pushFollow(FOLLOW_for_stmt_in_stmt125);
                    for_stmt();
                    _fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:30:4: print_stmt
                    {
                    pushFollow(FOLLOW_print_stmt_in_stmt130);
                    print_stmt();
                    _fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:31:4: return_stmt
                    {
                    pushFollow(FOLLOW_return_stmt_in_stmt135);
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:33:1: if_stmt : ^( IF expr block ( block )? ) ;
    public final void if_stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:34:2: ( ^( IF expr block ( block )? ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:34:2: ^( IF expr block ( block )? )
            {
            match(input,IF,FOLLOW_IF_in_if_stmt147); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_if_stmt149);
            expr();
            _fsp--;

            pushFollow(FOLLOW_block_in_if_stmt151);
            block();
            _fsp--;

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:34:18: ( block )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==BLOCKRT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:34:19: block
                    {
                    pushFollow(FOLLOW_block_in_if_stmt154);
                    block();
                    _fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:35:1: while_stmt : ^( WHILE expr block ) ;
    public final void while_stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:36:2: ( ^( WHILE expr block ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:36:2: ^( WHILE expr block )
            {
            match(input,WHILE,FOLLOW_WHILE_in_while_stmt165); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_while_stmt167);
            expr();
            _fsp--;

            pushFollow(FOLLOW_block_in_while_stmt169);
            block();
            _fsp--;


            match(input, Token.UP, null); 

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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:37:1: for_stmt : ^( FOR expr expr expr block ) ;
    public final void for_stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:38:2: ( ^( FOR expr expr expr block ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:38:2: ^( FOR expr expr expr block )
            {
            match(input,FOR,FOLLOW_FOR_in_for_stmt179); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_for_stmt181);
            expr();
            _fsp--;

            pushFollow(FOLLOW_expr_in_for_stmt183);
            expr();
            _fsp--;

            pushFollow(FOLLOW_expr_in_for_stmt185);
            expr();
            _fsp--;

            pushFollow(FOLLOW_block_in_for_stmt187);
            block();
            _fsp--;


            match(input, Token.UP, null); 

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


    // $ANTLR start print_stmt
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:39:1: print_stmt : ^( PRINT val= expr ) ;
    public final void print_stmt() throws RecognitionException {
        Value val = null;


        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:41:2: ( ^( PRINT val= expr ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:41:2: ^( PRINT val= expr )
            {
            match(input,PRINT,FOLLOW_PRINT_in_print_stmt199); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_print_stmt205);
            val=expr();
            _fsp--;


            match(input, Token.UP, null); 
            
            		/*UPDATE THIS ONCE TIM MAKES NEW STRING CONSTRUCTOR		
            		if(val.getType() != Type.STRING)
            			throw new ASMLSemanticException(
            				"Print: expression must evaluate to a string.");*/
            		ASMLString str = (ASMLString) val;
            		System.out.println(str.getValue());
            	

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


    // $ANTLR start return_stmt
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:49:1: return_stmt : ^( RETURN expr ) ;
    public final void return_stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:51:2: ( ^( RETURN expr ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:51:2: ^( RETURN expr )
            {
            match(input,RETURN,FOLLOW_RETURN_in_return_stmt218); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_return_stmt220);
            expr();
            _fsp--;


            match(input, Token.UP, null); 

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


    // $ANTLR start decl
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:53:1: decl : ^( DECLRT ( CONST )? TYPE ID ( expr )? ) ;
    public final void decl() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:54:2: ( ^( DECLRT ( CONST )? TYPE ID ( expr )? ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:54:2: ^( DECLRT ( CONST )? TYPE ID ( expr )? )
            {
            match(input,DECLRT,FOLLOW_DECLRT_in_decl232); 

            match(input, Token.DOWN, null); 
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:54:11: ( CONST )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==CONST) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:54:11: CONST
                    {
                    match(input,CONST,FOLLOW_CONST_in_decl234); 

                    }
                    break;

            }

            match(input,TYPE,FOLLOW_TYPE_in_decl237); 
            match(input,ID,FOLLOW_ID_in_decl239); 
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:54:26: ( expr )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==CALLRT||LA8_0==STRING||LA8_0==ID||(LA8_0>=ASSIGN && LA8_0<=AT)||LA8_0==NUMBER) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:54:26: expr
                    {
                    pushFollow(FOLLOW_expr_in_decl241);
                    expr();
                    _fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

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


    // $ANTLR start params
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:55:1: params : param ( params )? ;
    public final void params() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:56:2: ( param ( params )? )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:56:2: param ( params )?
            {
            pushFollow(FOLLOW_param_in_params252);
            param();
            _fsp--;

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:56:8: ( params )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==PARAMRT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:56:10: params
                    {
                    pushFollow(FOLLOW_params_in_params256);
                    params();
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
    // $ANTLR end params


    // $ANTLR start param
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:57:1: param : ^( PARAMRT ( CONST )? TYPE ID ) ;
    public final void param() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:58:2: ( ^( PARAMRT ( CONST )? TYPE ID ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:58:2: ^( PARAMRT ( CONST )? TYPE ID )
            {
            match(input,PARAMRT,FOLLOW_PARAMRT_in_param267); 

            match(input, Token.DOWN, null); 
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:58:12: ( CONST )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==CONST) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:58:12: CONST
                    {
                    match(input,CONST,FOLLOW_CONST_in_param269); 

                    }
                    break;

            }

            match(input,TYPE,FOLLOW_TYPE_in_param272); 
            match(input,ID,FOLLOW_ID_in_param274); 

            match(input, Token.UP, null); 

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
    // $ANTLR end param


    // $ANTLR start expr
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:60:1: expr returns [Value v] : ( ^( ASSIGN lhs= expr rhs= expr ) | ^( LOG_OP lhs= expr rhs= expr ) | ^( REL_OP lhs= expr rhs= expr ) | ^( ADD_OP lhs= expr rhs= expr ) | ^( SUB_OP lhs= expr rhs= expr ) | ^( MULT_OP lhs= expr rhs= expr ) | ^( DIV_OP lhs= expr rhs= expr ) | ^( MOD_OP lhs= expr rhs= expr ) | ^( AMPLOF lhs= expr ) | ^( AT expr ( expr )? ) | ^( CALLRT ID ( expr )* ) | ID | NUMBER | STRING );
    public final Value expr() throws RecognitionException {
        Value v = null;

        CommonTree LOG_OP1=null;
        CommonTree REL_OP2=null;
        Value lhs = null;

        Value rhs = null;


        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:61:4: ( ^( ASSIGN lhs= expr rhs= expr ) | ^( LOG_OP lhs= expr rhs= expr ) | ^( REL_OP lhs= expr rhs= expr ) | ^( ADD_OP lhs= expr rhs= expr ) | ^( SUB_OP lhs= expr rhs= expr ) | ^( MULT_OP lhs= expr rhs= expr ) | ^( DIV_OP lhs= expr rhs= expr ) | ^( MOD_OP lhs= expr rhs= expr ) | ^( AMPLOF lhs= expr ) | ^( AT expr ( expr )? ) | ^( CALLRT ID ( expr )* ) | ID | NUMBER | STRING )
            int alt13=14;
            switch ( input.LA(1) ) {
            case ASSIGN:
                {
                alt13=1;
                }
                break;
            case LOG_OP:
                {
                alt13=2;
                }
                break;
            case REL_OP:
                {
                alt13=3;
                }
                break;
            case ADD_OP:
                {
                alt13=4;
                }
                break;
            case SUB_OP:
                {
                alt13=5;
                }
                break;
            case MULT_OP:
                {
                alt13=6;
                }
                break;
            case DIV_OP:
                {
                alt13=7;
                }
                break;
            case MOD_OP:
                {
                alt13=8;
                }
                break;
            case AMPLOF:
                {
                alt13=9;
                }
                break;
            case AT:
                {
                alt13=10;
                }
                break;
            case CALLRT:
                {
                alt13=11;
                }
                break;
            case ID:
                {
                alt13=12;
                }
                break;
            case NUMBER:
                {
                alt13=13;
                }
                break;
            case STRING:
                {
                alt13=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("60:1: expr returns [Value v] : ( ^( ASSIGN lhs= expr rhs= expr ) | ^( LOG_OP lhs= expr rhs= expr ) | ^( REL_OP lhs= expr rhs= expr ) | ^( ADD_OP lhs= expr rhs= expr ) | ^( SUB_OP lhs= expr rhs= expr ) | ^( MULT_OP lhs= expr rhs= expr ) | ^( DIV_OP lhs= expr rhs= expr ) | ^( MOD_OP lhs= expr rhs= expr ) | ^( AMPLOF lhs= expr ) | ^( AT expr ( expr )? ) | ^( CALLRT ID ( expr )* ) | ID | NUMBER | STRING );", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:61:4: ^( ASSIGN lhs= expr rhs= expr )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_expr291); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr297);
                    lhs=expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr303);
                    rhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 
                    
                    	  	
                    	  
                    	  

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:65:4: ^( LOG_OP lhs= expr rhs= expr )
                    {
                    LOG_OP1=(CommonTree)input.LT(1);
                    match(input,LOG_OP,FOLLOW_LOG_OP_in_expr311); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr317);
                    lhs=expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr323);
                    rhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 
                    
                    		try{v = lhs.logic(rhs, LOG_OP1.getText());}
                    		catch(ASMLSemanticException e){
                    			System.err.println(e.getMessage());}
                    	

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:70:4: ^( REL_OP lhs= expr rhs= expr )
                    {
                    REL_OP2=(CommonTree)input.LT(1);
                    match(input,REL_OP,FOLLOW_REL_OP_in_expr331); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr337);
                    lhs=expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr343);
                    rhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 
                    
                    		try{v = lhs.relate(rhs, REL_OP2.getText());}
                    		catch(ASMLSemanticException e){
                    			System.err.println(e.getMessage());}
                    	

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:75:4: ^( ADD_OP lhs= expr rhs= expr )
                    {
                    match(input,ADD_OP,FOLLOW_ADD_OP_in_expr351); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr357);
                    lhs=expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr363);
                    rhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:76:4: ^( SUB_OP lhs= expr rhs= expr )
                    {
                    match(input,SUB_OP,FOLLOW_SUB_OP_in_expr371); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr377);
                    lhs=expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr383);
                    rhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:77:4: ^( MULT_OP lhs= expr rhs= expr )
                    {
                    match(input,MULT_OP,FOLLOW_MULT_OP_in_expr391); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr397);
                    lhs=expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr403);
                    rhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:78:4: ^( DIV_OP lhs= expr rhs= expr )
                    {
                    match(input,DIV_OP,FOLLOW_DIV_OP_in_expr411); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr417);
                    lhs=expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr423);
                    rhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:79:4: ^( MOD_OP lhs= expr rhs= expr )
                    {
                    match(input,MOD_OP,FOLLOW_MOD_OP_in_expr431); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr437);
                    lhs=expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr443);
                    rhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 9 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:80:4: ^( AMPLOF lhs= expr )
                    {
                    match(input,AMPLOF,FOLLOW_AMPLOF_in_expr451); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr457);
                    lhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:81:4: ^( AT expr ( expr )? )
                    {
                    match(input,AT,FOLLOW_AT_in_expr464); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr466);
                    expr();
                    _fsp--;

                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:81:14: ( expr )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==CALLRT||LA11_0==STRING||LA11_0==ID||(LA11_0>=ASSIGN && LA11_0<=AT)||LA11_0==NUMBER) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:81:14: expr
                            {
                            pushFollow(FOLLOW_expr_in_expr468);
                            expr();
                            _fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:82:4: ^( CALLRT ID ( expr )* )
                    {
                    match(input,CALLRT,FOLLOW_CALLRT_in_expr476); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_expr478); 
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:82:16: ( expr )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==CALLRT||LA12_0==STRING||LA12_0==ID||(LA12_0>=ASSIGN && LA12_0<=AT)||LA12_0==NUMBER) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:82:16: expr
                    	    {
                    	    pushFollow(FOLLOW_expr_in_expr480);
                    	    expr();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:83:4: ID
                    {
                    match(input,ID,FOLLOW_ID_in_expr487); 


                    }
                    break;
                case 13 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:84:4: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_expr493); 


                    }
                    break;
                case 14 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:85:4: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_expr499); 


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
        return v;
    }
    // $ANTLR end expr


 

    public static final BitSet FOLLOW_include_stmt_in_program37 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_fun_decl_in_program41 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_INCLUDE_in_include_stmt55 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_include_stmt57 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUN_in_fun_decl68 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPE_in_fun_decl70 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_fun_decl72 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_params_in_fun_decl74 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_block_in_fun_decl77 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCKRT_in_block89 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stmt_in_block91 = new BitSet(new long[]{0x00000017FE7A2258L});
    public static final BitSet FOLLOW_decl_in_stmt105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_stmt115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_stmt120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_stmt125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_stmt_in_stmt130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_stmt135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_stmt147 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_if_stmt149 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_block_in_if_stmt151 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_block_in_if_stmt154 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt165 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_while_stmt167 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_block_in_while_stmt169 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_for_stmt179 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_for_stmt181 = new BitSet(new long[]{0x00000017FE002240L});
    public static final BitSet FOLLOW_expr_in_for_stmt183 = new BitSet(new long[]{0x00000017FE002240L});
    public static final BitSet FOLLOW_expr_in_for_stmt185 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_block_in_for_stmt187 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRINT_in_print_stmt199 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_print_stmt205 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_return_stmt220 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLRT_in_decl232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONST_in_decl234 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_TYPE_in_decl237 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_decl239 = new BitSet(new long[]{0x00000017FE002248L});
    public static final BitSet FOLLOW_expr_in_decl241 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_param_in_params252 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_params_in_params256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAMRT_in_param267 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONST_in_param269 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_TYPE_in_param272 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_param274 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_expr291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr297 = new BitSet(new long[]{0x00000017FE002240L});
    public static final BitSet FOLLOW_expr_in_expr303 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOG_OP_in_expr311 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr317 = new BitSet(new long[]{0x00000017FE002240L});
    public static final BitSet FOLLOW_expr_in_expr323 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REL_OP_in_expr331 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr337 = new BitSet(new long[]{0x00000017FE002240L});
    public static final BitSet FOLLOW_expr_in_expr343 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADD_OP_in_expr351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr357 = new BitSet(new long[]{0x00000017FE002240L});
    public static final BitSet FOLLOW_expr_in_expr363 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUB_OP_in_expr371 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr377 = new BitSet(new long[]{0x00000017FE002240L});
    public static final BitSet FOLLOW_expr_in_expr383 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MULT_OP_in_expr391 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr397 = new BitSet(new long[]{0x00000017FE002240L});
    public static final BitSet FOLLOW_expr_in_expr403 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_OP_in_expr411 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr417 = new BitSet(new long[]{0x00000017FE002240L});
    public static final BitSet FOLLOW_expr_in_expr423 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_OP_in_expr431 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr437 = new BitSet(new long[]{0x00000017FE002240L});
    public static final BitSet FOLLOW_expr_in_expr443 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AMPLOF_in_expr451 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr457 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AT_in_expr464 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr466 = new BitSet(new long[]{0x00000017FE002248L});
    public static final BitSet FOLLOW_expr_in_expr468 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALLRT_in_expr476 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr478 = new BitSet(new long[]{0x00000017FE002248L});
    public static final BitSet FOLLOW_expr_in_expr480 = new BitSet(new long[]{0x00000017FE002248L});
    public static final BitSet FOLLOW_ID_in_expr487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_expr493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expr499 = new BitSet(new long[]{0x0000000000000002L});

}