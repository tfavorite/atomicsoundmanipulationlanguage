package asml.walker;

import java.util.ArrayList;
import java.util.Stack;
import org.antlr.runtime.tree.*;

/**
 * @author Frank A Smith and Tim Favorite
 * */
public class FunctionRecord {
	protected int mType;
	protected String mName  = null;
	protected Value mRetVal = null;
	
	protected Stack<SymbolTable> mSTStack  = null;
	protected ArrayList<Value> mFormalArgs = null;
	protected CommonTree mBlockRt          = null;
	
	public FunctionRecord(int aType, String aName, 
			ArrayList<Value> aFormalArgs, CommonTree aBlockRt){
		
	}
	
	//Argument handling methods
	
	public int getNumArgs(){
		return -1;
	}
	
	public void passParamString(ArrayList<Value> aActualParams) throws ASMLSemanticException{
		
	}
	
	public void passParamValue(ArrayList<String> aActualParams) throws ASMLSemanticException{
		
	}
	
	//Value get/set

	public Value getRetVal() {
		return mRetVal;
	}

	public void setRetVal(Value aRetVal) throws ASMLSemanticException {
		if(mType != aRetVal.getType())
			throw new ASMLSemanticException("Type mismatch, function with type " + 
					mType + " cannot return type " + aRetVal.getType());
		mRetVal = aRetVal;
	}
	
	//SymbolTable Handling methods
}
