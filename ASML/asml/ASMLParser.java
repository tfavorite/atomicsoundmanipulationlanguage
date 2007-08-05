// $ANTLR 3.0 C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g 2007-08-05 12:27:01
package asml;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class ASMLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DECLRT", "PARAMRT", "CALLRT", "BLOCKRT", "INCLUDE", "STRING", "SEMI", "FUN", "TYPE", "ID", "LPARENS", "RPARENS", "END", "IF", "ELSE", "FOR", "WHILE", "RETURN", "PRINT", "COMMA", "ASSIGN", "LOG_OP", "REL_OP", "ADD_OP", "SUB_OP", "MULT_OP", "DIV_OP", "MOD_OP", "AMPLOF", "AT", "TO", "NUMBER", "COMMENT", "LETTER", "DIGIT", "INTEGER", "FRAC", "STR_CONTENT", "WS", "'!'"
    };
    public static final int INTEGER=39;
    public static final int BLOCKRT=7;
    public static final int MULT_OP=29;
    public static final int RPARENS=15;
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
    public static final int CALLRT=6;
    public static final int ID=13;
    public static final int EOF=-1;
    public static final int SEMI=10;
    public static final int PRINT=22;
    public static final int FRAC=40;
    public static final int TYPE=12;
    public static final int IF=17;
    public static final int AT=33;
    public static final int PARAMRT=5;
    public static final int WS=42;
    public static final int SUB_OP=28;
    public static final int REL_OP=26;
    public static final int COMMA=23;
    public static final int INCLUDE=8;
    public static final int ASSIGN=24;
    public static final int RETURN=21;
    public static final int DIGIT=38;
    public static final int LOG_OP=25;
    public static final int COMMENT=36;
    public static final int MOD_OP=31;
    public static final int FUN=11;
    public static final int END=16;
    public static final int STRING=9;

        public ASMLParser(TokenStream input) {
            super(input);
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g"; }

    
    	public boolean hasError = false;
    @Override
    	public void reportError(RecognitionException e){
    		super.reportError(e);
    		hasError = true;
    	}
    	


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start program
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:47:1: program : ( include_stmt )* ( fun_decl )+ ;
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        include_stmt_return include_stmt1 = null;

        fun_decl_return fun_decl2 = null;



        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:47:9: ( ( include_stmt )* ( fun_decl )+ )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:47:11: ( include_stmt )* ( fun_decl )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:47:11: ( include_stmt )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==INCLUDE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:47:12: include_stmt
            	    {
            	    pushFollow(FOLLOW_include_stmt_in_program75);
            	    include_stmt1=include_stmt();
            	    _fsp--;

            	    adaptor.addChild(root_0, include_stmt1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:47:26: ( fun_decl )+
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
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:47:27: fun_decl
            	    {
            	    pushFollow(FOLLOW_fun_decl_in_program79);
            	    fun_decl2=fun_decl();
            	    _fsp--;

            	    adaptor.addChild(root_0, fun_decl2.getTree());

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

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end program

    public static class include_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start include_stmt
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:49:1: include_stmt : INCLUDE STRING SEMI ;
    public final include_stmt_return include_stmt() throws RecognitionException {
        include_stmt_return retval = new include_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INCLUDE3=null;
        Token STRING4=null;
        Token SEMI5=null;

        CommonTree INCLUDE3_tree=null;
        CommonTree STRING4_tree=null;
        CommonTree SEMI5_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:50:2: ( INCLUDE STRING SEMI )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:50:5: INCLUDE STRING SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            INCLUDE3=(Token)input.LT(1);
            match(input,INCLUDE,FOLLOW_INCLUDE_in_include_stmt91); 
            INCLUDE3_tree = (CommonTree)adaptor.create(INCLUDE3);
            root_0 = (CommonTree)adaptor.becomeRoot(INCLUDE3_tree, root_0);

            STRING4=(Token)input.LT(1);
            match(input,STRING,FOLLOW_STRING_in_include_stmt94); 
            STRING4_tree = (CommonTree)adaptor.create(STRING4);
            adaptor.addChild(root_0, STRING4_tree);

            SEMI5=(Token)input.LT(1);
            match(input,SEMI,FOLLOW_SEMI_in_include_stmt96); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end include_stmt

    public static class fun_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start fun_decl
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:51:1: fun_decl : FUN TYPE ID LPARENS ( params )? RPARENS block FUN -> ^( FUN TYPE ID ( params )? block ) ;
    public final fun_decl_return fun_decl() throws RecognitionException {
        fun_decl_return retval = new fun_decl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FUN6=null;
        Token TYPE7=null;
        Token ID8=null;
        Token LPARENS9=null;
        Token RPARENS11=null;
        Token FUN13=null;
        params_return params10 = null;

        block_return block12 = null;


        CommonTree FUN6_tree=null;
        CommonTree TYPE7_tree=null;
        CommonTree ID8_tree=null;
        CommonTree LPARENS9_tree=null;
        CommonTree RPARENS11_tree=null;
        CommonTree FUN13_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_FUN=new RewriteRuleTokenStream(adaptor,"token FUN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:51:9: ( FUN TYPE ID LPARENS ( params )? RPARENS block FUN -> ^( FUN TYPE ID ( params )? block ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:51:11: FUN TYPE ID LPARENS ( params )? RPARENS block FUN
            {
            FUN6=(Token)input.LT(1);
            match(input,FUN,FOLLOW_FUN_in_fun_decl103); 
            stream_FUN.add(FUN6);

            TYPE7=(Token)input.LT(1);
            match(input,TYPE,FOLLOW_TYPE_in_fun_decl105); 
            stream_TYPE.add(TYPE7);

            ID8=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_fun_decl107); 
            stream_ID.add(ID8);

            LPARENS9=(Token)input.LT(1);
            match(input,LPARENS,FOLLOW_LPARENS_in_fun_decl109); 
            stream_LPARENS.add(LPARENS9);

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:51:31: ( params )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TYPE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:51:31: params
                    {
                    pushFollow(FOLLOW_params_in_fun_decl111);
                    params10=params();
                    _fsp--;

                    stream_params.add(params10.getTree());

                    }
                    break;

            }

            RPARENS11=(Token)input.LT(1);
            match(input,RPARENS,FOLLOW_RPARENS_in_fun_decl114); 
            stream_RPARENS.add(RPARENS11);

            pushFollow(FOLLOW_block_in_fun_decl116);
            block12=block();
            _fsp--;

            stream_block.add(block12.getTree());
            FUN13=(Token)input.LT(1);
            match(input,FUN,FOLLOW_FUN_in_fun_decl118); 
            stream_FUN.add(FUN13);


            // AST REWRITE
            // elements: params, FUN, TYPE, ID, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 51:57: -> ^( FUN TYPE ID ( params )? block )
            {
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:51:60: ^( FUN TYPE ID ( params )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_FUN.next(), root_1);

                adaptor.addChild(root_1, stream_TYPE.next());
                adaptor.addChild(root_1, stream_ID.next());
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:51:74: ( params )?
                if ( stream_params.hasNext() ) {
                    adaptor.addChild(root_1, stream_params.next());

                }
                stream_params.reset();
                adaptor.addChild(root_1, stream_block.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end fun_decl

    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start block
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:53:1: block : ( stmt )* END -> ^( BLOCKRT ( stmt )* ) ;
    public final block_return block() throws RecognitionException {
        block_return retval = new block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token END15=null;
        stmt_return stmt14 = null;


        CommonTree END15_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:53:7: ( ( stmt )* END -> ^( BLOCKRT ( stmt )* ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:53:9: ( stmt )* END
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:53:9: ( stmt )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==STRING||(LA4_0>=TYPE && LA4_0<=LPARENS)||LA4_0==IF||(LA4_0>=FOR && LA4_0<=PRINT)||LA4_0==SUB_OP||LA4_0==AMPLOF||LA4_0==NUMBER||LA4_0==43) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:53:9: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_block141);
            	    stmt14=stmt();
            	    _fsp--;

            	    stream_stmt.add(stmt14.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            END15=(Token)input.LT(1);
            match(input,END,FOLLOW_END_in_block144); 
            stream_END.add(END15);


            // AST REWRITE
            // elements: stmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 53:20: -> ^( BLOCKRT ( stmt )* )
            {
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:53:23: ^( BLOCKRT ( stmt )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(BLOCKRT, "BLOCKRT"), root_1);

                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:53:33: ( stmt )*
                while ( stream_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmt.next());

                }
                stream_stmt.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end block

    public static class stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start stmt
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:56:1: stmt : ( decl SEMI | expr SEMI | if_stmt | while_stmt | for_stmt | print_stmt | return_stmt );
    public final stmt_return stmt() throws RecognitionException {
        stmt_return retval = new stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMI17=null;
        Token SEMI19=null;
        decl_return decl16 = null;

        expr_return expr18 = null;

        if_stmt_return if_stmt20 = null;

        while_stmt_return while_stmt21 = null;

        for_stmt_return for_stmt22 = null;

        print_stmt_return print_stmt23 = null;

        return_stmt_return return_stmt24 = null;


        CommonTree SEMI17_tree=null;
        CommonTree SEMI19_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:56:6: ( decl SEMI | expr SEMI | if_stmt | while_stmt | for_stmt | print_stmt | return_stmt )
            int alt5=7;
            switch ( input.LA(1) ) {
            case TYPE:
                {
                alt5=1;
                }
                break;
            case STRING:
            case ID:
            case LPARENS:
            case SUB_OP:
            case AMPLOF:
            case NUMBER:
            case 43:
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
                    new NoViableAltException("56:1: stmt : ( decl SEMI | expr SEMI | if_stmt | while_stmt | for_stmt | print_stmt | return_stmt );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:56:8: decl SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_decl_in_stmt163);
                    decl16=decl();
                    _fsp--;

                    adaptor.addChild(root_0, decl16.getTree());
                    SEMI17=(Token)input.LT(1);
                    match(input,SEMI,FOLLOW_SEMI_in_stmt165); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:57:4: expr SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_stmt171);
                    expr18=expr();
                    _fsp--;

                    adaptor.addChild(root_0, expr18.getTree());
                    SEMI19=(Token)input.LT(1);
                    match(input,SEMI,FOLLOW_SEMI_in_stmt173); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:58:4: if_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_stmt_in_stmt179);
                    if_stmt20=if_stmt();
                    _fsp--;

                    adaptor.addChild(root_0, if_stmt20.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:59:4: while_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_stmt_in_stmt184);
                    while_stmt21=while_stmt();
                    _fsp--;

                    adaptor.addChild(root_0, while_stmt21.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:60:4: for_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_for_stmt_in_stmt189);
                    for_stmt22=for_stmt();
                    _fsp--;

                    adaptor.addChild(root_0, for_stmt22.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:61:4: print_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_print_stmt_in_stmt194);
                    print_stmt23=print_stmt();
                    _fsp--;

                    adaptor.addChild(root_0, print_stmt23.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:62:4: return_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_return_stmt_in_stmt199);
                    return_stmt24=return_stmt();
                    _fsp--;

                    adaptor.addChild(root_0, return_stmt24.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end stmt

    public static class if_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start if_stmt
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:64:1: if_stmt : IF LPARENS expr RPARENS block ( ELSE block )? IF ;
    public final if_stmt_return if_stmt() throws RecognitionException {
        if_stmt_return retval = new if_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF25=null;
        Token LPARENS26=null;
        Token RPARENS28=null;
        Token ELSE30=null;
        Token IF32=null;
        expr_return expr27 = null;

        block_return block29 = null;

        block_return block31 = null;


        CommonTree IF25_tree=null;
        CommonTree LPARENS26_tree=null;
        CommonTree RPARENS28_tree=null;
        CommonTree ELSE30_tree=null;
        CommonTree IF32_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:64:9: ( IF LPARENS expr RPARENS block ( ELSE block )? IF )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:64:11: IF LPARENS expr RPARENS block ( ELSE block )? IF
            {
            root_0 = (CommonTree)adaptor.nil();

            IF25=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_if_stmt207); 
            IF25_tree = (CommonTree)adaptor.create(IF25);
            root_0 = (CommonTree)adaptor.becomeRoot(IF25_tree, root_0);

            LPARENS26=(Token)input.LT(1);
            match(input,LPARENS,FOLLOW_LPARENS_in_if_stmt210); 
            pushFollow(FOLLOW_expr_in_if_stmt213);
            expr27=expr();
            _fsp--;

            adaptor.addChild(root_0, expr27.getTree());
            RPARENS28=(Token)input.LT(1);
            match(input,RPARENS,FOLLOW_RPARENS_in_if_stmt215); 
            pushFollow(FOLLOW_block_in_if_stmt218);
            block29=block();
            _fsp--;

            adaptor.addChild(root_0, block29.getTree());
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:64:44: ( ELSE block )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ELSE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:64:45: ELSE block
                    {
                    ELSE30=(Token)input.LT(1);
                    match(input,ELSE,FOLLOW_ELSE_in_if_stmt221); 
                    pushFollow(FOLLOW_block_in_if_stmt224);
                    block31=block();
                    _fsp--;

                    adaptor.addChild(root_0, block31.getTree());

                    }
                    break;

            }

            IF32=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_if_stmt228); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class for_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start for_stmt
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:66:1: for_stmt : FOR LPARENS expr SEMI expr SEMI expr RPARENS block FOR ;
    public final for_stmt_return for_stmt() throws RecognitionException {
        for_stmt_return retval = new for_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FOR33=null;
        Token LPARENS34=null;
        Token SEMI36=null;
        Token SEMI38=null;
        Token RPARENS40=null;
        Token FOR42=null;
        expr_return expr35 = null;

        expr_return expr37 = null;

        expr_return expr39 = null;

        block_return block41 = null;


        CommonTree FOR33_tree=null;
        CommonTree LPARENS34_tree=null;
        CommonTree SEMI36_tree=null;
        CommonTree SEMI38_tree=null;
        CommonTree RPARENS40_tree=null;
        CommonTree FOR42_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:66:9: ( FOR LPARENS expr SEMI expr SEMI expr RPARENS block FOR )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:66:11: FOR LPARENS expr SEMI expr SEMI expr RPARENS block FOR
            {
            root_0 = (CommonTree)adaptor.nil();

            FOR33=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_for_stmt236); 
            FOR33_tree = (CommonTree)adaptor.create(FOR33);
            root_0 = (CommonTree)adaptor.becomeRoot(FOR33_tree, root_0);

            LPARENS34=(Token)input.LT(1);
            match(input,LPARENS,FOLLOW_LPARENS_in_for_stmt239); 
            pushFollow(FOLLOW_expr_in_for_stmt242);
            expr35=expr();
            _fsp--;

            adaptor.addChild(root_0, expr35.getTree());
            SEMI36=(Token)input.LT(1);
            match(input,SEMI,FOLLOW_SEMI_in_for_stmt244); 
            pushFollow(FOLLOW_expr_in_for_stmt247);
            expr37=expr();
            _fsp--;

            adaptor.addChild(root_0, expr37.getTree());
            SEMI38=(Token)input.LT(1);
            match(input,SEMI,FOLLOW_SEMI_in_for_stmt249); 
            pushFollow(FOLLOW_expr_in_for_stmt252);
            expr39=expr();
            _fsp--;

            adaptor.addChild(root_0, expr39.getTree());
            RPARENS40=(Token)input.LT(1);
            match(input,RPARENS,FOLLOW_RPARENS_in_for_stmt254); 
            pushFollow(FOLLOW_block_in_for_stmt257);
            block41=block();
            _fsp--;

            adaptor.addChild(root_0, block41.getTree());
            FOR42=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_for_stmt259); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end for_stmt

    public static class while_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start while_stmt
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:67:1: while_stmt : WHILE LPARENS expr RPARENS block WHILE ;
    public final while_stmt_return while_stmt() throws RecognitionException {
        while_stmt_return retval = new while_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHILE43=null;
        Token LPARENS44=null;
        Token RPARENS46=null;
        Token WHILE48=null;
        expr_return expr45 = null;

        block_return block47 = null;


        CommonTree WHILE43_tree=null;
        CommonTree LPARENS44_tree=null;
        CommonTree RPARENS46_tree=null;
        CommonTree WHILE48_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:68:2: ( WHILE LPARENS expr RPARENS block WHILE )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:68:4: WHILE LPARENS expr RPARENS block WHILE
            {
            root_0 = (CommonTree)adaptor.nil();

            WHILE43=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_while_stmt268); 
            WHILE43_tree = (CommonTree)adaptor.create(WHILE43);
            root_0 = (CommonTree)adaptor.becomeRoot(WHILE43_tree, root_0);

            LPARENS44=(Token)input.LT(1);
            match(input,LPARENS,FOLLOW_LPARENS_in_while_stmt271); 
            pushFollow(FOLLOW_expr_in_while_stmt274);
            expr45=expr();
            _fsp--;

            adaptor.addChild(root_0, expr45.getTree());
            RPARENS46=(Token)input.LT(1);
            match(input,RPARENS,FOLLOW_RPARENS_in_while_stmt276); 
            pushFollow(FOLLOW_block_in_while_stmt279);
            block47=block();
            _fsp--;

            adaptor.addChild(root_0, block47.getTree());
            WHILE48=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_while_stmt281); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end while_stmt

    public static class return_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start return_stmt
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:69:1: return_stmt : RETURN expr SEMI ;
    public final return_stmt_return return_stmt() throws RecognitionException {
        return_stmt_return retval = new return_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RETURN49=null;
        Token SEMI51=null;
        expr_return expr50 = null;


        CommonTree RETURN49_tree=null;
        CommonTree SEMI51_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:70:2: ( RETURN expr SEMI )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:70:4: RETURN expr SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            RETURN49=(Token)input.LT(1);
            match(input,RETURN,FOLLOW_RETURN_in_return_stmt290); 
            RETURN49_tree = (CommonTree)adaptor.create(RETURN49);
            root_0 = (CommonTree)adaptor.becomeRoot(RETURN49_tree, root_0);

            pushFollow(FOLLOW_expr_in_return_stmt293);
            expr50=expr();
            _fsp--;

            adaptor.addChild(root_0, expr50.getTree());
            SEMI51=(Token)input.LT(1);
            match(input,SEMI,FOLLOW_SEMI_in_return_stmt295); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end return_stmt

    public static class print_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start print_stmt
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:71:1: print_stmt : PRINT expr SEMI ;
    public final print_stmt_return print_stmt() throws RecognitionException {
        print_stmt_return retval = new print_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PRINT52=null;
        Token SEMI54=null;
        expr_return expr53 = null;


        CommonTree PRINT52_tree=null;
        CommonTree SEMI54_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:71:11: ( PRINT expr SEMI )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:71:13: PRINT expr SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            PRINT52=(Token)input.LT(1);
            match(input,PRINT,FOLLOW_PRINT_in_print_stmt302); 
            PRINT52_tree = (CommonTree)adaptor.create(PRINT52);
            root_0 = (CommonTree)adaptor.becomeRoot(PRINT52_tree, root_0);

            pushFollow(FOLLOW_expr_in_print_stmt305);
            expr53=expr();
            _fsp--;

            adaptor.addChild(root_0, expr53.getTree());
            SEMI54=(Token)input.LT(1);
            match(input,SEMI,FOLLOW_SEMI_in_print_stmt307); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end print_stmt

    public static class params_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start params
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:74:1: params : param ( COMMA params )? ;
    public final params_return params() throws RecognitionException {
        params_return retval = new params_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA56=null;
        param_return param55 = null;

        params_return params57 = null;


        CommonTree COMMA56_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:74:8: ( param ( COMMA params )? )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:74:10: param ( COMMA params )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_param_in_params318);
            param55=param();
            _fsp--;

            adaptor.addChild(root_0, param55.getTree());
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:74:16: ( COMMA params )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==COMMA) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:74:17: COMMA params
                    {
                    COMMA56=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_params321); 
                    pushFollow(FOLLOW_params_in_params324);
                    params57=params();
                    _fsp--;

                    adaptor.addChild(root_0, params57.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end params

    public static class param_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start param
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:75:1: param : TYPE ID -> ^( PARAMRT TYPE ID ) ;
    public final param_return param() throws RecognitionException {
        param_return retval = new param_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TYPE58=null;
        Token ID59=null;

        CommonTree TYPE58_tree=null;
        CommonTree ID59_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:75:7: ( TYPE ID -> ^( PARAMRT TYPE ID ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:75:9: TYPE ID
            {
            TYPE58=(Token)input.LT(1);
            match(input,TYPE,FOLLOW_TYPE_in_param333); 
            stream_TYPE.add(TYPE58);

            ID59=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_param335); 
            stream_ID.add(ID59);


            // AST REWRITE
            // elements: ID, TYPE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 75:18: -> ^( PARAMRT TYPE ID )
            {
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:75:21: ^( PARAMRT TYPE ID )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(PARAMRT, "PARAMRT"), root_1);

                adaptor.addChild(root_1, stream_TYPE.next());
                adaptor.addChild(root_1, stream_ID.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end param

    public static class decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start decl
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:76:1: decl : TYPE ID ( ASSIGN expr )? -> ^( DECLRT TYPE ID ( expr )? ) ;
    public final decl_return decl() throws RecognitionException {
        decl_return retval = new decl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TYPE60=null;
        Token ID61=null;
        Token ASSIGN62=null;
        expr_return expr63 = null;


        CommonTree TYPE60_tree=null;
        CommonTree ID61_tree=null;
        CommonTree ASSIGN62_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:76:6: ( TYPE ID ( ASSIGN expr )? -> ^( DECLRT TYPE ID ( expr )? ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:77:2: TYPE ID ( ASSIGN expr )?
            {
            TYPE60=(Token)input.LT(1);
            match(input,TYPE,FOLLOW_TYPE_in_decl355); 
            stream_TYPE.add(TYPE60);

            ID61=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_decl357); 
            stream_ID.add(ID61);

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:77:10: ( ASSIGN expr )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ASSIGN) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:77:11: ASSIGN expr
                    {
                    ASSIGN62=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_decl360); 
                    stream_ASSIGN.add(ASSIGN62);

                    pushFollow(FOLLOW_expr_in_decl362);
                    expr63=expr();
                    _fsp--;

                    stream_expr.add(expr63.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: TYPE, ID, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 77:25: -> ^( DECLRT TYPE ID ( expr )? )
            {
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:77:28: ^( DECLRT TYPE ID ( expr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(DECLRT, "DECLRT"), root_1);

                adaptor.addChild(root_1, stream_TYPE.next());
                adaptor.addChild(root_1, stream_ID.next());
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:77:45: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.next());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end decl

    public static class expr_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start expr_list
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:79:1: expr_list : expr ( COMMA expr_list )? ;
    public final expr_list_return expr_list() throws RecognitionException {
        expr_list_return retval = new expr_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA65=null;
        expr_return expr64 = null;

        expr_list_return expr_list66 = null;


        CommonTree COMMA65_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:80:2: ( expr ( COMMA expr_list )? )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:80:4: expr ( COMMA expr_list )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_in_expr_list386);
            expr64=expr();
            _fsp--;

            adaptor.addChild(root_0, expr64.getTree());
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:80:9: ( COMMA expr_list )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==COMMA) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:80:10: COMMA expr_list
                    {
                    COMMA65=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_expr_list389); 
                    pushFollow(FOLLOW_expr_list_in_expr_list392);
                    expr_list66=expr_list();
                    _fsp--;

                    adaptor.addChild(root_0, expr_list66.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end expr_list

    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start expr
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:81:1: expr : log_expr ( ASSIGN expr )? ;
    public final expr_return expr() throws RecognitionException {
        expr_return retval = new expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASSIGN68=null;
        log_expr_return log_expr67 = null;

        expr_return expr69 = null;


        CommonTree ASSIGN68_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:81:6: ( log_expr ( ASSIGN expr )? )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:81:8: log_expr ( ASSIGN expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_log_expr_in_expr401);
            log_expr67=log_expr();
            _fsp--;

            adaptor.addChild(root_0, log_expr67.getTree());
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:81:17: ( ASSIGN expr )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ASSIGN) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:81:18: ASSIGN expr
                    {
                    ASSIGN68=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_expr404); 
                    ASSIGN68_tree = (CommonTree)adaptor.create(ASSIGN68);
                    root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN68_tree, root_0);

                    pushFollow(FOLLOW_expr_in_expr407);
                    expr69=expr();
                    _fsp--;

                    adaptor.addChild(root_0, expr69.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end expr

    public static class log_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start log_expr
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:82:1: log_expr : rel_expr ( LOG_OP rel_expr )* ;
    public final log_expr_return log_expr() throws RecognitionException {
        log_expr_return retval = new log_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LOG_OP71=null;
        rel_expr_return rel_expr70 = null;

        rel_expr_return rel_expr72 = null;


        CommonTree LOG_OP71_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:82:9: ( rel_expr ( LOG_OP rel_expr )* )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:82:11: rel_expr ( LOG_OP rel_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_rel_expr_in_log_expr415);
            rel_expr70=rel_expr();
            _fsp--;

            adaptor.addChild(root_0, rel_expr70.getTree());
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:82:20: ( LOG_OP rel_expr )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==LOG_OP) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:82:21: LOG_OP rel_expr
            	    {
            	    LOG_OP71=(Token)input.LT(1);
            	    match(input,LOG_OP,FOLLOW_LOG_OP_in_log_expr418); 
            	    LOG_OP71_tree = (CommonTree)adaptor.create(LOG_OP71);
            	    root_0 = (CommonTree)adaptor.becomeRoot(LOG_OP71_tree, root_0);

            	    pushFollow(FOLLOW_rel_expr_in_log_expr421);
            	    rel_expr72=rel_expr();
            	    _fsp--;

            	    adaptor.addChild(root_0, rel_expr72.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end log_expr

    public static class rel_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start rel_expr
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:83:1: rel_expr : add_expr ( REL_OP add_expr )* ;
    public final rel_expr_return rel_expr() throws RecognitionException {
        rel_expr_return retval = new rel_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token REL_OP74=null;
        add_expr_return add_expr73 = null;

        add_expr_return add_expr75 = null;


        CommonTree REL_OP74_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:83:9: ( add_expr ( REL_OP add_expr )* )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:83:11: add_expr ( REL_OP add_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_add_expr_in_rel_expr429);
            add_expr73=add_expr();
            _fsp--;

            adaptor.addChild(root_0, add_expr73.getTree());
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:83:20: ( REL_OP add_expr )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==REL_OP) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:83:21: REL_OP add_expr
            	    {
            	    REL_OP74=(Token)input.LT(1);
            	    match(input,REL_OP,FOLLOW_REL_OP_in_rel_expr432); 
            	    REL_OP74_tree = (CommonTree)adaptor.create(REL_OP74);
            	    root_0 = (CommonTree)adaptor.becomeRoot(REL_OP74_tree, root_0);

            	    pushFollow(FOLLOW_add_expr_in_rel_expr435);
            	    add_expr75=add_expr();
            	    _fsp--;

            	    adaptor.addChild(root_0, add_expr75.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end rel_expr

    public static class add_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start add_expr
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:84:1: add_expr : mult_expr ( ( ADD_OP | SUB_OP ) mult_expr )* ;
    public final add_expr_return add_expr() throws RecognitionException {
        add_expr_return retval = new add_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ADD_OP77=null;
        Token SUB_OP78=null;
        mult_expr_return mult_expr76 = null;

        mult_expr_return mult_expr79 = null;


        CommonTree ADD_OP77_tree=null;
        CommonTree SUB_OP78_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:84:9: ( mult_expr ( ( ADD_OP | SUB_OP ) mult_expr )* )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:84:11: mult_expr ( ( ADD_OP | SUB_OP ) mult_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_mult_expr_in_add_expr443);
            mult_expr76=mult_expr();
            _fsp--;

            adaptor.addChild(root_0, mult_expr76.getTree());
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:84:21: ( ( ADD_OP | SUB_OP ) mult_expr )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=ADD_OP && LA14_0<=SUB_OP)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:84:22: ( ADD_OP | SUB_OP ) mult_expr
            	    {
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:84:22: ( ADD_OP | SUB_OP )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==ADD_OP) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==SUB_OP) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("84:22: ( ADD_OP | SUB_OP )", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:84:23: ADD_OP
            	            {
            	            ADD_OP77=(Token)input.LT(1);
            	            match(input,ADD_OP,FOLLOW_ADD_OP_in_add_expr447); 
            	            ADD_OP77_tree = (CommonTree)adaptor.create(ADD_OP77);
            	            root_0 = (CommonTree)adaptor.becomeRoot(ADD_OP77_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:84:33: SUB_OP
            	            {
            	            SUB_OP78=(Token)input.LT(1);
            	            match(input,SUB_OP,FOLLOW_SUB_OP_in_add_expr452); 
            	            SUB_OP78_tree = (CommonTree)adaptor.create(SUB_OP78);
            	            root_0 = (CommonTree)adaptor.becomeRoot(SUB_OP78_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_mult_expr_in_add_expr456);
            	    mult_expr79=mult_expr();
            	    _fsp--;

            	    adaptor.addChild(root_0, mult_expr79.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end add_expr

    public static class mult_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start mult_expr
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:85:1: mult_expr : unary_expr ( ( MULT_OP | DIV_OP | MOD_OP ) unary_expr )* ;
    public final mult_expr_return mult_expr() throws RecognitionException {
        mult_expr_return retval = new mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MULT_OP81=null;
        Token DIV_OP82=null;
        Token MOD_OP83=null;
        unary_expr_return unary_expr80 = null;

        unary_expr_return unary_expr84 = null;


        CommonTree MULT_OP81_tree=null;
        CommonTree DIV_OP82_tree=null;
        CommonTree MOD_OP83_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:86:2: ( unary_expr ( ( MULT_OP | DIV_OP | MOD_OP ) unary_expr )* )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:86:4: unary_expr ( ( MULT_OP | DIV_OP | MOD_OP ) unary_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unary_expr_in_mult_expr466);
            unary_expr80=unary_expr();
            _fsp--;

            adaptor.addChild(root_0, unary_expr80.getTree());
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:86:15: ( ( MULT_OP | DIV_OP | MOD_OP ) unary_expr )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=MULT_OP && LA16_0<=MOD_OP)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:86:16: ( MULT_OP | DIV_OP | MOD_OP ) unary_expr
            	    {
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:86:16: ( MULT_OP | DIV_OP | MOD_OP )
            	    int alt15=3;
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
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("86:16: ( MULT_OP | DIV_OP | MOD_OP )", 15, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:86:17: MULT_OP
            	            {
            	            MULT_OP81=(Token)input.LT(1);
            	            match(input,MULT_OP,FOLLOW_MULT_OP_in_mult_expr470); 
            	            MULT_OP81_tree = (CommonTree)adaptor.create(MULT_OP81);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MULT_OP81_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:86:28: DIV_OP
            	            {
            	            DIV_OP82=(Token)input.LT(1);
            	            match(input,DIV_OP,FOLLOW_DIV_OP_in_mult_expr475); 
            	            DIV_OP82_tree = (CommonTree)adaptor.create(DIV_OP82);
            	            root_0 = (CommonTree)adaptor.becomeRoot(DIV_OP82_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:86:38: MOD_OP
            	            {
            	            MOD_OP83=(Token)input.LT(1);
            	            match(input,MOD_OP,FOLLOW_MOD_OP_in_mult_expr480); 
            	            MOD_OP83_tree = (CommonTree)adaptor.create(MOD_OP83);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MOD_OP83_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unary_expr_in_mult_expr484);
            	    unary_expr84=unary_expr();
            	    _fsp--;

            	    adaptor.addChild(root_0, unary_expr84.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end mult_expr

    public static class unary_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start unary_expr
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:87:1: unary_expr : ( '!' | '-' | AMPLOF )? at_expr ;
    public final unary_expr_return unary_expr() throws RecognitionException {
        unary_expr_return retval = new unary_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal85=null;
        Token char_literal86=null;
        Token AMPLOF87=null;
        at_expr_return at_expr88 = null;


        CommonTree char_literal85_tree=null;
        CommonTree char_literal86_tree=null;
        CommonTree AMPLOF87_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:88:2: ( ( '!' | '-' | AMPLOF )? at_expr )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:88:4: ( '!' | '-' | AMPLOF )? at_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:88:4: ( '!' | '-' | AMPLOF )?
            int alt17=4;
            switch ( input.LA(1) ) {
                case 43:
                    {
                    alt17=1;
                    }
                    break;
                case SUB_OP:
                    {
                    alt17=2;
                    }
                    break;
                case AMPLOF:
                    {
                    alt17=3;
                    }
                    break;
            }

            switch (alt17) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:88:5: '!'
                    {
                    char_literal85=(Token)input.LT(1);
                    match(input,43,FOLLOW_43_in_unary_expr496); 
                    char_literal85_tree = (CommonTree)adaptor.create(char_literal85);
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal85_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:88:12: '-'
                    {
                    char_literal86=(Token)input.LT(1);
                    match(input,SUB_OP,FOLLOW_SUB_OP_in_unary_expr501); 
                    char_literal86_tree = (CommonTree)adaptor.create(char_literal86);
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal86_tree, root_0);


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:88:19: AMPLOF
                    {
                    AMPLOF87=(Token)input.LT(1);
                    match(input,AMPLOF,FOLLOW_AMPLOF_in_unary_expr506); 
                    AMPLOF87_tree = (CommonTree)adaptor.create(AMPLOF87);
                    root_0 = (CommonTree)adaptor.becomeRoot(AMPLOF87_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_at_expr_in_unary_expr511);
            at_expr88=at_expr();
            _fsp--;

            adaptor.addChild(root_0, at_expr88.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end unary_expr

    public static class at_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start at_expr
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:89:1: at_expr : fun_call ( AT fun_call ( TO fun_call )? )* ;
    public final at_expr_return at_expr() throws RecognitionException {
        at_expr_return retval = new at_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AT90=null;
        Token TO92=null;
        fun_call_return fun_call89 = null;

        fun_call_return fun_call91 = null;

        fun_call_return fun_call93 = null;


        CommonTree AT90_tree=null;
        CommonTree TO92_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:89:9: ( fun_call ( AT fun_call ( TO fun_call )? )* )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:89:11: fun_call ( AT fun_call ( TO fun_call )? )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_fun_call_in_at_expr519);
            fun_call89=fun_call();
            _fsp--;

            adaptor.addChild(root_0, fun_call89.getTree());
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:89:20: ( AT fun_call ( TO fun_call )? )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==AT) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:89:21: AT fun_call ( TO fun_call )?
            	    {
            	    AT90=(Token)input.LT(1);
            	    match(input,AT,FOLLOW_AT_in_at_expr522); 
            	    AT90_tree = (CommonTree)adaptor.create(AT90);
            	    root_0 = (CommonTree)adaptor.becomeRoot(AT90_tree, root_0);

            	    pushFollow(FOLLOW_fun_call_in_at_expr525);
            	    fun_call91=fun_call();
            	    _fsp--;

            	    adaptor.addChild(root_0, fun_call91.getTree());
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:89:34: ( TO fun_call )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==TO) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:89:35: TO fun_call
            	            {
            	            TO92=(Token)input.LT(1);
            	            match(input,TO,FOLLOW_TO_in_at_expr528); 
            	            pushFollow(FOLLOW_fun_call_in_at_expr531);
            	            fun_call93=fun_call();
            	            _fsp--;

            	            adaptor.addChild(root_0, fun_call93.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end at_expr

    public static class fun_call_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start fun_call
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:91:1: fun_call : ( ID LPARENS ( expr_list )? RPARENS -> ^( CALLRT ID ( expr_list )? ) | top_expr -> top_expr );
    public final fun_call_return fun_call() throws RecognitionException {
        fun_call_return retval = new fun_call_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID94=null;
        Token LPARENS95=null;
        Token RPARENS97=null;
        expr_list_return expr_list96 = null;

        top_expr_return top_expr98 = null;


        CommonTree ID94_tree=null;
        CommonTree LPARENS95_tree=null;
        CommonTree RPARENS97_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_top_expr=new RewriteRuleSubtreeStream(adaptor,"rule top_expr");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:91:9: ( ID LPARENS ( expr_list )? RPARENS -> ^( CALLRT ID ( expr_list )? ) | top_expr -> top_expr )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==LPARENS) ) {
                    alt21=1;
                }
                else if ( (LA21_1==SEMI||LA21_1==RPARENS||(LA21_1>=COMMA && LA21_1<=MOD_OP)||(LA21_1>=AT && LA21_1<=TO)) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("91:1: fun_call : ( ID LPARENS ( expr_list )? RPARENS -> ^( CALLRT ID ( expr_list )? ) | top_expr -> top_expr );", 21, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA21_0==STRING||LA21_0==LPARENS||LA21_0==NUMBER) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("91:1: fun_call : ( ID LPARENS ( expr_list )? RPARENS -> ^( CALLRT ID ( expr_list )? ) | top_expr -> top_expr );", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:91:11: ID LPARENS ( expr_list )? RPARENS
                    {
                    ID94=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_fun_call542); 
                    stream_ID.add(ID94);

                    LPARENS95=(Token)input.LT(1);
                    match(input,LPARENS,FOLLOW_LPARENS_in_fun_call544); 
                    stream_LPARENS.add(LPARENS95);

                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:91:22: ( expr_list )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==STRING||(LA20_0>=ID && LA20_0<=LPARENS)||LA20_0==SUB_OP||LA20_0==AMPLOF||LA20_0==NUMBER||LA20_0==43) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:91:22: expr_list
                            {
                            pushFollow(FOLLOW_expr_list_in_fun_call546);
                            expr_list96=expr_list();
                            _fsp--;

                            stream_expr_list.add(expr_list96.getTree());

                            }
                            break;

                    }

                    RPARENS97=(Token)input.LT(1);
                    match(input,RPARENS,FOLLOW_RPARENS_in_fun_call549); 
                    stream_RPARENS.add(RPARENS97);


                    // AST REWRITE
                    // elements: expr_list, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 91:42: -> ^( CALLRT ID ( expr_list )? )
                    {
                        // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:91:45: ^( CALLRT ID ( expr_list )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(CALLRT, "CALLRT"), root_1);

                        adaptor.addChild(root_1, stream_ID.next());
                        // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:91:57: ( expr_list )?
                        if ( stream_expr_list.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr_list.next());

                        }
                        stream_expr_list.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:92:5: top_expr
                    {
                    pushFollow(FOLLOW_top_expr_in_fun_call567);
                    top_expr98=top_expr();
                    _fsp--;

                    stream_top_expr.add(top_expr98.getTree());

                    // AST REWRITE
                    // elements: top_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 92:16: -> top_expr
                    {
                        adaptor.addChild(root_0, stream_top_expr.next());

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end fun_call

    public static class top_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start top_expr
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:94:1: top_expr : ( LPARENS expr RPARENS | NUMBER | STRING | ID );
    public final top_expr_return top_expr() throws RecognitionException {
        top_expr_return retval = new top_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPARENS99=null;
        Token RPARENS101=null;
        Token NUMBER102=null;
        Token STRING103=null;
        Token ID104=null;
        expr_return expr100 = null;


        CommonTree LPARENS99_tree=null;
        CommonTree RPARENS101_tree=null;
        CommonTree NUMBER102_tree=null;
        CommonTree STRING103_tree=null;
        CommonTree ID104_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:94:9: ( LPARENS expr RPARENS | NUMBER | STRING | ID )
            int alt22=4;
            switch ( input.LA(1) ) {
            case LPARENS:
                {
                alt22=1;
                }
                break;
            case NUMBER:
                {
                alt22=2;
                }
                break;
            case STRING:
                {
                alt22=3;
                }
                break;
            case ID:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("94:1: top_expr : ( LPARENS expr RPARENS | NUMBER | STRING | ID );", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:94:11: LPARENS expr RPARENS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LPARENS99=(Token)input.LT(1);
                    match(input,LPARENS,FOLLOW_LPARENS_in_top_expr582); 
                    pushFollow(FOLLOW_expr_in_top_expr585);
                    expr100=expr();
                    _fsp--;

                    adaptor.addChild(root_0, expr100.getTree());
                    RPARENS101=(Token)input.LT(1);
                    match(input,RPARENS,FOLLOW_RPARENS_in_top_expr587); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:94:36: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NUMBER102=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_top_expr592); 
                    NUMBER102_tree = (CommonTree)adaptor.create(NUMBER102);
                    adaptor.addChild(root_0, NUMBER102_tree);


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:94:45: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING103=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_top_expr596); 
                    STRING103_tree = (CommonTree)adaptor.create(STRING103);
                    adaptor.addChild(root_0, STRING103_tree);


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:94:54: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ID104=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_top_expr600); 
                    ID104_tree = (CommonTree)adaptor.create(ID104);
                    adaptor.addChild(root_0, ID104_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end top_expr


 

    public static final BitSet FOLLOW_include_stmt_in_program75 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_fun_decl_in_program79 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_INCLUDE_in_include_stmt91 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_STRING_in_include_stmt94 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_include_stmt96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUN_in_fun_decl103 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_TYPE_in_fun_decl105 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_fun_decl107 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPARENS_in_fun_decl109 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_params_in_fun_decl111 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPARENS_in_fun_decl114 = new BitSet(new long[]{0x00000809107B7200L});
    public static final BitSet FOLLOW_block_in_fun_decl116 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_FUN_in_fun_decl118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_block141 = new BitSet(new long[]{0x00000809107B7200L});
    public static final BitSet FOLLOW_END_in_block144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_stmt163 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_stmt165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt171 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_stmt173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_stmt179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_stmt184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_stmt189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_stmt_in_stmt194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_stmt199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_stmt207 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPARENS_in_if_stmt210 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_expr_in_if_stmt213 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPARENS_in_if_stmt215 = new BitSet(new long[]{0x00000809107B7200L});
    public static final BitSet FOLLOW_block_in_if_stmt218 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_ELSE_in_if_stmt221 = new BitSet(new long[]{0x00000809107B7200L});
    public static final BitSet FOLLOW_block_in_if_stmt224 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IF_in_if_stmt228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt236 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPARENS_in_for_stmt239 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_expr_in_for_stmt242 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_for_stmt244 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_expr_in_for_stmt247 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_for_stmt249 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_expr_in_for_stmt252 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPARENS_in_for_stmt254 = new BitSet(new long[]{0x00000809107B7200L});
    public static final BitSet FOLLOW_block_in_for_stmt257 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_FOR_in_for_stmt259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt268 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPARENS_in_while_stmt271 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_expr_in_while_stmt274 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPARENS_in_while_stmt276 = new BitSet(new long[]{0x00000809107B7200L});
    public static final BitSet FOLLOW_block_in_while_stmt279 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt290 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_expr_in_return_stmt293 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_return_stmt295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print_stmt302 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_expr_in_print_stmt305 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_print_stmt307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params318 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_params321 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_params_in_params324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_param333 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_param335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_decl355 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_decl357 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ASSIGN_in_decl360 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_expr_in_decl362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list386 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_expr_list389 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_expr_list_in_expr_list392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_log_expr_in_expr401 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ASSIGN_in_expr404 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_expr_in_expr407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rel_expr_in_log_expr415 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LOG_OP_in_log_expr418 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_rel_expr_in_log_expr421 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_add_expr_in_rel_expr429 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_REL_OP_in_rel_expr432 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_add_expr_in_rel_expr435 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr443 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ADD_OP_in_add_expr447 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_SUB_OP_in_add_expr452 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr456 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr466 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_MULT_OP_in_mult_expr470 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_DIV_OP_in_mult_expr475 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_MOD_OP_in_mult_expr480 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr484 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_43_in_unary_expr496 = new BitSet(new long[]{0x0000000800006200L});
    public static final BitSet FOLLOW_SUB_OP_in_unary_expr501 = new BitSet(new long[]{0x0000000800006200L});
    public static final BitSet FOLLOW_AMPLOF_in_unary_expr506 = new BitSet(new long[]{0x0000000800006200L});
    public static final BitSet FOLLOW_at_expr_in_unary_expr511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_call_in_at_expr519 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_AT_in_at_expr522 = new BitSet(new long[]{0x0000000800006200L});
    public static final BitSet FOLLOW_fun_call_in_at_expr525 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_TO_in_at_expr528 = new BitSet(new long[]{0x0000000800006200L});
    public static final BitSet FOLLOW_fun_call_in_at_expr531 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ID_in_fun_call542 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPARENS_in_fun_call544 = new BitSet(new long[]{0x000008091000E200L});
    public static final BitSet FOLLOW_expr_list_in_fun_call546 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPARENS_in_fun_call549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_top_expr_in_fun_call567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_top_expr582 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_expr_in_top_expr585 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPARENS_in_top_expr587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_top_expr592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_top_expr596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_top_expr600 = new BitSet(new long[]{0x0000000000000002L});

}