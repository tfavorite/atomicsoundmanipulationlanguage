// $ANTLR 3.0 C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g 2007-08-08 18:33:53
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
    	
    	public void setHasError(boolean aHasError){
    		hasError = aHasError;
    	}
    	
    @Override
    	public void reportError(RecognitionException e){
    		super.reportError(e);
    		hasError = true;
    	}
    	
    	@Override
    	protected void mismatch(IntStream input, int ttype, BitSet follow) 
    		throws RecognitionException{
    		throw new MismatchedTokenException(ttype, input);
    	}
    	
    	@Override
    	public void recoverFromMismatchedSet(IntStream input, 
    		RecognitionException e, BitSet follow) throws RecognitionException{
    		throw e;
    	}	


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start program
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:71:1: program : ( include_stmt )* ( fun_decl )+ EOF ;
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF3=null;
        include_stmt_return include_stmt1 = null;

        fun_decl_return fun_decl2 = null;


        CommonTree EOF3_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:71:9: ( ( include_stmt )* ( fun_decl )+ EOF )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:71:11: ( include_stmt )* ( fun_decl )+ EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:71:11: ( include_stmt )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==INCLUDE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:71:12: include_stmt
            	    {
            	    pushFollow(FOLLOW_include_stmt_in_program82);
            	    include_stmt1=include_stmt();
            	    _fsp--;

            	    adaptor.addChild(root_0, include_stmt1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:71:26: ( fun_decl )+
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
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:71:27: fun_decl
            	    {
            	    pushFollow(FOLLOW_fun_decl_in_program86);
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

            EOF3=(Token)input.LT(1);
            match(input,EOF,FOLLOW_EOF_in_program89); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        	catch (RecognitionException e) {
        		reportError(e);
        		throw e;
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:73:1: include_stmt : INCLUDE STRING SEMI ;
    public final include_stmt_return include_stmt() throws RecognitionException {
        include_stmt_return retval = new include_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INCLUDE4=null;
        Token STRING5=null;
        Token SEMI6=null;

        CommonTree INCLUDE4_tree=null;
        CommonTree STRING5_tree=null;
        CommonTree SEMI6_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:74:2: ( INCLUDE STRING SEMI )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:74:5: INCLUDE STRING SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            INCLUDE4=(Token)input.LT(1);
            match(input,INCLUDE,FOLLOW_INCLUDE_in_include_stmt100); 
            INCLUDE4_tree = (CommonTree)adaptor.create(INCLUDE4);
            root_0 = (CommonTree)adaptor.becomeRoot(INCLUDE4_tree, root_0);

            STRING5=(Token)input.LT(1);
            match(input,STRING,FOLLOW_STRING_in_include_stmt103); 
            STRING5_tree = (CommonTree)adaptor.create(STRING5);
            adaptor.addChild(root_0, STRING5_tree);

            SEMI6=(Token)input.LT(1);
            match(input,SEMI,FOLLOW_SEMI_in_include_stmt105); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        	catch (RecognitionException e) {
        		reportError(e);
        		throw e;
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:75:1: fun_decl : FUN TYPE ID LPARENS ( params )? RPARENS block FUN -> ^( FUN TYPE ID ( params )? block ) ;
    public final fun_decl_return fun_decl() throws RecognitionException {
        fun_decl_return retval = new fun_decl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FUN7=null;
        Token TYPE8=null;
        Token ID9=null;
        Token LPARENS10=null;
        Token RPARENS12=null;
        Token FUN14=null;
        params_return params11 = null;

        block_return block13 = null;


        CommonTree FUN7_tree=null;
        CommonTree TYPE8_tree=null;
        CommonTree ID9_tree=null;
        CommonTree LPARENS10_tree=null;
        CommonTree RPARENS12_tree=null;
        CommonTree FUN14_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_FUN=new RewriteRuleTokenStream(adaptor,"token FUN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:75:9: ( FUN TYPE ID LPARENS ( params )? RPARENS block FUN -> ^( FUN TYPE ID ( params )? block ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:75:11: FUN TYPE ID LPARENS ( params )? RPARENS block FUN
            {
            FUN7=(Token)input.LT(1);
            match(input,FUN,FOLLOW_FUN_in_fun_decl112); 
            stream_FUN.add(FUN7);

            TYPE8=(Token)input.LT(1);
            match(input,TYPE,FOLLOW_TYPE_in_fun_decl114); 
            stream_TYPE.add(TYPE8);

            ID9=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_fun_decl116); 
            stream_ID.add(ID9);

            LPARENS10=(Token)input.LT(1);
            match(input,LPARENS,FOLLOW_LPARENS_in_fun_decl118); 
            stream_LPARENS.add(LPARENS10);

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:75:31: ( params )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TYPE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:75:31: params
                    {
                    pushFollow(FOLLOW_params_in_fun_decl120);
                    params11=params();
                    _fsp--;

                    stream_params.add(params11.getTree());

                    }
                    break;

            }

            RPARENS12=(Token)input.LT(1);
            match(input,RPARENS,FOLLOW_RPARENS_in_fun_decl123); 
            stream_RPARENS.add(RPARENS12);

            pushFollow(FOLLOW_block_in_fun_decl125);
            block13=block();
            _fsp--;

            stream_block.add(block13.getTree());
            FUN14=(Token)input.LT(1);
            match(input,FUN,FOLLOW_FUN_in_fun_decl127); 
            stream_FUN.add(FUN14);


            // AST REWRITE
            // elements: params, block, ID, FUN, TYPE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 75:57: -> ^( FUN TYPE ID ( params )? block )
            {
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:75:60: ^( FUN TYPE ID ( params )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_FUN.next(), root_1);

                adaptor.addChild(root_1, stream_TYPE.next());
                adaptor.addChild(root_1, stream_ID.next());
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:75:74: ( params )?
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
        
        	catch (RecognitionException e) {
        		reportError(e);
        		throw e;
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:77:1: block : ( stmt )* END -> ^( BLOCKRT ( stmt )* ) ;
    public final block_return block() throws RecognitionException {
        block_return retval = new block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token END16=null;
        stmt_return stmt15 = null;


        CommonTree END16_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:77:7: ( ( stmt )* END -> ^( BLOCKRT ( stmt )* ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:77:9: ( stmt )* END
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:77:9: ( stmt )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==STRING||(LA4_0>=TYPE && LA4_0<=LPARENS)||LA4_0==IF||(LA4_0>=FOR && LA4_0<=PRINT)||LA4_0==SUB_OP||LA4_0==AMPLOF||LA4_0==NUMBER||LA4_0==43) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:77:9: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_block150);
            	    stmt15=stmt();
            	    _fsp--;

            	    stream_stmt.add(stmt15.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            END16=(Token)input.LT(1);
            match(input,END,FOLLOW_END_in_block153); 
            stream_END.add(END16);


            // AST REWRITE
            // elements: stmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 77:20: -> ^( BLOCKRT ( stmt )* )
            {
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:77:23: ^( BLOCKRT ( stmt )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(BLOCKRT, "BLOCKRT"), root_1);

                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:77:33: ( stmt )*
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
        
        	catch (RecognitionException e) {
        		reportError(e);
        		throw e;
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:80:1: stmt : ( decl SEMI | expr SEMI | if_stmt | while_stmt | for_stmt | print_stmt | return_stmt );
    public final stmt_return stmt() throws RecognitionException {
        stmt_return retval = new stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMI18=null;
        Token SEMI20=null;
        decl_return decl17 = null;

        expr_return expr19 = null;

        if_stmt_return if_stmt21 = null;

        while_stmt_return while_stmt22 = null;

        for_stmt_return for_stmt23 = null;

        print_stmt_return print_stmt24 = null;

        return_stmt_return return_stmt25 = null;


        CommonTree SEMI18_tree=null;
        CommonTree SEMI20_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:80:6: ( decl SEMI | expr SEMI | if_stmt | while_stmt | for_stmt | print_stmt | return_stmt )
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
                    new NoViableAltException("80:1: stmt : ( decl SEMI | expr SEMI | if_stmt | while_stmt | for_stmt | print_stmt | return_stmt );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:80:8: decl SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_decl_in_stmt172);
                    decl17=decl();
                    _fsp--;

                    adaptor.addChild(root_0, decl17.getTree());
                    SEMI18=(Token)input.LT(1);
                    match(input,SEMI,FOLLOW_SEMI_in_stmt174); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:81:4: expr SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_stmt180);
                    expr19=expr();
                    _fsp--;

                    adaptor.addChild(root_0, expr19.getTree());
                    SEMI20=(Token)input.LT(1);
                    match(input,SEMI,FOLLOW_SEMI_in_stmt182); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:82:4: if_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_stmt_in_stmt188);
                    if_stmt21=if_stmt();
                    _fsp--;

                    adaptor.addChild(root_0, if_stmt21.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:83:4: while_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_stmt_in_stmt193);
                    while_stmt22=while_stmt();
                    _fsp--;

                    adaptor.addChild(root_0, while_stmt22.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:84:4: for_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_for_stmt_in_stmt198);
                    for_stmt23=for_stmt();
                    _fsp--;

                    adaptor.addChild(root_0, for_stmt23.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:85:4: print_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_print_stmt_in_stmt203);
                    print_stmt24=print_stmt();
                    _fsp--;

                    adaptor.addChild(root_0, print_stmt24.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:86:4: return_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_return_stmt_in_stmt208);
                    return_stmt25=return_stmt();
                    _fsp--;

                    adaptor.addChild(root_0, return_stmt25.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        	catch (RecognitionException e) {
        		reportError(e);
        		throw e;
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:88:1: if_stmt : IF LPARENS expr RPARENS block ( ELSE block )? IF ;
    public final if_stmt_return if_stmt() throws RecognitionException {
        if_stmt_return retval = new if_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF26=null;
        Token LPARENS27=null;
        Token RPARENS29=null;
        Token ELSE31=null;
        Token IF33=null;
        expr_return expr28 = null;

        block_return block30 = null;

        block_return block32 = null;


        CommonTree IF26_tree=null;
        CommonTree LPARENS27_tree=null;
        CommonTree RPARENS29_tree=null;
        CommonTree ELSE31_tree=null;
        CommonTree IF33_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:88:9: ( IF LPARENS expr RPARENS block ( ELSE block )? IF )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:88:11: IF LPARENS expr RPARENS block ( ELSE block )? IF
            {
            root_0 = (CommonTree)adaptor.nil();

            IF26=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_if_stmt216); 
            IF26_tree = (CommonTree)adaptor.create(IF26);
            root_0 = (CommonTree)adaptor.becomeRoot(IF26_tree, root_0);

            LPARENS27=(Token)input.LT(1);
            match(input,LPARENS,FOLLOW_LPARENS_in_if_stmt219); 
            pushFollow(FOLLOW_expr_in_if_stmt222);
            expr28=expr();
            _fsp--;

            adaptor.addChild(root_0, expr28.getTree());
            RPARENS29=(Token)input.LT(1);
            match(input,RPARENS,FOLLOW_RPARENS_in_if_stmt224); 
            pushFollow(FOLLOW_block_in_if_stmt227);
            block30=block();
            _fsp--;

            adaptor.addChild(root_0, block30.getTree());
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:88:44: ( ELSE block )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ELSE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:88:45: ELSE block
                    {
                    ELSE31=(Token)input.LT(1);
                    match(input,ELSE,FOLLOW_ELSE_in_if_stmt230); 
                    pushFollow(FOLLOW_block_in_if_stmt233);
                    block32=block();
                    _fsp--;

                    adaptor.addChild(root_0, block32.getTree());

                    }
                    break;

            }

            IF33=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_if_stmt237); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        	catch (RecognitionException e) {
        		reportError(e);
        		throw e;
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:90:1: for_stmt : FOR LPARENS expr SEMI expr SEMI expr RPARENS block FOR ;
    public final for_stmt_return for_stmt() throws RecognitionException {
        for_stmt_return retval = new for_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FOR34=null;
        Token LPARENS35=null;
        Token SEMI37=null;
        Token SEMI39=null;
        Token RPARENS41=null;
        Token FOR43=null;
        expr_return expr36 = null;

        expr_return expr38 = null;

        expr_return expr40 = null;

        block_return block42 = null;


        CommonTree FOR34_tree=null;
        CommonTree LPARENS35_tree=null;
        CommonTree SEMI37_tree=null;
        CommonTree SEMI39_tree=null;
        CommonTree RPARENS41_tree=null;
        CommonTree FOR43_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:90:9: ( FOR LPARENS expr SEMI expr SEMI expr RPARENS block FOR )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:90:11: FOR LPARENS expr SEMI expr SEMI expr RPARENS block FOR
            {
            root_0 = (CommonTree)adaptor.nil();

            FOR34=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_for_stmt245); 
            FOR34_tree = (CommonTree)adaptor.create(FOR34);
            root_0 = (CommonTree)adaptor.becomeRoot(FOR34_tree, root_0);

            LPARENS35=(Token)input.LT(1);
            match(input,LPARENS,FOLLOW_LPARENS_in_for_stmt248); 
            pushFollow(FOLLOW_expr_in_for_stmt251);
            expr36=expr();
            _fsp--;

            adaptor.addChild(root_0, expr36.getTree());
            SEMI37=(Token)input.LT(1);
            match(input,SEMI,FOLLOW_SEMI_in_for_stmt253); 
            pushFollow(FOLLOW_expr_in_for_stmt256);
            expr38=expr();
            _fsp--;

            adaptor.addChild(root_0, expr38.getTree());
            SEMI39=(Token)input.LT(1);
            match(input,SEMI,FOLLOW_SEMI_in_for_stmt258); 
            pushFollow(FOLLOW_expr_in_for_stmt261);
            expr40=expr();
            _fsp--;

            adaptor.addChild(root_0, expr40.getTree());
            RPARENS41=(Token)input.LT(1);
            match(input,RPARENS,FOLLOW_RPARENS_in_for_stmt263); 
            pushFollow(FOLLOW_block_in_for_stmt266);
            block42=block();
            _fsp--;

            adaptor.addChild(root_0, block42.getTree());
            FOR43=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_for_stmt268); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        	catch (RecognitionException e) {
        		reportError(e);
        		throw e;
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:91:1: while_stmt : WHILE LPARENS expr RPARENS block WHILE ;
    public final while_stmt_return while_stmt() throws RecognitionException {
        while_stmt_return retval = new while_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHILE44=null;
        Token LPARENS45=null;
        Token RPARENS47=null;
        Token WHILE49=null;
        expr_return expr46 = null;

        block_return block48 = null;


        CommonTree WHILE44_tree=null;
        CommonTree LPARENS45_tree=null;
        CommonTree RPARENS47_tree=null;
        CommonTree WHILE49_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:92:2: ( WHILE LPARENS expr RPARENS block WHILE )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:92:4: WHILE LPARENS expr RPARENS block WHILE
            {
            root_0 = (CommonTree)adaptor.nil();

            WHILE44=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_while_stmt277); 
            WHILE44_tree = (CommonTree)adaptor.create(WHILE44);
            root_0 = (CommonTree)adaptor.becomeRoot(WHILE44_tree, root_0);

            LPARENS45=(Token)input.LT(1);
            match(input,LPARENS,FOLLOW_LPARENS_in_while_stmt280); 
            pushFollow(FOLLOW_expr_in_while_stmt283);
            expr46=expr();
            _fsp--;

            adaptor.addChild(root_0, expr46.getTree());
            RPARENS47=(Token)input.LT(1);
            match(input,RPARENS,FOLLOW_RPARENS_in_while_stmt285); 
            pushFollow(FOLLOW_block_in_while_stmt288);
            block48=block();
            _fsp--;

            adaptor.addChild(root_0, block48.getTree());
            WHILE49=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_while_stmt290); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        	catch (RecognitionException e) {
        		reportError(e);
        		throw e;
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:93:1: return_stmt : RETURN expr SEMI ;
    public final return_stmt_return return_stmt() throws RecognitionException {
        return_stmt_return retval = new return_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RETURN50=null;
        Token SEMI52=null;
        expr_return expr51 = null;


        CommonTree RETURN50_tree=null;
        CommonTree SEMI52_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:94:2: ( RETURN expr SEMI )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:94:4: RETURN expr SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            RETURN50=(Token)input.LT(1);
            match(input,RETURN,FOLLOW_RETURN_in_return_stmt299); 
            RETURN50_tree = (CommonTree)adaptor.create(RETURN50);
            root_0 = (CommonTree)adaptor.becomeRoot(RETURN50_tree, root_0);

            pushFollow(FOLLOW_expr_in_return_stmt302);
            expr51=expr();
            _fsp--;

            adaptor.addChild(root_0, expr51.getTree());
            SEMI52=(Token)input.LT(1);
            match(input,SEMI,FOLLOW_SEMI_in_return_stmt304); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        	catch (RecognitionException e) {
        		reportError(e);
        		throw e;
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:95:1: print_stmt : PRINT expr SEMI ;
    public final print_stmt_return print_stmt() throws RecognitionException {
        print_stmt_return retval = new print_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PRINT53=null;
        Token SEMI55=null;
        expr_return expr54 = null;


        CommonTree PRINT53_tree=null;
        CommonTree SEMI55_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:95:11: ( PRINT expr SEMI )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:95:13: PRINT expr SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            PRINT53=(Token)input.LT(1);
            match(input,PRINT,FOLLOW_PRINT_in_print_stmt311); 
            PRINT53_tree = (CommonTree)adaptor.create(PRINT53);
            root_0 = (CommonTree)adaptor.becomeRoot(PRINT53_tree, root_0);

            pushFollow(FOLLOW_expr_in_print_stmt314);
            expr54=expr();
            _fsp--;

            adaptor.addChild(root_0, expr54.getTree());
            SEMI55=(Token)input.LT(1);
            match(input,SEMI,FOLLOW_SEMI_in_print_stmt316); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        	catch (RecognitionException e) {
        		reportError(e);
        		throw e;
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:98:1: params : param ( COMMA params )? ;
    public final params_return params() throws RecognitionException {
        params_return retval = new params_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA57=null;
        param_return param56 = null;

        params_return params58 = null;


        CommonTree COMMA57_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:98:8: ( param ( COMMA params )? )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:98:10: param ( COMMA params )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_param_in_params327);
            param56=param();
            _fsp--;

            adaptor.addChild(root_0, param56.getTree());
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:98:16: ( COMMA params )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==COMMA) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:98:17: COMMA params
                    {
                    COMMA57=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_params330); 
                    pushFollow(FOLLOW_params_in_params333);
                    params58=params();
                    _fsp--;

                    adaptor.addChild(root_0, params58.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        	catch (RecognitionException e) {
        		reportError(e);
        		throw e;
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:99:1: param : TYPE ID -> ^( PARAMRT TYPE ID ) ;
    public final param_return param() throws RecognitionException {
        param_return retval = new param_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TYPE59=null;
        Token ID60=null;

        CommonTree TYPE59_tree=null;
        CommonTree ID60_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:99:7: ( TYPE ID -> ^( PARAMRT TYPE ID ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:99:9: TYPE ID
            {
            TYPE59=(Token)input.LT(1);
            match(input,TYPE,FOLLOW_TYPE_in_param342); 
            stream_TYPE.add(TYPE59);

            ID60=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_param344); 
            stream_ID.add(ID60);


            // AST REWRITE
            // elements: TYPE, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 99:18: -> ^( PARAMRT TYPE ID )
            {
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:99:21: ^( PARAMRT TYPE ID )
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
        
        	catch (RecognitionException e) {
        		reportError(e);
        		throw e;
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:100:1: decl : TYPE ID ( ASSIGN expr )? -> ^( DECLRT TYPE ID ( expr )? ) ;
    public final decl_return decl() throws RecognitionException {
        decl_return retval = new decl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TYPE61=null;
        Token ID62=null;
        Token ASSIGN63=null;
        expr_return expr64 = null;


        CommonTree TYPE61_tree=null;
        CommonTree ID62_tree=null;
        CommonTree ASSIGN63_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:100:6: ( TYPE ID ( ASSIGN expr )? -> ^( DECLRT TYPE ID ( expr )? ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:101:2: TYPE ID ( ASSIGN expr )?
            {
            TYPE61=(Token)input.LT(1);
            match(input,TYPE,FOLLOW_TYPE_in_decl364); 
            stream_TYPE.add(TYPE61);

            ID62=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_decl366); 
            stream_ID.add(ID62);

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:101:10: ( ASSIGN expr )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ASSIGN) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:101:11: ASSIGN expr
                    {
                    ASSIGN63=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_decl369); 
                    stream_ASSIGN.add(ASSIGN63);

                    pushFollow(FOLLOW_expr_in_decl371);
                    expr64=expr();
                    _fsp--;

                    stream_expr.add(expr64.getTree());

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
            // 101:25: -> ^( DECLRT TYPE ID ( expr )? )
            {
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:101:28: ^( DECLRT TYPE ID ( expr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(DECLRT, "DECLRT"), root_1);

                adaptor.addChild(root_1, stream_TYPE.next());
                adaptor.addChild(root_1, stream_ID.next());
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:101:45: ( expr )?
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
        
        	catch (RecognitionException e) {
        		reportError(e);
        		throw e;
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:103:1: expr_list : expr ( COMMA expr_list )? ;
    public final expr_list_return expr_list() throws RecognitionException {
        expr_list_return retval = new expr_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA66=null;
        expr_return expr65 = null;

        expr_list_return expr_list67 = null;


        CommonTree COMMA66_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:104:2: ( expr ( COMMA expr_list )? )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:104:4: expr ( COMMA expr_list )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_in_expr_list395);
            expr65=expr();
            _fsp--;

            adaptor.addChild(root_0, expr65.getTree());
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:104:9: ( COMMA expr_list )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==COMMA) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:104:10: COMMA expr_list
                    {
                    COMMA66=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_expr_list398); 
                    pushFollow(FOLLOW_expr_list_in_expr_list401);
                    expr_list67=expr_list();
                    _fsp--;

                    adaptor.addChild(root_0, expr_list67.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        	catch (RecognitionException e) {
        		reportError(e);
        		throw e;
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:105:1: expr : log_expr ( ASSIGN expr )? ;
    public final expr_return expr() throws RecognitionException {
        expr_return retval = new expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASSIGN69=null;
        log_expr_return log_expr68 = null;

        expr_return expr70 = null;


        CommonTree ASSIGN69_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:105:6: ( log_expr ( ASSIGN expr )? )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:105:8: log_expr ( ASSIGN expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_log_expr_in_expr410);
            log_expr68=log_expr();
            _fsp--;

            adaptor.addChild(root_0, log_expr68.getTree());
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:105:17: ( ASSIGN expr )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ASSIGN) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:105:18: ASSIGN expr
                    {
                    ASSIGN69=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_expr413); 
                    ASSIGN69_tree = (CommonTree)adaptor.create(ASSIGN69);
                    root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN69_tree, root_0);

                    pushFollow(FOLLOW_expr_in_expr416);
                    expr70=expr();
                    _fsp--;

                    adaptor.addChild(root_0, expr70.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        	catch (RecognitionException e) {
        		reportError(e);
        		throw e;
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:106:1: log_expr : rel_expr ( LOG_OP rel_expr )* ;
    public final log_expr_return log_expr() throws RecognitionException {
        log_expr_return retval = new log_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LOG_OP72=null;
        rel_expr_return rel_expr71 = null;

        rel_expr_return rel_expr73 = null;


        CommonTree LOG_OP72_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:106:9: ( rel_expr ( LOG_OP rel_expr )* )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:106:11: rel_expr ( LOG_OP rel_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_rel_expr_in_log_expr424);
            rel_expr71=rel_expr();
            _fsp--;

            adaptor.addChild(root_0, rel_expr71.getTree());
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:106:20: ( LOG_OP rel_expr )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==LOG_OP) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:106:21: LOG_OP rel_expr
            	    {
            	    LOG_OP72=(Token)input.LT(1);
            	    match(input,LOG_OP,FOLLOW_LOG_OP_in_log_expr427); 
            	    LOG_OP72_tree = (CommonTree)adaptor.create(LOG_OP72);
            	    root_0 = (CommonTree)adaptor.becomeRoot(LOG_OP72_tree, root_0);

            	    pushFollow(FOLLOW_rel_expr_in_log_expr430);
            	    rel_expr73=rel_expr();
            	    _fsp--;

            	    adaptor.addChild(root_0, rel_expr73.getTree());

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
        
        	catch (RecognitionException e) {
        		reportError(e);
        		throw e;
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:107:1: rel_expr : add_expr ( REL_OP add_expr )* ;
    public final rel_expr_return rel_expr() throws RecognitionException {
        rel_expr_return retval = new rel_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token REL_OP75=null;
        add_expr_return add_expr74 = null;

        add_expr_return add_expr76 = null;


        CommonTree REL_OP75_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:107:9: ( add_expr ( REL_OP add_expr )* )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:107:11: add_expr ( REL_OP add_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_add_expr_in_rel_expr438);
            add_expr74=add_expr();
            _fsp--;

            adaptor.addChild(root_0, add_expr74.getTree());
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:107:20: ( REL_OP add_expr )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==REL_OP) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:107:21: REL_OP add_expr
            	    {
            	    REL_OP75=(Token)input.LT(1);
            	    match(input,REL_OP,FOLLOW_REL_OP_in_rel_expr441); 
            	    REL_OP75_tree = (CommonTree)adaptor.create(REL_OP75);
            	    root_0 = (CommonTree)adaptor.becomeRoot(REL_OP75_tree, root_0);

            	    pushFollow(FOLLOW_add_expr_in_rel_expr444);
            	    add_expr76=add_expr();
            	    _fsp--;

            	    adaptor.addChild(root_0, add_expr76.getTree());

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
        
        	catch (RecognitionException e) {
        		reportError(e);
        		throw e;
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:108:1: add_expr : mult_expr ( ( ADD_OP | SUB_OP ) mult_expr )* ;
    public final add_expr_return add_expr() throws RecognitionException {
        add_expr_return retval = new add_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ADD_OP78=null;
        Token SUB_OP79=null;
        mult_expr_return mult_expr77 = null;

        mult_expr_return mult_expr80 = null;


        CommonTree ADD_OP78_tree=null;
        CommonTree SUB_OP79_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:108:9: ( mult_expr ( ( ADD_OP | SUB_OP ) mult_expr )* )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:108:11: mult_expr ( ( ADD_OP | SUB_OP ) mult_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_mult_expr_in_add_expr452);
            mult_expr77=mult_expr();
            _fsp--;

            adaptor.addChild(root_0, mult_expr77.getTree());
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:108:21: ( ( ADD_OP | SUB_OP ) mult_expr )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=ADD_OP && LA14_0<=SUB_OP)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:108:22: ( ADD_OP | SUB_OP ) mult_expr
            	    {
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:108:22: ( ADD_OP | SUB_OP )
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
            	            new NoViableAltException("108:22: ( ADD_OP | SUB_OP )", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:108:23: ADD_OP
            	            {
            	            ADD_OP78=(Token)input.LT(1);
            	            match(input,ADD_OP,FOLLOW_ADD_OP_in_add_expr456); 
            	            ADD_OP78_tree = (CommonTree)adaptor.create(ADD_OP78);
            	            root_0 = (CommonTree)adaptor.becomeRoot(ADD_OP78_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:108:33: SUB_OP
            	            {
            	            SUB_OP79=(Token)input.LT(1);
            	            match(input,SUB_OP,FOLLOW_SUB_OP_in_add_expr461); 
            	            SUB_OP79_tree = (CommonTree)adaptor.create(SUB_OP79);
            	            root_0 = (CommonTree)adaptor.becomeRoot(SUB_OP79_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_mult_expr_in_add_expr465);
            	    mult_expr80=mult_expr();
            	    _fsp--;

            	    adaptor.addChild(root_0, mult_expr80.getTree());

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
        
        	catch (RecognitionException e) {
        		reportError(e);
        		throw e;
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:109:1: mult_expr : unary_expr ( ( MULT_OP | DIV_OP | MOD_OP ) unary_expr )* ;
    public final mult_expr_return mult_expr() throws RecognitionException {
        mult_expr_return retval = new mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MULT_OP82=null;
        Token DIV_OP83=null;
        Token MOD_OP84=null;
        unary_expr_return unary_expr81 = null;

        unary_expr_return unary_expr85 = null;


        CommonTree MULT_OP82_tree=null;
        CommonTree DIV_OP83_tree=null;
        CommonTree MOD_OP84_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:110:2: ( unary_expr ( ( MULT_OP | DIV_OP | MOD_OP ) unary_expr )* )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:110:4: unary_expr ( ( MULT_OP | DIV_OP | MOD_OP ) unary_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unary_expr_in_mult_expr475);
            unary_expr81=unary_expr();
            _fsp--;

            adaptor.addChild(root_0, unary_expr81.getTree());
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:110:15: ( ( MULT_OP | DIV_OP | MOD_OP ) unary_expr )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=MULT_OP && LA16_0<=MOD_OP)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:110:16: ( MULT_OP | DIV_OP | MOD_OP ) unary_expr
            	    {
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:110:16: ( MULT_OP | DIV_OP | MOD_OP )
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
            	            new NoViableAltException("110:16: ( MULT_OP | DIV_OP | MOD_OP )", 15, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:110:17: MULT_OP
            	            {
            	            MULT_OP82=(Token)input.LT(1);
            	            match(input,MULT_OP,FOLLOW_MULT_OP_in_mult_expr479); 
            	            MULT_OP82_tree = (CommonTree)adaptor.create(MULT_OP82);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MULT_OP82_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:110:28: DIV_OP
            	            {
            	            DIV_OP83=(Token)input.LT(1);
            	            match(input,DIV_OP,FOLLOW_DIV_OP_in_mult_expr484); 
            	            DIV_OP83_tree = (CommonTree)adaptor.create(DIV_OP83);
            	            root_0 = (CommonTree)adaptor.becomeRoot(DIV_OP83_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:110:38: MOD_OP
            	            {
            	            MOD_OP84=(Token)input.LT(1);
            	            match(input,MOD_OP,FOLLOW_MOD_OP_in_mult_expr489); 
            	            MOD_OP84_tree = (CommonTree)adaptor.create(MOD_OP84);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MOD_OP84_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unary_expr_in_mult_expr493);
            	    unary_expr85=unary_expr();
            	    _fsp--;

            	    adaptor.addChild(root_0, unary_expr85.getTree());

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
        
        	catch (RecognitionException e) {
        		reportError(e);
        		throw e;
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:111:1: unary_expr : ( '!' | '-' | AMPLOF )? at_expr ;
    public final unary_expr_return unary_expr() throws RecognitionException {
        unary_expr_return retval = new unary_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal86=null;
        Token char_literal87=null;
        Token AMPLOF88=null;
        at_expr_return at_expr89 = null;


        CommonTree char_literal86_tree=null;
        CommonTree char_literal87_tree=null;
        CommonTree AMPLOF88_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:112:2: ( ( '!' | '-' | AMPLOF )? at_expr )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:112:4: ( '!' | '-' | AMPLOF )? at_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:112:4: ( '!' | '-' | AMPLOF )?
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
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:112:5: '!'
                    {
                    char_literal86=(Token)input.LT(1);
                    match(input,43,FOLLOW_43_in_unary_expr505); 
                    char_literal86_tree = (CommonTree)adaptor.create(char_literal86);
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal86_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:112:12: '-'
                    {
                    char_literal87=(Token)input.LT(1);
                    match(input,SUB_OP,FOLLOW_SUB_OP_in_unary_expr510); 
                    char_literal87_tree = (CommonTree)adaptor.create(char_literal87);
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal87_tree, root_0);


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:112:19: AMPLOF
                    {
                    AMPLOF88=(Token)input.LT(1);
                    match(input,AMPLOF,FOLLOW_AMPLOF_in_unary_expr515); 
                    AMPLOF88_tree = (CommonTree)adaptor.create(AMPLOF88);
                    root_0 = (CommonTree)adaptor.becomeRoot(AMPLOF88_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_at_expr_in_unary_expr520);
            at_expr89=at_expr();
            _fsp--;

            adaptor.addChild(root_0, at_expr89.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        	catch (RecognitionException e) {
        		reportError(e);
        		throw e;
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:113:1: at_expr : fun_call ( AT fun_call ( TO fun_call )? )* ;
    public final at_expr_return at_expr() throws RecognitionException {
        at_expr_return retval = new at_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AT91=null;
        Token TO93=null;
        fun_call_return fun_call90 = null;

        fun_call_return fun_call92 = null;

        fun_call_return fun_call94 = null;


        CommonTree AT91_tree=null;
        CommonTree TO93_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:113:9: ( fun_call ( AT fun_call ( TO fun_call )? )* )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:113:11: fun_call ( AT fun_call ( TO fun_call )? )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_fun_call_in_at_expr528);
            fun_call90=fun_call();
            _fsp--;

            adaptor.addChild(root_0, fun_call90.getTree());
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:113:20: ( AT fun_call ( TO fun_call )? )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==AT) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:113:21: AT fun_call ( TO fun_call )?
            	    {
            	    AT91=(Token)input.LT(1);
            	    match(input,AT,FOLLOW_AT_in_at_expr531); 
            	    AT91_tree = (CommonTree)adaptor.create(AT91);
            	    root_0 = (CommonTree)adaptor.becomeRoot(AT91_tree, root_0);

            	    pushFollow(FOLLOW_fun_call_in_at_expr534);
            	    fun_call92=fun_call();
            	    _fsp--;

            	    adaptor.addChild(root_0, fun_call92.getTree());
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:113:34: ( TO fun_call )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==TO) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:113:35: TO fun_call
            	            {
            	            TO93=(Token)input.LT(1);
            	            match(input,TO,FOLLOW_TO_in_at_expr537); 
            	            pushFollow(FOLLOW_fun_call_in_at_expr540);
            	            fun_call94=fun_call();
            	            _fsp--;

            	            adaptor.addChild(root_0, fun_call94.getTree());

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
        
        	catch (RecognitionException e) {
        		reportError(e);
        		throw e;
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:115:1: fun_call : ( ID LPARENS ( expr_list )? RPARENS -> ^( CALLRT ID ( expr_list )? ) | top_expr -> top_expr );
    public final fun_call_return fun_call() throws RecognitionException {
        fun_call_return retval = new fun_call_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID95=null;
        Token LPARENS96=null;
        Token RPARENS98=null;
        expr_list_return expr_list97 = null;

        top_expr_return top_expr99 = null;


        CommonTree ID95_tree=null;
        CommonTree LPARENS96_tree=null;
        CommonTree RPARENS98_tree=null;
        RewriteRuleTokenStream stream_LPARENS=new RewriteRuleTokenStream(adaptor,"token LPARENS");
        RewriteRuleTokenStream stream_RPARENS=new RewriteRuleTokenStream(adaptor,"token RPARENS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_top_expr=new RewriteRuleSubtreeStream(adaptor,"rule top_expr");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:115:9: ( ID LPARENS ( expr_list )? RPARENS -> ^( CALLRT ID ( expr_list )? ) | top_expr -> top_expr )
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
                        new NoViableAltException("115:1: fun_call : ( ID LPARENS ( expr_list )? RPARENS -> ^( CALLRT ID ( expr_list )? ) | top_expr -> top_expr );", 21, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA21_0==STRING||LA21_0==LPARENS||LA21_0==NUMBER) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("115:1: fun_call : ( ID LPARENS ( expr_list )? RPARENS -> ^( CALLRT ID ( expr_list )? ) | top_expr -> top_expr );", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:115:11: ID LPARENS ( expr_list )? RPARENS
                    {
                    ID95=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_fun_call551); 
                    stream_ID.add(ID95);

                    LPARENS96=(Token)input.LT(1);
                    match(input,LPARENS,FOLLOW_LPARENS_in_fun_call553); 
                    stream_LPARENS.add(LPARENS96);

                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:115:22: ( expr_list )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==STRING||(LA20_0>=ID && LA20_0<=LPARENS)||LA20_0==SUB_OP||LA20_0==AMPLOF||LA20_0==NUMBER||LA20_0==43) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:115:22: expr_list
                            {
                            pushFollow(FOLLOW_expr_list_in_fun_call555);
                            expr_list97=expr_list();
                            _fsp--;

                            stream_expr_list.add(expr_list97.getTree());

                            }
                            break;

                    }

                    RPARENS98=(Token)input.LT(1);
                    match(input,RPARENS,FOLLOW_RPARENS_in_fun_call558); 
                    stream_RPARENS.add(RPARENS98);


                    // AST REWRITE
                    // elements: expr_list, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 115:42: -> ^( CALLRT ID ( expr_list )? )
                    {
                        // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:115:45: ^( CALLRT ID ( expr_list )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(CALLRT, "CALLRT"), root_1);

                        adaptor.addChild(root_1, stream_ID.next());
                        // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:115:57: ( expr_list )?
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
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:116:5: top_expr
                    {
                    pushFollow(FOLLOW_top_expr_in_fun_call576);
                    top_expr99=top_expr();
                    _fsp--;

                    stream_top_expr.add(top_expr99.getTree());

                    // AST REWRITE
                    // elements: top_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 116:16: -> top_expr
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
        
        	catch (RecognitionException e) {
        		reportError(e);
        		throw e;
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:118:1: top_expr : ( LPARENS expr RPARENS | NUMBER | STRING | ID );
    public final top_expr_return top_expr() throws RecognitionException {
        top_expr_return retval = new top_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPARENS100=null;
        Token RPARENS102=null;
        Token NUMBER103=null;
        Token STRING104=null;
        Token ID105=null;
        expr_return expr101 = null;


        CommonTree LPARENS100_tree=null;
        CommonTree RPARENS102_tree=null;
        CommonTree NUMBER103_tree=null;
        CommonTree STRING104_tree=null;
        CommonTree ID105_tree=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:118:9: ( LPARENS expr RPARENS | NUMBER | STRING | ID )
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
                    new NoViableAltException("118:1: top_expr : ( LPARENS expr RPARENS | NUMBER | STRING | ID );", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:118:11: LPARENS expr RPARENS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LPARENS100=(Token)input.LT(1);
                    match(input,LPARENS,FOLLOW_LPARENS_in_top_expr591); 
                    pushFollow(FOLLOW_expr_in_top_expr594);
                    expr101=expr();
                    _fsp--;

                    adaptor.addChild(root_0, expr101.getTree());
                    RPARENS102=(Token)input.LT(1);
                    match(input,RPARENS,FOLLOW_RPARENS_in_top_expr596); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:118:36: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NUMBER103=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_top_expr601); 
                    NUMBER103_tree = (CommonTree)adaptor.create(NUMBER103);
                    adaptor.addChild(root_0, NUMBER103_tree);


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:118:45: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING104=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_top_expr605); 
                    STRING104_tree = (CommonTree)adaptor.create(STRING104);
                    adaptor.addChild(root_0, STRING104_tree);


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:118:54: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ID105=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_top_expr609); 
                    ID105_tree = (CommonTree)adaptor.create(ID105);
                    adaptor.addChild(root_0, ID105_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        	catch (RecognitionException e) {
        		reportError(e);
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end top_expr


 

    public static final BitSet FOLLOW_include_stmt_in_program82 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_fun_decl_in_program86 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EOF_in_program89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDE_in_include_stmt100 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_STRING_in_include_stmt103 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_include_stmt105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUN_in_fun_decl112 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_TYPE_in_fun_decl114 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_fun_decl116 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPARENS_in_fun_decl118 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_params_in_fun_decl120 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPARENS_in_fun_decl123 = new BitSet(new long[]{0x00000809107B7200L});
    public static final BitSet FOLLOW_block_in_fun_decl125 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_FUN_in_fun_decl127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_block150 = new BitSet(new long[]{0x00000809107B7200L});
    public static final BitSet FOLLOW_END_in_block153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_stmt172 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_stmt174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt180 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_stmt182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_stmt188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_stmt193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_stmt198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_stmt_in_stmt203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_stmt208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_stmt216 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPARENS_in_if_stmt219 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_expr_in_if_stmt222 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPARENS_in_if_stmt224 = new BitSet(new long[]{0x00000809107B7200L});
    public static final BitSet FOLLOW_block_in_if_stmt227 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_ELSE_in_if_stmt230 = new BitSet(new long[]{0x00000809107B7200L});
    public static final BitSet FOLLOW_block_in_if_stmt233 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IF_in_if_stmt237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt245 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPARENS_in_for_stmt248 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_expr_in_for_stmt251 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_for_stmt253 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_expr_in_for_stmt256 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_for_stmt258 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_expr_in_for_stmt261 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPARENS_in_for_stmt263 = new BitSet(new long[]{0x00000809107B7200L});
    public static final BitSet FOLLOW_block_in_for_stmt266 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_FOR_in_for_stmt268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt277 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPARENS_in_while_stmt280 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_expr_in_while_stmt283 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPARENS_in_while_stmt285 = new BitSet(new long[]{0x00000809107B7200L});
    public static final BitSet FOLLOW_block_in_while_stmt288 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt299 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_expr_in_return_stmt302 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_return_stmt304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print_stmt311 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_expr_in_print_stmt314 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_print_stmt316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params327 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_params330 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_params_in_params333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_param342 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_param344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_decl364 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_decl366 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ASSIGN_in_decl369 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_expr_in_decl371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list395 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_expr_list398 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_expr_list_in_expr_list401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_log_expr_in_expr410 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ASSIGN_in_expr413 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_expr_in_expr416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rel_expr_in_log_expr424 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LOG_OP_in_log_expr427 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_rel_expr_in_log_expr430 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_add_expr_in_rel_expr438 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_REL_OP_in_rel_expr441 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_add_expr_in_rel_expr444 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr452 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ADD_OP_in_add_expr456 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_SUB_OP_in_add_expr461 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr465 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr475 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_MULT_OP_in_mult_expr479 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_DIV_OP_in_mult_expr484 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_MOD_OP_in_mult_expr489 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr493 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_43_in_unary_expr505 = new BitSet(new long[]{0x0000000800006200L});
    public static final BitSet FOLLOW_SUB_OP_in_unary_expr510 = new BitSet(new long[]{0x0000000800006200L});
    public static final BitSet FOLLOW_AMPLOF_in_unary_expr515 = new BitSet(new long[]{0x0000000800006200L});
    public static final BitSet FOLLOW_at_expr_in_unary_expr520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_call_in_at_expr528 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_AT_in_at_expr531 = new BitSet(new long[]{0x0000000800006200L});
    public static final BitSet FOLLOW_fun_call_in_at_expr534 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_TO_in_at_expr537 = new BitSet(new long[]{0x0000000800006200L});
    public static final BitSet FOLLOW_fun_call_in_at_expr540 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ID_in_fun_call551 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPARENS_in_fun_call553 = new BitSet(new long[]{0x000008091000E200L});
    public static final BitSet FOLLOW_expr_list_in_fun_call555 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPARENS_in_fun_call558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_top_expr_in_fun_call576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARENS_in_top_expr591 = new BitSet(new long[]{0x0000080910006200L});
    public static final BitSet FOLLOW_expr_in_top_expr594 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPARENS_in_top_expr596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_top_expr601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_top_expr605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_top_expr609 = new BitSet(new long[]{0x0000000000000002L});

}