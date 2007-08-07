/**
 * 
 */
package asml.walker;

import java.util.*;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import asml.ASMLWalker;
import asml.walker.streams.SubwaveFloatAudioInputStream;

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
	
	public Value doCallFunction(String name, ArrayList<Value> aActualParams) throws ASMLSemanticException{
		if(!mFunctionMap.containsKey(name))
			throw new ASMLSemanticException("There is no " + name + " function.");
		FunctionRecord tFun = mFunctionMap.get(name);
		tFun.passParamValue(aActualParams);
		mActivationRecord.push(tFun);
		mTNStream.push(mTNStream.getNodeIndex(tFun.getBlockRt()));
		try {
			mWalker.block();
		} catch (RecognitionException e) {
			throw new ASMLSemanticException(e.getMessage());
		}
		mTNStream.pop();
		mActivationRecord.pop();
		return tFun.getRetVal();
	}	
	
	public Value doAssign(Value aLHS, Value aRHS) throws ASMLSemanticException{
		if (aLHS.getType() != aRHS.getType())
			throw new ASMLSemanticException("Type of lhs value does not match"+
			" type of rhs value.");
		if (!aLHS.isStorable())
			throw new ASMLSemanticException("Left hand value is not storable.");
		
		Value tVal = null;
		String tName = aLHS.getName();
		
		if(aRHS.getType() == Type.WAVE && ((ASMLWave)aRHS).isAtResult()){
			ASMLWave tWave = (ASMLWave)aRHS;
			if(tWave.getEndFreq().getValue() < tWave.getStartFreq().getValue() || 
					tWave.getEndTime().getValue() < tWave.getStartTime().getValue())
						throw new ASMLSemanticException("Second argument must be greater than or equal to first argument in at expression!");
			
			if(tWave.getStartFreq().getValue() > -1 && tWave.getStartTime().getValue() > -1)
				aRHS = tWave.at(tWave.getStartFreq(), tWave.getEndFreq()).at(tWave.getStartTime(), tWave.getEndTime());
			else if (tWave.getStartFreq().getValue() > -1)
				aRHS = tWave.at(tWave.getStartFreq(), tWave.getEndFreq());
			else if (tWave.getStartTime().getValue() > -1)
				aRHS = tWave.at(tWave.getStartTime(), tWave.getEndTime());
		}
		switch(aLHS.getType()){
		case Type.INT:		tVal = new ASMLInteger(((ASMLInteger)aRHS).getValue(), tName);
							break;
		case Type.FLOAT:	tVal = new ASMLFloat(((ASMLFloat)aRHS).getValue(), tName);
							break;
		case Type.AMPL:		tVal = new ASMLAmplitude(((ASMLAmplitude)aRHS).getValue(), tName);
							break;
		case Type.FREQ:		tVal = new ASMLFrequency(((ASMLFrequency)aRHS).getValue(), tName);
							break;
		case Type.TIME:		tVal = new ASMLTime(((ASMLTime)aRHS).getValue(), tName);
							break;
		case Type.WAVE:		if (((ASMLWave)aLHS).isAtResult()){
								ASMLWave tWave = (ASMLWave)aLHS;
								if (tWave.getStartFreq().getValue() > -1)
									System.out.println("At expressions on left hand side of "+
											"expressions are not currently supported, at will be ignored.");
								if (tWave.getEndTime().getValue() < tWave.getStartTime().getValue()){
									throw new ASMLSemanticException("Second argument must be greater than or equal to first argument in at expression!");
								} else if (tWave.getStartTime().getValue() > -1){
									tVal = new ASMLWave(new SubwaveFloatAudioInputStream(tWave.getValue().getFormat(), tWave.getValue(), ((ASMLWave)aRHS).getValue(), 
											tWave.getStartTime().getValue(), tWave.getEndTime().getValue()));
								}
							}
							else tVal = new ASMLWave(((ASMLWave)aRHS).getValue(), tName);
		}
		
		editSymbol(tVal);
		return tVal;
	}
	
	public void doDeclare(String aName, String aType, Value aVal) throws ASMLSemanticException{
		Value tVal = null;
		if (Type.getType(aType) != aVal.getType())
			throw new ASMLSemanticException("Type of assigned value does not match"+
					" type declarator.");
		
		switch(Type.getType(aType)){
		case Type.INT:		tVal = new ASMLInteger(((ASMLInteger)aVal).getValue(), aName);
							break;
		case Type.FLOAT:	tVal = new ASMLFloat(((ASMLFloat)aVal).getValue(), aName);
							break;
		case Type.AMPL:		tVal = new ASMLAmplitude(((ASMLAmplitude)aVal).getValue(), aName);
							break;
		case Type.FREQ:		tVal = new ASMLFrequency(((ASMLFrequency)aVal).getValue(), aName);
							break;
		case Type.TIME:		tVal = new ASMLTime(((ASMLTime)aVal).getValue(), aName);
							break;
		case Type.WAVE:		tVal = new ASMLWave((ASMLWave)aVal, aName);
		}
		
		addSymbol(tVal);
	}
	
	public void doDeclare(String aName, String aType) throws ASMLSemanticException{
		Value tVal = null;
		
		switch(Type.getType(aType)){
		case Type.INT:		tVal = new ASMLInteger(aName);
							break;
		case Type.FLOAT:	tVal = new ASMLFloat(aName);
							break;
		case Type.AMPL:		tVal = new ASMLAmplitude(aName);
							break;
		case Type.FREQ:		tVal = new ASMLFrequency(aName);
							break;
		case Type.TIME:		tVal = new ASMLTime(aName);
							break;
		case Type.WAVE:		tVal = new ASMLWave(aName);
		}
		
		addSymbol(tVal);
	}
	
	/**
	 * The pre-condition for doWhile is that the while condition is initially valid.  That
	 * is, the aExpr is tested in the walker first and this function is only called if it
	 * is true (non-zero).
	 * We must also know that aExpr evaluates to an integer.  That is something that must
	 * be checked in the walker.
	 * @param aExpr Pointer to the expr subtree that is checked with each loop.  Must
	 * evaluate to an integer.
	 * @param aBlock Pointer to the block subtree that is executed with every loop
	 * @throws Exception 
	*/
	public void doWhile(CommonTree aExpr, CommonTree aBlock) throws Exception{
		ASMLInteger tVal = null;
		
		do{
			mTNStream.push(mTNStream.getNodeIndex(aBlock));
			mWalker.block();
			mTNStream.pop();
			
			//return has been called
			if(isCurrentFunctionLocked())
				break;
			
			mTNStream.push(mTNStream.getNodeIndex(aExpr));
			tVal = (ASMLInteger) mWalker.expr();
			mTNStream.pop();
		}while(tVal.getValue() != 0);
	}
	
	/**
	 * The pre-condition for doFor is that the while condition is initially valid.  That
	 * is, the aExpr is tested in the walker first and this function is only called if it
	 * is true (non-zero).
	 * We must also know that aExpr evaluates to an integer.  That is something that must
	 * be checked in the walker.
	 * @param aCheck Pointer to the expr subtree that is checked with each loop.  Must
	 * evaluate to an integer.
	 * @param aUpdate Pointer to the expr subtree that is executed at the very end of
	 * each loop.
	 * @param aBlock Pointer to the block subtree that is executed with every loop
	 * @throws Exception 
	*/
	public void doFor(CommonTree aCheck, CommonTree aUpdate, CommonTree aBlock) 
		throws Exception{
		ASMLInteger tVal = null;
		
		do{
			mTNStream.push(mTNStream.getNodeIndex(aBlock));
			mWalker.block();
			mTNStream.pop();
			
			//return has been called
			if(isCurrentFunctionLocked())
				break;
			
			mTNStream.push(mTNStream.getNodeIndex(aUpdate));
			mWalker.expr();
			mTNStream.pop();

			mTNStream.push(mTNStream.getNodeIndex(aCheck));
			tVal = (ASMLInteger) mWalker.expr();
			mTNStream.pop();
		}while(tVal.getValue() != 0);
	}
	
	public void doReturn(Value aVal) throws ASMLSemanticException{
		Value tVal = null;
		
		switch(aVal.getType()){
		case Type.INT:	
			tVal = new ASMLInteger(((ASMLInteger)aVal).getValue());
			break;
		case Type.FLOAT:
			tVal = new ASMLFloat(((ASMLFloat)aVal).getValue());
			break;
		case Type.AMPL:		
			tVal = new ASMLAmplitude(((ASMLAmplitude)aVal).getValue());
			break;
		case Type.FREQ:
			tVal = new ASMLFrequency(((ASMLFrequency)aVal).getValue());
			break;
		case Type.TIME:
			tVal = new ASMLTime(((ASMLTime)aVal).getValue());
			break;
		case Type.WAVE:
			tVal = new ASMLWave(((ASMLWave)aVal).getValue());
		}
		
		mActivationRecord.peek().setRetVal(tVal);
		
		/*for(int i=0; i<mActivationRecord.peek().getScopeDepth(); i++)
			mTNStream.pop();*/
		mActivationRecord.peek().setCanExecute(false);
	}
	
	public Value doAt(ASMLWave aWave, Value aValueStart, Value aValueEnd) throws ASMLSemanticException {
		if (aValueStart.getType() == Type.FREQ && aValueEnd.getType() == Type.FREQ)
			aWave.setIsAtResult((ASMLFrequency)aValueStart, (ASMLFrequency)aValueEnd);
		else if (aValueStart.getType() == Type.TIME && aValueEnd.getType() == Type.TIME)
			aWave.setIsAtResult((ASMLTime)aValueStart, (ASMLTime)aValueEnd);
		else
			throw new ASMLSemanticException("At expression can only work with frequencies and times.");
		return aWave;
	}
	
	public Value doAt(ASMLWave aWave, Value aValue) throws ASMLSemanticException {
		return doAt(aWave, aValue, aValue);
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
	
	public void addSymbol(Value aVal) throws ASMLSemanticException{
		mActivationRecord.peek().addSymbol(aVal);
	}
	
	public void editSymbol(Value aVal) throws ASMLSemanticException{
		mActivationRecord.peek().editSymbol(aVal);
	}
	
	public Value getSymbol(String aName) throws ASMLSemanticException{
		return mActivationRecord.peek().getSymbol(aName);
	}
	
	public boolean isCurrentFunctionLocked(){
		return !mActivationRecord.peek().canExecute();
	}
}
