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
	^(FUN TYPE ID param* block);
	
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
		try {
			ASMLString str = new ASMLString(val);
			System.out.println(str.getValue());
		} catch (ASMLSemanticException e){
			System.err.println("Print: expression must evaluate to a string.");
		}
	};
return_stmt
	:	
	^(RETURN expr);
	
decl	:
	^(DECLRT TYPE ID expr?);
/*params	:	
	param ( params)?;*/
param	:
	^(PARAMRT TYPE ID);
	
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
	| ^(ADD_OP lhs = expr rhs = expr){
		try{$v = lhs.add(rhs);}
		catch(ASMLSemanticException e){
			System.err.println(e.getMessage());}	
	}
	| ^(SUB_OP lhs = expr rhs = expr){
		try{$v = lhs.subtract(rhs);}
		catch(ASMLSemanticException e){
			System.err.println(e.getMessage());}	
	}
	| ^(MULT_OP lhs = expr rhs = expr){
		try{$v = lhs.multiply(rhs);}
		catch(ASMLSemanticException e){
			System.err.println(e.getMessage());}
	}
	| ^(DIV_OP lhs = expr rhs = expr){
		try{$v = lhs.divide(rhs);}
		catch(ASMLSemanticException e){
			System.err.println(e.getMessage());}
	}
	| ^(MOD_OP lhs = expr rhs = expr){
		try{$v = lhs.mod(rhs);}
		catch(ASMLSemanticException e){
			System.err.println(e.getMessage());}
	}
	| ^(AMPLOF lhs = expr){
		try{$v = lhs.amplof();}
		catch(ASMLSemanticException e){
			System.err.println(e.getMessage());}
	}
	| ^(AT expr expr expr?){
		/*Need to research referring to '?' expression*/
	}
	| ^(CALLRT ID expr*)
	| ID{}
	| NUMBER{$v = Value.valueOf($NUMBER.text);}
	| STRING{$v = new ASMLString($STRING.text);};
