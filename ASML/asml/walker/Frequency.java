/**
 * 
 */
package asml.walker;

/**
 * @author Owner
 *
 */
public class Frequency extends Value {
	
	protected double mValue;
	public Frequency(double aValue) {
		mType = Type.FREQ;
		mValue = aValue;
		mIsInitialized = true;
	}
	
	public Frequency(double aValue, String aName, boolean aIsStorable, boolean aIsConst){
		this(aValue);
		mName = aName;
		mIsStorable = aIsStorable;
		mIsConst = aIsConst;
	}
	
	public Frequency(String aName, boolean aIsConst){
		mType = Type.FREQ;
		mName = aName;
		mIsConst = aIsConst;
		mIsInitialized = false;
	}
	

	@Override
	public Value add(Value rhs) throws ASMLSemanticException {
		if(rhs.getType() == Type.FREQ)
			return new Frequency(mValue + ((Frequency)rhs).getValue());
		
		return super.add(rhs);
	}

	@Override
	public Value divide(Value rhs) throws ASMLSemanticException {
		switch(rhs.getType()){
			case Type.INT:	
				return new Frequency(mValue / ((Integer)rhs).getValue());
			case Type.FLOAT:
				return new Frequency(mValue / ((Float)rhs).getValue());
			case Type.FREQ:
				return new Float(mValue / ((Frequency)rhs).getValue());
			default:
				return super.divide(rhs);
				
		}
	}

	@Override
	public Value multiply(Value rhs) throws ASMLSemanticException {
		switch(rhs.getType()){
			case Type.INT:	
				return new Frequency(mValue * ((Integer)rhs).getValue());
			case Type.FLOAT:
				return new Frequency(mValue * ((Float)rhs).getValue());
			default:
				return super.multiply(rhs);
			
		}
	}

	@Override
	public Value relate(Value rhs, String op) throws ASMLSemanticException {
		double tValue;
		if(rhs.getType() != Type.FREQ)
			return super.relate(rhs,op);

		tValue = ((Frequency)rhs).getValue();
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
		if(rhs.getType() != Type.FREQ)
			return super.subtract(rhs);
			
		return new Frequency(mValue - ((Frequency)rhs).getValue());
	}

	public double getValue() {
		return mValue;
	}
}
