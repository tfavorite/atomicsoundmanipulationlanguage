// $ANTLR 3.0 C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g 2007-06-21 18:43:41
package asml;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ASMLLexer extends Lexer {
    public static final int CONST=25;
    public static final int COMMA=13;
    public static final int TYPE=21;
    public static final int LETTER=15;
    public static final int LOG_OP=10;
    public static final int END=27;
    public static final int MULTDIV_OP=7;
    public static final int WS=23;
    public static final int NUMBER=19;
    public static final int STRING=22;
    public static final int NONCOMMENT=4;
    public static final int FUN=29;
    public static final int COMMENT=5;
    public static final int RPARENS=12;
    public static final int SEMI=14;
    public static final int INTEGER=17;
    public static final int PRINT=32;
    public static final int ELSE=26;
    public static final int CONSTANT=20;
    public static final int RETURN=33;
    public static final int INCLUDE=31;
    public static final int IF=30;
    public static final int ADDSUB_OP=6;
    public static final int EOF=-1;
    public static final int FRAC=18;
    public static final int ASSIGN=8;
    public static final int Tokens=35;
    public static final int REL_OP=9;
    public static final int DIGIT=16;
    public static final int LPARENS=11;
    public static final int FOREACH=28;
    public static final int AT=24;
    public static final int ID=34;
    public ASMLLexer() {;} 
    public ASMLLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g"; }

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:6:4: ( ( '/*' ( '*' | '/' | NONCOMMENT )* '*/' ) )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:6:4: ( '/*' ( '*' | '/' | NONCOMMENT )* '*/' )
            {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:6:4: ( '/*' ( '*' | '/' | NONCOMMENT )* '*/' )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:6:5: '/*' ( '*' | '/' | NONCOMMENT )* '*/'
            {
            match("/*"); 

            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:6:10: ( '*' | '/' | NONCOMMENT )*
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
            	    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:
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
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:9:4: (~ ( '*' | '/' ) )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:9:4: ~ ( '*' | '/' )
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
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:11:4: ( '+' | '-' )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:
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
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:13:5: ( '*' | '/' )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:
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
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:14:10: ( '=' )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:14:10: '='
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
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:16:10: ( '<' | '>' | '<=' | '>=' | '==' | '!=' )
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
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:16:10: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:16:16: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:16:22: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:16:29: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:16:36: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:16:43: '!='
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
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:17:10: ( '||' | '&&' )
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
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:17:10: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:17:17: '&&'
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
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:21:12: ( '(' )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:21:12: '('
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
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:22:11: ( ')' )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:22:11: ')'
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
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:23:9: ( ',' )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:23:9: ','
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
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:24:8: ( ';' )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:24:8: ';'
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
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:27:4: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )
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
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:27:4: ( 'a' .. 'z' )
                    {
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:27:4: ( 'a' .. 'z' )
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:27:5: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:27:15: ( 'A' .. 'Z' )
                    {
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:27:15: ( 'A' .. 'Z' )
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:27:16: 'A' .. 'Z'
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
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:29:4: ( ( '0' .. '9' ) )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:29:4: ( '0' .. '9' )
            {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:29:4: ( '0' .. '9' )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:29:5: '0' .. '9'
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
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:31:4: ( ( DIGIT )+ )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:31:4: ( DIGIT )+
            {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:31:4: ( DIGIT )+
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
            	    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:31:5: DIGIT
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
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:33:4: ( '.' ( INTEGER ) )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:33:4: '.' ( INTEGER )
            {
            match('.'); 
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:33:7: ( INTEGER )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:33:8: INTEGER
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
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:35:9: ( INTEGER ( 'Hz' | 'ms' )? | ( INTEGER )? FRAC ( 'a' | 'Hz' | 'ms' )? )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:35:9: INTEGER ( 'Hz' | 'ms' )?
                    {
                    mINTEGER(); 
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:36:3: ( 'Hz' | 'ms' )?
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
                            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:36:4: 'Hz'
                            {
                            match("Hz"); 


                            }
                            break;
                        case 2 :
                            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:37:4: 'ms'
                            {
                            match("ms"); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:38:4: ( INTEGER )? FRAC ( 'a' | 'Hz' | 'ms' )?
                    {
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:38:4: ( INTEGER )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:38:4: INTEGER
                            {
                            mINTEGER(); 

                            }
                            break;

                    }

                    mFRAC(); 
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:39:3: ( 'a' | 'Hz' | 'ms' )?
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
                            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:39:4: 'a'
                            {
                            match('a'); 

                            }
                            break;
                        case 2 :
                            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:40:4: 'Hz'
                            {
                            match("Hz"); 


                            }
                            break;
                        case 3 :
                            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:41:4: 'ms'
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

    // $ANTLR start CONSTANT
    public final void mCONSTANT() throws RecognitionException {
        try {
            int _type = CONSTANT;
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:43:11: ( NUMBER )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:43:11: NUMBER
            {
            mNUMBER(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CONSTANT

    // $ANTLR start TYPE
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:45:8: ( 'ampl' | 'float' | 'freq' | 'int' | 'time' | 'wave' )
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

                if ( (LA10_2=='r') ) {
                    alt10=3;
                }
                else if ( (LA10_2=='l') ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("45:1: TYPE : ( 'ampl' | 'float' | 'freq' | 'int' | 'time' | 'wave' );", 10, 2, input);

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
                    new NoViableAltException("45:1: TYPE : ( 'ampl' | 'float' | 'freq' | 'int' | 'time' | 'wave' );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:45:8: 'ampl'
                    {
                    match("ampl"); 


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:45:15: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:45:23: 'freq'
                    {
                    match("freq"); 


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:45:30: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:45:36: 'time'
                    {
                    match("time"); 


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:45:43: 'wave'
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
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:47:10: ( '\"' ( ( '\\\\' '\"' ) | ~ ( '\"' ) )* '\"' )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:47:10: '\"' ( ( '\\\\' '\"' ) | ~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:47:15: ( ( '\\\\' '\"' ) | ~ ( '\"' ) )*
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
            	    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:47:16: ( '\\\\' '\"' )
            	    {
            	    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:47:16: ( '\\\\' '\"' )
            	    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:47:17: '\\\\' '\"'
            	    {
            	    match('\\'); 
            	    match('\"'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:47:29: ~ ( '\"' )
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
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:49:6: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:49:6: ( ' ' | '\\t' | '\\n' | '\\r' )
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
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:51:6: ( 'at' )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:51:6: 'at'
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
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:52:10: ( 'const' )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:52:10: 'const'
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
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:53:9: ( 'else' )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:53:9: 'else'
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
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:54:7: ( 'end' )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:54:7: 'end'
            {
            match("end"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end END

    // $ANTLR start FOREACH
    public final void mFOREACH() throws RecognitionException {
        try {
            int _type = FOREACH;
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:55:11: ( 'foreach' )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:55:11: 'foreach'
            {
            match("foreach"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FOREACH

    // $ANTLR start FUN
    public final void mFUN() throws RecognitionException {
        try {
            int _type = FUN;
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:56:7: ( 'fun' )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:56:7: 'fun'
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
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:57:6: ( 'if' )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:57:6: 'if'
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
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:58:11: ( 'include' )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:58:11: 'include'
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
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:59:9: ( 'print' )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:59:9: 'print'
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
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:60:10: ( 'return' )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:60:10: 'return'
            {
            match("return"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RETURN

    // $ANTLR start ID
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:63:7: ( ( LETTER | '_' ) ( LETTER | '_' | DIGIT )* )
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:63:7: ( LETTER | '_' ) ( LETTER | '_' | DIGIT )*
            {
            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:63:7: ( LETTER | '_' )
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
                    new NoViableAltException("63:7: ( LETTER | '_' )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:63:8: LETTER
                    {
                    mLETTER(); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:63:15: '_'
                    {
                    match('_'); 

                    }
                    break;

            }

            // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:63:19: ( LETTER | '_' | DIGIT )*
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
            	    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:63:20: LETTER
            	    {
            	    mLETTER(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:63:27: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 3 :
            	    // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:63:31: DIGIT
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
        // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:10: ( COMMENT | ADDSUB_OP | MULTDIV_OP | ASSIGN | REL_OP | LOG_OP | LPARENS | RPARENS | COMMA | SEMI | NUMBER | CONSTANT | TYPE | STRING | WS | AT | CONST | ELSE | END | FOREACH | FUN | IF | INCLUDE | PRINT | RETURN | ID )
        int alt14=26;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:10: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 2 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:18: ADDSUB_OP
                {
                mADDSUB_OP(); 

                }
                break;
            case 3 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:28: MULTDIV_OP
                {
                mMULTDIV_OP(); 

                }
                break;
            case 4 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:39: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 5 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:46: REL_OP
                {
                mREL_OP(); 

                }
                break;
            case 6 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:53: LOG_OP
                {
                mLOG_OP(); 

                }
                break;
            case 7 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:60: LPARENS
                {
                mLPARENS(); 

                }
                break;
            case 8 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:68: RPARENS
                {
                mRPARENS(); 

                }
                break;
            case 9 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:76: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 10 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:82: SEMI
                {
                mSEMI(); 

                }
                break;
            case 11 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:87: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 12 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:94: CONSTANT
                {
                mCONSTANT(); 

                }
                break;
            case 13 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:103: TYPE
                {
                mTYPE(); 

                }
                break;
            case 14 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:108: STRING
                {
                mSTRING(); 

                }
                break;
            case 15 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:115: WS
                {
                mWS(); 

                }
                break;
            case 16 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:118: AT
                {
                mAT(); 

                }
                break;
            case 17 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:121: CONST
                {
                mCONST(); 

                }
                break;
            case 18 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:127: ELSE
                {
                mELSE(); 

                }
                break;
            case 19 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:132: END
                {
                mEND(); 

                }
                break;
            case 20 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:136: FOREACH
                {
                mFOREACH(); 

                }
                break;
            case 21 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:144: FUN
                {
                mFUN(); 

                }
                break;
            case 22 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:148: IF
                {
                mIF(); 

                }
                break;
            case 23 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:151: INCLUDE
                {
                mINCLUDE(); 

                }
                break;
            case 24 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:159: PRINT
                {
                mPRINT(); 

                }
                break;
            case 25 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:165: RETURN
                {
                mRETURN(); 

                }
                break;
            case 26 :
                // C:\\Documents and Settings\\Tim Favorite\\My Documents\\PLT\\ASML\\asml\\ASML.g:1:172: ID
                {
                mID(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA14 dfa14 = new DFA14(this);
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
            return "35:1: NUMBER : ( INTEGER ( 'Hz' | 'ms' )? | ( INTEGER )? FRAC ( 'a' | 'Hz' | 'ms' )? );";
        }
    }
    static final String DFA14_eotS =
        "\1\uffff\1\3\2\uffff\1\32\6\uffff\1\33\1\uffff\5\30\2\uffff\4\30"+
        "\6\uffff\1\33\1\63\6\30\1\73\7\30\6\uffff\1\30\1\106\3\30\1\112"+
        "\1\30\1\uffff\4\30\1\120\2\30\2\uffff\1\112\1\uffff\2\30\1\112\1"+
        "\uffff\1\30\2\112\1\30\1\127\1\uffff\3\30\1\112\1\30\1\134\1\uffff"+
        "\1\135\3\30\2\uffff\1\141\1\142\1\143\3\uffff";
    static final String DFA14_eofS =
        "\144\uffff";
    static final String DFA14_minS =
        "\1\11\1\52\2\uffff\1\75\6\uffff\1\56\1\60\1\155\1\154\1\146\1\151"+
        "\1\141\2\uffff\1\157\1\154\1\162\1\145\4\uffff\1\172\1\163\2\60"+
        "\1\160\1\156\1\162\1\157\1\145\1\143\1\60\1\155\1\166\1\156\1\163"+
        "\1\144\1\151\1\164\3\uffff\1\172\1\163\1\uffff\1\154\1\60\1\145"+
        "\1\141\1\161\1\60\1\154\1\uffff\2\145\1\163\1\145\1\60\1\156\1\165"+
        "\2\uffff\1\60\1\uffff\1\141\1\164\1\60\1\uffff\1\165\2\60\1\164"+
        "\1\60\1\uffff\1\164\1\162\1\143\1\60\1\144\1\60\1\uffff\1\60\1\156"+
        "\1\150\1\145\2\uffff\3\60\3\uffff";
    static final String DFA14_maxS =
        "\1\174\1\52\2\uffff\1\75\6\uffff\1\155\1\71\1\164\1\165\1\156\1"+
        "\151\1\141\2\uffff\1\157\1\156\1\162\1\145\4\uffff\1\172\1\163\1"+
        "\155\1\172\1\160\1\156\1\162\1\157\1\145\1\164\1\172\1\155\1\166"+
        "\1\156\1\163\1\144\1\151\1\164\3\uffff\1\172\1\163\1\uffff\1\154"+
        "\1\172\1\145\1\141\1\161\1\172\1\154\1\uffff\2\145\1\163\1\145\1"+
        "\172\1\156\1\165\2\uffff\1\172\1\uffff\1\141\1\164\1\172\1\uffff"+
        "\1\165\2\172\1\164\1\172\1\uffff\1\164\1\162\1\143\1\172\1\144\1"+
        "\172\1\uffff\1\172\1\156\1\150\1\145\2\uffff\3\172\3\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12\7\uffff\1\16"+
        "\1\17\4\uffff\1\32\1\1\1\4\1\13\22\uffff\3\13\2\uffff\1\20\7\uffff"+
        "\1\26\7\uffff\2\13\1\uffff\1\25\3\uffff\1\15\5\uffff\1\23\6\uffff"+
        "\1\22\4\uffff\1\21\1\30\3\uffff\1\31\1\24\1\27";
    static final String DFA14_specialS =
        "\144\uffff}>";
    static final String[] DFA14_transitionS = {
            "\2\23\2\uffff\1\23\22\uffff\1\23\1\5\1\22\3\uffff\1\6\1\uffff"+
            "\1\7\1\10\1\3\1\2\1\11\1\2\1\14\1\1\12\13\1\uffff\1\12\1\5\1"+
            "\4\1\5\2\uffff\32\30\4\uffff\1\30\1\uffff\1\15\1\30\1\24\1\30"+
            "\1\25\1\16\2\30\1\17\6\30\1\26\1\30\1\27\1\30\1\20\2\30\1\21"+
            "\3\30\1\uffff\1\6",
            "\1\31",
            "",
            "",
            "\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14\1\uffff\12\13\16\uffff\1\34\44\uffff\1\35",
            "\12\36",
            "\1\40\6\uffff\1\37",
            "\1\43\2\uffff\1\42\2\uffff\1\44\2\uffff\1\41",
            "\1\46\7\uffff\1\45",
            "\1\47",
            "\1\50",
            "",
            "",
            "\1\51",
            "\1\52\1\uffff\1\53",
            "\1\54",
            "\1\55",
            "",
            "",
            "",
            "",
            "\1\56",
            "\1\57",
            "\12\36\16\uffff\1\61\30\uffff\1\60\13\uffff\1\62",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\72\20\uffff\1\71",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "",
            "",
            "\1\103",
            "\1\104",
            "",
            "\1\105",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\107",
            "\1\110",
            "\1\111",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\113",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\121",
            "\1\122",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\123",
            "\1\124",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\125",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\126",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\133",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( COMMENT | ADDSUB_OP | MULTDIV_OP | ASSIGN | REL_OP | LOG_OP | LPARENS | RPARENS | COMMA | SEMI | NUMBER | CONSTANT | TYPE | STRING | WS | AT | CONST | ELSE | END | FOREACH | FUN | IF | INCLUDE | PRINT | RETURN | ID );";
        }
    }
 

}