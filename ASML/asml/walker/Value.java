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
	/** The Type of this Value (see Type class) */
	protected int mType;
	/** The name of this Value object. */
	protected String mName        = null;
	/** Represents whether this Value object is storable or not (is it a variable?) */
	protected boolean mIsStorable = false;
	/** Represents whether this Value object is a constant variable */
	protected boolean mIsConst    = false;
	/** Represents whether this Value object has been initialized */
	protected boolean mIsInitialized = false;
	
	//public accessors
	/**
	 * Gets the type.
	 * @return the type (see Type class)
	 */
	public int getType(){return mType;}
	/**
	 * Is this object storable?
	 * @return whether it's storable
	 */
	public boolean isStorable(){return mIsStorable;}
	/**
	 * Is this object a constant variable?
	 * @return whether it's a constant
	 */
	public boolean isConst(){return mIsConst;}
	/**
	 * Gets object's name.
	 * @return the name of this object
	 */
	public String getName() {return mName;}
	/**
	 * Has this object been initialized?
	 * @return if it's been initialized
	 */
	public boolean isInitialized() {return mIsInitialized;}
	
	/**
	 * Performs an add operation
	 * @param rhs The right hand side of the operation
	 * @return the value of the add operation
	 * @throws ASMLSemanticException if operand types were incompatible with this operation
	 */
	public Value add(Value rhs) throws ASMLSemanticException{
		throw new ASMLSemanticException("Illegal Operation: add");
	}
	
	/**
	 * Performs a subtraction operation
	 * @param rhs the right hand side of the operation
	 * @return the value of the subtraction operation
	 * @throws ASMLSemanticException if operand types were incompatible with this operation
	 */
	public Value subtract(Value rhs) throws ASMLSemanticException{
		throw new ASMLSemanticException("Illegal Operation: subtract");
	}
	
	/**
	 * Performs a multiplication operation
	 * @param rhs the right hand side of the operation
	 * @return the value of the multiplication operation
	 * @throws ASMLSemanticException if operand types were incompatible with this operation
	 */
	public Value multiply(Value rhs) throws ASMLSemanticException{
		throw new ASMLSemanticException("Illegal Operation: multiply");
	}

	/**
	 * Performs a division operation
	 * @param rhs the right hand side of the operation
	 * @return the value of the division operation
	 * @throws ASMLSemanticException if operand types were incompatible with this operation
	 */
	public Value divide(Value rhs) throws ASMLSemanticException{
		throw new ASMLSemanticException("Illegal Operation: divide");
	}
	
	/**
	 * Performs a modulus operation
	 * @param rhs the right hand side of the operation
	 * @return the value of the modulus operation
	 * @throws ASMLSemanticException if operand types were incompatible with this operation
	 */
	public Value mod(Value rhs) throws ASMLSemanticException{
		throw new ASMLSemanticException("Illegal Operation: mod");
	}
	
	/**
	 * Performs a relational expression
	 * @param rhs the right hand side of the operation
	 * @param op the operator (<, <=, >, >=, ==, !=)
	 * @return the result of the relational operation - an ASMLInteger with the value 0
	 * (false) or 1 (true)
	 * @throws ASMLSemanticException if operand types were incompatible with this operation
	 */
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
	
	/**
	 * Negates the value of this object
	 * @return the negative of this object's value
	 * @throws ASMLSemanticException if object could not be negated
	 */
	public Value negate() throws ASMLSemanticException{
		throw new ASMLSemanticException("Illegal Operation: 'negative'");
	}
	
	/**
	 * Gets the amplitude of this object's value (note: this value must be a wave)
	 * @return the amplitude of this wave
	 * @throws ASMLSemanticException if the object was not a wave
	 */
	public Value amplof() throws ASMLSemanticException{
		throw new ASMLSemanticException("Illegal Operation: amplof");
	}
	
	/**
	 * Gets a sample of this object (must be wave) at the time or frequency specified
	 * @param rhs the time or frequency being specified
	 * @return the sample of the wave
	 * @throws ASMLSemanticException if the object was not a wave
	 */
	public Value at(Value rhs) throws ASMLSemanticException{
		throw new ASMLSemanticException("Illegal Operation: at");
	}

	/**
	 * Gets a sample range of this object (must be wave) at the times or frequencies specified
	 * @param rhs the time or frequency range being specified
	 * @return the sample range of the wave
	 * @throws ASMLSemanticException if the object was not a wave
	 */
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
