// $ANTLR 3.0 C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g 2007-06-20 21:44:05

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ASMLLexer extends Lexer {
    public static final int PARENS=9;
    public static final int NONCOMMENT=4;
    public static final int ADDSUB_OP=6;
    public static final int WS=15;
    public static final int MULTDIV_OP=7;
    public static final int LETTER=11;
    public static final int ASSIGN=8;
    public static final int DIGIT=12;
    public static final int COMMENT=5;
    public static final int ID=13;
    public static final int Tokens=17;
    public static final int EOF=-1;
    public static final int SEMI=10;
    public static final int STRING=14;
    public static final int TYPE=16;
    public ASMLLexer() {;} 
    public ASMLLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g"; }

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:7:4: ( ( '/*' ( '*' | '/' | NONCOMMENT )* '*/' ) )
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:7:4: ( '/*' ( '*' | '/' | NONCOMMENT )* '*/' )
            {
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:7:4: ( '/*' ( '*' | '/' | NONCOMMENT )* '*/' )
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:7:5: '/*' ( '*' | '/' | NONCOMMENT )* '*/'
            {
            match("/*"); 

            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:7:10: ( '*' | '/' | NONCOMMENT )*
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
            	    // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:
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
            int _type = NONCOMMENT;
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:10:4: (~ ( '*' | '/' ) )
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:10:4: ~ ( '*' | '/' )
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NONCOMMENT

    // $ANTLR start ADDSUB_OP
    public final void mADDSUB_OP() throws RecognitionException {
        try {
            int _type = ADDSUB_OP;
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:12:4: ( '+' | '-' )
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:
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
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:14:5: ( '*' | '/' )
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:
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
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:15:10: ( '=' )
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:15:10: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ASSIGN

    // $ANTLR start PARENS
    public final void mPARENS() throws RecognitionException {
        try {
            int _type = PARENS;
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:19:5: ( ( '(' | ')' ) )
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:19:5: ( '(' | ')' )
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
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:20:8: ( ';' )
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:20:8: ';'
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
            int _type = LETTER;
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:23:4: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='a' && LA2_0<='z')) ) {
                alt2=1;
            }
            else if ( ((LA2_0>='A' && LA2_0<='Z')) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("22:11: protected LETTER : ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:23:4: ( 'a' .. 'z' )
                    {
                    // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:23:4: ( 'a' .. 'z' )
                    // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:23:5: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:23:15: ( 'A' .. 'Z' )
                    {
                    // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:23:15: ( 'A' .. 'Z' )
                    // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:23:16: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LETTER

    // $ANTLR start DIGIT
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:25:4: ( ( '0' .. '9' ) )
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:25:4: ( '0' .. '9' )
            {
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:25:4: ( '0' .. '9' )
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:25:5: '0' .. '9'
            {
            matchRange('0','9'); 

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIGIT

    // $ANTLR start ID
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:27:7: ( ( LETTER | '_' ) ( LETTER | '_' | DIGIT )* )
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:27:7: ( LETTER | '_' ) ( LETTER | '_' | DIGIT )*
            {
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:27:7: ( LETTER | '_' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                alt3=1;
            }
            else if ( (LA3_0=='_') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("27:7: ( LETTER | '_' )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:27:8: LETTER
                    {
                    mLETTER(); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:27:15: '_'
                    {
                    match('_'); 

                    }
                    break;

            }

            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:27:19: ( LETTER | '_' | DIGIT )*
            loop4:
            do {
                int alt4=4;
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
                    alt4=1;
                    }
                    break;
                case '_':
                    {
                    alt4=2;
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
                    alt4=3;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:27:20: LETTER
            	    {
            	    mLETTER(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:27:27: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 3 :
            	    // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:27:31: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ID

    // $ANTLR start STRING
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:28:10: ( '\"' ( ( '\\\\' '\"' ) | ~ ( '\"' ) )* '\"' )
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:28:10: '\"' ( ( '\\\\' '\"' ) | ~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:28:15: ( ( '\\\\' '\"' ) | ~ ( '\"' ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\\') ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2=='\"') ) {
                        int LA5_4 = input.LA(3);

                        if ( ((LA5_4>='\u0000' && LA5_4<='\uFFFE')) ) {
                            alt5=1;
                        }

                        else {
                            alt5=2;
                        }

                    }
                    else if ( ((LA5_2>='\u0000' && LA5_2<='!')||(LA5_2>='#' && LA5_2<='\uFFFE')) ) {
                        alt5=2;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:28:16: ( '\\\\' '\"' )
            	    {
            	    // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:28:16: ( '\\\\' '\"' )
            	    // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:28:17: '\\\\' '\"'
            	    {
            	    match('\\'); 
            	    match('\"'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:28:29: ~ ( '\"' )
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
            	    break loop5;
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
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:30:6: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:30:6: ( ' ' | '\\t' | '\\n' | '\\r' )
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

    // $ANTLR start TYPE
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:32:8: ( 'ampl' | 'float' | 'freq' | 'int' | 'time' | 'wave' )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt6=1;
                }
                break;
            case 'f':
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2=='l') ) {
                    alt6=2;
                }
                else if ( (LA6_2=='r') ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("32:1: TYPE : ( 'ampl' | 'float' | 'freq' | 'int' | 'time' | 'wave' );", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 'i':
                {
                alt6=4;
                }
                break;
            case 't':
                {
                alt6=5;
                }
                break;
            case 'w':
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("32:1: TYPE : ( 'ampl' | 'float' | 'freq' | 'int' | 'time' | 'wave' );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:32:8: 'ampl'
                    {
                    match("ampl"); 


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:32:15: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:32:23: 'freq'
                    {
                    match("freq"); 


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:32:30: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:32:36: 'time'
                    {
                    match("time"); 


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:32:43: 'wave'
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

    public void mTokens() throws RecognitionException {
        // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:1:10: ( COMMENT | NONCOMMENT | ADDSUB_OP | MULTDIV_OP | ASSIGN | PARENS | SEMI | LETTER | DIGIT | ID | STRING | WS | TYPE )
        int alt7=13;
        int LA7_0 = input.LA(1);

        if ( (LA7_0=='/') ) {
            int LA7_1 = input.LA(2);

            if ( (LA7_1=='*') ) {
                alt7=1;
            }
            else {
                alt7=4;}
        }
        else if ( (LA7_0=='+'||LA7_0=='-') ) {
            alt7=2;
        }
        else if ( (LA7_0=='=') ) {
            alt7=2;
        }
        else if ( (LA7_0=='*') ) {
            alt7=4;
        }
        else if ( ((LA7_0>='(' && LA7_0<=')')) ) {
            alt7=2;
        }
        else if ( (LA7_0==';') ) {
            alt7=2;
        }
        else if ( (LA7_0=='a') ) {
            switch ( input.LA(2) ) {
            case 'm':
                {
                int LA7_20 = input.LA(3);

                if ( (LA7_20=='p') ) {
                    int LA7_28 = input.LA(4);

                    if ( (LA7_28=='l') ) {
                        alt7=10;
                    }
                    else {
                        alt7=10;}
                }
                else {
                    alt7=10;}
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
                alt7=10;
                }
                break;
            default:
                alt7=2;}

        }
        else if ( ((LA7_0>='A' && LA7_0<='Z')) ) {
            int LA7_8 = input.LA(2);

            if ( ((LA7_8>='0' && LA7_8<='9')||(LA7_8>='A' && LA7_8<='Z')||LA7_8=='_'||(LA7_8>='a' && LA7_8<='z')) ) {
                alt7=10;
            }
            else {
                alt7=2;}
        }
        else if ( ((LA7_0>='0' && LA7_0<='9')) ) {
            alt7=2;
        }
        else if ( (LA7_0=='_') ) {
            int LA7_10 = input.LA(2);

            if ( ((LA7_10>='0' && LA7_10<='9')||(LA7_10>='A' && LA7_10<='Z')||LA7_10=='_'||(LA7_10>='a' && LA7_10<='z')) ) {
                alt7=10;
            }
            else {
                alt7=2;}
        }
        else if ( (LA7_0=='\"') ) {
            int LA7_11 = input.LA(2);

            if ( ((LA7_11>='\u0000' && LA7_11<='\uFFFE')) ) {
                alt7=11;
            }
            else {
                alt7=2;}
        }
        else if ( ((LA7_0>='\t' && LA7_0<='\n')||LA7_0=='\r'||LA7_0==' ') ) {
            alt7=2;
        }
        else if ( ((LA7_0>='\u0000' && LA7_0<='\b')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\u001F')||LA7_0=='!'||(LA7_0>='#' && LA7_0<='\'')||LA7_0==','||LA7_0=='.'||LA7_0==':'||LA7_0=='<'||(LA7_0>='>' && LA7_0<='@')||(LA7_0>='[' && LA7_0<='^')||LA7_0=='`'||(LA7_0>='{' && LA7_0<='\uFFFE')) ) {
            alt7=2;
        }
        else if ( (LA7_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA7_23 = input.LA(3);

                if ( (LA7_23=='e') ) {
                    int LA7_29 = input.LA(4);

                    if ( (LA7_29=='q') ) {
                        alt7=10;
                    }
                    else {
                        alt7=10;}
                }
                else {
                    alt7=10;}
                }
                break;
            case 'l':
                {
                int LA7_24 = input.LA(3);

                if ( (LA7_24=='o') ) {
                    int LA7_30 = input.LA(4);

                    if ( (LA7_30=='a') ) {
                        int LA7_36 = input.LA(5);

                        if ( (LA7_36=='t') ) {
                            alt7=10;
                        }
                        else {
                            alt7=10;}
                    }
                    else {
                        alt7=10;}
                }
                else {
                    alt7=10;}
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
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt7=10;
                }
                break;
            default:
                alt7=2;}

        }
        else if ( (LA7_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA7_25 = input.LA(3);

                if ( (LA7_25=='t') ) {
                    alt7=10;
                }
                else {
                    alt7=10;}
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
                alt7=10;
                }
                break;
            default:
                alt7=2;}

        }
        else if ( (LA7_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA7_26 = input.LA(3);

                if ( (LA7_26=='m') ) {
                    int LA7_32 = input.LA(4);

                    if ( (LA7_32=='e') ) {
                        alt7=10;
                    }
                    else {
                        alt7=10;}
                }
                else {
                    alt7=10;}
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
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
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
                alt7=10;
                }
                break;
            default:
                alt7=2;}

        }
        else if ( (LA7_0=='w') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA7_27 = input.LA(3);

                if ( (LA7_27=='v') ) {
                    int LA7_33 = input.LA(4);

                    if ( (LA7_33=='e') ) {
                        alt7=10;
                    }
                    else {
                        alt7=10;}
                }
                else {
                    alt7=10;}
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
                alt7=10;
                }
                break;
            default:
                alt7=2;}

        }
        else if ( ((LA7_0>='b' && LA7_0<='e')||(LA7_0>='g' && LA7_0<='h')||(LA7_0>='j' && LA7_0<='s')||(LA7_0>='u' && LA7_0<='v')||(LA7_0>='x' && LA7_0<='z')) ) {
            int LA7_18 = input.LA(2);

            if ( ((LA7_18>='0' && LA7_18<='9')||(LA7_18>='A' && LA7_18<='Z')||LA7_18=='_'||(LA7_18>='a' && LA7_18<='z')) ) {
                alt7=10;
            }
            else {
                alt7=2;}
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( COMMENT | NONCOMMENT | ADDSUB_OP | MULTDIV_OP | ASSIGN | PARENS | SEMI | LETTER | DIGIT | ID | STRING | WS | TYPE );", 7, 0, input);

            throw nvae;
        }
        switch (alt7) {
            case 1 :
                // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:1:10: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 2 :
                // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:1:18: NONCOMMENT
                {
                mNONCOMMENT(); 

                }
                break;
            case 3 :
                // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:1:29: ADDSUB_OP
                {
                mADDSUB_OP(); 

                }
                break;
            case 4 :
                // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:1:39: MULTDIV_OP
                {
                mMULTDIV_OP(); 

                }
                break;
            case 5 :
                // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:1:50: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 6 :
                // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:1:57: PARENS
                {
                mPARENS(); 

                }
                break;
            case 7 :
                // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:1:64: SEMI
                {
                mSEMI(); 

                }
                break;
            case 8 :
                // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:1:69: LETTER
                {
                mLETTER(); 

                }
                break;
            case 9 :
                // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:1:76: DIGIT
                {
                mDIGIT(); 

                }
                break;
            case 10 :
                // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:1:82: ID
                {
                mID(); 

                }
                break;
            case 11 :
                // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:1:85: STRING
                {
                mSTRING(); 

                }
                break;
            case 12 :
                // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:1:92: WS
                {
                mWS(); 

                }
                break;
            case 13 :
                // C:\\Documents and Settings\\Owner\\My Documents\\w4115\\ASML\\ASML.g:1:95: TYPE
                {
                mTYPE(); 

                }
                break;

        }

    }


 

}