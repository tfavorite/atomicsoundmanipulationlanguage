package asml.walker;

import java.util.ArrayList;
import java.util.Stack;
import org.antlr.runtime.tree.*;

/**
 * @author Frank A Smith and Tim Favorite
 * */

//TODO Remove anything to do with scope depth.  Doesn't work!
public class FunctionRecord {
	protected int mType;
	protected String mName  = null;
	protected Value mRetVal = null;
	
	protected Stack<SymbolTable> mSTStack    = null;
	protected ArrayList<Value> mFormalParams = null;
	
	protected CommonTree mBlockRt = null;
	protected SymbolTable mBottom = null;
	protected boolean mCanExecute = true;
	
	public FunctionRecord(int aType, String aName, 
			ArrayList<Value> aFormalArgs, CommonTree aBlockRt) throws ASMLSemanticException{
		mType = aType;
		mName = aName;
		mFormalParams = aFormalArgs;
		mBlockRt = aBlockRt;
		mRetVal = new ASMLError(aName + " failed on call");
		
		mSTStack = new Stack<SymbolTable>();
		SymbolTable st = new SymbolTable();
		for(int i=0; i<aFormalArgs.size(); i++){
			st.declare(mFormalParams.get(i));
		}
		mSTStack.push(st);
		mBottom = st;
	}
	
	/*
	 * Because this is a copy constructor, I'll just use direct references to the copied
	 * FunctionRecords protected fields.  I think this is a legitimate use of the new
	 * functionality of protected Java members.
	 * This still uses a lot of references, but the constants in here should never get
	 * changed.  The most important features are resetting the symbol table, return
	 * value and mCanExecute, which should all happen.*/
	public FunctionRecord(FunctionRecord aOrig) throws ASMLSemanticException{
		mType = aOrig.mType;
		mName = aOrig.mName;
		mFormalParams = aOrig.mFormalParams;
		mBlockRt = aOrig.mBlockRt;
		mRetVal = new ASMLError(mName + " failed on call");
		
		mSTStack = new Stack<SymbolTable>();
		SymbolTable st = new SymbolTable();
		for(int i=0; i<mFormalParams.size(); i++){
			st.declare(mFormalParams.get(i));
		}
		mSTStack.push(st);
		mBottom = st;
	}
	
	//Argument handling methods
	
	public int getNumArgs(){
		return mFormalParams.size();
	}
	
	public void passParamValue(ArrayList<Value> aActualParams) throws ASMLSemanticException{
		if (aActualParams.size() != mFormalParams.size())
			throw new ASMLSemanticException("Number of arguments in call differs from " +
					"number of arguments in function declaration.  Call to function "+
					mName+".");
		
		Value tFormal, tActual = null;
		for(int i=0; i<aActualParams.size(); i++){
			tFormal = mFormalParams.get(i);
			tActual = aActualParams.get(i);
			if(!tActual.isInitialized())
				throw new ASMLSemanticException("Cannot assign uninitialized actual argument to formal argument '"
						+tFormal.getName()+"'.");
			if(tActual.getType() == tFormal.getType()){
				String tFormalName = tFormal.getName();
				switch(tActual.getType()){
					case Type.INT:
					{
						ASMLInteger tVal = (ASMLInteger)tActual;
						mBottom.update(tFormalName, new ASMLInteger(tVal.getValue(), tFormalName));
						break;
					}
					case Type.FLOAT:
					{
						ASMLFloat tVal = (ASMLFloat)tActual;
						mBottom.update(tFormalName, new ASMLFloat(tVal.getValue(), tFormalName));
						break;
					}
					case Type.AMPL:
					{
						ASMLAmplitude tVal = (ASMLAmplitude)tActual;
						mBottom.update(tFormalName, new ASMLAmplitude(tVal.getValue(), tFormalName));
						break;
					}
					case Type.FREQ:
					{
						ASMLFrequency tVal = (ASMLFrequency)tActual;
						mBottom.update(tFormalName, new ASMLFrequency(tVal.getValue(), tFormalName));
						break;
					}
					case Type.TIME:
					{
						ASMLTime tVal = (ASMLTime)tActual;
						mBottom.update(tFormalName, new ASMLTime(tVal.getValue(), tFormalName));
						break;
					}
					case Type.WAVE:
					{
						ASMLWave tVal = (ASMLWave)tActual;
						mBottom.update(tFormalName, new ASMLWave(tVal.getValue(), tFormalName));
						break;
					}				
				}
			}
			else
				throw new ASMLSemanticException("Type of actual argument does not match formal argument '"+
						tFormal.getName() + "'.");
		}
	}
	
	public void passParamString(ArrayList<String> aActualParams) throws ASMLSemanticException{
		if (aActualParams.size() != mFormalParams.size())
			throw new ASMLSemanticException("Number of arguments in call differs from " +
					"number of arguments in function declaration.  Call to function "+
					mName+".");
		
		Value tFormal  = null; 
		String tActual = null;	
		for(int i=0; i<aActualParams.size(); i++){
			tFormal = mFormalParams.get(i);
			tActual = aActualParams.get(i);
			
			switch(tFormal.getType()){
			case Type.AMPL:
				try {
						mBottom.update(tFormal.getName(), new ASMLAmplitude(Double.valueOf(tActual), tFormal.getName()));
						break;
					} catch (NumberFormatException e) {
						throw new ASMLSemanticException("Type of actual argument does not match formal argument '"+
								tFormal.getName() + "'.");
					}
			case Type.FLOAT:
				try {
					mBottom.update(tFormal.getName(), new ASMLFloat(Double.valueOf(tActual), tFormal.getName()));
					break;
				} catch (NumberFormatException e) {
					throw new ASMLSemanticException("Type of actual argument does not match formal argument '"+
							tFormal.getName() + "'.");
				}					
			case Type.FREQ:
				try {
					mBottom.update(tFormal.getName(), new ASMLFrequency(Double.valueOf(tActual), tFormal.getName()));
					break;
				} catch (NumberFormatException e) {
					throw new ASMLSemanticException("Type of actual argument does not match formal argument '"+
							tFormal.getName() + "'.");
				}
			case Type.TIME:
				try {
					mBottom.update(tFormal.getName(), new ASMLTime(Double.valueOf(tActual), tFormal.getName()));
					break;
				} catch (NumberFormatException e) {
					throw new ASMLSemanticException("Type of actual argument does not match formal argument '"+
							tFormal.getName() + "'.");
				}
			case Type.INT:
				try {
					mBottom.update(tFormal.getName(), new ASMLInteger(Integer.valueOf(tActual), tFormal.getName()));
					break;
				} catch (NumberFormatException e) {
					throw new ASMLSemanticException("Type of actual argument does not match formal argument '"+
							tFormal.getName() + "'.");
				}
			case Type.WAVE:
				ASMLWave wave = ASMLWave.createWaveFromFile(tActual, tFormal.getName());
//				wave.mName = tFormal.getName();
				mBottom.update(tFormal.getName(), wave);
				break;				
			default:
				throw new ASMLSemanticException("Unknown excecption reached when passing parameters to function '"+
						mName + ".'");
			}// end switch
		}
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
	
	//Get Block root

	public CommonTree getBlockRt() {
		return mBlockRt;
	}	
	
	//SymbolTable Handling methods
	
	public void enterScope(){
		SymbolTable st = new SymbolTable(mSTStack.peek());
		mSTStack.push(st);
	}
	
	public void exitScope(){
		mSTStack.pop();
	}
	
	public void addSymbol(Value aVal)throws ASMLSemanticException{
		mSTStack.peek().declare(aVal);
	}
	
	public void editSymbol(Value aVal)throws ASMLSemanticException{
		mSTStack.peek().update(aVal);
	}
	
	public Value getSymbol(String aName)throws ASMLSemanticException{
		return mSTStack.peek().retrieve(aName);
	}

	public boolean canExecute() {
		return mCanExecute;
	}

	public void setCanExecute(boolean canExecute) {
		mCanExecute = canExecute;
	}

	public String getName() {
		return mName;
	}
}
