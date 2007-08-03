// $ANTLR 3.0 C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLFunWalker.g 2007-08-02 23:22:30

package asml;
import asml.walker.*;
import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ASMLFunWalker extends TreeParser {
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

        public ASMLFunWalker(TreeNodeStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLFunWalker.g"; }

    
    HashMap<String, FunctionRecord> FunctionTable = 
    	new HashMap<String, FunctionRecord>();
    
    HashMap<String, FunctionRecord> getFunctionTable(){
    	return FunctionTable;
    }		



    // $ANTLR start program
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLFunWalker.g:22:1: program : ( include_stmt )* ( fun_decl )+ ;
    public final void program() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLFunWalker.g:23:2: ( ( include_stmt )* ( fun_decl )+ )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLFunWalker.g:23:2: ( include_stmt )* ( fun_decl )+
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLFunWalker.g:23:2: ( include_stmt )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==INCLUDE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLFunWalker.g:23:3: include_stmt
            	    {
            	    pushFollow(FOLLOW_include_stmt_in_program43);
            	    include_stmt();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLFunWalker.g:23:17: ( fun_decl )+
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
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLFunWalker.g:23:18: fun_decl
            	    {
            	    pushFollow(FOLLOW_fun_decl_in_program47);
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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLFunWalker.g:25:1: include_stmt : ^( INCLUDE STRING ) ;
    public final void include_stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLFunWalker.g:26:2: ( ^( INCLUDE STRING ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLFunWalker.g:26:2: ^( INCLUDE STRING )
            {
            match(input,INCLUDE,FOLLOW_INCLUDE_in_include_stmt61); 

            match(input, Token.DOWN, null); 
            match(input,STRING,FOLLOW_STRING_in_include_stmt63); 

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

    public static class fun_decl_return extends TreeRuleReturnScope {
    };

    // $ANTLR start fun_decl
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLFunWalker.g:28:1: fun_decl : ^( FUN type= TYPE name= ID (par= param )* . ) ;
    public final fun_decl_return fun_decl() throws RecognitionException {
        fun_decl_return retval = new fun_decl_return();
        retval.start = input.LT(1);

        CommonTree type=null;
        CommonTree name=null;
        Value par = null;


        
        ArrayList<Value> formalParams = new ArrayList<Value>();
        int blockIndex = 2;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLFunWalker.g:65:2: ( ^( FUN type= TYPE name= ID (par= param )* . ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLFunWalker.g:65:2: ^( FUN type= TYPE name= ID (par= param )* . )
            {
            match(input,FUN,FOLLOW_FUN_in_fun_decl81); 

            match(input, Token.DOWN, null); 
            type=(CommonTree)input.LT(1);
            match(input,TYPE,FOLLOW_TYPE_in_fun_decl85); 
            name=(CommonTree)input.LT(1);
            match(input,ID,FOLLOW_ID_in_fun_decl89); 
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLFunWalker.g:65:26: (par= param )*
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
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLFunWalker.g:65:27: par= param
            	    {
            	    pushFollow(FOLLOW_param_in_fun_decl94);
            	    par=param();
            	    _fsp--;

            	    formalParams.add(par); 
            	    		 blockIndex++;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            matchAny(input); 

            match(input, Token.UP, null); 

            }

            
            if(FunctionTable.containsKey(name.getText())){
            	System.err.println("Function '" + name.getText() + 
            		"' cannot be declared more than once in a program.");
            	System.exit(-1);
            }
            
            CommonTree blockRt = (CommonTree)((CommonTree)retval.start).getChild(blockIndex);
            
            int funType = Type.WAVE;
            if(type.getText().equals("int"))
            	funType = Type.INT;
            else if(type.getText().equals("ampl"))
            	funType = Type.AMPL;
            else if(type.getText().equals("float"))
            	funType = Type.FLOAT;
            else if(type.getText().equals("freq"))
            	funType = Type.FREQ;
            else if(type.getText().equals("time"))
            	funType = Type.TIME;
            
            FunctionRecord newFunRec = null;
            try{
            newFunRec = new FunctionRecord(
            	funType, name.getText(), formalParams, blockRt);
            }catch(ASMLSemanticException e){
            	System.err.println(e.getMessage());
            	System.exit(-1);
            }
            	
            FunctionTable.put(name.getText(), newFunRec);

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


    // $ANTLR start param
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLFunWalker.g:69:1: param returns [Value v] : ^( PARAMRT type= TYPE name= ID ) ;
    public final Value param() throws RecognitionException {
        Value v = null;

        CommonTree type=null;
        CommonTree name=null;

        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLFunWalker.g:70:2: ( ^( PARAMRT type= TYPE name= ID ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASMLFunWalker.g:70:2: ^( PARAMRT type= TYPE name= ID )
            {
            match(input,PARAMRT,FOLLOW_PARAMRT_in_param118); 

            match(input, Token.DOWN, null); 
            type=(CommonTree)input.LT(1);
            match(input,TYPE,FOLLOW_TYPE_in_param122); 
            name=(CommonTree)input.LT(1);
            match(input,ID,FOLLOW_ID_in_param126); 

            match(input, Token.UP, null); 
            
            	if(type.getText().equals("int"))
            		return new ASMLInteger(name.getText());
            	else if(type.getText().equals("ampl"))
            		return new ASMLAmplitude(name.getText());
            	else if(type.getText().equals("float"))
            		return new ASMLFloat(name.getText());
            	else if(type.getText().equals("freq"))
            		return new ASMLFrequency(name.getText());
            	else if(type.getText().equals("time"))
            		return new ASMLTime(name.getText());
            	else if(type.getText().equals("wave"))
            		return new ASMLWave(name.getText());

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
    // $ANTLR end param


 

    public static final BitSet FOLLOW_include_stmt_in_program43 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_fun_decl_in_program47 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_INCLUDE_in_include_stmt61 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_include_stmt63 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUN_in_fun_decl81 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPE_in_fun_decl85 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_fun_decl89 = new BitSet(new long[]{0x00000FFFFFFFFFF0L});
    public static final BitSet FOLLOW_param_in_fun_decl94 = new BitSet(new long[]{0x00000FFFFFFFFFF0L});
    public static final BitSet FOLLOW_PARAMRT_in_param118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPE_in_param122 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_param126 = new BitSet(new long[]{0x0000000000000008L});

}