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

program	:	(include_expr)*(fun_decl)+;

include_expr
	: 	INCLUDE STRING SEMI;
fun_decl:	FUN TYPE ID LPARENS decls? RPARENS block FUN;

block	:	stmts END;

stmts 	:	(stmt stmts)?;
stmt	:	decl SEMI
	|	expr SEMI
	|	if_stmt
	|	while_stmt
	|	for_stmt
	|	print_stmt
	|	return_stmt;

if_stmt	:	IF LPARENS rel_expr RPARENS block (ELSE block)? IF;
while_stmt
	:	WHILE LPARENS rel_expr RPARENS block WHILE;
for_stmt:	FOR LPARENS expr SEMI rel_expr SEMI expr RPARENS block FOR;
return_stmt
	:	RETURN expr SEMI;
print_stmt:	PRINT STRING SEMI;
	

decls	:	decl declsp;
declsp	:	COMMA decls | /*nothing*/;
decl	:	CONST? TYPE expr;

expr_list
	:	expr expr_listp;
expr_listp
	:	COMMA expr_list | /*nothing*/;
expr	:	(ID | ID AT (ID | NUMBER)) ASSIGN log_expr | log_expr;
log_expr:	rel_expr log_exprp;
log_exprp
	:	LOG_OP log_expr | /* nothing*/;
rel_expr:	add_expr rel_exprp;
rel_exprp
	:	REL_OP rel_expr | /* nothing*/;
add_expr:	mult_expr add_exprp;
add_exprp
	:	ADDSUB_OP add_expr | /* nothing */;
mult_expr
	:	unary_expr mult_exprp;
mult_exprp
	:	MULTDIV_OP mult_expr | /*nothing*/;
unary_expr
	:	'!'at_expr | '-'at_expr | at_expr;
at_expr	:	fun_call at_exprp;
at_exprp:	AT at_expr | /*nothing*/;
fun_call	options{greedy = false;}: ID LPARENS expr_list? RPARENS | top_expr;
top_expr:	LPARENS expr RPARENS | ID | NUMBER;


COMMENT	:	'/*' (options{greedy = false;}: .)* '*/';

ADDSUB_OP
	:	'+' | '-';
MULTDIV_OP
	:	 '*' | '/';
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

STRING	:	'"'! (('\\'!'"') | ('\\'! '\\') | ~('"'|'\\'))* '"'!;

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
WHILE 	:	'while';

ID	: 	(LETTER|'_')(LETTER|'_'|DIGIT)*;




