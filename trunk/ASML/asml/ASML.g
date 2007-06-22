lexer grammar ASML;
@lexer::header {package asml;}
//options { /*testLiterals = false;*/ k = 2; }

COMMENT	options{ greedy = false; k = 2;}
	:	('/*' ('*'|'/'|NONCOMMENT)* '*/');

fragment NONCOMMENT
	:	~('*'|'/');
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
	
NUMBER:	INTEGER /*set type to int*/
		('Hz'/*set type to freq*/
		|'ms'/*set type to time*/)?
	| INTEGER? FRAC /*set type to float*/
		('a' /*set type to ampl*/
		|'Hz'/*set type to freq*/
		|'ms'/*set type to time*/)?;

CONSTANT:	NUMBER;
	
TYPE	:	'ampl'|'float'|'freq'|'int'|'time'|'wave';

STRING	:	'"'! (('\\'!'"') | ~('"'))* '"'!;

WS	:	(' ' | '\t' | '\n' | '\r');


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




