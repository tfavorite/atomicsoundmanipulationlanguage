// $ANTLR 3.0 C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g 2007-06-23 20:43:33
package asml;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ASMLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INCLUDE", "STRING", "SEMI", "FUN", "TYPE", "ID", "LPARENS", "RPARENS", "END", "IF", "ELSE", "WHILE", "FOR", "RETURN", "PRINT", "COMMA", "CONST", "ASSIGN", "COMMENT", "ADDSUB_OP", "MULTDIV_OP", "REL_OP", "LOG_OP", "LETTER", "DIGIT", "INTEGER", "FRAC", "NUMBER", "WS", "AT"
    };
    public static final int INTEGER=29;
    public static final int RPARENS=11;
    public static final int MULTDIV_OP=24;
    public static final int WHILE=15;
    public static final int LETTER=27;
    public static final int CONST=20;
    public static final int ELSE=14;
    public static final int NUMBER=31;
    public static final int LPARENS=10;
    public static final int FOR=16;
    public static final int ID=9;
    public static final int EOF=-1;
    public static final int SEMI=6;
    public static final int PRINT=18;
    public static final int FRAC=30;
    public static final int TYPE=8;
    public static final int IF=13;
    public static final int AT=33;
    public static final int ADDSUB_OP=23;
    public static final int WS=32;
    public static final int REL_OP=25;
    public static final int COMMA=19;
    public static final int INCLUDE=4;
    public static final int ASSIGN=21;
    public static final int RETURN=17;
    public static final int DIGIT=28;
    public static final int LOG_OP=26;
    public static final int COMMENT=22;
    public static final int FUN=7;
    public static final int END=12;
    public static final int STRING=5;

        public ASMLParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g"; }



    // $ANTLR start program
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:5:1: program : ( include_expr )* ( fun_decl )+ ;
    public final void program() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:5:11: ( ( include_expr )* ( fun_decl )+ )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:5:11: ( include_expr )* ( fun_decl )+
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:5:11: ( include_expr )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==INCLUDE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:5:12: include_expr
            	    {
            	    pushFollow(FOLLOW_include_expr_in_program24);
            	    include_expr();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:5:26: ( fun_decl )+
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
            	    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:5:27: fun_decl
            	    {
            	    pushFollow(FOLLOW_fun_decl_in_program28);
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


    // $ANTLR start include_expr
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:7:1: include_expr : INCLUDE STRING SEMI ;
    public final void include_expr() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:8:5: ( INCLUDE STRING SEMI )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:8:5: INCLUDE STRING SEMI
            {
            match(input,INCLUDE,FOLLOW_INCLUDE_in_include_expr40); 
            match(input,STRING,FOLLOW_STRING_in_include_expr42); 
            match(input,SEMI,FOLLOW_SEMI_in_include_expr44); 

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
    // $ANTLR end include_expr


    // $ANTLR start fun_decl
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:9:1: fun_decl : FUN TYPE ID LPARENS ( decls )? RPARENS block FUN ;
    public final void fun_decl() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:9:11: ( FUN TYPE ID LPARENS ( decls )? RPARENS block FUN )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:9:11: FUN TYPE ID LPARENS ( decls )? RPARENS block FUN
            {
            match(input,FUN,FOLLOW_FUN_in_fun_decl50); 
            match(input,TYPE,FOLLOW_TYPE_in_fun_decl52); 
            match(input,ID,FOLLOW_ID_in_fun_decl54); 
            match(input,LPARENS,FOLLOW_LPARENS_in_fun_decl56); 
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:9:31: ( decls )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TYPE||LA3_0==CONST) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:9:31: decls
                    {
                    pushFollow(FOLLOW_decls_in_fun_decl58);
                    decls();
                    _fsp--;


                    }
                    break;

            }

            match(input,RPARENS,FOLLOW_RPARENS_in_fun_decl61); 
            pushFollow(FOLLOW_block_in_fun_decl63);
            block();
            _fsp--;

            match(input,FUN,FOLLOW_FUN_in_fun_decl65); 

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
    // $ANTLR end fun_decl


    // $ANTLR start block
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:11:1: block : stmts END ;
    public final void block() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:11:9: ( stmts END )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:11:9: stmts END
            {
            pushFollow(FOLLOW_stmts_in_block73);
            stmts();
            _fsp--;

            match(input,END,FOLLOW_END_in_block75); 

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


    // $ANTLR start stmts
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:13:1: stmts : ( stmt stmts )? ;
    public final void stmts() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:13:10: ( ( stmt stmts )? )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:13:10: ( stmt stmts )?
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:13:10: ( stmt stmts )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=TYPE && LA4_0<=ID)||LA4_0==IF||(LA4_0>=WHILE && LA4_0<=PRINT)||LA4_0==CONST) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:13:11: stmt stmts
                    {
                    pushFollow(FOLLOW_stmt_in_stmts85);
                    stmt();
                    _fsp--;

                    pushFollow(FOLLOW_stmts_in_stmts87);
                    stmts();
                    _fsp--;


                    }
                    break;

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
    // $ANTLR end stmts


    // $ANTLR start stmt
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:14:1: stmt : ( decl SEMI | expr SEMI | if_stmt | while_stmt | for_stmt | print_stmt | return_stmt );
    public final void stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:14:8: ( decl SEMI | expr SEMI | if_stmt | while_stmt | for_stmt | print_stmt | return_stmt )
            int alt5=7;
            switch ( input.LA(1) ) {
            case TYPE:
            case CONST:
                {
                alt5=1;
                }
                break;
            case ID:
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
                    new NoViableAltException("14:1: stmt : ( decl SEMI | expr SEMI | if_stmt | while_stmt | for_stmt | print_stmt | return_stmt );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:14:8: decl SEMI
                    {
                    pushFollow(FOLLOW_decl_in_stmt96);
                    decl();
                    _fsp--;

                    match(input,SEMI,FOLLOW_SEMI_in_stmt98); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:15:4: expr SEMI
                    {
                    pushFollow(FOLLOW_expr_in_stmt103);
                    expr();
                    _fsp--;

                    match(input,SEMI,FOLLOW_SEMI_in_stmt105); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:16:4: if_stmt
                    {
                    pushFollow(FOLLOW_if_stmt_in_stmt110);
                    if_stmt();
                    _fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:17:4: while_stmt
                    {
                    pushFollow(FOLLOW_while_stmt_in_stmt115);
                    while_stmt();
                    _fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:18:4: for_stmt
                    {
                    pushFollow(FOLLOW_for_stmt_in_stmt120);
                    for_stmt();
                    _fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:19:4: print_stmt
                    {
                    pushFollow(FOLLOW_print_stmt_in_stmt125);
                    print_stmt();
                    _fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:20:4: return_stmt
                    {
                    pushFollow(FOLLOW_return_stmt_in_stmt130);
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


    // $ANTLR start if_stmt
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:22:1: if_stmt : IF LPARENS expr RPARENS block ( ELSE block )? IF ;
    public final void if_stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:22:11: ( IF LPARENS expr RPARENS block ( ELSE block )? IF )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:22:11: IF LPARENS expr RPARENS block ( ELSE block )? IF
            {
            match(input,IF,FOLLOW_IF_in_if_stmt138); 
            match(input,LPARENS,FOLLOW_LPARENS_in_if_stmt140); 
            pushFollow(FOLLOW_expr_in_if_stmt142);
            expr();
            _fsp--;

            match(input,RPARENS,FOLLOW_RPARENS_in_if_stmt144); 
            pushFollow(FOLLOW_block_in_if_stmt146);
            block();
            _fsp--;

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:22:41: ( ELSE block )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ELSE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:22:42: ELSE block
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_if_stmt149); 
                    pushFollow(FOLLOW_block_in_if_stmt151);
                    block();
                    _fsp--;


                    }
                    break;

            }

            match(input,IF,FOLLOW_IF_in_if_stmt155); 

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
    // $ANTLR end if_stmt


    // $ANTLR start while_stmt
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:23:1: while_stmt : WHILE LPARENS expr RPARENS block WHILE ;
    public final void while_stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:24:4: ( WHILE LPARENS expr RPARENS block WHILE )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:24:4: WHILE LPARENS expr RPARENS block WHILE
            {
            match(input,WHILE,FOLLOW_WHILE_in_while_stmt163); 
            match(input,LPARENS,FOLLOW_LPARENS_in_while_stmt165); 
            pushFollow(FOLLOW_expr_in_while_stmt167);
            expr();
            _fsp--;

            match(input,RPARENS,FOLLOW_RPARENS_in_while_stmt169); 
            pushFollow(FOLLOW_block_in_while_stmt171);
            block();
            _fsp--;

            match(input,WHILE,FOLLOW_WHILE_in_while_stmt173); 

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
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:25:1: for_stmt : FOR LPARENS expr SEMI expr SEMI expr RPARENS block FOR ;
    public final void for_stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:25:11: ( FOR LPARENS expr SEMI expr SEMI expr RPARENS block FOR )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:25:11: FOR LPARENS expr SEMI expr SEMI expr RPARENS block FOR
            {
            match(input,FOR,FOLLOW_FOR_in_for_stmt179); 
            match(input,LPARENS,FOLLOW_LPARENS_in_for_stmt181); 
            pushFollow(FOLLOW_expr_in_for_stmt183);
            expr();
            _fsp--;

            match(input,SEMI,FOLLOW_SEMI_in_for_stmt185); 
            pushFollow(FOLLOW_expr_in_for_stmt187);
            expr();
            _fsp--;

            match(input,SEMI,FOLLOW_SEMI_in_for_stmt191); 
            pushFollow(FOLLOW_expr_in_for_stmt193);
            expr();
            _fsp--;

            match(input,RPARENS,FOLLOW_RPARENS_in_for_stmt195); 
            pushFollow(FOLLOW_block_in_for_stmt197);
            block();
            _fsp--;

            match(input,FOR,FOLLOW_FOR_in_for_stmt199); 

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


    // $ANTLR start return_stmt
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:26:1: return_stmt : RETURN expr SEMI ;
    public final void return_stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:27:4: ( RETURN expr SEMI )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:27:4: RETURN expr SEMI
            {
            match(input,RETURN,FOLLOW_RETURN_in_return_stmt207); 
            pushFollow(FOLLOW_expr_in_return_stmt209);
            expr();
            _fsp--;

            match(input,SEMI,FOLLOW_SEMI_in_return_stmt211); 

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


    // $ANTLR start print_stmt
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:28:1: print_stmt : PRINT STRING SEMI ;
    public final void print_stmt() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:28:13: ( PRINT STRING SEMI )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:28:13: PRINT STRING SEMI
            {
            match(input,PRINT,FOLLOW_PRINT_in_print_stmt217); 
            match(input,STRING,FOLLOW_STRING_in_print_stmt219); 
            match(input,SEMI,FOLLOW_SEMI_in_print_stmt221); 

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


    // $ANTLR start decls
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:31:1: decls : ( decl COMMA decls | decl );
    public final void decls() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:31:9: ( decl COMMA decls | decl )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==CONST) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==TYPE) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==ID) ) {
                        switch ( input.LA(4) ) {
                        case ASSIGN:
                            {
                            int LA7_4 = input.LA(5);

                            if ( (LA7_4==ID) ) {
                                int LA7_7 = input.LA(6);

                                if ( (LA7_7==RPARENS) ) {
                                    alt7=2;
                                }
                                else if ( (LA7_7==COMMA) ) {
                                    alt7=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("31:1: decls : ( decl COMMA decls | decl );", 7, 7, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("31:1: decls : ( decl COMMA decls | decl );", 7, 4, input);

                                throw nvae;
                            }
                            }
                            break;
                        case COMMA:
                            {
                            alt7=1;
                            }
                            break;
                        case RPARENS:
                            {
                            alt7=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("31:1: decls : ( decl COMMA decls | decl );", 7, 3, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("31:1: decls : ( decl COMMA decls | decl );", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("31:1: decls : ( decl COMMA decls | decl );", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==TYPE) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==ID) ) {
                    switch ( input.LA(3) ) {
                    case ASSIGN:
                        {
                        int LA7_4 = input.LA(4);

                        if ( (LA7_4==ID) ) {
                            int LA7_7 = input.LA(5);

                            if ( (LA7_7==RPARENS) ) {
                                alt7=2;
                            }
                            else if ( (LA7_7==COMMA) ) {
                                alt7=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("31:1: decls : ( decl COMMA decls | decl );", 7, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("31:1: decls : ( decl COMMA decls | decl );", 7, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case COMMA:
                        {
                        alt7=1;
                        }
                        break;
                    case RPARENS:
                        {
                        alt7=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("31:1: decls : ( decl COMMA decls | decl );", 7, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("31:1: decls : ( decl COMMA decls | decl );", 7, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("31:1: decls : ( decl COMMA decls | decl );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:31:9: decl COMMA decls
                    {
                    pushFollow(FOLLOW_decl_in_decls231);
                    decl();
                    _fsp--;

                    match(input,COMMA,FOLLOW_COMMA_in_decls233); 
                    pushFollow(FOLLOW_decls_in_decls235);
                    decls();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:31:28: decl
                    {
                    pushFollow(FOLLOW_decl_in_decls239);
                    decl();
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
    // $ANTLR end decls


    // $ANTLR start decl
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:32:1: decl : ( CONST )? ( TYPE ID | TYPE expr ) ;
    public final void decl() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:32:8: ( ( CONST )? ( TYPE ID | TYPE expr ) )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:32:8: ( CONST )? ( TYPE ID | TYPE expr )
            {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:32:8: ( CONST )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==CONST) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:32:8: CONST
                    {
                    match(input,CONST,FOLLOW_CONST_in_decl246); 

                    }
                    break;

            }

            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:32:15: ( TYPE ID | TYPE expr )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==TYPE) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==ID) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==ASSIGN) ) {
                        alt9=2;
                    }
                    else if ( (LA9_2==SEMI||LA9_2==RPARENS||LA9_2==COMMA) ) {
                        alt9=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("32:15: ( TYPE ID | TYPE expr )", 9, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("32:15: ( TYPE ID | TYPE expr )", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("32:15: ( TYPE ID | TYPE expr )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:32:16: TYPE ID
                    {
                    match(input,TYPE,FOLLOW_TYPE_in_decl250); 
                    match(input,ID,FOLLOW_ID_in_decl252); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:32:26: TYPE expr
                    {
                    match(input,TYPE,FOLLOW_TYPE_in_decl256); 
                    pushFollow(FOLLOW_expr_in_decl258);
                    expr();
                    _fsp--;


                    }
                    break;

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
    // $ANTLR end decl


    // $ANTLR start expr_list
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:34:1: expr_list : ( expr COMMA expr_list | expr );
    public final void expr_list() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:35:4: ( expr COMMA expr_list | expr )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==ASSIGN) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==ID) ) {
                        int LA10_3 = input.LA(4);

                        if ( (LA10_3==COMMA) ) {
                            alt10=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("34:1: expr_list : ( expr COMMA expr_list | expr );", 10, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("34:1: expr_list : ( expr COMMA expr_list | expr );", 10, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("34:1: expr_list : ( expr COMMA expr_list | expr );", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("34:1: expr_list : ( expr COMMA expr_list | expr );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:35:4: expr COMMA expr_list
                    {
                    pushFollow(FOLLOW_expr_in_expr_list268);
                    expr();
                    _fsp--;

                    match(input,COMMA,FOLLOW_COMMA_in_expr_list270); 
                    pushFollow(FOLLOW_expr_list_in_expr_list272);
                    expr_list();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:35:27: expr
                    {
                    pushFollow(FOLLOW_expr_in_expr_list276);
                    expr();
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
    // $ANTLR end expr_list


    // $ANTLR start expr
    // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:36:1: expr : ID ASSIGN ID ;
    public final void expr() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:36:8: ( ID ASSIGN ID )
            // C:\\Documents and Settings\\Owner\\workspace\\ASML\\asml\\ASML.g:36:8: ID ASSIGN ID
            {
            match(input,ID,FOLLOW_ID_in_expr283); 
            match(input,ASSIGN,FOLLOW_ASSIGN_in_expr285); 
            match(input,ID,FOLLOW_ID_in_expr287); 

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
    // $ANTLR end expr


 

    public static final BitSet FOLLOW_include_expr_in_program24 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_fun_decl_in_program28 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_INCLUDE_in_include_expr40 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_in_include_expr42 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_include_expr44 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUN_in_fun_decl50 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TYPE_in_fun_decl52 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_fun_decl54 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPARENS_in_fun_decl56 = new BitSet(new long[]{0x0000000000100900L});
    public static final BitSet FOLLOW_decls_in_fun_decl58 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RPARENS_in_fun_decl61 = new BitSet(new long[]{0x000000000017B300L});
    public static final BitSet FOLLOW_block_in_fun_decl63 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_FUN_in_fun_decl65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmts_in_block73 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_END_in_block75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmts85 = new BitSet(new long[]{0x000000000017A300L});
    public static final BitSet FOLLOW_stmts_in_stmts87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_stmt96 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_stmt98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt103 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_stmt105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_stmt110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_stmt115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_stmt120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_stmt_in_stmt125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_stmt130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_stmt138 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPARENS_in_if_stmt140 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_expr_in_if_stmt142 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RPARENS_in_if_stmt144 = new BitSet(new long[]{0x000000000017B300L});
    public static final BitSet FOLLOW_block_in_if_stmt146 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ELSE_in_if_stmt149 = new BitSet(new long[]{0x000000000017B300L});
    public static final BitSet FOLLOW_block_in_if_stmt151 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_IF_in_if_stmt155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt163 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPARENS_in_while_stmt165 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_expr_in_while_stmt167 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RPARENS_in_while_stmt169 = new BitSet(new long[]{0x000000000017B300L});
    public static final BitSet FOLLOW_block_in_while_stmt171 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt179 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPARENS_in_for_stmt181 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_expr_in_for_stmt183 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_for_stmt185 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_expr_in_for_stmt187 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_for_stmt191 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_expr_in_for_stmt193 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RPARENS_in_for_stmt195 = new BitSet(new long[]{0x000000000017B300L});
    public static final BitSet FOLLOW_block_in_for_stmt197 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FOR_in_for_stmt199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt207 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_expr_in_return_stmt209 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_return_stmt211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print_stmt217 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_in_print_stmt219 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_print_stmt221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_decls231 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COMMA_in_decls233 = new BitSet(new long[]{0x0000000000100100L});
    public static final BitSet FOLLOW_decls_in_decls235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_decls239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_decl246 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TYPE_in_decl250 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_decl252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_decl256 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_expr_in_decl258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list268 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COMMA_in_expr_list270 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_expr_list_in_expr_list272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr283 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ASSIGN_in_expr285 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_expr287 = new BitSet(new long[]{0x0000000000000002L});

}