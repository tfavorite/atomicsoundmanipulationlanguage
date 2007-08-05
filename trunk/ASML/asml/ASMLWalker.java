// $ANTLR 3.0 C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g 2007-08-05 12:31:11

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

    
    CommonTreeNodeStream stream = (CommonTreeNodeStream)input;
    ASMLControl control = null;
    public void setControl(ASMLControl aControl){
    	control = aControl;
    }



    // $ANTLR start program
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:20:1: program : ( include_stmt )* ( fun_decl )+ ;
    public final void program() throws RecognitionException {
        
        control.setStream(stream);

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:24:1: ( ( include_stmt )* ( fun_decl )+ )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:24:2: ( include_stmt )* ( fun_decl )+
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:24:2: ( include_stmt )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==INCLUDE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:24:3: include_stmt
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

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:24:17: ( fun_decl )+
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
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:24:18: fun_decl
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:26:1: include_stmt : ^( INCLUDE STRING ) ;
    public final void include_stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:26:13: ( ^( INCLUDE STRING ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:27:2: ^( INCLUDE STRING )
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:29:1: fun_decl : ^( FUN TYPE name= ID ( param )* . ) ;
    public final void fun_decl() throws RecognitionException {
        CommonTree name=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:38:1: ( ^( FUN TYPE name= ID ( param )* . ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:38:2: ^( FUN TYPE name= ID ( param )* . )
            {
            match(input,FUN,FOLLOW_FUN_in_fun_decl78); 

            match(input, Token.DOWN, null); 
            match(input,TYPE,FOLLOW_TYPE_in_fun_decl80); 
            name=(CommonTree)input.LT(1);
            match(input,ID,FOLLOW_ID_in_fun_decl84); 
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:38:21: ( param )*
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
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:38:21: param
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:40:1: block : ^( BLOCKRT ( stmt )* ) ;
    public final void block() throws RecognitionException {
        
        try{control.enterScope();}
        catch(ASMLSemanticException e){
        	System.err.println(e.getMessage());
        	System.exit(-1);
        }
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:53:1: ( ^( BLOCKRT ( stmt )* ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:53:2: ^( BLOCKRT ( stmt )* )
            {
            match(input,BLOCKRT,FOLLOW_BLOCKRT_in_block108); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:53:12: ( stmt )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==DECLRT||LA4_0==CALLRT||LA4_0==STRING||LA4_0==ID||LA4_0==IF||(LA4_0>=FOR && LA4_0<=PRINT)||(LA4_0>=ASSIGN && LA4_0<=AT)||LA4_0==NUMBER) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:53:12: stmt
                	    {
                	    pushFollow(FOLLOW_stmt_in_block110);
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

            
            try{control.exitScope();}
            catch(ASMLSemanticException e){
            	System.err.println(e.getMessage());
            	System.exit(-1);
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:55:1: stmt : ( decl | expr | if_stmt | while_stmt | for_stmt | print_stmt | return_stmt );
    public final void stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:55:6: ( decl | expr | if_stmt | while_stmt | for_stmt | print_stmt | return_stmt )
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
                    new NoViableAltException("55:1: stmt : ( decl | expr | if_stmt | while_stmt | for_stmt | print_stmt | return_stmt );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:56:4: decl
                    {
                    pushFollow(FOLLOW_decl_in_stmt124);
                    decl();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:57:4: expr
                    {
                    pushFollow(FOLLOW_expr_in_stmt129);
                    expr();
                    _fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:58:4: if_stmt
                    {
                    pushFollow(FOLLOW_if_stmt_in_stmt134);
                    if_stmt();
                    _fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:59:4: while_stmt
                    {
                    pushFollow(FOLLOW_while_stmt_in_stmt139);
                    while_stmt();
                    _fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:60:4: for_stmt
                    {
                    pushFollow(FOLLOW_for_stmt_in_stmt144);
                    for_stmt();
                    _fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:61:4: print_stmt
                    {
                    pushFollow(FOLLOW_print_stmt_in_stmt149);
                    print_stmt();
                    _fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:62:4: return_stmt
                    {
                    pushFollow(FOLLOW_return_stmt_in_stmt154);
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

    public static class if_stmt_return extends TreeRuleReturnScope {
    };

    // $ANTLR start if_stmt
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:64:1: if_stmt : ^( IF eval= expr . ( . )? ) ;
    public final if_stmt_return if_stmt() throws RecognitionException {
        if_stmt_return retval = new if_stmt_return();
        retval.start = input.LT(1);

        Value eval = null;


        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:83:1: ( ^( IF eval= expr . ( . )? ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:83:2: ^( IF eval= expr . ( . )? )
            {
            match(input,IF,FOLLOW_IF_in_if_stmt168); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_if_stmt172);
            eval=expr();
            _fsp--;

            matchAny(input); 
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:83:19: ( . )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=DECLRT && LA6_0<=43)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:83:19: .
                    {
                    matchAny(input); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

            
            if(eval.getType() != Type.INT){
            	System.err.println("Semantic exception: Expressions for conditional statements must evaluate to an int.");
            	System.exit(-1);
            	}
            if(((ASMLInteger)eval).getValue() != 0){
            	CommonTree block1=(CommonTree)((CommonTree)retval.start).getChild(1);
            	stream.push(stream.getNodeIndex(block1));
            	block();
            	stream.pop();
            	}
            else if(((CommonTree)retval.start).getChildCount() == 3){
            	CommonTree block2=(CommonTree)((CommonTree)retval.start).getChild(2);
            	stream.push(stream.getNodeIndex(block2));
            	block();
            	stream.pop();
            	}

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end if_stmt


    // $ANTLR start while_stmt
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:85:1: while_stmt : ^( WHILE expr block ) ;
    public final void while_stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:85:11: ( ^( WHILE expr block ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:86:2: ^( WHILE expr block )
            {
            match(input,WHILE,FOLLOW_WHILE_in_while_stmt187); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_while_stmt189);
            expr();
            _fsp--;

            pushFollow(FOLLOW_block_in_while_stmt191);
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:87:1: for_stmt : ^( FOR expr expr expr block ) ;
    public final void for_stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:87:9: ( ^( FOR expr expr expr block ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:88:2: ^( FOR expr expr expr block )
            {
            match(input,FOR,FOLLOW_FOR_in_for_stmt201); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_for_stmt203);
            expr();
            _fsp--;

            pushFollow(FOLLOW_expr_in_for_stmt205);
            expr();
            _fsp--;

            pushFollow(FOLLOW_expr_in_for_stmt207);
            expr();
            _fsp--;

            pushFollow(FOLLOW_block_in_for_stmt209);
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:89:1: print_stmt : ^( PRINT val= expr ) ;
    public final void print_stmt() throws RecognitionException {
        Value val = null;


        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:90:2: ( ^( PRINT val= expr ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:91:2: ^( PRINT val= expr )
            {
            match(input,PRINT,FOLLOW_PRINT_in_print_stmt221); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_print_stmt227);
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:99:1: return_stmt : ^( RETURN expr ) ;
    public final void return_stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:100:2: ( ^( RETURN expr ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:101:2: ^( RETURN expr )
            {
            match(input,RETURN,FOLLOW_RETURN_in_return_stmt240); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_return_stmt242);
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:103:1: decl : ^( DECLRT TYPE ID ( expr )? ) ;
    public final void decl() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:103:6: ( ^( DECLRT TYPE ID ( expr )? ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:104:2: ^( DECLRT TYPE ID ( expr )? )
            {
            match(input,DECLRT,FOLLOW_DECLRT_in_decl254); 

            match(input, Token.DOWN, null); 
            match(input,TYPE,FOLLOW_TYPE_in_decl256); 
            match(input,ID,FOLLOW_ID_in_decl258); 
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:104:19: ( expr )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==CALLRT||LA7_0==STRING||LA7_0==ID||(LA7_0>=ASSIGN && LA7_0<=AT)||LA7_0==NUMBER) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:104:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_decl260);
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:107:1: param : ^( PARAMRT TYPE ID ) ;
    public final void param() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:107:7: ( ^( PARAMRT TYPE ID ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:108:2: ^( PARAMRT TYPE ID )
            {
            match(input,PARAMRT,FOLLOW_PARAMRT_in_param273); 

            match(input, Token.DOWN, null); 
            match(input,TYPE,FOLLOW_TYPE_in_param275); 
            match(input,ID,FOLLOW_ID_in_param277); 

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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:110:1: expr returns [Value v] : ( ^( ASSIGN lhs= expr rhs= expr ) | ^( LOG_OP lhs= expr rhs= expr ) | ^( REL_OP lhs= expr rhs= expr ) | ^( ADD_OP lhs= expr rhs= expr ) | ^( SUB_OP lhs= expr rhs= expr ) | ^( MULT_OP lhs= expr rhs= expr ) | ^( DIV_OP lhs= expr rhs= expr ) | ^( MOD_OP lhs= expr rhs= expr ) | ^( AMPLOF lhs= expr ) | ^( AT expr expr ( expr )? ) | ^( CALLRT name= ID (par= expr )* ) | ID | NUMBER | STRING );
    public final Value expr() throws RecognitionException {
        Value v = null;

        CommonTree name=null;
        CommonTree LOG_OP1=null;
        CommonTree REL_OP2=null;
        CommonTree ID3=null;
        CommonTree NUMBER4=null;
        CommonTree STRING5=null;
        Value lhs = null;

        Value rhs = null;

        Value par = null;


        
        	ArrayList<Value> aParams = new ArrayList<Value>();
        	

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:114:2: ( ^( ASSIGN lhs= expr rhs= expr ) | ^( LOG_OP lhs= expr rhs= expr ) | ^( REL_OP lhs= expr rhs= expr ) | ^( ADD_OP lhs= expr rhs= expr ) | ^( SUB_OP lhs= expr rhs= expr ) | ^( MULT_OP lhs= expr rhs= expr ) | ^( DIV_OP lhs= expr rhs= expr ) | ^( MOD_OP lhs= expr rhs= expr ) | ^( AMPLOF lhs= expr ) | ^( AT expr expr ( expr )? ) | ^( CALLRT name= ID (par= expr )* ) | ID | NUMBER | STRING )
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
                    new NoViableAltException("110:1: expr returns [Value v] : ( ^( ASSIGN lhs= expr rhs= expr ) | ^( LOG_OP lhs= expr rhs= expr ) | ^( REL_OP lhs= expr rhs= expr ) | ^( ADD_OP lhs= expr rhs= expr ) | ^( SUB_OP lhs= expr rhs= expr ) | ^( MULT_OP lhs= expr rhs= expr ) | ^( DIV_OP lhs= expr rhs= expr ) | ^( MOD_OP lhs= expr rhs= expr ) | ^( AMPLOF lhs= expr ) | ^( AT expr expr ( expr )? ) | ^( CALLRT name= ID (par= expr )* ) | ID | NUMBER | STRING );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:115:4: ^( ASSIGN lhs= expr rhs= expr )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_expr298); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr304);
                    lhs=expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr310);
                    rhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 
                    
                    	  	
                    	  
                    	  

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:119:4: ^( LOG_OP lhs= expr rhs= expr )
                    {
                    LOG_OP1=(CommonTree)input.LT(1);
                    match(input,LOG_OP,FOLLOW_LOG_OP_in_expr318); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr324);
                    lhs=expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr330);
                    rhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 
                    
                    		try{v = lhs.logic(rhs, LOG_OP1.getText());}
                    		catch(ASMLSemanticException e){
                    			System.err.println(e.getMessage());
                    			System.exit(-1);
                    		}
                    	

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:126:4: ^( REL_OP lhs= expr rhs= expr )
                    {
                    REL_OP2=(CommonTree)input.LT(1);
                    match(input,REL_OP,FOLLOW_REL_OP_in_expr338); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr344);
                    lhs=expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr350);
                    rhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 
                    
                    		try{v = lhs.relate(rhs, REL_OP2.getText());}
                    		catch(ASMLSemanticException e){
                    			System.err.println(e.getMessage());
                    			System.exit(-1);
                    		}
                    	

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:133:4: ^( ADD_OP lhs= expr rhs= expr )
                    {
                    match(input,ADD_OP,FOLLOW_ADD_OP_in_expr358); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr364);
                    lhs=expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr370);
                    rhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 
                    
                    		try{v = lhs.add(rhs);}
                    		catch(ASMLSemanticException e){
                    			System.err.println(e.getMessage());
                    			System.exit(-1);
                    		}	
                    	

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:140:4: ^( SUB_OP lhs= expr rhs= expr )
                    {
                    match(input,SUB_OP,FOLLOW_SUB_OP_in_expr378); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr384);
                    lhs=expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr390);
                    rhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 
                    
                    		try{v = lhs.subtract(rhs);}
                    		catch(ASMLSemanticException e){
                    			System.err.println(e.getMessage());
                    			System.exit(-1);
                    		}	
                    	

                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:147:4: ^( MULT_OP lhs= expr rhs= expr )
                    {
                    match(input,MULT_OP,FOLLOW_MULT_OP_in_expr398); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr404);
                    lhs=expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr410);
                    rhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 
                    
                    		try{v = lhs.multiply(rhs);}
                    		catch(ASMLSemanticException e){
                    			System.err.println(e.getMessage());
                    			System.exit(-1);
                    		}
                    	

                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:154:4: ^( DIV_OP lhs= expr rhs= expr )
                    {
                    match(input,DIV_OP,FOLLOW_DIV_OP_in_expr418); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr424);
                    lhs=expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr430);
                    rhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 
                    
                    		try{v = lhs.divide(rhs);}
                    		catch(ASMLSemanticException e){
                    			System.err.println(e.getMessage());
                    			System.exit(-1);
                    		}
                    	

                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:161:4: ^( MOD_OP lhs= expr rhs= expr )
                    {
                    match(input,MOD_OP,FOLLOW_MOD_OP_in_expr438); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr444);
                    lhs=expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr450);
                    rhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 
                    
                    		try{v = lhs.mod(rhs);}
                    		catch(ASMLSemanticException e){
                    			System.err.println(e.getMessage());
                    			System.exit(-1);
                    		}
                    	

                    }
                    break;
                case 9 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:168:4: ^( AMPLOF lhs= expr )
                    {
                    match(input,AMPLOF,FOLLOW_AMPLOF_in_expr458); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr464);
                    lhs=expr();
                    _fsp--;


                    match(input, Token.UP, null); 
                    
                    		try{v = lhs.amplof();}
                    		catch(ASMLSemanticException e){
                    			System.err.println(e.getMessage());
                    			System.exit(-1);
                    		}
                    	

                    }
                    break;
                case 10 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:175:4: ^( AT expr expr ( expr )? )
                    {
                    match(input,AT,FOLLOW_AT_in_expr472); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr474);
                    expr();
                    _fsp--;

                    pushFollow(FOLLOW_expr_in_expr476);
                    expr();
                    _fsp--;

                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:175:19: ( expr )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==CALLRT||LA8_0==STRING||LA8_0==ID||(LA8_0>=ASSIGN && LA8_0<=AT)||LA8_0==NUMBER) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:175:19: expr
                            {
                            pushFollow(FOLLOW_expr_in_expr478);
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
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:178:4: ^( CALLRT name= ID (par= expr )* )
                    {
                    match(input,CALLRT,FOLLOW_CALLRT_in_expr487); 

                    match(input, Token.DOWN, null); 
                    name=(CommonTree)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_expr491); 
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:178:21: (par= expr )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==CALLRT||LA9_0==STRING||LA9_0==ID||(LA9_0>=ASSIGN && LA9_0<=AT)||LA9_0==NUMBER) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:178:22: par= expr
                    	    {
                    	    pushFollow(FOLLOW_expr_in_expr496);
                    	    par=expr();
                    	    _fsp--;

                    	    aParams.add(par);

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    match(input, Token.UP, null); 
                    
                    		try{
                    			v = control.doCallFunction(name.getText(), aParams);	
                    		} catch(ASMLSemanticException e){
                    			System.err.println(e.getMessage());
                    			System.exit(-1);
                    		}
                    	

                    }
                    break;
                case 12 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:186:4: ID
                    {
                    ID3=(CommonTree)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_expr506); 
                    
                    		try {
                    			v = control.getSymbol(ID3.getText());
                    		} catch(ASMLSemanticException e){
                    			System.err.println(e.getMessage());
                    			System.exit(-1);
                    		}
                    	

                    }
                    break;
                case 13 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:194:4: NUMBER
                    {
                    NUMBER4=(CommonTree)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_expr512); 
                    v = Value.valueOf(NUMBER4.getText());

                    }
                    break;
                case 14 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLWalker.g:195:4: STRING
                    {
                    STRING5=(CommonTree)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_expr518); 
                    v = new ASMLString(STRING5.getText());

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
    public static final BitSet FOLLOW_BLOCKRT_in_block108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stmt_in_block110 = new BitSet(new long[]{0x0000000BFF7A2258L});
    public static final BitSet FOLLOW_decl_in_stmt124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_stmt134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_stmt139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_stmt144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_stmt_in_stmt149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_stmt154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_stmt168 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_if_stmt172 = new BitSet(new long[]{0x00000FFFFFFFFFF0L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt187 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_while_stmt189 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_block_in_while_stmt191 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_for_stmt201 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_for_stmt203 = new BitSet(new long[]{0x0000000BFF002240L});
    public static final BitSet FOLLOW_expr_in_for_stmt205 = new BitSet(new long[]{0x0000000BFF002240L});
    public static final BitSet FOLLOW_expr_in_for_stmt207 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_block_in_for_stmt209 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRINT_in_print_stmt221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_print_stmt227 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt240 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_return_stmt242 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLRT_in_decl254 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPE_in_decl256 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_decl258 = new BitSet(new long[]{0x0000000BFF002248L});
    public static final BitSet FOLLOW_expr_in_decl260 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMRT_in_param273 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPE_in_param275 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_param277 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_expr298 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr304 = new BitSet(new long[]{0x0000000BFF002240L});
    public static final BitSet FOLLOW_expr_in_expr310 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOG_OP_in_expr318 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr324 = new BitSet(new long[]{0x0000000BFF002240L});
    public static final BitSet FOLLOW_expr_in_expr330 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REL_OP_in_expr338 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr344 = new BitSet(new long[]{0x0000000BFF002240L});
    public static final BitSet FOLLOW_expr_in_expr350 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADD_OP_in_expr358 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr364 = new BitSet(new long[]{0x0000000BFF002240L});
    public static final BitSet FOLLOW_expr_in_expr370 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUB_OP_in_expr378 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr384 = new BitSet(new long[]{0x0000000BFF002240L});
    public static final BitSet FOLLOW_expr_in_expr390 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MULT_OP_in_expr398 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr404 = new BitSet(new long[]{0x0000000BFF002240L});
    public static final BitSet FOLLOW_expr_in_expr410 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_OP_in_expr418 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr424 = new BitSet(new long[]{0x0000000BFF002240L});
    public static final BitSet FOLLOW_expr_in_expr430 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_OP_in_expr438 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr444 = new BitSet(new long[]{0x0000000BFF002240L});
    public static final BitSet FOLLOW_expr_in_expr450 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AMPLOF_in_expr458 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr464 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AT_in_expr472 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr474 = new BitSet(new long[]{0x0000000BFF002240L});
    public static final BitSet FOLLOW_expr_in_expr476 = new BitSet(new long[]{0x0000000BFF002248L});
    public static final BitSet FOLLOW_expr_in_expr478 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALLRT_in_expr487 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr491 = new BitSet(new long[]{0x0000000BFF002248L});
    public static final BitSet FOLLOW_expr_in_expr496 = new BitSet(new long[]{0x0000000BFF002248L});
    public static final BitSet FOLLOW_ID_in_expr506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_expr512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expr518 = new BitSet(new long[]{0x0000000000000002L});

}