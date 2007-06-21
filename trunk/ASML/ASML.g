lexer grammar ASML;

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


PARENS //options{ testLiterals = true; }
	: 	('(' | ')');
SEMI	:	';';

fragment LETTER
	:	('a'..'z')|('A'..'Z');
fragment DIGIT
	:	('0'..'9');
	
TYPE	:	'ampl'|'float'|'freq'|'int'|'time'|'wave';

ID	: 	(LETTER|'_')(LETTER|'_'|DIGIT)*;
STRING	:	'"'! (('\\'!'"') | ~('"'))* '"'!;

WS	:	(' ' | '\t' | '\n' | '\r');



