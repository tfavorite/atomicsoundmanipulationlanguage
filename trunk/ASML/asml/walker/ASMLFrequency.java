/**
 * 
 */
package asml.walker;

/**
 * @author Owner
 *
 */
public class ASMLFrequency extends Value {
	
	/** the value of this ASMLFrequency object */
	protected double mValue;
	
	/**
	 * Constructs a non-storable ASMLFrequency object
	 * Example: 450Hz
	 * @param aValue the vale of this ASMLFrequency object
	 */
	public ASMLFrequency(double aValue) {
		mType = Type.FREQ;
		mValue = aValue;
		mIsInitialized = true;
	}
	
	/**
	 * Constructs an ASMLFrequency object with value, name, and constant specifier 
	 * (declaration and assignment)
	 * Example freq f = 450Hz
	 * @param aValue the value of this ASMLFrequency object
	 * @param aName the name of this ASMLFrequency object
	 * @param aIsConst the constant specifier of this ASMLFrequency object
	 */
	public ASMLFrequency(double aValue, String aName, boolean aIsConst){
		this(aValue);
		mName = aName;
		mIsStorable = true;
		mIsConst = aIsConst;
	}
	
	/** Constructs an ASMLFrequency object with a name (declaration)
	 * Example: freq f
	 * @param aName the name of the object
	 * @param aIsConst
	 */
	public ASMLFrequency(String aName, boolean aIsConst){
		mType = Type.FREQ;
		mName = aName;
		mIsConst = aIsConst;
		mIsInitialized = false;
		mIsStorable = true;
	}
	

	@Override
	public Value add(Value rhs) throws ASMLSemanticException {
		if(rhs.getType() == Type.FREQ)
			return new ASMLFrequency(mValue + ((ASMLFrequency)rhs).getValue());
		if(rhs.getType() == Type.STRING)
			return new ASMLString(Double.toString(mValue) + "Hz" +
					((ASMLString)rhs).getValue());
		return super.add(rhs);
	}

	@Override
	public Value divide(Value rhs) throws ASMLSemanticException {
		switch(rhs.getType()){
			case Type.INT:	
				return new ASMLFrequency(mValue / ((ASMLInteger)rhs).getValue());
			case Type.FLOAT:
				return new ASMLFrequency(mValue / ((ASMLFloat)rhs).getValue());
			case Type.FREQ:
				return new ASMLFloat(mValue / ((ASMLFrequency)rhs).getValue());
			default:
				return super.divide(rhs);
				
		}
	}

	@Override
	public Value multiply(Value rhs) throws ASMLSemanticException {
		switch(rhs.getType()){
			case Type.INT:	
				return new ASMLFrequency(mValue * ((ASMLInteger)rhs).getValue());
			case Type.FLOAT:
				return new ASMLFrequency(mValue * ((ASMLFloat)rhs).getValue());
			default:
				return super.multiply(rhs);
			
		}
	}

	@Override
	public Value relate(Value rhs, String op) throws ASMLSemanticException {
		double tValue;
		if(rhs.getType() != Type.FREQ)
			return super.relate(rhs,op);

		tValue = ((ASMLFrequency)rhs).getValue();
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

	@Override
	public Value subtract(Value rhs) throws ASMLSemanticException {
		if(rhs.getType() != Type.FREQ)
			return super.subtract(rhs);
			
		return new ASMLFrequency(mValue - ((ASMLFrequency)rhs).getValue());
	}

	/** Gets the value of this ASMLFrequency object */
	public double getValue() {
		return mValue;
	}
}
