/**
 * 
 */
package asml.walker;

/**
 * @author Owner
 *
 */
public class Time extends Value {
	
	protected double mValue;
	
	public Time(double aValue) {
		mType = Type.TIME;
		mValue = aValue;
		mIsInitialized = true;
	}
	
	public Time(double aValue, String aName, boolean aIsStorable, boolean aIsConst){
		this(aValue);
		mName = aName;
		mIsStorable = aIsStorable;
		mIsConst = aIsConst;
	}
	
	public Time(String aName, boolean aIsConst){
		mType = Type.TIME;
		mName = aName;
		mIsConst = aIsConst;
		mIsInitialized = false;
	}
	

	@Override
	public Value add(Value rhs) throws ASMLSemanticException {
		if(rhs.getType() == Type.TIME)
			return new Time(mValue + ((Time)rhs).getValue());
		return super.add(rhs);
	}

	@Override
	public Value divide(Value rhs) throws ASMLSemanticException {
		switch(rhs.getType()){
			case Type.INT:	
				return new Time(mValue / ((Integer)rhs).getValue());
			case Type.FLOAT:
				return new Time(mValue / ((Float)rhs).getValue());
			case Type.TIME:
				return new Float(mValue / ((Time)rhs).getValue());
			default:
				return super.divide(rhs);
				
		}
	}

	@Override
	public Value multiply(Value rhs) throws ASMLSemanticException {
		switch(rhs.getType()){
			case Type.INT:	
				return new Time(mValue * ((Integer)rhs).getValue());
			case Type.FLOAT:
				return new Time(mValue * ((Float)rhs).getValue());
			default:
				return super.multiply(rhs);
			
		}
	}

	@Override
	public Value relate(Value rhs, String op) throws ASMLSemanticException {
		double tValue;
		if(rhs.getType() != Type.TIME)
			return super.relate(rhs,op);

		tValue = ((Time)rhs).getValue();
		if (op.equals("<"))
			if (mValue < tValue) return new Integer(1);
			else return new Integer(0);
		else if (op.equals("<="))
			if (mValue <= tValue) return new Integer(1);
			else return new Integer(0);
		else if (op.equals(">"))
			if (mValue > tValue) return new Integer(1);
			else return new Integer(0);
		else if (op.equals(">="))
			if (mValue >= tValue) return new Integer(1);
			else return new Integer(0);
		else if (op.equals("=="))
			if (mValue == tValue) return new Integer(1);
			else return new Integer(0);
		else if (op.equals("!="))
			if (mValue != tValue) return new Integer(1);
			else return new Integer(0);
		return super.relate(rhs, op);
	}

	@Override
	public Value subtract(Value rhs) throws ASMLSemanticException {
		if(rhs.getType() != Type.TIME)
			return super.subtract(rhs);
			
		return new Time(mValue - ((Time)rhs).getValue());
	}

	public double getValue() {
		return mValue;
	}
}
