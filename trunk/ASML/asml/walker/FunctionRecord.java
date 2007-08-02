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
	protected ArrayList<Value> mFormalParams = null;
	protected CommonTree mBlockRt          = null;
	protected SymbolTable mBottom 		   = null;
	
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
	
	//Argument handling methods
	
	public int getNumArgs(){
		return mFormalParams.size();
	}
	
	public void passParamValue(ArrayList<Value> aActualParams) throws ASMLSemanticException{
		if (aActualParams.size() != mFormalParams.size())
			throw new ASMLSemanticException("Number of arguments in call differs from " +
					"number of arguments in function declaration.");
		
		Value tFormal, tActual = null;
		for(int i=0; i<aActualParams.size(); i++){
			tFormal = mFormalParams.get(i);
			tActual = aActualParams.get(i);
			if(tActual.getType() == tFormal.getType()){
				//TODO: Resolve value.mname issues with passing params this way.
				mBottom.update(tFormal.getName(), tActual);
			}
			else
				throw new ASMLSemanticException("Type of actual argument does not match formal argument '"+
						tFormal.getName() + "'.");
		}
	}
	
	public void passParamString(ArrayList<String> aActualParams) throws ASMLSemanticException{
		if (aActualParams.size() != mFormalParams.size())
			throw new ASMLSemanticException("Number of arguments in call differs from " +
					"number of arguments in function declaration.");
		
		Value tFormal  = null; 
		String tActual = null;	
		for(int i=0; i<aActualParams.size(); i++){
			tFormal = mFormalParams.get(i);
			tActual = aActualParams.get(i);
			
			switch(tFormal.getType()){
			case Type.AMPL:
				try {
						mBottom.update(tFormal.getName(), new ASMLAmplitude(Double.valueOf(tActual), tFormal.getName(), tFormal.isConst()));
						break;
					} catch (NumberFormatException e) {
						throw new ASMLSemanticException("Type of actual argument does not match formal argument '"+
								tFormal.getName() + "'.");
					}
			case Type.FLOAT:
				try {
					mBottom.update(tFormal.getName(), new ASMLFloat(Double.valueOf(tActual), tFormal.getName(), tFormal.isConst()));
					break;
				} catch (NumberFormatException e) {
					throw new ASMLSemanticException("Type of actual argument does not match formal argument '"+
							tFormal.getName() + "'.");
				}					
			case Type.FREQ:
				try {
					mBottom.update(tFormal.getName(), new ASMLFrequency(Double.valueOf(tActual), tFormal.getName(), tFormal.isConst()));
					break;
				} catch (NumberFormatException e) {
					throw new ASMLSemanticException("Type of actual argument does not match formal argument '"+
							tFormal.getName() + "'.");
				}
			case Type.TIME:
				try {
					mBottom.update(tFormal.getName(), new ASMLTime(Double.valueOf(tActual), tFormal.getName(), tFormal.isConst()));
					break;
				} catch (NumberFormatException e) {
					throw new ASMLSemanticException("Type of actual argument does not match formal argument '"+
							tFormal.getName() + "'.");
				}
			case Type.INT:
				try {
					mBottom.update(tFormal.getName(), new ASMLInteger(Integer.valueOf(tActual), tFormal.getName(), tFormal.isConst()));
					break;
				} catch (NumberFormatException e) {
					throw new ASMLSemanticException("Type of actual argument does not match formal argument '"+
							tFormal.getName() + "'.");
				}
			case Type.WAVE:
				try {
					mBottom.update(tFormal.getName(), new ASMLWave(tActual, tFormal.getName(), tFormal.isConst()));
					break;
				} catch (NumberFormatException e) {
					throw new ASMLSemanticException("Type of actual argument does not match formal argument '"+
							tFormal.getName() + "'.");
				}
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
}
