/**
 * 
 */
package asml.walker;

import java.util.*;

/**
 * @author Frank A. Smith and Tim Favorite
 *
 */
public class ASMLControl {
	Stack<FunctionRecord> mActivationRecord      = null;
	HashMap<String, FunctionRecord> mFunctionMap = null;
	ArrayList<String> mCmdLnArgs                 = null;
	
	public ASMLControl(HashMap<String, FunctionRecord> aFunctionMap){
		this(aFunctionMap, new ArrayList<String>());
	}
	
	public ASMLControl(HashMap<String, FunctionRecord> aFunctionMap,
			ArrayList<String> aCmdLnArgs){
		mFunctionMap = aFunctionMap;
		mCmdLnArgs   = aCmdLnArgs;
		mActivationRecord = new Stack<FunctionRecord>();
	}
	
	public void doCallMain() throws ASMLSemanticException{
		if(!mFunctionMap.containsKey("main"))
			throw new ASMLSemanticException("There is no main function and therefore program" +
					"cannot be run.");
		FunctionRecord tMain = mFunctionMap.get("main");
		tMain.passParamString(mCmdLnArgs);
		mActivationRecord.push(tMain);
		/* TODO here we need to push the block onto the antlrinputstream
		 * TODO need to pass in input stream somehow (through set perhaps)
		 *  */
		
	}
	
	public void doCallFunction(String name, ArrayList<Value> aActualParams){
		
	}
	
	public void doDeclare(String aName, String aType, Value aVal){
		
	}
	
	public void enterScope() throws ASMLSemanticException {
		if(mActivationRecord.empty()) 
			throw new ASMLSemanticException("Activation Record is currently empty.");
		mActivationRecord.peek().enterScope();
	}
	
	public void exitScope() throws ASMLSemanticException{
		if(mActivationRecord.empty()) 
			throw new ASMLSemanticException("Activation Record is currently empty.");
		mActivationRecord.peek().exitScope();
	}
}
