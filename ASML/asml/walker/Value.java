/**
 * 
 */
package asml.walker;

/**
 * This is the parent class for an abstraction of every major type
 * that is used by ASML.  Value is the return type of all expressions.
 * Children of Value are expected to implement the way their individual
 * type handles various operations (e.g. addition, multiplication). 
 * @author Frank A. Smith & Tim Favorite
 *
 */
public abstract class Value {
	protected int mType;
	protected ASMLString mName        = null;
	protected boolean mIsStorable = false;
	protected boolean mIsConst    = false;
	protected boolean mIsInitialized = false;
	
	//public accessors
	public int getType(){return mType;}
	public boolean isStorable(){return mIsStorable;}
	public boolean isConst(){return mIsConst;}
	public ASMLString getName() {return mName;}
	public boolean isInitialized() {return mIsInitialized;}
	
	public Value add(Value rhs) throws ASMLSemanticException{
		throw new ASMLSemanticException("Illegal Operation: add");
	}
	
	public Value subtract(Value rhs) throws ASMLSemanticException{
		throw new ASMLSemanticException("Illegal Operation: subtract");
	}
	
	public Value multiply(Value rhs) throws ASMLSemanticException{
		throw new ASMLSemanticException("Illegal Operation: multiply");
	}
	
	public Value divide(Value rhs) throws ASMLSemanticException{
		throw new ASMLSemanticException("Illegal Operation: divide");
	}
	
	public Value mod(Value rhs) throws ASMLSemanticException{
		throw new ASMLSemanticException("Illegal Operation: mod");
	}
	
	public Value relate(Value rhs, String op) throws ASMLSemanticException{
		throw new ASMLSemanticException("Illegal Operation: '" + op + "'");
	}
	
	public Value logic(Value rhs, String op) throws ASMLSemanticException{
		throw new ASMLSemanticException("Illegal Operation: '" + op + "'");
	}
	
	public Value not() throws ASMLSemanticException{
		throw new ASMLSemanticException("Illegal Operation: '!'");
	}
	
	public Value negate() throws ASMLSemanticException{
		throw new ASMLSemanticException("Illegal Operation: 'negative'");
	}
	
	public Value amplof() throws ASMLSemanticException{
		throw new ASMLSemanticException("Illegal Operation: amplof");
	}
	
	public Value at(Value rhs) throws ASMLSemanticException{
		throw new ASMLSemanticException("Illegal Operation: at");
	}
	
	public Value at(Value rhs1, Value rhs2) throws ASMLSemanticException{
		throw new ASMLSemanticException("Illegal Operation: at");
	}
	
	public Value assign(Value rhs) throws ASMLSemanticException{
		throw new ASMLSemanticException("Illegal Operation: assignment");
	}
}
