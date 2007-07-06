grammar ASML;
@header {package asml;}
@members{
	public boolean hasError = false;
@Override
	public void reportError(RecognitionException e){
		super.reportError(e);
		hasError = true;
	}
}
@lexer::header {package asml;}
@lexer::members{
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
}

program	:	(include_stmt)*(fun_decl)+;

include_stmt
	: 	INCLUDE STRING SEMI;
fun_decl:	FUN TYPE ID LPARENS params? RPARENS block FUN;

block	:	stmts END;

stmts 	:	(stmt stmts)?;
stmt	:	decl SEMI
	|	expr SEMI
	|	if_stmt
	|	while_stmt
	|	for_stmt
	|	print_stmt
	|	return_stmt;

if_stmt	:	IF LPARENS expr RPARENS block (ELSE block)? IF;
while_stmt
	:	WHILE LPARENS expr RPARENS block WHILE;
for_stmt:	FOR LPARENS expr SEMI expr SEMI expr RPARENS block FOR;
return_stmt
	:	RETURN expr SEMI;
print_stmt:	PRINT STRING SEMI;
	

params	:	param paramsp;
paramsp :	COMMA params | /* nothing */;
param	:	CONST? TYPE ID;
decl	:	CONST? TYPE expr;

expr_list
	:	expr expr_listp;
expr_listp
	:	COMMA expr_list | /*nothing*/;
expr	:	log_expr exprp;
exprp	:	ASSIGN expr | /*nothing*/;
log_expr:	rel_expr log_exprp;
log_exprp
	:	LOG_OP log_expr | /* nothing*/;
rel_expr:	add_expr rel_exprp;
rel_exprp
	:	REL_OP rel_expr | /* nothing*/;
add_expr:	mult_expr add_exprp;
add_exprp
	:	ADD_OP add_expr | SUB_OP add_expr |/* nothing */;
mult_expr
	:	unary_expr mult_exprp;
mult_exprp
	:	MULT_OP mult_expr | DIV_OP mult_expr | MOD_OP mult_expr | /*nothing*/;
unary_expr
	:	'!'at_expr | '-'at_expr | at_expr;
at_expr	:	fun_call at_exprp;
at_exprp:	AT at_expr at_exprpp |  /* nothing*/;
at_exprpp
	:	TO at_expr | /* nothing */;
fun_call	options{greedy = false;}: ID LPARENS expr_list? RPARENS | top_expr;
top_expr:	LPARENS expr RPARENS | ID | NUMBER;


COMMENT	:	'/*' (options{greedy = false;}: .)* '*/';

ADD_OP	:	'+';
SUB_OP	:	'-';
MULT_OP	:	 '*';
DIV_OP	:	'/';
MOD_OP	:	'%';
ASSIGN	:	'=';

REL_OP	:	'<' | '>' | '<=' | '>=' | '==' | '!=';
LOG_OP	:	'||' | '&&';



LPARENS	: 	'(';
RPARENS	:	')';
COMMA	:	',';
SEMI	:	';';

fragment LETTER
	:	('a'..'z')|('A'..'Z');
fragment DIGIT
	:	('0'..'9');
fragment INTEGER
	:	(DIGIT)+;
fragment FRAC 
	:	'.'(INTEGER);
	
/*CONSTANT:	NUMBER;*/

NUMBER:	INTEGER /*set type to int*/
		('Hz'/*set type to freq*/
		|'ms'/*set type to time*/)?
	| INTEGER? FRAC /*set type to float*/
		('a' /*set type to ampl*/
		|'Hz'/*set type to freq*/
		|'ms'/*set type to time*/)?;

	
TYPE	:	'ampl'|'float'|'freq'|'int'|'time'|'wave';

/*fragment STR_QUOTE
	:	'\\' '"' { setText("\"");};
fragment STR_BACKSLASH
	:	'\\' '\\' { setText("\\");};*/
fragment STR_CONTENT
	:	(('\\''"') | ('\\''\\') | ~('"'|'\\'))*;
STRING	:	'"' t = STR_CONTENT '"' {setText(stripEscapeChars($STR_CONTENT.text));};

WS	:	(' ' | '\t' | '\n' | '\r')+ {skip();};


AT	:	'at';
CONST 	:	'const';
ELSE	: 	'else';
END	:	'end';
FOR	:	'for';
FUN	:	'fun';
IF	:	'if';
INCLUDE	:	'include';
PRINT	:	'print';
RETURN	:	'return';
TO	:	'to';	
WHILE 	:	'while';

ID	: 	(LETTER|'_')(LETTER|'_'|DIGIT)*;




