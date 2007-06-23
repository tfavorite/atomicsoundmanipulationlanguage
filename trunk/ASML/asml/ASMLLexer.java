// $ANTLR 3.0 C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g 2007-06-22 19:39:27
package asml;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ASMLLexer extends Lexer {
    public static final int INTEGER=17;
    public static final int NONCOMMENT=4;
    public static final int RPARENS=12;
    public static final int WHILE=33;
    public static final int MULTDIV_OP=7;
    public static final int LETTER=15;
    public static final int CONST=24;
    public static final int ELSE=25;
    public static final int NUMBER=19;
    public static final int LPARENS=11;
    public static final int FOR=27;
    public static final int ID=34;
    public static final int Tokens=35;
    public static final int EOF=-1;
    public static final int SEMI=14;
    public static final int PRINT=31;
    public static final int FRAC=18;
    public static final int IF=29;
    public static final int TYPE=20;
    public static final int AT=23;
    public static final int ADDSUB_OP=6;
    public static final int WS=22;
    public static final int REL_OP=9;
    public static final int COMMA=13;
    public static final int INCLUDE=30;
    public static final int RETURN=32;
    public static final int ASSIGN=8;
    public static final int LOG_OP=10;
    public static final int DIGIT=16;
    public static final int FUN=28;
    public static final int END=26;
    public static final int COMMENT=5;
    public static final int STRING=21;
    public ASMLLexer() {;} 
    public ASMLLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g"; }

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:6:4: ( ( '/*' ( '*' | '/' | NONCOMMENT )* '*/' ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:6:4: ( '/*' ( '*' | '/' | NONCOMMENT )* '*/' )
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:6:4: ( '/*' ( '*' | '/' | NONCOMMENT )* '*/' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:6:5: '/*' ( '*' | '/' | NONCOMMENT )* '*/'
            {
            match("/*"); 

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:6:10: ( '*' | '/' | NONCOMMENT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        int LA1_3 = input.LA(3);

                        if ( ((LA1_3>='\u0000' && LA1_3<='\uFFFE')) ) {
                            alt1=1;
                        }


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
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\uFFFE') ) {
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
            	    break loop1;
                }
            } while (true);

            match("*/"); 


            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMENT

    // $ANTLR start NONCOMMENT
    public final void mNONCOMMENT() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:9:4: (~ ( '*' | '/' ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:9:4: ~ ( '*' | '/' )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='\uFFFE') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end NONCOMMENT

    // $ANTLR start ADDSUB_OP
    public final void mADDSUB_OP() throws RecognitionException {
        try {
            int _type = ADDSUB_OP;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:11:4: ( '+' | '-' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ADDSUB_OP

    // $ANTLR start MULTDIV_OP
    public final void mMULTDIV_OP() throws RecognitionException {
        try {
            int _type = MULTDIV_OP;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:13:5: ( '*' | '/' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:
            {
            if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MULTDIV_OP

    // $ANTLR start ASSIGN
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:14:10: ( '=' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:14:10: '='
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:16:10: ( '<' | '>' | '<=' | '>=' | '==' | '!=' )
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
                    new NoViableAltException("16:1: REL_OP : ( '<' | '>' | '<=' | '>=' | '==' | '!=' );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:16:10: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:16:16: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:16:22: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:16:29: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:16:36: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:16:43: '!='
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:17:10: ( '||' | '&&' )
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
                    new NoViableAltException("17:1: LOG_OP : ( '||' | '&&' );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:17:10: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:17:17: '&&'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:21:12: ( '(' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:21:12: '('
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:22:11: ( ')' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:22:11: ')'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:23:9: ( ',' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:23:9: ','
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:24:8: ( ';' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:24:8: ';'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:27:4: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )
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
                    new NoViableAltException("26:10: fragment LETTER : ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:27:4: ( 'a' .. 'z' )
                    {
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:27:4: ( 'a' .. 'z' )
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:27:5: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:27:15: ( 'A' .. 'Z' )
                    {
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:27:15: ( 'A' .. 'Z' )
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:27:16: 'A' .. 'Z'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:29:4: ( ( '0' .. '9' ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:29:4: ( '0' .. '9' )
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:29:4: ( '0' .. '9' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:29:5: '0' .. '9'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:31:4: ( ( DIGIT )+ )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:31:4: ( DIGIT )+
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:31:4: ( DIGIT )+
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
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:31:5: DIGIT
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:33:4: ( '.' ( INTEGER ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:33:4: '.' ( INTEGER )
            {
            match('.'); 
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:33:7: ( INTEGER )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:33:8: INTEGER
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:37:9: ( INTEGER ( 'Hz' | 'ms' )? | ( INTEGER )? FRAC ( 'a' | 'Hz' | 'ms' )? )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:37:9: INTEGER ( 'Hz' | 'ms' )?
                    {
                    mINTEGER(); 
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:38:3: ( 'Hz' | 'ms' )?
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
                            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:38:4: 'Hz'
                            {
                            match("Hz"); 


                            }
                            break;
                        case 2 :
                            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:39:4: 'ms'
                            {
                            match("ms"); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:40:4: ( INTEGER )? FRAC ( 'a' | 'Hz' | 'ms' )?
                    {
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:40:4: ( INTEGER )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:40:4: INTEGER
                            {
                            mINTEGER(); 

                            }
                            break;

                    }

                    mFRAC(); 
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:41:3: ( 'a' | 'Hz' | 'ms' )?
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
                            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:41:4: 'a'
                            {
                            match('a'); 

                            }
                            break;
                        case 2 :
                            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:42:4: 'Hz'
                            {
                            match("Hz"); 


                            }
                            break;
                        case 3 :
                            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:43:4: 'ms'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:46:8: ( 'ampl' | 'float' | 'freq' | 'int' | 'time' | 'wave' )
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
                        new NoViableAltException("46:1: TYPE : ( 'ampl' | 'float' | 'freq' | 'int' | 'time' | 'wave' );", 10, 2, input);

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
                    new NoViableAltException("46:1: TYPE : ( 'ampl' | 'float' | 'freq' | 'int' | 'time' | 'wave' );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:46:8: 'ampl'
                    {
                    match("ampl"); 


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:46:15: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:46:23: 'freq'
                    {
                    match("freq"); 


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:46:30: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:46:36: 'time'
                    {
                    match("time"); 


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:46:43: 'wave'
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

    // $ANTLR start STRING
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:48:10: ( '\"' ( ( '\\\\' '\"' ) | ~ ( '\"' ) )* '\"' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:48:10: '\"' ( ( '\\\\' '\"' ) | ~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:48:15: ( ( '\\\\' '\"' ) | ~ ( '\"' ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\\') ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2=='\"') ) {
                        int LA11_4 = input.LA(3);

                        if ( ((LA11_4>='\u0000' && LA11_4<='\uFFFE')) ) {
                            alt11=1;
                        }

                        else {
                            alt11=2;
                        }

                    }
                    else if ( ((LA11_2>='\u0000' && LA11_2<='!')||(LA11_2>='#' && LA11_2<='\uFFFE')) ) {
                        alt11=2;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFE')) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:48:16: ( '\\\\' '\"' )
            	    {
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:48:16: ( '\\\\' '\"' )
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:48:17: '\\\\' '\"'
            	    {
            	    match('\\'); 
            	    match('\"'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:48:29: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFE') ) {
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

            match('\"'); 

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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:50:6: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:50:6: ( ' ' | '\\t' | '\\n' | '\\r' )
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:53:6: ( 'at' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:53:6: 'at'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:54:10: ( 'const' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:54:10: 'const'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:55:9: ( 'else' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:55:9: 'else'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:56:7: ( 'end' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:56:7: 'end'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:57:7: ( 'for' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:57:7: 'for'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:58:7: ( 'fun' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:58:7: 'fun'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:59:6: ( 'if' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:59:6: 'if'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:60:11: ( 'include' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:60:11: 'include'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:61:9: ( 'print' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:61:9: 'print'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:62:10: ( 'return' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:62:10: 'return'
            {
            match("return"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RETURN

    // $ANTLR start WHILE
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:63:10: ( 'while' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:63:10: 'while'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:65:7: ( ( LETTER | '_' ) ( LETTER | '_' | DIGIT )* )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:65:7: ( LETTER | '_' ) ( LETTER | '_' | DIGIT )*
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:65:7: ( LETTER | '_' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>='A' && LA12_0<='Z')||(LA12_0>='a' && LA12_0<='z')) ) {
                alt12=1;
            }
            else if ( (LA12_0=='_') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("65:7: ( LETTER | '_' )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:65:8: LETTER
                    {
                    mLETTER(); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:65:15: '_'
                    {
                    match('_'); 

                    }
                    break;

            }

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:65:19: ( LETTER | '_' | DIGIT )*
            loop13:
            do {
                int alt13=4;
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
                    alt13=1;
                    }
                    break;
                case '_':
                    {
                    alt13=2;
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
                    alt13=3;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:65:20: LETTER
            	    {
            	    mLETTER(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:65:27: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 3 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:65:31: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
        // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:10: ( COMMENT | ADDSUB_OP | MULTDIV_OP | ASSIGN | REL_OP | LOG_OP | LPARENS | RPARENS | COMMA | SEMI | NUMBER | TYPE | STRING | WS | AT | CONST | ELSE | END | FOR | FUN | IF | INCLUDE | PRINT | RETURN | WHILE | ID )
        int alt14=26;
        switch ( input.LA(1) ) {
        case '/':
            {
            int LA14_1 = input.LA(2);

            if ( (LA14_1=='*') ) {
                alt14=1;
            }
            else {
                alt14=3;}
            }
            break;
        case '+':
        case '-':
            {
            alt14=2;
            }
            break;
        case '*':
            {
            alt14=3;
            }
            break;
        case '=':
            {
            int LA14_4 = input.LA(2);

            if ( (LA14_4=='=') ) {
                alt14=5;
            }
            else {
                alt14=4;}
            }
            break;
        case '!':
        case '<':
        case '>':
            {
            alt14=5;
            }
            break;
        case '&':
        case '|':
            {
            alt14=6;
            }
            break;
        case '(':
            {
            alt14=7;
            }
            break;
        case ')':
            {
            alt14=8;
            }
            break;
        case ',':
            {
            alt14=9;
            }
            break;
        case ';':
            {
            alt14=10;
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
            alt14=11;
            }
            break;
        case 'a':
            {
            switch ( input.LA(2) ) {
            case 'm':
                {
                int LA14_26 = input.LA(3);

                if ( (LA14_26=='p') ) {
                    int LA14_42 = input.LA(4);

                    if ( (LA14_42=='l') ) {
                        int LA14_59 = input.LA(5);

                        if ( ((LA14_59>='0' && LA14_59<='9')||(LA14_59>='A' && LA14_59<='Z')||LA14_59=='_'||(LA14_59>='a' && LA14_59<='z')) ) {
                            alt14=26;
                        }
                        else {
                            alt14=12;}
                    }
                    else {
                        alt14=26;}
                }
                else {
                    alt14=26;}
                }
                break;
            case 't':
                {
                int LA14_27 = input.LA(3);

                if ( ((LA14_27>='0' && LA14_27<='9')||(LA14_27>='A' && LA14_27<='Z')||LA14_27=='_'||(LA14_27>='a' && LA14_27<='z')) ) {
                    alt14=26;
                }
                else {
                    alt14=15;}
                }
                break;
            default:
                alt14=26;}

            }
            break;
        case 'f':
            {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA14_28 = input.LA(3);

                if ( (LA14_28=='o') ) {
                    int LA14_44 = input.LA(4);

                    if ( (LA14_44=='a') ) {
                        int LA14_60 = input.LA(5);

                        if ( (LA14_60=='t') ) {
                            int LA14_74 = input.LA(6);

                            if ( ((LA14_74>='0' && LA14_74<='9')||(LA14_74>='A' && LA14_74<='Z')||LA14_74=='_'||(LA14_74>='a' && LA14_74<='z')) ) {
                                alt14=26;
                            }
                            else {
                                alt14=12;}
                        }
                        else {
                            alt14=26;}
                    }
                    else {
                        alt14=26;}
                }
                else {
                    alt14=26;}
                }
                break;
            case 'r':
                {
                int LA14_29 = input.LA(3);

                if ( (LA14_29=='e') ) {
                    int LA14_45 = input.LA(4);

                    if ( (LA14_45=='q') ) {
                        int LA14_61 = input.LA(5);

                        if ( ((LA14_61>='0' && LA14_61<='9')||(LA14_61>='A' && LA14_61<='Z')||LA14_61=='_'||(LA14_61>='a' && LA14_61<='z')) ) {
                            alt14=26;
                        }
                        else {
                            alt14=12;}
                    }
                    else {
                        alt14=26;}
                }
                else {
                    alt14=26;}
                }
                break;
            case 'o':
                {
                int LA14_30 = input.LA(3);

                if ( (LA14_30=='r') ) {
                    int LA14_46 = input.LA(4);

                    if ( ((LA14_46>='0' && LA14_46<='9')||(LA14_46>='A' && LA14_46<='Z')||LA14_46=='_'||(LA14_46>='a' && LA14_46<='z')) ) {
                        alt14=26;
                    }
                    else {
                        alt14=19;}
                }
                else {
                    alt14=26;}
                }
                break;
            case 'u':
                {
                int LA14_31 = input.LA(3);

                if ( (LA14_31=='n') ) {
                    int LA14_47 = input.LA(4);

                    if ( ((LA14_47>='0' && LA14_47<='9')||(LA14_47>='A' && LA14_47<='Z')||LA14_47=='_'||(LA14_47>='a' && LA14_47<='z')) ) {
                        alt14=26;
                    }
                    else {
                        alt14=20;}
                }
                else {
                    alt14=26;}
                }
                break;
            default:
                alt14=26;}

            }
            break;
        case 'i':
            {
            switch ( input.LA(2) ) {
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 'c':
                    {
                    int LA14_48 = input.LA(4);

                    if ( (LA14_48=='l') ) {
                        int LA14_64 = input.LA(5);

                        if ( (LA14_64=='u') ) {
                            int LA14_75 = input.LA(6);

                            if ( (LA14_75=='d') ) {
                                int LA14_81 = input.LA(7);

                                if ( (LA14_81=='e') ) {
                                    int LA14_86 = input.LA(8);

                                    if ( ((LA14_86>='0' && LA14_86<='9')||(LA14_86>='A' && LA14_86<='Z')||LA14_86=='_'||(LA14_86>='a' && LA14_86<='z')) ) {
                                        alt14=26;
                                    }
                                    else {
                                        alt14=22;}
                                }
                                else {
                                    alt14=26;}
                            }
                            else {
                                alt14=26;}
                        }
                        else {
                            alt14=26;}
                    }
                    else {
                        alt14=26;}
                    }
                    break;
                case 't':
                    {
                    int LA14_49 = input.LA(4);

                    if ( ((LA14_49>='0' && LA14_49<='9')||(LA14_49>='A' && LA14_49<='Z')||LA14_49=='_'||(LA14_49>='a' && LA14_49<='z')) ) {
                        alt14=26;
                    }
                    else {
                        alt14=12;}
                    }
                    break;
                default:
                    alt14=26;}

                }
                break;
            case 'f':
                {
                int LA14_33 = input.LA(3);

                if ( ((LA14_33>='0' && LA14_33<='9')||(LA14_33>='A' && LA14_33<='Z')||LA14_33=='_'||(LA14_33>='a' && LA14_33<='z')) ) {
                    alt14=26;
                }
                else {
                    alt14=21;}
                }
                break;
            default:
                alt14=26;}

            }
            break;
        case 't':
            {
            int LA14_15 = input.LA(2);

            if ( (LA14_15=='i') ) {
                int LA14_34 = input.LA(3);

                if ( (LA14_34=='m') ) {
                    int LA14_51 = input.LA(4);

                    if ( (LA14_51=='e') ) {
                        int LA14_66 = input.LA(5);

                        if ( ((LA14_66>='0' && LA14_66<='9')||(LA14_66>='A' && LA14_66<='Z')||LA14_66=='_'||(LA14_66>='a' && LA14_66<='z')) ) {
                            alt14=26;
                        }
                        else {
                            alt14=12;}
                    }
                    else {
                        alt14=26;}
                }
                else {
                    alt14=26;}
            }
            else {
                alt14=26;}
            }
            break;
        case 'w':
            {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA14_35 = input.LA(3);

                if ( (LA14_35=='v') ) {
                    int LA14_52 = input.LA(4);

                    if ( (LA14_52=='e') ) {
                        int LA14_67 = input.LA(5);

                        if ( ((LA14_67>='0' && LA14_67<='9')||(LA14_67>='A' && LA14_67<='Z')||LA14_67=='_'||(LA14_67>='a' && LA14_67<='z')) ) {
                            alt14=26;
                        }
                        else {
                            alt14=12;}
                    }
                    else {
                        alt14=26;}
                }
                else {
                    alt14=26;}
                }
                break;
            case 'h':
                {
                int LA14_36 = input.LA(3);

                if ( (LA14_36=='i') ) {
                    int LA14_53 = input.LA(4);

                    if ( (LA14_53=='l') ) {
                        int LA14_68 = input.LA(5);

                        if ( (LA14_68=='e') ) {
                            int LA14_76 = input.LA(6);

                            if ( ((LA14_76>='0' && LA14_76<='9')||(LA14_76>='A' && LA14_76<='Z')||LA14_76=='_'||(LA14_76>='a' && LA14_76<='z')) ) {
                                alt14=26;
                            }
                            else {
                                alt14=25;}
                        }
                        else {
                            alt14=26;}
                    }
                    else {
                        alt14=26;}
                }
                else {
                    alt14=26;}
                }
                break;
            default:
                alt14=26;}

            }
            break;
        case '\"':
            {
            alt14=13;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt14=14;
            }
            break;
        case 'c':
            {
            int LA14_19 = input.LA(2);

            if ( (LA14_19=='o') ) {
                int LA14_37 = input.LA(3);

                if ( (LA14_37=='n') ) {
                    int LA14_54 = input.LA(4);

                    if ( (LA14_54=='s') ) {
                        int LA14_69 = input.LA(5);

                        if ( (LA14_69=='t') ) {
                            int LA14_77 = input.LA(6);

                            if ( ((LA14_77>='0' && LA14_77<='9')||(LA14_77>='A' && LA14_77<='Z')||LA14_77=='_'||(LA14_77>='a' && LA14_77<='z')) ) {
                                alt14=26;
                            }
                            else {
                                alt14=16;}
                        }
                        else {
                            alt14=26;}
                    }
                    else {
                        alt14=26;}
                }
                else {
                    alt14=26;}
            }
            else {
                alt14=26;}
            }
            break;
        case 'e':
            {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA14_38 = input.LA(3);

                if ( (LA14_38=='d') ) {
                    int LA14_55 = input.LA(4);

                    if ( ((LA14_55>='0' && LA14_55<='9')||(LA14_55>='A' && LA14_55<='Z')||LA14_55=='_'||(LA14_55>='a' && LA14_55<='z')) ) {
                        alt14=26;
                    }
                    else {
                        alt14=18;}
                }
                else {
                    alt14=26;}
                }
                break;
            case 'l':
                {
                int LA14_39 = input.LA(3);

                if ( (LA14_39=='s') ) {
                    int LA14_56 = input.LA(4);

                    if ( (LA14_56=='e') ) {
                        int LA14_71 = input.LA(5);

                        if ( ((LA14_71>='0' && LA14_71<='9')||(LA14_71>='A' && LA14_71<='Z')||LA14_71=='_'||(LA14_71>='a' && LA14_71<='z')) ) {
                            alt14=26;
                        }
                        else {
                            alt14=17;}
                    }
                    else {
                        alt14=26;}
                }
                else {
                    alt14=26;}
                }
                break;
            default:
                alt14=26;}

            }
            break;
        case 'p':
            {
            int LA14_21 = input.LA(2);

            if ( (LA14_21=='r') ) {
                int LA14_40 = input.LA(3);

                if ( (LA14_40=='i') ) {
                    int LA14_57 = input.LA(4);

                    if ( (LA14_57=='n') ) {
                        int LA14_72 = input.LA(5);

                        if ( (LA14_72=='t') ) {
                            int LA14_79 = input.LA(6);

                            if ( ((LA14_79>='0' && LA14_79<='9')||(LA14_79>='A' && LA14_79<='Z')||LA14_79=='_'||(LA14_79>='a' && LA14_79<='z')) ) {
                                alt14=26;
                            }
                            else {
                                alt14=23;}
                        }
                        else {
                            alt14=26;}
                    }
                    else {
                        alt14=26;}
                }
                else {
                    alt14=26;}
            }
            else {
                alt14=26;}
            }
            break;
        case 'r':
            {
            int LA14_22 = input.LA(2);

            if ( (LA14_22=='e') ) {
                int LA14_41 = input.LA(3);

                if ( (LA14_41=='t') ) {
                    int LA14_58 = input.LA(4);

                    if ( (LA14_58=='u') ) {
                        int LA14_73 = input.LA(5);

                        if ( (LA14_73=='r') ) {
                            int LA14_80 = input.LA(6);

                            if ( (LA14_80=='n') ) {
                                int LA14_85 = input.LA(7);

                                if ( ((LA14_85>='0' && LA14_85<='9')||(LA14_85>='A' && LA14_85<='Z')||LA14_85=='_'||(LA14_85>='a' && LA14_85<='z')) ) {
                                    alt14=26;
                                }
                                else {
                                    alt14=24;}
                            }
                            else {
                                alt14=26;}
                        }
                        else {
                            alt14=26;}
                    }
                    else {
                        alt14=26;}
                }
                else {
                    alt14=26;}
            }
            else {
                alt14=26;}
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
            alt14=26;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( COMMENT | ADDSUB_OP | MULTDIV_OP | ASSIGN | REL_OP | LOG_OP | LPARENS | RPARENS | COMMA | SEMI | NUMBER | TYPE | STRING | WS | AT | CONST | ELSE | END | FOR | FUN | IF | INCLUDE | PRINT | RETURN | WHILE | ID );", 14, 0, input);

            throw nvae;
        }

        switch (alt14) {
            case 1 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:10: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 2 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:18: ADDSUB_OP
                {
                mADDSUB_OP(); 

                }
                break;
            case 3 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:28: MULTDIV_OP
                {
                mMULTDIV_OP(); 

                }
                break;
            case 4 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:39: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 5 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:46: REL_OP
                {
                mREL_OP(); 

                }
                break;
            case 6 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:53: LOG_OP
                {
                mLOG_OP(); 

                }
                break;
            case 7 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:60: LPARENS
                {
                mLPARENS(); 

                }
                break;
            case 8 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:68: RPARENS
                {
                mRPARENS(); 

                }
                break;
            case 9 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:76: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 10 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:82: SEMI
                {
                mSEMI(); 

                }
                break;
            case 11 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:87: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 12 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:94: TYPE
                {
                mTYPE(); 

                }
                break;
            case 13 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:99: STRING
                {
                mSTRING(); 

                }
                break;
            case 14 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:106: WS
                {
                mWS(); 

                }
                break;
            case 15 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:109: AT
                {
                mAT(); 

                }
                break;
            case 16 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:112: CONST
                {
                mCONST(); 

                }
                break;
            case 17 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:118: ELSE
                {
                mELSE(); 

                }
                break;
            case 18 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:123: END
                {
                mEND(); 

                }
                break;
            case 19 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:127: FOR
                {
                mFOR(); 

                }
                break;
            case 20 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:131: FUN
                {
                mFUN(); 

                }
                break;
            case 21 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:135: IF
                {
                mIF(); 

                }
                break;
            case 22 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:138: INCLUDE
                {
                mINCLUDE(); 

                }
                break;
            case 23 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:146: PRINT
                {
                mPRINT(); 

                }
                break;
            case 24 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:152: RETURN
                {
                mRETURN(); 

                }
                break;
            case 25 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:159: WHILE
                {
                mWHILE(); 

                }
                break;
            case 26 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:165: ID
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
            return "37:1: NUMBER : ( INTEGER ( 'Hz' | 'ms' )? | ( INTEGER )? FRAC ( 'a' | 'Hz' | 'ms' )? );";
        }
    }
 

}