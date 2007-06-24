grammar ASML;
@header {package asml;}
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

if_stmt	:	IF LPARENS expr RPARENS block (ELSE block)? IF;
while_stmt
	:	WHILE LPARENS expr RPARENS block WHILE;
for_stmt:	FOR LPARENS expr SEMI expr /*PLACEHOLDER*/ SEMI expr RPARENS block FOR;
return_stmt
	:	RETURN expr SEMI;
print_stmt:	PRINT STRING SEMI;
	

decls	:	decl COMMA decls | decl;
decl	:	CONST? (TYPE ID | TYPE expr);

expr_list
	:	expr COMMA expr_list | expr;
expr	:	ID ASSIGN ID;



//options { /*testLiterals = false;*/ k = 2; }

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




