/**
 * 
 */
package asml.walker;

/**
 * @author Owner
 *
 */
public class ASMLTime extends Value {
	
	protected double mValue;
	
	public ASMLTime(double aValue) {
		mType = Type.TIME;
		mValue = aValue;
		mIsInitialized = true;
	}
	
	public ASMLTime(double aValue, String aName){
		this(aValue);
		mName = aName;
		mIsStorable = true;
	}
	
	public ASMLTime(String aName){
		mType          = Type.TIME;
		mName          = aName;
		mIsInitialized = false;
		mIsStorable    = true;
	}
	

	@Override
	public Value add(Value rhs) throws ASMLSemanticException {
		if(rhs.getType() == Type.TIME)
			return new ASMLTime(mValue + ((ASMLTime)rhs).getValue());
		if(rhs.getType() == Type.STRING)
			return new ASMLString(Double.toString(mValue) + "ms" +
					((ASMLString)rhs).getValue());
		
		return super.add(rhs);
	}

	@Override
	public Value divide(Value rhs) throws ASMLSemanticException {
		switch(rhs.getType()){
			case Type.INT:	
				return new ASMLTime(mValue / ((ASMLInteger)rhs).getValue());
			case Type.FLOAT:
				return new ASMLTime(mValue / ((ASMLFloat)rhs).getValue());
			case Type.TIME:
				return new ASMLFloat(mValue / ((ASMLTime)rhs).getValue());
			default:
				return super.divide(rhs);
				
		}
	}

	@Override
	public Value multiply(Value rhs) throws ASMLSemanticException {
		switch(rhs.getType()){
			case Type.INT:	
				return new ASMLTime(mValue * ((ASMLInteger)rhs).getValue());
			case Type.FLOAT:
				return new ASMLTime(mValue * ((ASMLFloat)rhs).getValue());
			default:
				return super.multiply(rhs);
			
		}
	}

	@Override
	public Value relate(Value rhs, String op) throws ASMLSemanticException {
		double tValue;
		if(rhs.getType() != Type.TIME)
			return super.relate(rhs,op);

		tValue = ((ASMLTime)rhs).getValue();
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
		if(rhs.getType() != Type.TIME)
			return super.subtract(rhs);
			
		return new ASMLTime(mValue - ((ASMLTime)rhs).getValue());
	}

	public double getValue() {
		return mValue;
	}
}
