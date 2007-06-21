grammar ASML;

class ASMLLexer extends Lexer;
options { testLiterals = false; k = 2; }

COMMENT	options{ greedy = false; }
	:	('/*' ('*'|'/'|NONCOMMENT)* '*/');

protected NONCOMMENT
	:	~('*'|'/');
ADDSUB_OP
	:	'+' | '-';
MULTDIV_OP
	:	 '*' | '/';
ASSIGN	:	'=';


PARENS options{ testLiterals = true; }
	: 	('(' | ')');
SEMI	:	';';

protected LETTER
	:	('a'..'z')|('A'..'Z');
protected DIGIT
	:	('0'..'9');
	
ID	: 	(LETTER|'_')(LETTER|'_'|DIGIT)*;
STRING	:	'"'! (('\\'!'"') | ~('"'))* '"'!;

WS	:	(' ' | '\t' | '\n' | '\r');

TYPE	:	'ampl'|'float'|'freq'|'int'|'time'|'wave';

