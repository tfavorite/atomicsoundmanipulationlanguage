tree grammar ASMLWalker;

options {
tokenVocab=ASML; // reuse token types
ASTLabelType=CommonTree; // $label will have type CommonTree
}
@header {
package asml;
import asml.walker.*;
}

program	:	
	(include_stmt)*(fun_decl)+;
	
include_stmt: 	
	^(INCLUDE STRING);
	
fun_decl:
	^(FUN TYPE ID params? block);
	
block	:
	^(BLOCKRT stmt*);

stmt	:	
	  decl
	| expr
	| if_stmt
	| while_stmt
	| for_stmt
	| print_stmt
	| return_stmt;
	
if_stmt	: 
	^(IF expr block (block)?);
while_stmt:
	^(WHILE expr block);
for_stmt:	
	^(FOR expr expr expr block);
print_stmt
	:	
	^(PRINT val = expr){
		/*UPDATE THIS ONCE TIM MAKES NEW STRING CONSTRUCTOR		
		if(val.getType() != Type.STRING)
			throw new ASMLSemanticException(
				"Print: expression must evaluate to a string.");*/
		ASMLString str = (ASMLString) val;
		System.out.println(str.getValue());
	};
return_stmt
	:	
	^(RETURN expr);
	
decl	:
	^(DECLRT CONST? TYPE ID expr?);
params	:	
	param ( params)?;
param	:
	^(PARAMRT CONST? TYPE ID);
	
expr returns [Value v]:
	  ^(ASSIGN lhs = expr rhs = expr){
	  	
	  
	  }
	| ^(LOG_OP lhs = expr rhs = expr){
		try{$v = lhs.logic(rhs, $LOG_OP.text);}
		catch(ASMLSemanticException e){
			System.err.println(e.getMessage());}
	}
	| ^(REL_OP lhs = expr rhs = expr){
		try{$v = lhs.relate(rhs, $REL_OP.text);}
		catch(ASMLSemanticException e){
			System.err.println(e.getMessage());}
	}
	| ^(ADD_OP lhs = expr rhs = expr){}
	| ^(SUB_OP lhs = expr rhs = expr){}
	| ^(MULT_OP lhs = expr rhs = expr){}
	| ^(DIV_OP lhs = expr rhs = expr){}
	| ^(MOD_OP lhs = expr rhs = expr){}
	| ^(AMPLOF lhs = expr)
	| ^(AT expr expr?)
	| ^(CALLRT ID expr*)
	| ID{}
	| NUMBER{}
	| STRING{};
