tree grammar ASMLFunWalker;

options {
tokenVocab=ASML; // reuse token types
ASTLabelType=CommonTree; // $label will have type CommonTree
}
@header {
package asml;
import asml.walker.*;
import java.util.HashMap;
}

@members {
HashMap<String, FunctionRecord> FunctionTable = 
	new HashMap<String, FunctionRecord>();

HashMap<String, FunctionRecord> getFunctionTable(){
	return FunctionTable;
}		
}

program	:	
	(include_stmt)*(fun_decl)+;
	
include_stmt: 	
	^(INCLUDE STRING);
	
fun_decl
@init{
ArrayList<Value> formalParams = new ArrayList<Value>();
int blockIndex = 2;
}
@after{
if(FunctionTable.containsKey($name.text)){
	System.err.println("Function '" + $name.text + 
		"' cannot be declared more than once in a program.");
	System.exit(-1);
}

CommonTree blockRt = (CommonTree)$fun_decl.start.getChild(blockIndex);

int funType = Type.WAVE;
if($type.text.equals("int"))
	funType = Type.INT;
else if($type.text.equals("ampl"))
	funType = Type.AMPL;
else if($type.text.equals("float"))
	funType = Type.FLOAT;
else if($type.text.equals("freq"))
	funType = Type.FREQ;
else if($type.text.equals("time"))
	funType = Type.TIME;

FunctionRecord newFunRec = null;
try{
newFunRec = new FunctionRecord(
	funType, $name.text, formalParams, blockRt);
}catch(ASMLSemanticException e){
	System.err.println(e.getMessage());
	System.exit(-1);
}
	
FunctionTable.put($name.text, newFunRec);
}
:^(FUN type=TYPE name=ID (par=param 
		{formalParams.add(par); 
		 blockIndex++;})* .);
	
param returns [Value v]:
	^(PARAMRT type=TYPE name=ID){
	if($type.text.equals("int"))
		return new ASMLInteger($name.text);
	else if($type.text.equals("ampl"))
		return new ASMLAmplitude($name.text);
	else if($type.text.equals("float"))
		return new ASMLFloat($name.text);
	else if($type.text.equals("freq"))
		return new ASMLFrequency($name.text);
	else if($type.text.equals("time"))
		return new ASMLTime($name.text);
	else if($type.text.equals("wave"))
		return new ASMLWave($name.text);};
		
