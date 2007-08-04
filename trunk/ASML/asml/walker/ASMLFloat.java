/**
 * 
 */
package asml.walker;

/**
 * @author Frank Smith and Tim Favorite
 *
 */
public class ASMLFloat extends Value {

	/** The value representing the ASMLFloat value */
	protected double mValue;
	
	/**
	 * Constructs an ASMLFloat object based on a float value (this is a literal)
	 * Example: 2.5
	 * @param aValue the value of this ASMLFloat
	 */
	public ASMLFloat(double aValue) {
		mType = Type.FLOAT;
		mValue = aValue;
		mIsInitialized = true;
	}
	
	/**
	 * Constructs an ASMLFloat object based on a float value, a name, and a boolean
	 * representing its constancy.
	 * Example: const float a = 2.5
	 * @param aValue the value of this ASMLFloat
	 * @param aName the name of this ASMLFloat
	 */
	public ASMLFloat(double aValue, String aName){
		this(aValue);
		mName = aName;
		mIsStorable = true;
	}
	
	/**
	 * Constructs an ASMLFloat object based on a name and a boolean representing
	 * its constancy (declaration)
	 * Example: float a
	 * 
	 * @param aName the name of this ASMLFloat
	 * @param aIsConst
	 */
	public ASMLFloat(String aName){
		mType = Type.FLOAT;
		mName = aName;
		mIsInitialized = false;
		mIsStorable = true;
	}
	

	/**
	 * Adds rhs value to this ASMLFloat. Only ints, floats, strings, and waves may be added.
	 * In case of a string rhs type it concatenates the value of this ASMLFloat to the rhs
	 * string. In case of a wave rhs type it shifts the wave up by this ASMLFloat's value.
	 * @param rhs the right hand side of the add operation
	 * @return the result of the add expression
	 */
	public Value add(Value rhs) throws ASMLSemanticException {
		switch(rhs.getType()){
			case Type.INT:	
				return new ASMLFloat(mValue + ((ASMLInteger)rhs).getValue());
			case Type.FLOAT:
				return new ASMLFloat(mValue + ((ASMLFloat)rhs).getValue());
			case Type.STRING:
				return new ASMLString(Double.toString(mValue) + 
						((ASMLString)rhs).getValue());
			case Type.WAVE:
				return ((ASMLWave)rhs).add(this);
			default:
				return super.add(rhs);
				
		}
	}

	/**
	 * Does a division operation - only ints and floats allowed for rhs value.
	 * @param rhs the right hand side of the operation
	 * @return the result of the operation
	 */
	public Value divide(Value rhs) throws ASMLSemanticException {
		switch(rhs.getType()){
			case Type.INT:	
				return new ASMLFloat(mValue / ((ASMLInteger)rhs).getValue());
			case Type.FLOAT:
				return new ASMLFloat(mValue / ((ASMLFloat)rhs).getValue());
			default:
				return super.add(rhs);
				
		}
	}

	/**
	 * Does a multiplication operation - ints, floats, frequencies, times, amplitudes, and 
	 * waves are allowed as right hand side operands. For waves, this is a multiplication 
	 * of its amplitude by a factor of this ASMLFloat's value.
	 * @param rhs The right hand side operand
	 * @return The result of the multiplication
	 */
	public Value multiply(Value rhs) throws ASMLSemanticException {
		switch(rhs.getType()){
			case Type.INT:	
				return new ASMLFloat(mValue * ((ASMLInteger)rhs).getValue());
			case Type.FLOAT:
				return new ASMLFloat(mValue * ((ASMLFloat)rhs).getValue());
			case Type.FREQ:
				return new ASMLFrequency(mValue * ((ASMLFrequency)rhs).getValue());
			case Type.TIME:
				return new ASMLTime(mValue * ((ASMLTime)rhs).getValue());
			case Type.AMPL:
				return new ASMLAmplitude(mValue * ((ASMLAmplitude)rhs).getValue());
			case Type.WAVE:
				ASMLWave tW = (ASMLWave) rhs;
				return tW.multiply(this);
			default:
				return super.multiply(rhs);
			
		}
	}

	/**
	 * Negates this ASMLFloat's value.
	 * @return the negative of this ASMLFloat
	 */
	public Value negate() throws ASMLSemanticException {
		return new ASMLFloat(-mValue);
	}

	/**
	 * Does a relational operation on this ASMLFloat and another number
	 * @param rhs the right hand side of the relational operation (must be int or float)
	 * @param op the operator (<, <=, >, >=, ==, !=)
	 * @return an ASMLInteger with a value of 0 (false) or 1 (true)
	 * @throws ASMLSemanticException if rhs was not an int or float or if operator was invalid
	 */
	public Value relate(Value rhs, String op) throws ASMLSemanticException {
		double tValue;
		switch(rhs.getType()){
			case Type.INT:	
				tValue = ((ASMLInteger)rhs).getValue();
				break;
			case Type.FLOAT:
				tValue = ((ASMLFloat)rhs).getValue();
				break;
			default:
				return super.relate(rhs,op);
		}

		if (op.equals("<"))
			if (mValue < tValue) return new ASMLInteger(1);
			else return new ASMLInteger(0);
		else if (op.equals("<="))
			if (mValue <= tValue) return new ASMLInteger(1);
			else return new ASMLInteger(0);
		else if (op.equals(">"))
			if (mValue > tValue) return new ASMLInteger(1);
			else return new ASMLInteger(0);
		else if (op.equals(">="))
			if (mValue >= tValue) return new ASMLInteger(1);
			else return new ASMLInteger(0);
		else if (op.equals("=="))
			if (mValue == tValue) return new ASMLInteger(1);
			else return new ASMLInteger(0);
		else if (op.equals("!="))
			if (mValue != tValue) return new ASMLInteger(1);
			else return new ASMLInteger(0);
		return super.relate(rhs, op);
	}

	/**
	 * Performs a subtraction operation
	 * @param rhs the right hand side of the operation (must be int or float)
	 * @return the result of the subtraction
	 * @throws ASMLSemanticException if rhs was not an int or float
	 */
	public Value subtract(Value rhs) throws ASMLSemanticException {
		switch(rhs.getType()){
			case Type.INT:	
				return new ASMLFloat(mValue - ((ASMLInteger)rhs).getValue());
			case Type.FLOAT:
				return new ASMLFloat(mValue - ((ASMLFloat)rhs).getValue());
			default:
				return super.subtract(rhs);
			
		}
	}

	/**
	 * Get the value of this ASMLFloat
	 * @return the value of this ASMLFloat
	 */
	public double getValue() {
		return mValue;
	}

}
