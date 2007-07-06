// $ANTLR 3.0 C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g 2007-07-05 22:33:40
package asml;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ASMLLexer extends Lexer {
    public static final int INTEGER=35;
    public static final int RPARENS=11;
    public static final int MULT_OP=26;
    public static final int WHILE=15;
    public static final int TO=30;
    public static final int DIV_OP=27;
    public static final int LETTER=33;
    public static final int CONST=20;
    public static final int ELSE=14;
    public static final int NUMBER=31;
    public static final int ADD_OP=24;
    public static final int LPARENS=10;
    public static final int FOR=16;
    public static final int STR_CONTENT=37;
    public static final int ID=9;
    public static final int Tokens=40;
    public static final int EOF=-1;
    public static final int SEMI=6;
    public static final int PRINT=18;
    public static final int FRAC=36;
    public static final int IF=13;
    public static final int TYPE=8;
    public static final int AT=29;
    public static final int WS=38;
    public static final int SUB_OP=25;
    public static final int COMMA=19;
    public static final int REL_OP=23;
    public static final int INCLUDE=4;
    public static final int RETURN=17;
    public static final int ASSIGN=21;
    public static final int LOG_OP=22;
    public static final int DIGIT=34;
    public static final int T39=39;
    public static final int END=12;
    public static final int FUN=7;
    public static final int MOD_OP=28;
    public static final int COMMENT=32;
    public static final int STRING=5;
    
    	public String stripEscapeChars(String in){
    		String newStr = in.replaceAll("\\\\\"", "\"");   
    		 		
        		char[] formSlashes = new char[newStr.length()];
        		int charsAdded = 0;
        		for(int i=0; i<newStr.length(); i++){
        			if((newStr.charAt(i) == '\\') && 
        					(newStr.charAt(i+1) == '\\')){
        				formSlashes[charsAdded++] = newStr.charAt(++i);
        				
        			}//end if
        			else{
        				formSlashes[charsAdded++] = newStr.charAt(i);
        				
        			}//end else
        		}//end for
        		newStr = new String(formSlashes);
        		newStr = newStr.substring(0, charsAdded);
        		
        		return newStr;			
    	}

    public ASMLLexer() {;} 
    public ASMLLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g"; }

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:27:7: ( '!' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:27:7: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:96:11: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:96:11: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:96:16: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFE')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:96:43: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMENT

    // $ANTLR start ADD_OP
    public final void mADD_OP() throws RecognitionException {
        try {
            int _type = ADD_OP;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:98:10: ( '+' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:98:10: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ADD_OP

    // $ANTLR start SUB_OP
    public final void mSUB_OP() throws RecognitionException {
        try {
            int _type = SUB_OP;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:99:10: ( '-' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:99:10: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SUB_OP

    // $ANTLR start MULT_OP
    public final void mMULT_OP() throws RecognitionException {
        try {
            int _type = MULT_OP;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:100:12: ( '*' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:100:12: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MULT_OP

    // $ANTLR start DIV_OP
    public final void mDIV_OP() throws RecognitionException {
        try {
            int _type = DIV_OP;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:101:10: ( '/' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:101:10: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIV_OP

    // $ANTLR start MOD_OP
    public final void mMOD_OP() throws RecognitionException {
        try {
            int _type = MOD_OP;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:102:10: ( '%' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:102:10: '%'
            {
            match('%'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MOD_OP

    // $ANTLR start ASSIGN
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:103:10: ( '=' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:103:10: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ASSIGN

    // $ANTLR start REL_OP
    public final void mREL_OP() throws RecognitionException {
        try {
            int _type = REL_OP;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:105:10: ( '<' | '>' | '<=' | '>=' | '==' | '!=' )
            int alt2=6;
            switch ( input.LA(1) ) {
            case '<':
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='=') ) {
                    alt2=3;
                }
                else {
                    alt2=1;}
                }
                break;
            case '>':
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='=') ) {
                    alt2=4;
                }
                else {
                    alt2=2;}
                }
                break;
            case '=':
                {
                alt2=5;
                }
                break;
            case '!':
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("105:1: REL_OP : ( '<' | '>' | '<=' | '>=' | '==' | '!=' );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:105:10: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:105:16: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:105:22: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:105:29: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:105:36: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:105:43: '!='
                    {
                    match("!="); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end REL_OP

    // $ANTLR start LOG_OP
    public final void mLOG_OP() throws RecognitionException {
        try {
            int _type = LOG_OP;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:106:10: ( '||' | '&&' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='|') ) {
                alt3=1;
            }
            else if ( (LA3_0=='&') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("106:1: LOG_OP : ( '||' | '&&' );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:106:10: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:106:17: '&&'
                    {
                    match("&&"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LOG_OP

    // $ANTLR start LPARENS
    public final void mLPARENS() throws RecognitionException {
        try {
            int _type = LPARENS;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:110:12: ( '(' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:110:12: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LPARENS

    // $ANTLR start RPARENS
    public final void mRPARENS() throws RecognitionException {
        try {
            int _type = RPARENS;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:111:11: ( ')' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:111:11: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RPARENS

    // $ANTLR start COMMA
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:112:9: ( ',' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:112:9: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMA

    // $ANTLR start SEMI
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:113:8: ( ';' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:113:8: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SEMI

    // $ANTLR start LETTER
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:116:4: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>='a' && LA4_0<='z')) ) {
                alt4=1;
            }
            else if ( ((LA4_0>='A' && LA4_0<='Z')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("115:10: fragment LETTER : ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:116:4: ( 'a' .. 'z' )
                    {
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:116:4: ( 'a' .. 'z' )
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:116:5: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:116:15: ( 'A' .. 'Z' )
                    {
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:116:15: ( 'A' .. 'Z' )
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:116:16: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end LETTER

    // $ANTLR start DIGIT
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:118:4: ( ( '0' .. '9' ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:118:4: ( '0' .. '9' )
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:118:4: ( '0' .. '9' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:118:5: '0' .. '9'
            {
            matchRange('0','9'); 

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end DIGIT

    // $ANTLR start INTEGER
    public final void mINTEGER() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:120:4: ( ( DIGIT )+ )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:120:4: ( DIGIT )+
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:120:4: ( DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:120:5: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end INTEGER

    // $ANTLR start FRAC
    public final void mFRAC() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:122:4: ( '.' ( INTEGER ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:122:4: '.' ( INTEGER )
            {
            match('.'); 
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:122:7: ( INTEGER )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:122:8: INTEGER
            {
            mINTEGER(); 

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end FRAC

    // $ANTLR start NUMBER
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:126:9: ( INTEGER ( 'Hz' | 'ms' )? | ( INTEGER )? FRAC ( 'a' | 'Hz' | 'ms' )? )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:126:9: INTEGER ( 'Hz' | 'ms' )?
                    {
                    mINTEGER(); 
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:127:3: ( 'Hz' | 'ms' )?
                    int alt6=3;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='H') ) {
                        alt6=1;
                    }
                    else if ( (LA6_0=='m') ) {
                        alt6=2;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:127:4: 'Hz'
                            {
                            match("Hz"); 


                            }
                            break;
                        case 2 :
                            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:128:4: 'ms'
                            {
                            match("ms"); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:129:4: ( INTEGER )? FRAC ( 'a' | 'Hz' | 'ms' )?
                    {
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:129:4: ( INTEGER )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:129:4: INTEGER
                            {
                            mINTEGER(); 

                            }
                            break;

                    }

                    mFRAC(); 
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:130:3: ( 'a' | 'Hz' | 'ms' )?
                    int alt8=4;
                    switch ( input.LA(1) ) {
                        case 'a':
                            {
                            alt8=1;
                            }
                            break;
                        case 'H':
                            {
                            alt8=2;
                            }
                            break;
                        case 'm':
                            {
                            alt8=3;
                            }
                            break;
                    }

                    switch (alt8) {
                        case 1 :
                            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:130:4: 'a'
                            {
                            match('a'); 

                            }
                            break;
                        case 2 :
                            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:131:4: 'Hz'
                            {
                            match("Hz"); 


                            }
                            break;
                        case 3 :
                            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:132:4: 'ms'
                            {
                            match("ms"); 


                            }
                            break;

                    }


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NUMBER

    // $ANTLR start TYPE
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:135:8: ( 'ampl' | 'float' | 'freq' | 'int' | 'time' | 'wave' )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt10=1;
                }
                break;
            case 'f':
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2=='l') ) {
                    alt10=2;
                }
                else if ( (LA10_2=='r') ) {
                    alt10=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("135:1: TYPE : ( 'ampl' | 'float' | 'freq' | 'int' | 'time' | 'wave' );", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case 'i':
                {
                alt10=4;
                }
                break;
            case 't':
                {
                alt10=5;
                }
                break;
            case 'w':
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("135:1: TYPE : ( 'ampl' | 'float' | 'freq' | 'int' | 'time' | 'wave' );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:135:8: 'ampl'
                    {
                    match("ampl"); 


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:135:15: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:135:23: 'freq'
                    {
                    match("freq"); 


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:135:30: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:135:36: 'time'
                    {
                    match("time"); 


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:135:43: 'wave'
                    {
                    match("wave"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TYPE

    // $ANTLR start STR_CONTENT
    public final void mSTR_CONTENT() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:142:4: ( ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | ~ ( '\"' | '\\\\' ) )* )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:142:4: ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | ~ ( '\"' | '\\\\' ) )*
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:142:4: ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | ~ ( '\"' | '\\\\' ) )*
            loop11:
            do {
                int alt11=4;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\\') ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2=='\"') ) {
                        alt11=1;
                    }
                    else if ( (LA11_2=='\\') ) {
                        alt11=2;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFE')) ) {
                    alt11=3;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:142:5: ( '\\\\' '\"' )
            	    {
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:142:5: ( '\\\\' '\"' )
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:142:6: '\\\\' '\"'
            	    {
            	    match('\\'); 
            	    match('\"'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:142:17: ( '\\\\' '\\\\' )
            	    {
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:142:17: ( '\\\\' '\\\\' )
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:142:18: '\\\\' '\\\\'
            	    {
            	    match('\\'); 
            	    match('\\'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:142:30: ~ ( '\"' | '\\\\' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end STR_CONTENT

    // $ANTLR start STRING
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            Token t=null;

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:143:10: ( '\"' t= STR_CONTENT '\"' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:143:10: '\"' t= STR_CONTENT '\"'
            {
            match('\"'); 
            int tStart372 = getCharIndex();
            mSTR_CONTENT(); 
            t = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, tStart372, getCharIndex()-1);
            match('\"'); 
            setText(stripEscapeChars(t.getText()));

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRING

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:145:6: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:145:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:145:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            skip();

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start AT
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:148:6: ( 'at' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:148:6: 'at'
            {
            match("at"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end AT

    // $ANTLR start CONST
    public final void mCONST() throws RecognitionException {
        try {
            int _type = CONST;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:149:10: ( 'const' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:149:10: 'const'
            {
            match("const"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CONST

    // $ANTLR start ELSE
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:150:9: ( 'else' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:150:9: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ELSE

    // $ANTLR start END
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:151:7: ( 'end' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:151:7: 'end'
            {
            match("end"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end END

    // $ANTLR start FOR
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:152:7: ( 'for' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:152:7: 'for'
            {
            match("for"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FOR

    // $ANTLR start FUN
    public final void mFUN() throws RecognitionException {
        try {
            int _type = FUN;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:153:7: ( 'fun' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:153:7: 'fun'
            {
            match("fun"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FUN

    // $ANTLR start IF
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:154:6: ( 'if' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:154:6: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IF

    // $ANTLR start INCLUDE
    public final void mINCLUDE() throws RecognitionException {
        try {
            int _type = INCLUDE;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:155:11: ( 'include' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:155:11: 'include'
            {
            match("include"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INCLUDE

    // $ANTLR start PRINT
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:156:9: ( 'print' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:156:9: 'print'
            {
            match("print"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PRINT

    // $ANTLR start RETURN
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:157:10: ( 'return' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:157:10: 'return'
            {
            match("return"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RETURN

    // $ANTLR start TO
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:158:6: ( 'to' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:158:6: 'to'
            {
            match("to"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TO

    // $ANTLR start WHILE
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:159:10: ( 'while' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:159:10: 'while'
            {
            match("while"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WHILE

    // $ANTLR start ID
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:161:7: ( ( LETTER | '_' ) ( LETTER | '_' | DIGIT )* )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:161:7: ( LETTER | '_' ) ( LETTER | '_' | DIGIT )*
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:161:7: ( LETTER | '_' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>='A' && LA13_0<='Z')||(LA13_0>='a' && LA13_0<='z')) ) {
                alt13=1;
            }
            else if ( (LA13_0=='_') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("161:7: ( LETTER | '_' )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:161:8: LETTER
                    {
                    mLETTER(); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:161:15: '_'
                    {
                    match('_'); 

                    }
                    break;

            }

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:161:19: ( LETTER | '_' | DIGIT )*
            loop14:
            do {
                int alt14=4;
                switch ( input.LA(1) ) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt14=1;
                    }
                    break;
                case '_':
                    {
                    alt14=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt14=3;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:161:20: LETTER
            	    {
            	    mLETTER(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:161:27: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 3 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:161:31: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ID

    public void mTokens() throws RecognitionException {
        // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:10: ( T39 | COMMENT | ADD_OP | SUB_OP | MULT_OP | DIV_OP | MOD_OP | ASSIGN | REL_OP | LOG_OP | LPARENS | RPARENS | COMMA | SEMI | NUMBER | TYPE | STRING | WS | AT | CONST | ELSE | END | FOR | FUN | IF | INCLUDE | PRINT | RETURN | TO | WHILE | ID )
        int alt15=31;
        switch ( input.LA(1) ) {
        case '!':
            {
            int LA15_1 = input.LA(2);

            if ( (LA15_1=='=') ) {
                alt15=9;
            }
            else {
                alt15=1;}
            }
            break;
        case '/':
            {
            int LA15_2 = input.LA(2);

            if ( (LA15_2=='*') ) {
                alt15=2;
            }
            else {
                alt15=6;}
            }
            break;
        case '+':
            {
            alt15=3;
            }
            break;
        case '-':
            {
            alt15=4;
            }
            break;
        case '*':
            {
            alt15=5;
            }
            break;
        case '%':
            {
            alt15=7;
            }
            break;
        case '=':
            {
            int LA15_7 = input.LA(2);

            if ( (LA15_7=='=') ) {
                alt15=9;
            }
            else {
                alt15=8;}
            }
            break;
        case '<':
        case '>':
            {
            alt15=9;
            }
            break;
        case '&':
        case '|':
            {
            alt15=10;
            }
            break;
        case '(':
            {
            alt15=11;
            }
            break;
        case ')':
            {
            alt15=12;
            }
            break;
        case ',':
            {
            alt15=13;
            }
            break;
        case ';':
            {
            alt15=14;
            }
            break;
        case '.':
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt15=15;
            }
            break;
        case 'a':
            {
            switch ( input.LA(2) ) {
            case 'm':
                {
                int LA15_31 = input.LA(3);

                if ( (LA15_31=='p') ) {
                    int LA15_48 = input.LA(4);

                    if ( (LA15_48=='l') ) {
                        int LA15_66 = input.LA(5);

                        if ( ((LA15_66>='0' && LA15_66<='9')||(LA15_66>='A' && LA15_66<='Z')||LA15_66=='_'||(LA15_66>='a' && LA15_66<='z')) ) {
                            alt15=31;
                        }
                        else {
                            alt15=16;}
                    }
                    else {
                        alt15=31;}
                }
                else {
                    alt15=31;}
                }
                break;
            case 't':
                {
                int LA15_32 = input.LA(3);

                if ( ((LA15_32>='0' && LA15_32<='9')||(LA15_32>='A' && LA15_32<='Z')||LA15_32=='_'||(LA15_32>='a' && LA15_32<='z')) ) {
                    alt15=31;
                }
                else {
                    alt15=19;}
                }
                break;
            default:
                alt15=31;}

            }
            break;
        case 'f':
            {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA15_33 = input.LA(3);

                if ( (LA15_33=='o') ) {
                    int LA15_50 = input.LA(4);

                    if ( (LA15_50=='a') ) {
                        int LA15_67 = input.LA(5);

                        if ( (LA15_67=='t') ) {
                            int LA15_81 = input.LA(6);

                            if ( ((LA15_81>='0' && LA15_81<='9')||(LA15_81>='A' && LA15_81<='Z')||LA15_81=='_'||(LA15_81>='a' && LA15_81<='z')) ) {
                                alt15=31;
                            }
                            else {
                                alt15=16;}
                        }
                        else {
                            alt15=31;}
                    }
                    else {
                        alt15=31;}
                }
                else {
                    alt15=31;}
                }
                break;
            case 'r':
                {
                int LA15_34 = input.LA(3);

                if ( (LA15_34=='e') ) {
                    int LA15_51 = input.LA(4);

                    if ( (LA15_51=='q') ) {
                        int LA15_68 = input.LA(5);

                        if ( ((LA15_68>='0' && LA15_68<='9')||(LA15_68>='A' && LA15_68<='Z')||LA15_68=='_'||(LA15_68>='a' && LA15_68<='z')) ) {
                            alt15=31;
                        }
                        else {
                            alt15=16;}
                    }
                    else {
                        alt15=31;}
                }
                else {
                    alt15=31;}
                }
                break;
            case 'o':
                {
                int LA15_35 = input.LA(3);

                if ( (LA15_35=='r') ) {
                    int LA15_52 = input.LA(4);

                    if ( ((LA15_52>='0' && LA15_52<='9')||(LA15_52>='A' && LA15_52<='Z')||LA15_52=='_'||(LA15_52>='a' && LA15_52<='z')) ) {
                        alt15=31;
                    }
                    else {
                        alt15=23;}
                }
                else {
                    alt15=31;}
                }
                break;
            case 'u':
                {
                int LA15_36 = input.LA(3);

                if ( (LA15_36=='n') ) {
                    int LA15_53 = input.LA(4);

                    if ( ((LA15_53>='0' && LA15_53<='9')||(LA15_53>='A' && LA15_53<='Z')||LA15_53=='_'||(LA15_53>='a' && LA15_53<='z')) ) {
                        alt15=31;
                    }
                    else {
                        alt15=24;}
                }
                else {
                    alt15=31;}
                }
                break;
            default:
                alt15=31;}

            }
            break;
        case 'i':
            {
            switch ( input.LA(2) ) {
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA15_54 = input.LA(4);

                    if ( ((LA15_54>='0' && LA15_54<='9')||(LA15_54>='A' && LA15_54<='Z')||LA15_54=='_'||(LA15_54>='a' && LA15_54<='z')) ) {
                        alt15=31;
                    }
                    else {
                        alt15=16;}
                    }
                    break;
                case 'c':
                    {
                    int LA15_55 = input.LA(4);

                    if ( (LA15_55=='l') ) {
                        int LA15_72 = input.LA(5);

                        if ( (LA15_72=='u') ) {
                            int LA15_82 = input.LA(6);

                            if ( (LA15_82=='d') ) {
                                int LA15_88 = input.LA(7);

                                if ( (LA15_88=='e') ) {
                                    int LA15_93 = input.LA(8);

                                    if ( ((LA15_93>='0' && LA15_93<='9')||(LA15_93>='A' && LA15_93<='Z')||LA15_93=='_'||(LA15_93>='a' && LA15_93<='z')) ) {
                                        alt15=31;
                                    }
                                    else {
                                        alt15=26;}
                                }
                                else {
                                    alt15=31;}
                            }
                            else {
                                alt15=31;}
                        }
                        else {
                            alt15=31;}
                    }
                    else {
                        alt15=31;}
                    }
                    break;
                default:
                    alt15=31;}

                }
                break;
            case 'f':
                {
                int LA15_38 = input.LA(3);

                if ( ((LA15_38>='0' && LA15_38<='9')||(LA15_38>='A' && LA15_38<='Z')||LA15_38=='_'||(LA15_38>='a' && LA15_38<='z')) ) {
                    alt15=31;
                }
                else {
                    alt15=25;}
                }
                break;
            default:
                alt15=31;}

            }
            break;
        case 't':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA15_39 = input.LA(3);

                if ( ((LA15_39>='0' && LA15_39<='9')||(LA15_39>='A' && LA15_39<='Z')||LA15_39=='_'||(LA15_39>='a' && LA15_39<='z')) ) {
                    alt15=31;
                }
                else {
                    alt15=29;}
                }
                break;
            case 'i':
                {
                int LA15_40 = input.LA(3);

                if ( (LA15_40=='m') ) {
                    int LA15_58 = input.LA(4);

                    if ( (LA15_58=='e') ) {
                        int LA15_73 = input.LA(5);

                        if ( ((LA15_73>='0' && LA15_73<='9')||(LA15_73>='A' && LA15_73<='Z')||LA15_73=='_'||(LA15_73>='a' && LA15_73<='z')) ) {
                            alt15=31;
                        }
                        else {
                            alt15=16;}
                    }
                    else {
                        alt15=31;}
                }
                else {
                    alt15=31;}
                }
                break;
            default:
                alt15=31;}

            }
            break;
        case 'w':
            {
            switch ( input.LA(2) ) {
            case 'h':
                {
                int LA15_41 = input.LA(3);

                if ( (LA15_41=='i') ) {
                    int LA15_59 = input.LA(4);

                    if ( (LA15_59=='l') ) {
                        int LA15_74 = input.LA(5);

                        if ( (LA15_74=='e') ) {
                            int LA15_83 = input.LA(6);

                            if ( ((LA15_83>='0' && LA15_83<='9')||(LA15_83>='A' && LA15_83<='Z')||LA15_83=='_'||(LA15_83>='a' && LA15_83<='z')) ) {
                                alt15=31;
                            }
                            else {
                                alt15=30;}
                        }
                        else {
                            alt15=31;}
                    }
                    else {
                        alt15=31;}
                }
                else {
                    alt15=31;}
                }
                break;
            case 'a':
                {
                int LA15_42 = input.LA(3);

                if ( (LA15_42=='v') ) {
                    int LA15_60 = input.LA(4);

                    if ( (LA15_60=='e') ) {
                        int LA15_75 = input.LA(5);

                        if ( ((LA15_75>='0' && LA15_75<='9')||(LA15_75>='A' && LA15_75<='Z')||LA15_75=='_'||(LA15_75>='a' && LA15_75<='z')) ) {
                            alt15=31;
                        }
                        else {
                            alt15=16;}
                    }
                    else {
                        alt15=31;}
                }
                else {
                    alt15=31;}
                }
                break;
            default:
                alt15=31;}

            }
            break;
        case '\"':
            {
            alt15=17;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt15=18;
            }
            break;
        case 'c':
            {
            int LA15_22 = input.LA(2);

            if ( (LA15_22=='o') ) {
                int LA15_43 = input.LA(3);

                if ( (LA15_43=='n') ) {
                    int LA15_61 = input.LA(4);

                    if ( (LA15_61=='s') ) {
                        int LA15_76 = input.LA(5);

                        if ( (LA15_76=='t') ) {
                            int LA15_84 = input.LA(6);

                            if ( ((LA15_84>='0' && LA15_84<='9')||(LA15_84>='A' && LA15_84<='Z')||LA15_84=='_'||(LA15_84>='a' && LA15_84<='z')) ) {
                                alt15=31;
                            }
                            else {
                                alt15=20;}
                        }
                        else {
                            alt15=31;}
                    }
                    else {
                        alt15=31;}
                }
                else {
                    alt15=31;}
            }
            else {
                alt15=31;}
            }
            break;
        case 'e':
            {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA15_44 = input.LA(3);

                if ( (LA15_44=='d') ) {
                    int LA15_62 = input.LA(4);

                    if ( ((LA15_62>='0' && LA15_62<='9')||(LA15_62>='A' && LA15_62<='Z')||LA15_62=='_'||(LA15_62>='a' && LA15_62<='z')) ) {
                        alt15=31;
                    }
                    else {
                        alt15=22;}
                }
                else {
                    alt15=31;}
                }
                break;
            case 'l':
                {
                int LA15_45 = input.LA(3);

                if ( (LA15_45=='s') ) {
                    int LA15_63 = input.LA(4);

                    if ( (LA15_63=='e') ) {
                        int LA15_78 = input.LA(5);

                        if ( ((LA15_78>='0' && LA15_78<='9')||(LA15_78>='A' && LA15_78<='Z')||LA15_78=='_'||(LA15_78>='a' && LA15_78<='z')) ) {
                            alt15=31;
                        }
                        else {
                            alt15=21;}
                    }
                    else {
                        alt15=31;}
                }
                else {
                    alt15=31;}
                }
                break;
            default:
                alt15=31;}

            }
            break;
        case 'p':
            {
            int LA15_24 = input.LA(2);

            if ( (LA15_24=='r') ) {
                int LA15_46 = input.LA(3);

                if ( (LA15_46=='i') ) {
                    int LA15_64 = input.LA(4);

                    if ( (LA15_64=='n') ) {
                        int LA15_79 = input.LA(5);

                        if ( (LA15_79=='t') ) {
                            int LA15_86 = input.LA(6);

                            if ( ((LA15_86>='0' && LA15_86<='9')||(LA15_86>='A' && LA15_86<='Z')||LA15_86=='_'||(LA15_86>='a' && LA15_86<='z')) ) {
                                alt15=31;
                            }
                            else {
                                alt15=27;}
                        }
                        else {
                            alt15=31;}
                    }
                    else {
                        alt15=31;}
                }
                else {
                    alt15=31;}
            }
            else {
                alt15=31;}
            }
            break;
        case 'r':
            {
            int LA15_25 = input.LA(2);

            if ( (LA15_25=='e') ) {
                int LA15_47 = input.LA(3);

                if ( (LA15_47=='t') ) {
                    int LA15_65 = input.LA(4);

                    if ( (LA15_65=='u') ) {
                        int LA15_80 = input.LA(5);

                        if ( (LA15_80=='r') ) {
                            int LA15_87 = input.LA(6);

                            if ( (LA15_87=='n') ) {
                                int LA15_92 = input.LA(7);

                                if ( ((LA15_92>='0' && LA15_92<='9')||(LA15_92>='A' && LA15_92<='Z')||LA15_92=='_'||(LA15_92>='a' && LA15_92<='z')) ) {
                                    alt15=31;
                                }
                                else {
                                    alt15=28;}
                            }
                            else {
                                alt15=31;}
                        }
                        else {
                            alt15=31;}
                    }
                    else {
                        alt15=31;}
                }
                else {
                    alt15=31;}
            }
            else {
                alt15=31;}
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'b':
        case 'd':
        case 'g':
        case 'h':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'q':
        case 's':
        case 'u':
        case 'v':
        case 'x':
        case 'y':
        case 'z':
            {
            alt15=31;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T39 | COMMENT | ADD_OP | SUB_OP | MULT_OP | DIV_OP | MOD_OP | ASSIGN | REL_OP | LOG_OP | LPARENS | RPARENS | COMMA | SEMI | NUMBER | TYPE | STRING | WS | AT | CONST | ELSE | END | FOR | FUN | IF | INCLUDE | PRINT | RETURN | TO | WHILE | ID );", 15, 0, input);

            throw nvae;
        }

        switch (alt15) {
            case 1 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:10: T39
                {
                mT39(); 

                }
                break;
            case 2 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:14: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 3 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:22: ADD_OP
                {
                mADD_OP(); 

                }
                break;
            case 4 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:29: SUB_OP
                {
                mSUB_OP(); 

                }
                break;
            case 5 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:36: MULT_OP
                {
                mMULT_OP(); 

                }
                break;
            case 6 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:44: DIV_OP
                {
                mDIV_OP(); 

                }
                break;
            case 7 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:51: MOD_OP
                {
                mMOD_OP(); 

                }
                break;
            case 8 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:58: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 9 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:65: REL_OP
                {
                mREL_OP(); 

                }
                break;
            case 10 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:72: LOG_OP
                {
                mLOG_OP(); 

                }
                break;
            case 11 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:79: LPARENS
                {
                mLPARENS(); 

                }
                break;
            case 12 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:87: RPARENS
                {
                mRPARENS(); 

                }
                break;
            case 13 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:95: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 14 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:101: SEMI
                {
                mSEMI(); 

                }
                break;
            case 15 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:106: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 16 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:113: TYPE
                {
                mTYPE(); 

                }
                break;
            case 17 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:118: STRING
                {
                mSTRING(); 

                }
                break;
            case 18 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:125: WS
                {
                mWS(); 

                }
                break;
            case 19 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:128: AT
                {
                mAT(); 

                }
                break;
            case 20 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:131: CONST
                {
                mCONST(); 

                }
                break;
            case 21 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:137: ELSE
                {
                mELSE(); 

                }
                break;
            case 22 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:142: END
                {
                mEND(); 

                }
                break;
            case 23 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:146: FOR
                {
                mFOR(); 

                }
                break;
            case 24 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:150: FUN
                {
                mFUN(); 

                }
                break;
            case 25 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:154: IF
                {
                mIF(); 

                }
                break;
            case 26 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:157: INCLUDE
                {
                mINCLUDE(); 

                }
                break;
            case 27 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:165: PRINT
                {
                mPRINT(); 

                }
                break;
            case 28 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:171: RETURN
                {
                mRETURN(); 

                }
                break;
            case 29 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:178: TO
                {
                mTO(); 

                }
                break;
            case 30 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:181: WHILE
                {
                mWHILE(); 

                }
                break;
            case 31 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:187: ID
                {
                mID(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\1\uffff\1\3\2\uffff";
    static final String DFA9_eofS =
        "\4\uffff";
    static final String DFA9_minS =
        "\2\56\2\uffff";
    static final String DFA9_maxS =
        "\2\71\2\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA9_specialS =
        "\4\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\2\1\uffff\12\1",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "126:1: NUMBER : ( INTEGER ( 'Hz' | 'ms' )? | ( INTEGER )? FRAC ( 'a' | 'Hz' | 'ms' )? );";
        }
    }
 

}