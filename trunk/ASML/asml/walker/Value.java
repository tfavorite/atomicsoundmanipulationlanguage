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
	protected String mName        = null;
	protected boolean mIsStorable = false;
	protected boolean mIsConst    = false;
	protected boolean mIsInitialized = false;
	
	//public accessors
	public int getType(){return mType;}
	public boolean isStorable(){return mIsStorable;}
	public boolean isConst(){return mIsConst;}
	public String getName() {return mName;}
	public boolean isInitialized() {return mIsInitialized;}
	
	//TODO: implement static method to take string and spit out value for NUMBER token
	
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
	
	/**
	 * Carries out a logical operation (logical 'and' or logical 'or')
	 * with the accessed Value as the LHS of the operation, and the
	 * formal parameter as the RHS of the operation
	 * @param rhs a value to be tested logically
	 * @param op the logical operator being used: '&&' or '||'
	 * @return an ASMLInteger of 1 if the operation results in true 
	 * or 0 if the operation results in false*/
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
	
	/**
	 * This method is intended to be used on the NUMBER token in the tree walker.  For this
	 * reason it does not need to input check as it is impossible for a number defying
	 * the rules below to be assigned to the NUMBER token.
	 * @param val The string representation of a legal Integer, Float, Frequency, Amplitude,
	 * or Time in the ASML language.
	 * @return The value of the string cast into its appropriate ASML wrapper type.
	 * */
	public static final Value valueOf(String val){
		val = val.trim();
		if(val.endsWith("Hz"))
			return new ASMLFrequency(Double.valueOf(val.substring(0,val.length()-2)));
		if(val.endsWith("ms"))
			return new ASMLTime(Double.valueOf(val.substring(0,val.length()-2)));
		if(val.endsWith("a"))
			return new ASMLAmplitude(Double.valueOf(val.substring(0,val.length()-1)));
		if(val.contains("."))
			return new ASMLFloat(Double.valueOf(val));

		return new ASMLInteger(Integer.valueOf(val));
	}
}
