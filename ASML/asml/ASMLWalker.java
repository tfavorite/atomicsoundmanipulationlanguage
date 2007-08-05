// $ANTLR 3.0 C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g 2007-08-04 23:09:45

package asml;
import asml.walker.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ASMLWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DECLRT", "PARAMRT", "CALLRT", "BLOCKRT", "INCLUDE", "STRING", "SEMI", "FUN", "TYPE", "ID", "LPARENS", "RPARENS", "END", "IF", "ELSE", "FOR", "WHILE", "RETURN", "PRINT", "COMMA", "ASSIGN", "LOG_OP", "REL_OP", "ADD_OP", "SUB_OP", "MULT_OP", "DIV_OP", "MOD_OP", "AMPLOF", "AT", "TO", "NUMBER", "COMMENT", "LETTER", "DIGIT", "INTEGER", "FRAC", "STR_CONTENT", "WS", "'!'"
    };
    public static final int INTEGER=39;
    public static final int BLOCKRT=7;
    public static final int RPARENS=15;
    public static final int MULT_OP=29;
    public static final int WHILE=20;
    public static final int TO=34;
    public static final int DECLRT=4;
    public static final int AMPLOF=32;
    public static final int DIV_OP=30;
    public static final int LETTER=37;
    public static final int ELSE=18;
    public static final int NUMBER=35;
    public static final int ADD_OP=27;
    public static final int LPARENS=14;
    public static final int FOR=19;
    public static final int STR_CONTENT=41;
    public static final int ID=13;
    public static final int CALLRT=6;
    public static final int EOF=-1;
    public static final int SEMI=10;
    public static final int PRINT=22;
    public static final int FRAC=40;
    public static final int IF=17;
    public static final int TYPE=12;
    public static final int PARAMRT=5;
    public static final int AT=33;
    public static final int WS=42;
    public static final int SUB_OP=28;
    public static final int COMMA=23;
    public static final int REL_OP=26;
    public static final int INCLUDE=8;
    public static final int RETURN=21;
    public static final int ASSIGN=24;
    public static final int LOG_OP=25;
    public static final int DIGIT=38;
    public static final int END=16;
    public static final int FUN=11;
    public static final int MOD_OP=31;
    public static final int COMMENT=36;
    public static final int STRING=9;

        public ASMLWalker(TreeNodeStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g"; }

    
    ASMLControl control = null;
    public void setControl(ASMLControl aControl){
    	control = aControl;
    }



    // $ANTLR start program
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:19:1: program : ( include_stmt )* ( fun_decl )+ ;
    public final void program() throws RecognitionException {
        
        control.setStream((CommonTreeNodeStream)input);

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:23:1: ( ( include_stmt )* ( fun_decl )+ )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:23:2: ( include_stmt )* ( fun_decl )+
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:23:2: ( include_stmt )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==INCLUDE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:23:3: include_stmt
            	    {
            	    pushFollow(FOLLOW_include_stmt_in_program44);
            	    include_stmt();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:23:17: ( fun_decl )+
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
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:23:18: fun_decl
            	    {
            	    pushFollow(FOLLOW_fun_decl_in_program48);
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:25:1: include_stmt : ^( INCLUDE STRING ) ;
    public final void include_stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:25:13: ( ^( INCLUDE STRING ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:26:2: ^( INCLUDE STRING )
            {
            match(input,INCLUDE,FOLLOW_INCLUDE_in_include_stmt62); 

            match(input, Token.DOWN, null); 
            match(input,STRING,FOLLOW_STRING_in_include_stmt64); 

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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:28:1: fun_decl : ^( FUN TYPE name= ID ( param )* . ) ;
    public final void fun_decl() throws RecognitionException {
        CommonTree name=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:37:1: ( ^( FUN TYPE name= ID ( param )* . ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:37:2: ^( FUN TYPE name= ID ( param )* . )
            {
            match(input,FUN,FOLLOW_FUN_in_fun_decl78); 

            match(input, Token.DOWN, null); 
            match(input,TYPE,FOLLOW_TYPE_in_fun_decl80); 
            name=(CommonTree)input.LT(1);
            match(input,ID,FOLLOW_ID_in_fun_decl84); 
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:37:21: ( param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==PARAMRT) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==DOWN) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:37:21: param
            	    {
            	    pushFollow(FOLLOW_param_in_fun_decl86);
            	    param();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            matchAny(input); 

            match(input, Token.UP, null); 

            }

            
            try{
            	if(name.getText().equals("main"))
            		control.doCallMain();
            }catch(ASMLSemanticException e){
            	System.err.println(e.getMessage());
            	System.exit(-1);}

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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:39:1: block : ^( BLOCKRT ( stmt )* ) ;
    public final void block() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:39:7: ( ^( BLOCKRT ( stmt )* ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:40:2: ^( BLOCKRT ( stmt )* )
            {
            match(input,BLOCKRT,FOLLOW_BLOCKRT_in_block101); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:40:12: ( stmt )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==DECLRT||LA4_0==CALLRT||LA4_0==STRING||LA4_0==ID||LA4_0==IF||(LA4_0>=FOR && LA4_0<=PRINT)||(LA4_0>=ASSIGN && LA4_0<=AT)||LA4_0==NUMBER) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:40:12: stmt
                	    {
                	    pushFollow(FOLLOW_stmt_in_block103);
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:42:1: stmt : ( decl | expr | if_stmt | while_stmt | for_stmt | print_stmt | return_stmt );
    public final void stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:42:6: ( decl | expr | if_stmt | while_stmt | for_stmt | print_stmt | return_stmt )
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
                    new NoViableAltException("42:1: stmt : ( decl | expr | if_stmt | while_stmt | for_stmt | print_stmt | return_stmt );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:43:4: decl
                    {
                    pushFollow(FOLLOW_decl_in_stmt117);
                    decl();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:44:4: expr
                    {
                    pushFollow(FOLLOW_expr_in_stmt122);
                    expr();
                    _fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:45:4: if_stmt
                    {
                    pushFollow(FOLLOW_if_stmt_in_stmt127);
                    if_stmt();
                    _fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:46:4: while_stmt
                    {
                    pushFollow(FOLLOW_while_stmt_in_stmt132);
                    while_stmt();
                    _fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:47:4: for_stmt
                    {
                    pushFollow(FOLLOW_for_stmt_in_stmt137);
                    for_stmt();
                    _fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:48:4: print_stmt
                    {
                    pushFollow(FOLLOW_print_stmt_in_stmt142);
                    print_stmt();
                    _fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:49:4: return_stmt
                    {
                    pushFollow(FOLLOW_return_stmt_in_stmt147);
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:51:1: if_stmt : ^( IF expr block ( block )? ) ;
    public final void if_stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:51:9: ( ^( IF expr block ( block )? ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:52:2: ^( IF expr block ( block )? )
            {
            match(input,IF,FOLLOW_IF_in_if_stmt159); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_if_stmt161);
            expr();
            _fsp--;

            pushFollow(FOLLOW_block_in_if_stmt163);
            block();
            _fsp--;

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:52:18: ( block )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==BLOCKRT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:52:19: block
                    {
                    pushFollow(FOLLOW_block_in_if_stmt166);
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:53:1: while_stmt : ^( WHILE expr block ) ;
    public final void while_stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:53:11: ( ^( WHILE expr block ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:54:2: ^( WHILE expr block )
            {
            match(input,WHILE,FOLLOW_WHILE_in_while_stmt177); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_while_stmt179);
            expr();
            _fsp--;

            pushFollow(FOLLOW_block_in_while_stmt181);
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:55:1: for_stmt : ^( FOR expr expr expr block ) ;
    public final void for_stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:55:9: ( ^( FOR expr expr expr block ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:56:2: ^( FOR expr expr expr block )
            {
            match(input,FOR,FOLLOW_FOR_in_for_stmt191); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_for_stmt193);
            expr();
            _fsp--;

            pushFollow(FOLLOW_expr_in_for_stmt195);
            expr();
            _fsp--;

            pushFollow(FOLLOW_expr_in_for_stmt197);
            expr();
            _fsp--;

            pushFollow(FOLLOW_block_in_for_stmt199);
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:57:1: print_stmt : ^( PRINT val= expr ) ;
    public final void print_stmt() throws RecognitionException {
        Value val = null;


        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:58:2: ( ^( PRINT val= expr ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:59:2: ^( PRINT val= expr )
            {
            match(input,PRINT,FOLLOW_PRINT_in_print_stmt211); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_print_stmt217);
            val=expr();
            _fsp--;


            match(input, Token.UP, null); 
            
            		try {
            			ASMLString str = new ASMLString(val);
            			System.out.println(str.getValue());
            		} catch (ASMLSemanticException e){
            			System.err.println("Print: expression must evaluate to a string.");
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
    // $ANTLR end print_stmt


    // $ANTLR start return_stmt
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:67:1: return_stmt : ^( RETURN expr ) ;
    public final void return_stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:68:2: ( ^( RETURN expr ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:69:2: ^( RETURN expr )
            {
            match(input,RETURN,FOLLOW_RETURN_in_return_stmt230); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_return_stmt232);
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:71:1: decl : ^( DECLRT TYPE ID ( expr )? ) ;
    public final void decl() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:71:6: ( ^( DECLRT TYPE ID ( expr )? ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:72:2: ^( DECLRT TYPE ID ( expr )? )
            {
            match(input,DECLRT,FOLLOW_DECLRT_in_decl244); 

            match(input, Token.DOWN, null); 
            match(input,TYPE,FOLLOW_TYPE_in_decl246); 
            match(input,ID,FOLLOW_ID_in_decl248); 
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:72:19: ( expr )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==CALLRT||LA7_0==STRING||LA7_0==ID||(LA7_0>=ASSIGN && LA7_0<=AT)||LA7_0==NUMBER) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:72:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_decl250);
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


    // $ANTLR start param
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:75:1: param : ^( PARAMRT TYPE ID ) ;
    public final void param() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:75:7: ( ^( PARAMRT TYPE ID ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:76:2: ^( PARAMRT TYPE ID )
            {
            match(input,PARAMRT,FOLLOW_PARAMRT_in_param263); 

            match(input, Token.DOWN, null); 
            match(input,TYPE,FOLLOW_TYPE_in_param265); 
            match(input,ID,FOLLOW_ID_in_param267); 

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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:78:1: expr returns [Value v] : ( ^( ASSIGN lhs= expr rhs= expr ) | ^( LOG_OP lhs= expr rhs= expr ) | ^( REL_OP lhs= expr rhs= expr ) | ^( ADD_OP lhs= expr rhs= expr ) | ^( SUB_OP lhs= expr rhs= expr ) | ^( MULT_OP lhs= expr rhs= expr ) | ^( DIV_OP lhs= expr rhs= expr ) | ^( MOD_OP lhs= expr rhs= expr ) | ^( AMPLOF lhs= expr ) | ^( AT expr expr ( expr )? ) | ^( CALLRT ID ( expr )* ) | ID | NUMBER | STRING );
    public final Value expr() throws RecognitionException {
        Value v = null;

        CommonTree LOG_OP1=null;
        CommonTree REL_OP2=null;
        CommonTree NUMBER3=null;
        CommonTree STRING4=null;
        Value lhs = null;

        Value rhs = null;


        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:78:23: ( ^( ASSIGN lhs= expr rhs= expr ) | ^( LOG_OP lhs= expr rhs= expr ) | ^( REL_OP lhs= expr rhs= expr ) | ^( ADD_OP lhs= expr rhs= expr ) | ^( SUB_OP lhs= expr rhs= expr ) | ^( MULT_OP lhs= expr rhs= expr ) | ^( DIV_OP lhs= expr rhs= expr ) | ^( MOD_OP lhs= expr rhs= expr ) | ^( AMPLOF lhs= expr ) | ^( AT expr expr ( expr )? ) | ^( CALLRT ID ( expr )* ) | ID | NUMBER | STRING )
            int alt10=14;
            switch ( input.LA(1) ) {
            case ASSIGN:
                {
                alt10=1;
                }
                break;
            case LOG_OP:
                {
                alt10=2;
                }
                break;
            case REL_OP:
                {
                alt10=3;
                }
                break;
            case ADD_OP:
                {
                alt10=4;
                }
                break;
            case SUB_OP:
                {
                alt10=5;
                }
                break;
            case MULT_OP:
                {
                alt10=6;
                }
                break;
            case DIV_OP:
                {
                alt10=7;
                }
                break;
            case MOD_OP:
                {
                alt10=8;
                }
                break;
            case AMPLOF:
                {
                alt10=9;
                }
                break;
            case AT:
                {
                alt10=10;
                }
                break;
            case CALLRT:
                {
                alt10=11;
                }
                break;
            case ID:
                {
                alt10=12;
                }
                break;
            case NUMBER:
                {
                alt10=13;
                }
                break;
            case STRING:
                {
                alt10=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("78:1: expr returns [Value v] : ( ^( ASSIGN lhs= expr rhs= expr ) | ^( LOG_OP lhs= expr rhs= expr ) | ^( REL_OP lhs= expr rhs= expr ) | ^( ADD_OP lhs= expr rhs= expr ) | ^( SUB_OP lhs= expr rhs= expr ) | ^( MULT_OP lhs= expr rhs= expr ) | ^( DIV_OP lhs= expr rhs= expr ) | ^( MOD_OP lhs= expr rhs= expr ) | ^( AMPLOF lhs= expr ) | ^( AT expr expr ( expr )? ) | ^( CALLRT ID ( expr )* ) | ID | NUMBER | STRING );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:79:4: ^( ASSIGN lhs= expr rhs= expr )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_expr284); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr290);
                    lhs=expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr296);
                    rhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 
                    
                    	  	
                    	  
                    	  

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:83:4: ^( LOG_OP lhs= expr rhs= expr )
                    {
                    LOG_OP1=(CommonTree)input.LT(1);
                    match(input,LOG_OP,FOLLOW_LOG_OP_in_expr304); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr310);
                    lhs=expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr316);
                    rhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 
                    
                    		try{v = lhs.logic(rhs, LOG_OP1.getText());}
                    		catch(ASMLSemanticException e){
                    			System.err.println(e.getMessage());}
                    	

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:88:4: ^( REL_OP lhs= expr rhs= expr )
                    {
                    REL_OP2=(CommonTree)input.LT(1);
                    match(input,REL_OP,FOLLOW_REL_OP_in_expr324); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr330);
                    lhs=expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr336);
                    rhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 
                    
                    		try{v = lhs.relate(rhs, REL_OP2.getText());}
                    		catch(ASMLSemanticException e){
                    			System.err.println(e.getMessage());}
                    	

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:93:4: ^( ADD_OP lhs= expr rhs= expr )
                    {
                    match(input,ADD_OP,FOLLOW_ADD_OP_in_expr344); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr350);
                    lhs=expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr356);
                    rhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 
                    
                    		try{v = lhs.add(rhs);}
                    		catch(ASMLSemanticException e){
                    			System.err.println(e.getMessage());}	
                    	

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:98:4: ^( SUB_OP lhs= expr rhs= expr )
                    {
                    match(input,SUB_OP,FOLLOW_SUB_OP_in_expr364); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr370);
                    lhs=expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr376);
                    rhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 
                    
                    		try{v = lhs.subtract(rhs);}
                    		catch(ASMLSemanticException e){
                    			System.err.println(e.getMessage());}	
                    	

                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:103:4: ^( MULT_OP lhs= expr rhs= expr )
                    {
                    match(input,MULT_OP,FOLLOW_MULT_OP_in_expr384); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr390);
                    lhs=expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr396);
                    rhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 
                    
                    		try{v = lhs.multiply(rhs);}
                    		catch(ASMLSemanticException e){
                    			System.err.println(e.getMessage());}
                    	

                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:108:4: ^( DIV_OP lhs= expr rhs= expr )
                    {
                    match(input,DIV_OP,FOLLOW_DIV_OP_in_expr404); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr410);
                    lhs=expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr416);
                    rhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 
                    
                    		try{v = lhs.divide(rhs);}
                    		catch(ASMLSemanticException e){
                    			System.err.println(e.getMessage());}
                    	

                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:113:4: ^( MOD_OP lhs= expr rhs= expr )
                    {
                    match(input,MOD_OP,FOLLOW_MOD_OP_in_expr424); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr430);
                    lhs=expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr436);
                    rhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 
                    
                    		try{v = lhs.mod(rhs);}
                    		catch(ASMLSemanticException e){
                    			System.err.println(e.getMessage());}
                    	

                    }
                    break;
                case 9 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:118:4: ^( AMPLOF lhs= expr )
                    {
                    match(input,AMPLOF,FOLLOW_AMPLOF_in_expr444); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr450);
                    lhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 
                    
                    		try{v = lhs.amplof();}
                    		catch(ASMLSemanticException e){
                    			System.err.println(e.getMessage());}
                    	

                    }
                    break;
                case 10 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:123:4: ^( AT expr expr ( expr )? )
                    {
                    match(input,AT,FOLLOW_AT_in_expr458); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr460);
                    expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr462);
                    expr();
                    _fsp--;

                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:123:19: ( expr )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==CALLRT||LA8_0==STRING||LA8_0==ID||(LA8_0>=ASSIGN && LA8_0<=AT)||LA8_0==NUMBER) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:123:19: expr
                            {
                            pushFollow(FOLLOW_expr_in_expr464);
                            expr();
                            _fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    
                    		/*Need to research referring to '?' expression*/
                    	

                    }
                    break;
                case 11 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:126:4: ^( CALLRT ID ( expr )* )
                    {
                    match(input,CALLRT,FOLLOW_CALLRT_in_expr473); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_expr475); 
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:126:16: ( expr )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==CALLRT||LA9_0==STRING||LA9_0==ID||(LA9_0>=ASSIGN && LA9_0<=AT)||LA9_0==NUMBER) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:126:16: expr
                    	    {
                    	    pushFollow(FOLLOW_expr_in_expr477);
                    	    expr();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:127:4: ID
                    {
                    match(input,ID,FOLLOW_ID_in_expr484); 


                    }
                    break;
                case 13 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:128:4: NUMBER
                    {
                    NUMBER3=(CommonTree)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_expr490); 
                    v = Value.valueOf(NUMBER3.getText());

                    }
                    break;
                case 14 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:129:4: STRING
                    {
                    STRING4=(CommonTree)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_expr496); 
                    v = new ASMLString(STRING4.getText());

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


 

    public static final BitSet FOLLOW_include_stmt_in_program44 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_fun_decl_in_program48 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_INCLUDE_in_include_stmt62 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_include_stmt64 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUN_in_fun_decl78 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPE_in_fun_decl80 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_fun_decl84 = new BitSet(new long[]{0x00000FFFFFFFFFF0L});
    public static final BitSet FOLLOW_param_in_fun_decl86 = new BitSet(new long[]{0x00000FFFFFFFFFF0L});
    public static final BitSet FOLLOW_BLOCKRT_in_block101 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stmt_in_block103 = new BitSet(new long[]{0x0000000BFF7A2258L});
    public static final BitSet FOLLOW_decl_in_stmt117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_stmt127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_stmt132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_stmt137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_stmt_in_stmt142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_stmt147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_stmt159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_if_stmt161 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_block_in_if_stmt163 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_block_in_if_stmt166 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt177 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_while_stmt179 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_block_in_while_stmt181 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_for_stmt191 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_for_stmt193 = new BitSet(new long[]{0x0000000BFF002240L});
    public static final BitSet FOLLOW_expr_in_for_stmt195 = new BitSet(new long[]{0x0000000BFF002240L});
    public static final BitSet FOLLOW_expr_in_for_stmt197 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_block_in_for_stmt199 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRINT_in_print_stmt211 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_print_stmt217 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt230 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_return_stmt232 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLRT_in_decl244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPE_in_decl246 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_decl248 = new BitSet(new long[]{0x0000000BFF002248L});
    public static final BitSet FOLLOW_expr_in_decl250 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMRT_in_param263 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPE_in_param265 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_param267 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_expr284 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr290 = new BitSet(new long[]{0x0000000BFF002240L});
    public static final BitSet FOLLOW_expr_in_expr296 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOG_OP_in_expr304 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr310 = new BitSet(new long[]{0x0000000BFF002240L});
    public static final BitSet FOLLOW_expr_in_expr316 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REL_OP_in_expr324 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr330 = new BitSet(new long[]{0x0000000BFF002240L});
    public static final BitSet FOLLOW_expr_in_expr336 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADD_OP_in_expr344 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr350 = new BitSet(new long[]{0x0000000BFF002240L});
    public static final BitSet FOLLOW_expr_in_expr356 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUB_OP_in_expr364 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr370 = new BitSet(new long[]{0x0000000BFF002240L});
    public static final BitSet FOLLOW_expr_in_expr376 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MULT_OP_in_expr384 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr390 = new BitSet(new long[]{0x0000000BFF002240L});
    public static final BitSet FOLLOW_expr_in_expr396 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_OP_in_expr404 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr410 = new BitSet(new long[]{0x0000000BFF002240L});
    public static final BitSet FOLLOW_expr_in_expr416 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_OP_in_expr424 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr430 = new BitSet(new long[]{0x0000000BFF002240L});
    public static final BitSet FOLLOW_expr_in_expr436 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AMPLOF_in_expr444 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr450 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AT_in_expr458 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr460 = new BitSet(new long[]{0x0000000BFF002240L});
    public static final BitSet FOLLOW_expr_in_expr462 = new BitSet(new long[]{0x0000000BFF002248L});
    public static final BitSet FOLLOW_expr_in_expr464 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALLRT_in_expr473 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr475 = new BitSet(new long[]{0x0000000BFF002248L});
    public static final BitSet FOLLOW_expr_in_expr477 = new BitSet(new long[]{0x0000000BFF002248L});
    public static final BitSet FOLLOW_ID_in_expr484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_expr490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expr496 = new BitSet(new long[]{0x0000000000000002L});

}