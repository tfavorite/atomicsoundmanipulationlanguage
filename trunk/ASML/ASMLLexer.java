// $ANTLR 3.0 C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g 2007-06-21 15:04:06

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ASMLLexer extends Lexer {
    public static final int PARENS=9;
    public static final int NONCOMMENT=4;
    public static final int ADDSUB_OP=6;
    public static final int WS=16;
    public static final int MULTDIV_OP=7;
    public static final int LETTER=11;
    public static final int ASSIGN=8;
    public static final int DIGIT=12;
    public static final int ID=14;
    public static final int COMMENT=5;
    public static final int Tokens=17;
    public static final int EOF=-1;
    public static final int SEMI=10;
    public static final int STRING=15;
    public static final int TYPE=13;
    public ASMLLexer() {;} 
    public ASMLLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g"; }

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:6:4: ( ( '/*' ( '*' | '/' | NONCOMMENT )* '*/' ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:6:4: ( '/*' ( '*' | '/' | NONCOMMENT )* '*/' )
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:6:4: ( '/*' ( '*' | '/' | NONCOMMENT )* '*/' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:6:5: '/*' ( '*' | '/' | NONCOMMENT )* '*/'
            {
            match("/*"); 

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:6:10: ( '*' | '/' | NONCOMMENT )*
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
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:9:4: (~ ( '*' | '/' ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:9:4: ~ ( '*' | '/' )
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:11:4: ( '+' | '-' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:13:5: ( '*' | '/' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:14:10: ( '=' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:14:10: '='
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:18:5: ( ( '(' | ')' ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:18:5: ( '(' | ')' )
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:19:8: ( ';' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:19:8: ';'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:22:4: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )
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
                    new NoViableAltException("21:10: fragment LETTER : ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:22:4: ( 'a' .. 'z' )
                    {
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:22:4: ( 'a' .. 'z' )
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:22:5: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:22:15: ( 'A' .. 'Z' )
                    {
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:22:15: ( 'A' .. 'Z' )
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:22:16: 'A' .. 'Z'
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:24:4: ( ( '0' .. '9' ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:24:4: ( '0' .. '9' )
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:24:4: ( '0' .. '9' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:24:5: '0' .. '9'
            {
            matchRange('0','9'); 

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end DIGIT

    // $ANTLR start TYPE
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:26:8: ( 'ampl' | 'float' | 'freq' | 'int' | 'time' | 'wave' )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt3=1;
                }
                break;
            case 'f':
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2=='l') ) {
                    alt3=2;
                }
                else if ( (LA3_2=='r') ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("26:1: TYPE : ( 'ampl' | 'float' | 'freq' | 'int' | 'time' | 'wave' );", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 'i':
                {
                alt3=4;
                }
                break;
            case 't':
                {
                alt3=5;
                }
                break;
            case 'w':
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("26:1: TYPE : ( 'ampl' | 'float' | 'freq' | 'int' | 'time' | 'wave' );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:26:8: 'ampl'
                    {
                    match("ampl"); 


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:26:15: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:26:23: 'freq'
                    {
                    match("freq"); 


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:26:30: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:26:36: 'time'
                    {
                    match("time"); 


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:26:43: 'wave'
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

    // $ANTLR start ID
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:28:7: ( ( LETTER | '_' ) ( LETTER | '_' | DIGIT )* )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:28:7: ( LETTER | '_' ) ( LETTER | '_' | DIGIT )*
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:28:7: ( LETTER | '_' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
                alt4=1;
            }
            else if ( (LA4_0=='_') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("28:7: ( LETTER | '_' )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:28:8: LETTER
                    {
                    mLETTER(); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:28:15: '_'
                    {
                    match('_'); 

                    }
                    break;

            }

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:28:19: ( LETTER | '_' | DIGIT )*
            loop5:
            do {
                int alt5=4;
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
                    alt5=1;
                    }
                    break;
                case '_':
                    {
                    alt5=2;
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
                    alt5=3;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:28:20: LETTER
            	    {
            	    mLETTER(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:28:27: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 3 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:28:31: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop5;
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:29:10: ( '\"' ( ( '\\\\' '\"' ) | ~ ( '\"' ) )* '\"' )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:29:10: '\"' ( ( '\\\\' '\"' ) | ~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:29:15: ( ( '\\\\' '\"' ) | ~ ( '\"' ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\\') ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2=='\"') ) {
                        int LA6_4 = input.LA(3);

                        if ( ((LA6_4>='\u0000' && LA6_4<='\uFFFE')) ) {
                            alt6=1;
                        }

                        else {
                            alt6=2;
                        }

                    }
                    else if ( ((LA6_2>='\u0000' && LA6_2<='!')||(LA6_2>='#' && LA6_2<='\uFFFE')) ) {
                        alt6=2;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:29:16: ( '\\\\' '\"' )
            	    {
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:29:16: ( '\\\\' '\"' )
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:29:17: '\\\\' '\"'
            	    {
            	    match('\\'); 
            	    match('\"'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:29:29: ~ ( '\"' )
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
            	    break loop6;
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
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:31:6: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:31:6: ( ' ' | '\\t' | '\\n' | '\\r' )
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

    public void mTokens() throws RecognitionException {
        // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:1:10: ( COMMENT | ADDSUB_OP | MULTDIV_OP | ASSIGN | PARENS | SEMI | TYPE | ID | STRING | WS )
        int alt7=10;
        switch ( input.LA(1) ) {
        case '/':
            {
            int LA7_1 = input.LA(2);

            if ( (LA7_1=='*') ) {
                alt7=1;
            }
            else {
                alt7=3;}
            }
            break;
        case '+':
        case '-':
            {
            alt7=2;
            }
            break;
        case '*':
            {
            alt7=3;
            }
            break;
        case '=':
            {
            alt7=4;
            }
            break;
        case '(':
        case ')':
            {
            alt7=5;
            }
            break;
        case ';':
            {
            alt7=6;
            }
            break;
        case 'a':
            {
            int LA7_7 = input.LA(2);

            if ( (LA7_7=='m') ) {
                int LA7_16 = input.LA(3);

                if ( (LA7_16=='p') ) {
                    int LA7_22 = input.LA(4);

                    if ( (LA7_22=='l') ) {
                        int LA7_28 = input.LA(5);

                        if ( ((LA7_28>='0' && LA7_28<='9')||(LA7_28>='A' && LA7_28<='Z')||LA7_28=='_'||(LA7_28>='a' && LA7_28<='z')) ) {
                            alt7=8;
                        }
                        else {
                            alt7=7;}
                    }
                    else {
                        alt7=8;}
                }
                else {
                    alt7=8;}
            }
            else {
                alt7=8;}
            }
            break;
        case 'f':
            {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA7_17 = input.LA(3);

                if ( (LA7_17=='o') ) {
                    int LA7_23 = input.LA(4);

                    if ( (LA7_23=='a') ) {
                        int LA7_29 = input.LA(5);

                        if ( (LA7_29=='t') ) {
                            int LA7_34 = input.LA(6);

                            if ( ((LA7_34>='0' && LA7_34<='9')||(LA7_34>='A' && LA7_34<='Z')||LA7_34=='_'||(LA7_34>='a' && LA7_34<='z')) ) {
                                alt7=8;
                            }
                            else {
                                alt7=7;}
                        }
                        else {
                            alt7=8;}
                    }
                    else {
                        alt7=8;}
                }
                else {
                    alt7=8;}
                }
                break;
            case 'r':
                {
                int LA7_18 = input.LA(3);

                if ( (LA7_18=='e') ) {
                    int LA7_24 = input.LA(4);

                    if ( (LA7_24=='q') ) {
                        int LA7_30 = input.LA(5);

                        if ( ((LA7_30>='0' && LA7_30<='9')||(LA7_30>='A' && LA7_30<='Z')||LA7_30=='_'||(LA7_30>='a' && LA7_30<='z')) ) {
                            alt7=8;
                        }
                        else {
                            alt7=7;}
                    }
                    else {
                        alt7=8;}
                }
                else {
                    alt7=8;}
                }
                break;
            default:
                alt7=8;}

            }
            break;
        case 'i':
            {
            int LA7_9 = input.LA(2);

            if ( (LA7_9=='n') ) {
                int LA7_19 = input.LA(3);

                if ( (LA7_19=='t') ) {
                    int LA7_25 = input.LA(4);

                    if ( ((LA7_25>='0' && LA7_25<='9')||(LA7_25>='A' && LA7_25<='Z')||LA7_25=='_'||(LA7_25>='a' && LA7_25<='z')) ) {
                        alt7=8;
                    }
                    else {
                        alt7=7;}
                }
                else {
                    alt7=8;}
            }
            else {
                alt7=8;}
            }
            break;
        case 't':
            {
            int LA7_10 = input.LA(2);

            if ( (LA7_10=='i') ) {
                int LA7_20 = input.LA(3);

                if ( (LA7_20=='m') ) {
                    int LA7_26 = input.LA(4);

                    if ( (LA7_26=='e') ) {
                        int LA7_32 = input.LA(5);

                        if ( ((LA7_32>='0' && LA7_32<='9')||(LA7_32>='A' && LA7_32<='Z')||LA7_32=='_'||(LA7_32>='a' && LA7_32<='z')) ) {
                            alt7=8;
                        }
                        else {
                            alt7=7;}
                    }
                    else {
                        alt7=8;}
                }
                else {
                    alt7=8;}
            }
            else {
                alt7=8;}
            }
            break;
        case 'w':
            {
            int LA7_11 = input.LA(2);

            if ( (LA7_11=='a') ) {
                int LA7_21 = input.LA(3);

                if ( (LA7_21=='v') ) {
                    int LA7_27 = input.LA(4);

                    if ( (LA7_27=='e') ) {
                        int LA7_33 = input.LA(5);

                        if ( ((LA7_33>='0' && LA7_33<='9')||(LA7_33>='A' && LA7_33<='Z')||LA7_33=='_'||(LA7_33>='a' && LA7_33<='z')) ) {
                            alt7=8;
                        }
                        else {
                            alt7=7;}
                    }
                    else {
                        alt7=8;}
                }
                else {
                    alt7=8;}
            }
            else {
                alt7=8;}
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
        case 'c':
        case 'd':
        case 'e':
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
        case 'u':
        case 'v':
        case 'x':
        case 'y':
        case 'z':
            {
            alt7=8;
            }
            break;
        case '\"':
            {
            alt7=9;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt7=10;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( COMMENT | ADDSUB_OP | MULTDIV_OP | ASSIGN | PARENS | SEMI | TYPE | ID | STRING | WS );", 7, 0, input);

            throw nvae;
        }

        switch (alt7) {
            case 1 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:1:10: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 2 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:1:18: ADDSUB_OP
                {
                mADDSUB_OP(); 

                }
                break;
            case 3 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:1:28: MULTDIV_OP
                {
                mMULTDIV_OP(); 

                }
                break;
            case 4 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:1:39: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 5 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:1:46: PARENS
                {
                mPARENS(); 

                }
                break;
            case 6 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:1:53: SEMI
                {
                mSEMI(); 

                }
                break;
            case 7 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:1:58: TYPE
                {
                mTYPE(); 

                }
                break;
            case 8 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:1:63: ID
                {
                mID(); 

                }
                break;
            case 9 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:1:66: STRING
                {
                mSTRING(); 

                }
                break;
            case 10 :
                // C:\\Documents and Settings\\Owner\\workspace\\ASML\\ASML.g:1:73: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}