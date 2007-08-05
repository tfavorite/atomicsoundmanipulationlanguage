/**
 * 
 */
package asml.walker;

import java.util.*;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import asml.ASMLWalker;

/**
 * @author Frank A. Smith and Tim Favorite
 *
 */
public class ASMLControl {
	Stack<FunctionRecord> mActivationRecord      = null;
	HashMap<String, FunctionRecord> mFunctionMap = null;
	ArrayList<String> mCmdLnArgs                 = null;
	String mInput								 = null;
	String mOutput								 = null;
	CommonTreeNodeStream mTNStream 				 = null;
	ASMLWalker mWalker							 = null;
	
//	public ASMLControl(HashMap<String, FunctionRecord> aFunctionMap, 
//			String input, String output){
//		this(aFunctionMap, new ArrayList<String>(), input, output);
//	}
	
	public ASMLControl(HashMap<String, FunctionRecord> aFunctionMap,
			ArrayList<String> aCmdLnArgs, String input, String output, ASMLWalker walker){
		mFunctionMap = aFunctionMap;
		mCmdLnArgs   = aCmdLnArgs;
		mActivationRecord = new Stack<FunctionRecord>();
		mInput = input;
		mOutput = output;
		mWalker = walker;
	}
	
	public void doCallMain() throws ASMLSemanticException{
		if(!mFunctionMap.containsKey("main"))
			throw new ASMLSemanticException("There is no main function and therefore program" +
					"cannot be run.");
		FunctionRecord tMain = mFunctionMap.get("main");
		tMain.passParamString(mCmdLnArgs);
		tMain.addSymbol(new ASMLWave("input", mInput));
		mActivationRecord.push(tMain);
		mTNStream.push(mTNStream.getNodeIndex(tMain.getBlockRt()));
		try {
			mWalker.block();
		} catch (RecognitionException e) {
			throw new ASMLSemanticException(e.getMessage());
		}
		mTNStream.pop();
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

	public void setStream(CommonTreeNodeStream stream) {
		mTNStream = stream;
	}
}
