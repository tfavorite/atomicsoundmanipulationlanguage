tree grammar ASMLWalker;

options {
tokenVocab=ASML; // reuse token types
ASTLabelType=CommonTree; // $label will have type CommonTree
}
@header {
package asml;
import asml.walker.*;
}

@members{
CommonTreeNodeStream stream = (CommonTreeNodeStream)input;
ASMLControl control = null;
public void setControl(ASMLControl aControl){
	control = aControl;
}
}

program	
@init{
control.setStream(stream);
}
:(include_stmt)*(fun_decl)+;
	
include_stmt: 	
	^(INCLUDE STRING);
	
fun_decl
@after{
try{
	if($name.text.equals("main"))
		control.doCallMain();
}catch(ASMLSemanticException e){
	System.err.println(e.getMessage());
	System.exit(-1);}
}
:^(FUN TYPE name=ID param* .);
	
block	
@init{
try{control.enterScope();}
catch(ASMLSemanticException e){
	System.err.println(e.getMessage());
	System.exit(-1);
}}
@after{
try{control.exitScope();}
catch(ASMLSemanticException e){
	System.err.println(e.getMessage());
	System.exit(-1);
}}
:^(BLOCKRT stmt*);

stmt		
@init{
	try{
	if(control.isCurrentFunctionLocked()){
		matchAny(input);
		return;
	}
	}catch(java.util.EmptyStackException ignore){}
}
:	  decl
	| expr
	| if_stmt
	| while_stmt
	| for_stmt
	| print_stmt
	| return_stmt;
	
if_stmt	
@after{
if(eval.getType() != Type.INT){
	System.err.println("Semantic exception: Expressions for conditional statements must evaluate to an int.");
	System.exit(-1);
	}
if(((ASMLInteger)eval).getValue() != 0){
	CommonTree block1=(CommonTree)$if_stmt.start.getChild(1);
	stream.push(stream.getNodeIndex(block1));
	block();
	stream.pop();
	}
else if($if_stmt.start.getChildCount() == 3){
	CommonTree block2=(CommonTree)$if_stmt.start.getChild(2);
	stream.push(stream.getNodeIndex(block2));
	block();
	stream.pop();
	}
}
:^(IF eval=expr . .?);

while_stmt
@after{
if(eval.getType() != Type.INT){
	System.err.println("Semantic exception: Expressions for conditional statements must evaluate to an int.");
	System.exit(-1);
	}
if(((ASMLInteger)eval).getValue() != 0){
	CommonTree tExpr=(CommonTree)$while_stmt.start.getChild(0);
	CommonTree tBlock=(CommonTree)$while_stmt.start.getChild(1);
	try{control.doWhile(tExpr, tBlock);}
	catch(Exception e){
		System.err.println(e.getMessage());
		System.exit(-1);
		}
	}
}
:^(WHILE eval=expr .);

for_stmt
@after{
if(eval.getType() != Type.INT){
	System.err.println("Semantic exception: Expressions for conditional statements must evaluate to an int.");
	System.exit(-1);
	}
if(((ASMLInteger)eval).getValue() != 0){
	CommonTree tEval=(CommonTree)$for_stmt.start.getChild(1);
	CommonTree tExec=(CommonTree)$for_stmt.start.getChild(2);
	CommonTree tBlock=(CommonTree)$for_stmt.start.getChild(3);
	try{control.doFor(tEval, tExec, tBlock);}
	catch(Exception e){
		System.err.println(e.getMessage());
		System.exit(-1);
		}
	}	
}
:^(FOR expr eval=expr . .);
	
print_stmt
	:	
	^(PRINT val = expr){
		try {
			ASMLString str = new ASMLString(val);
			System.out.println(str.getValue());
		} catch (ASMLSemanticException e){
			System.err.println("Print: expression must evaluate to a string.");
			System.exit(-1);
		}
	};
return_stmt
@after{
try{control.doReturn(retval);}
catch(Exception e){
	System.err.println(e.getMessage());
	System.exit(-1);
	}
}
:^(RETURN retval=expr);
	
decl	
@after{
try{
	if($decl.start.getChildCount() == 3)
		control.doDeclare($name.text, $type.text, rhs);		
	else
		control.doDeclare($name.text, $type.text);
	}
catch(ASMLSemanticException e){
	System.err.println(e.getMessage());
	System.exit(-1);
	}
}
:^(DECLRT type=TYPE name=ID (rhs = expr)?);
/*params	:	
	param ( params)?;*/
param	:
	^(PARAMRT TYPE ID);
	
expr returns [Value v]
@init{
	ArrayList<Value> aParams = new ArrayList<Value>();
	
}:
	  ^(ASSIGN lhs = expr rhs = expr){
	  	try{$v = control.doAssign(lhs, rhs);}
		catch(ASMLSemanticException e){
			System.err.println(e.getMessage());
			System.exit(-1);
		}	  
	  }
	| ^(LOG_OP lhs = expr rhs = expr){
		try{$v = lhs.logic(rhs, $LOG_OP.text);}
		catch(ASMLSemanticException e){
			System.err.println(e.getMessage());
			System.exit(-1);
		}
	}
	| ^(REL_OP lhs = expr rhs = expr){
		try{$v = lhs.relate(rhs, $REL_OP.text);}
		catch(ASMLSemanticException e){
			System.err.println(e.getMessage());
			System.exit(-1);
		}
	}
	| ^(ADD_OP lhs = expr rhs = expr){
		try{$v = lhs.add(rhs);}
		catch(ASMLSemanticException e){
			System.err.println(e.getMessage());
			System.exit(-1);
		}	
	}
	| ^(SUB_OP lhs = expr rhs = expr){
		try{$v = lhs.subtract(rhs);}
		catch(ASMLSemanticException e){
			System.err.println(e.getMessage());
			System.exit(-1);
		}	
	}
	| ^(MULT_OP lhs = expr rhs = expr){
		try{$v = lhs.multiply(rhs);}
		catch(ASMLSemanticException e){
			System.err.println(e.getMessage());
			System.exit(-1);
		}
	}
	| ^(DIV_OP lhs = expr rhs = expr){
		try{$v = lhs.divide(rhs);}
		catch(ASMLSemanticException e){
			System.err.println(e.getMessage());
			System.exit(-1);
		}
	}
	| ^(MOD_OP lhs = expr rhs = expr){
		try{$v = lhs.mod(rhs);}
		catch(ASMLSemanticException e){
			System.err.println(e.getMessage());
			System.exit(-1);
		}
	}
	| ^(AMPLOF lhs = expr){
		try{$v = lhs.amplof();}
		catch(ASMLSemanticException e){
			System.err.println(e.getMessage());
			System.exit(-1);
		}
	}
	| ^(AT wave=expr start=expr (end=expr)?){
		try {if ($expr.start.getChildCount() == 2)
			$v = control.doAt(start);
		else if ($expr.start.getChildCount() == 3)
			$v = control.doAt(start,end);
		else {
			System.err.println("At expression somehow had more than two arguments, exiting.");
			System.exit(-1);
		}	
		} catch(ASMLSemanticException e){
			System.err.println(e.getMessage());
			System.exit(-1);
		}	
	}
	| ^(CALLRT name=ID (par=expr{aParams.add(par);})*){
		try{
			$v = control.doCallFunction($name.text, aParams);	
		} catch(ASMLSemanticException e){
			System.err.println(e.getMessage());
			System.exit(-1);
		}
	}
	| ID{
		try {
			$v = control.getSymbol($ID.text);
		} catch(ASMLSemanticException e){
			System.err.println(e.getMessage());
			System.exit(-1);
		}
	}
	| NUMBER{$v = Value.valueOf($NUMBER.text);}
	| STRING{$v = new ASMLString($STRING.text);};
