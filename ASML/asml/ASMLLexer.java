// $ANTLR 3.0 C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g 2007-06-21 17:44:13
package asml;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ASMLLexer extends Lexer {
    public static final int INTEGER=15;
    public static final int NONCOMMENT=4;
    public static final int MULTDIV_OP=7;
    public static final int LETTER=13;
    public static final int CONST=22;
    public static final int ELSE=23;
    public static final int NUMBER=17;
    public static final int ID=31;
    public static final int Tokens=32;
    public static final int EOF=-1;
    public static final int SEMI=12;
    public static final int PRINT=29;
    public static final int FRAC=16;
    public static final int IF=27;
    public static final int TYPE=18;
    public static final int AT=21;
    public static final int PARENS=11;
    public static final int ADDSUB_OP=6;
    public static final int WS=20;
    public static final int REL_OP=9;
    public static final int INCLUDE=28;
    public static final int RETURN=30;
    public static final int ASSIGN=8;
    public static final int FOREACH=25;
    public static final int LOG_OP=10;
    public static final int DIGIT=14;
    public static final int FUN=26;
    public static final int END=24;
    public static final int COMMENT=5;
    public static final int STRING=19;
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

    // $ANTLR start PARENS
    public final void mPARENS() throws RecognitionException {
        try {
            int _type = PARENS;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:22:5: ( ( '(' | ')' ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:22:5: ( '(' | ')' )
            {
            if ( (input.LA(1)>='(' && input.LA(1)<=')') ) {
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
    // $ANTLR end PARENS

    // $ANTLR start SEMI
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:23:8: ( ';' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:23:8: ';'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:26:4: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )
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
                    new NoViableAltException("25:10: fragment LETTER : ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:26:4: ( 'a' .. 'z' )
                    {
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:26:4: ( 'a' .. 'z' )
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:26:5: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:26:15: ( 'A' .. 'Z' )
                    {
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:26:15: ( 'A' .. 'Z' )
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:26:16: 'A' .. 'Z'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:28:4: ( ( '0' .. '9' ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:28:4: ( '0' .. '9' )
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:28:4: ( '0' .. '9' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:28:5: '0' .. '9'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:30:4: ( ( DIGIT )+ )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:30:4: ( DIGIT )+
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:30:4: ( DIGIT )+
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
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:30:5: DIGIT
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:32:4: ( '.' ( INTEGER ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:32:4: '.' ( INTEGER )
            {
            match('.'); 
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:32:7: ( INTEGER )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:32:8: INTEGER
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:34:9: ( INTEGER ( 'Hz' | 'ms' )? | ( INTEGER )? FRAC ( 'a' | 'Hz' | 'ms' )? )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:34:9: INTEGER ( 'Hz' | 'ms' )?
                    {
                    mINTEGER(); 
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:35:3: ( 'Hz' | 'ms' )?
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
                            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:35:4: 'Hz'
                            {
                            match("Hz"); 


                            }
                            break;
                        case 2 :
                            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:36:4: 'ms'
                            {
                            match("ms"); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:37:4: ( INTEGER )? FRAC ( 'a' | 'Hz' | 'ms' )?
                    {
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:37:4: ( INTEGER )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:37:4: INTEGER
                            {
                            mINTEGER(); 

                            }
                            break;

                    }

                    mFRAC(); 
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:38:3: ( 'a' | 'Hz' | 'ms' )?
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
                            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:38:4: 'a'
                            {
                            match('a'); 

                            }
                            break;
                        case 2 :
                            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:39:4: 'Hz'
                            {
                            match("Hz"); 


                            }
                            break;
                        case 3 :
                            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:40:4: 'ms'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:42:8: ( 'ampl' | 'float' | 'freq' | 'int' | 'time' | 'wave' )
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
                        new NoViableAltException("42:1: TYPE : ( 'ampl' | 'float' | 'freq' | 'int' | 'time' | 'wave' );", 10, 2, input);

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
                    new NoViableAltException("42:1: TYPE : ( 'ampl' | 'float' | 'freq' | 'int' | 'time' | 'wave' );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:42:8: 'ampl'
                    {
                    match("ampl"); 


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:42:15: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:42:23: 'freq'
                    {
                    match("freq"); 


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:42:30: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:42:36: 'time'
                    {
                    match("time"); 


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:42:43: 'wave'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:44:10: ( '\"' ( ( '\\\\' '\"' ) | ~ ( '\"' ) )* '\"' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:44:10: '\"' ( ( '\\\\' '\"' ) | ~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:44:15: ( ( '\\\\' '\"' ) | ~ ( '\"' ) )*
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
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:44:16: ( '\\\\' '\"' )
            	    {
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:44:16: ( '\\\\' '\"' )
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:44:17: '\\\\' '\"'
            	    {
            	    match('\\'); 
            	    match('\"'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:44:29: ~ ( '\"' )
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:46:6: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:46:6: ( ' ' | '\\t' | '\\n' | '\\r' )
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:48:6: ( 'at' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:48:6: 'at'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:49:10: ( 'const' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:49:10: 'const'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:50:9: ( 'else' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:50:9: 'else'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:51:7: ( 'end' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:51:7: 'end'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:52:11: ( 'foreach' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:52:11: 'foreach'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:53:7: ( 'fun' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:53:7: 'fun'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:54:6: ( 'if' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:54:6: 'if'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:55:11: ( 'include' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:55:11: 'include'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:56:9: ( 'print' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:56:9: 'print'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:57:10: ( 'return' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:57:10: 'return'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:60:7: ( ( LETTER | '_' ) ( LETTER | '_' | DIGIT )* )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:60:7: ( LETTER | '_' ) ( LETTER | '_' | DIGIT )*
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:60:7: ( LETTER | '_' )
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
                    new NoViableAltException("60:7: ( LETTER | '_' )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:60:8: LETTER
                    {
                    mLETTER(); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:60:15: '_'
                    {
                    match('_'); 

                    }
                    break;

            }

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:60:19: ( LETTER | '_' | DIGIT )*
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
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:60:20: LETTER
            	    {
            	    mLETTER(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:60:27: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 3 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:60:31: DIGIT
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
        // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:10: ( COMMENT | ADDSUB_OP | MULTDIV_OP | ASSIGN | REL_OP | LOG_OP | PARENS | SEMI | NUMBER | TYPE | STRING | WS | AT | CONST | ELSE | END | FOREACH | FUN | IF | INCLUDE | PRINT | RETURN | ID )
        int alt14=23;
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
        case ')':
            {
            alt14=7;
            }
            break;
        case ';':
            {
            alt14=8;
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
            alt14=9;
            }
            break;
        case 'a':
            {
            switch ( input.LA(2) ) {
            case 'm':
                {
                int LA14_24 = input.LA(3);

                if ( (LA14_24=='p') ) {
                    int LA14_39 = input.LA(4);

                    if ( (LA14_39=='l') ) {
                        int LA14_55 = input.LA(5);

                        if ( ((LA14_55>='0' && LA14_55<='9')||(LA14_55>='A' && LA14_55<='Z')||LA14_55=='_'||(LA14_55>='a' && LA14_55<='z')) ) {
                            alt14=23;
                        }
                        else {
                            alt14=10;}
                    }
                    else {
                        alt14=23;}
                }
                else {
                    alt14=23;}
                }
                break;
            case 't':
                {
                int LA14_25 = input.LA(3);

                if ( ((LA14_25>='0' && LA14_25<='9')||(LA14_25>='A' && LA14_25<='Z')||LA14_25=='_'||(LA14_25>='a' && LA14_25<='z')) ) {
                    alt14=23;
                }
                else {
                    alt14=13;}
                }
                break;
            default:
                alt14=23;}

            }
            break;
        case 'f':
            {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA14_26 = input.LA(3);

                if ( (LA14_26=='o') ) {
                    int LA14_41 = input.LA(4);

                    if ( (LA14_41=='a') ) {
                        int LA14_56 = input.LA(5);

                        if ( (LA14_56=='t') ) {
                            int LA14_69 = input.LA(6);

                            if ( ((LA14_69>='0' && LA14_69<='9')||(LA14_69>='A' && LA14_69<='Z')||LA14_69=='_'||(LA14_69>='a' && LA14_69<='z')) ) {
                                alt14=23;
                            }
                            else {
                                alt14=10;}
                        }
                        else {
                            alt14=23;}
                    }
                    else {
                        alt14=23;}
                }
                else {
                    alt14=23;}
                }
                break;
            case 'r':
                {
                int LA14_27 = input.LA(3);

                if ( (LA14_27=='e') ) {
                    int LA14_42 = input.LA(4);

                    if ( (LA14_42=='q') ) {
                        int LA14_57 = input.LA(5);

                        if ( ((LA14_57>='0' && LA14_57<='9')||(LA14_57>='A' && LA14_57<='Z')||LA14_57=='_'||(LA14_57>='a' && LA14_57<='z')) ) {
                            alt14=23;
                        }
                        else {
                            alt14=10;}
                    }
                    else {
                        alt14=23;}
                }
                else {
                    alt14=23;}
                }
                break;
            case 'o':
                {
                int LA14_28 = input.LA(3);

                if ( (LA14_28=='r') ) {
                    int LA14_43 = input.LA(4);

                    if ( (LA14_43=='e') ) {
                        int LA14_58 = input.LA(5);

                        if ( (LA14_58=='a') ) {
                            int LA14_70 = input.LA(6);

                            if ( (LA14_70=='c') ) {
                                int LA14_76 = input.LA(7);

                                if ( (LA14_76=='h') ) {
                                    int LA14_81 = input.LA(8);

                                    if ( ((LA14_81>='0' && LA14_81<='9')||(LA14_81>='A' && LA14_81<='Z')||LA14_81=='_'||(LA14_81>='a' && LA14_81<='z')) ) {
                                        alt14=23;
                                    }
                                    else {
                                        alt14=17;}
                                }
                                else {
                                    alt14=23;}
                            }
                            else {
                                alt14=23;}
                        }
                        else {
                            alt14=23;}
                    }
                    else {
                        alt14=23;}
                }
                else {
                    alt14=23;}
                }
                break;
            case 'u':
                {
                int LA14_29 = input.LA(3);

                if ( (LA14_29=='n') ) {
                    int LA14_44 = input.LA(4);

                    if ( ((LA14_44>='0' && LA14_44<='9')||(LA14_44>='A' && LA14_44<='Z')||LA14_44=='_'||(LA14_44>='a' && LA14_44<='z')) ) {
                        alt14=23;
                    }
                    else {
                        alt14=18;}
                }
                else {
                    alt14=23;}
                }
                break;
            default:
                alt14=23;}

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
                    int LA14_45 = input.LA(4);

                    if ( (LA14_45=='l') ) {
                        int LA14_60 = input.LA(5);

                        if ( (LA14_60=='u') ) {
                            int LA14_71 = input.LA(6);

                            if ( (LA14_71=='d') ) {
                                int LA14_77 = input.LA(7);

                                if ( (LA14_77=='e') ) {
                                    int LA14_82 = input.LA(8);

                                    if ( ((LA14_82>='0' && LA14_82<='9')||(LA14_82>='A' && LA14_82<='Z')||LA14_82=='_'||(LA14_82>='a' && LA14_82<='z')) ) {
                                        alt14=23;
                                    }
                                    else {
                                        alt14=20;}
                                }
                                else {
                                    alt14=23;}
                            }
                            else {
                                alt14=23;}
                        }
                        else {
                            alt14=23;}
                    }
                    else {
                        alt14=23;}
                    }
                    break;
                case 't':
                    {
                    int LA14_46 = input.LA(4);

                    if ( ((LA14_46>='0' && LA14_46<='9')||(LA14_46>='A' && LA14_46<='Z')||LA14_46=='_'||(LA14_46>='a' && LA14_46<='z')) ) {
                        alt14=23;
                    }
                    else {
                        alt14=10;}
                    }
                    break;
                default:
                    alt14=23;}

                }
                break;
            case 'f':
                {
                int LA14_31 = input.LA(3);

                if ( ((LA14_31>='0' && LA14_31<='9')||(LA14_31>='A' && LA14_31<='Z')||LA14_31=='_'||(LA14_31>='a' && LA14_31<='z')) ) {
                    alt14=23;
                }
                else {
                    alt14=19;}
                }
                break;
            default:
                alt14=23;}

            }
            break;
        case 't':
            {
            int LA14_13 = input.LA(2);

            if ( (LA14_13=='i') ) {
                int LA14_32 = input.LA(3);

                if ( (LA14_32=='m') ) {
                    int LA14_48 = input.LA(4);

                    if ( (LA14_48=='e') ) {
                        int LA14_62 = input.LA(5);

                        if ( ((LA14_62>='0' && LA14_62<='9')||(LA14_62>='A' && LA14_62<='Z')||LA14_62=='_'||(LA14_62>='a' && LA14_62<='z')) ) {
                            alt14=23;
                        }
                        else {
                            alt14=10;}
                    }
                    else {
                        alt14=23;}
                }
                else {
                    alt14=23;}
            }
            else {
                alt14=23;}
            }
            break;
        case 'w':
            {
            int LA14_14 = input.LA(2);

            if ( (LA14_14=='a') ) {
                int LA14_33 = input.LA(3);

                if ( (LA14_33=='v') ) {
                    int LA14_49 = input.LA(4);

                    if ( (LA14_49=='e') ) {
                        int LA14_63 = input.LA(5);

                        if ( ((LA14_63>='0' && LA14_63<='9')||(LA14_63>='A' && LA14_63<='Z')||LA14_63=='_'||(LA14_63>='a' && LA14_63<='z')) ) {
                            alt14=23;
                        }
                        else {
                            alt14=10;}
                    }
                    else {
                        alt14=23;}
                }
                else {
                    alt14=23;}
            }
            else {
                alt14=23;}
            }
            break;
        case '\"':
            {
            alt14=11;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt14=12;
            }
            break;
        case 'c':
            {
            int LA14_17 = input.LA(2);

            if ( (LA14_17=='o') ) {
                int LA14_34 = input.LA(3);

                if ( (LA14_34=='n') ) {
                    int LA14_50 = input.LA(4);

                    if ( (LA14_50=='s') ) {
                        int LA14_64 = input.LA(5);

                        if ( (LA14_64=='t') ) {
                            int LA14_72 = input.LA(6);

                            if ( ((LA14_72>='0' && LA14_72<='9')||(LA14_72>='A' && LA14_72<='Z')||LA14_72=='_'||(LA14_72>='a' && LA14_72<='z')) ) {
                                alt14=23;
                            }
                            else {
                                alt14=14;}
                        }
                        else {
                            alt14=23;}
                    }
                    else {
                        alt14=23;}
                }
                else {
                    alt14=23;}
            }
            else {
                alt14=23;}
            }
            break;
        case 'e':
            {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA14_35 = input.LA(3);

                if ( (LA14_35=='s') ) {
                    int LA14_51 = input.LA(4);

                    if ( (LA14_51=='e') ) {
                        int LA14_65 = input.LA(5);

                        if ( ((LA14_65>='0' && LA14_65<='9')||(LA14_65>='A' && LA14_65<='Z')||LA14_65=='_'||(LA14_65>='a' && LA14_65<='z')) ) {
                            alt14=23;
                        }
                        else {
                            alt14=15;}
                    }
                    else {
                        alt14=23;}
                }
                else {
                    alt14=23;}
                }
                break;
            case 'n':
                {
                int LA14_36 = input.LA(3);

                if ( (LA14_36=='d') ) {
                    int LA14_52 = input.LA(4);

                    if ( ((LA14_52>='0' && LA14_52<='9')||(LA14_52>='A' && LA14_52<='Z')||LA14_52=='_'||(LA14_52>='a' && LA14_52<='z')) ) {
                        alt14=23;
                    }
                    else {
                        alt14=16;}
                }
                else {
                    alt14=23;}
                }
                break;
            default:
                alt14=23;}

            }
            break;
        case 'p':
            {
            int LA14_19 = input.LA(2);

            if ( (LA14_19=='r') ) {
                int LA14_37 = input.LA(3);

                if ( (LA14_37=='i') ) {
                    int LA14_53 = input.LA(4);

                    if ( (LA14_53=='n') ) {
                        int LA14_67 = input.LA(5);

                        if ( (LA14_67=='t') ) {
                            int LA14_74 = input.LA(6);

                            if ( ((LA14_74>='0' && LA14_74<='9')||(LA14_74>='A' && LA14_74<='Z')||LA14_74=='_'||(LA14_74>='a' && LA14_74<='z')) ) {
                                alt14=23;
                            }
                            else {
                                alt14=21;}
                        }
                        else {
                            alt14=23;}
                    }
                    else {
                        alt14=23;}
                }
                else {
                    alt14=23;}
            }
            else {
                alt14=23;}
            }
            break;
        case 'r':
            {
            int LA14_20 = input.LA(2);

            if ( (LA14_20=='e') ) {
                int LA14_38 = input.LA(3);

                if ( (LA14_38=='t') ) {
                    int LA14_54 = input.LA(4);

                    if ( (LA14_54=='u') ) {
                        int LA14_68 = input.LA(5);

                        if ( (LA14_68=='r') ) {
                            int LA14_75 = input.LA(6);

                            if ( (LA14_75=='n') ) {
                                int LA14_80 = input.LA(7);

                                if ( ((LA14_80>='0' && LA14_80<='9')||(LA14_80>='A' && LA14_80<='Z')||LA14_80=='_'||(LA14_80>='a' && LA14_80<='z')) ) {
                                    alt14=23;
                                }
                                else {
                                    alt14=22;}
                            }
                            else {
                                alt14=23;}
                        }
                        else {
                            alt14=23;}
                    }
                    else {
                        alt14=23;}
                }
                else {
                    alt14=23;}
            }
            else {
                alt14=23;}
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
            alt14=23;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( COMMENT | ADDSUB_OP | MULTDIV_OP | ASSIGN | REL_OP | LOG_OP | PARENS | SEMI | NUMBER | TYPE | STRING | WS | AT | CONST | ELSE | END | FOREACH | FUN | IF | INCLUDE | PRINT | RETURN | ID );", 14, 0, input);

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
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:60: PARENS
                {
                mPARENS(); 

                }
                break;
            case 8 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:67: SEMI
                {
                mSEMI(); 

                }
                break;
            case 9 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:72: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 10 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:79: TYPE
                {
                mTYPE(); 

                }
                break;
            case 11 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:84: STRING
                {
                mSTRING(); 

                }
                break;
            case 12 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:91: WS
                {
                mWS(); 

                }
                break;
            case 13 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:94: AT
                {
                mAT(); 

                }
                break;
            case 14 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:97: CONST
                {
                mCONST(); 

                }
                break;
            case 15 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:103: ELSE
                {
                mELSE(); 

                }
                break;
            case 16 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:108: END
                {
                mEND(); 

                }
                break;
            case 17 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:112: FOREACH
                {
                mFOREACH(); 

                }
                break;
            case 18 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:120: FUN
                {
                mFUN(); 

                }
                break;
            case 19 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:124: IF
                {
                mIF(); 

                }
                break;
            case 20 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:127: INCLUDE
                {
                mINCLUDE(); 

                }
                break;
            case 21 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:135: PRINT
                {
                mPRINT(); 

                }
                break;
            case 22 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:141: RETURN
                {
                mRETURN(); 

                }
                break;
            case 23 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:1:148: ID
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
            return "34:1: NUMBER : ( INTEGER ( 'Hz' | 'ms' )? | ( INTEGER )? FRAC ( 'a' | 'Hz' | 'ms' )? );";
        }
    }
 

}