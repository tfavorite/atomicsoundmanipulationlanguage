/**
 * 
 */
package asml.walker;

/**
 * This class represents the Integer type.
 * It extends Value and all applicable operations.
 * @author Frank A. Smith & Tim Favorite
 *
 */
public class Integer extends Value {

	/**
	 * 
	 */
	
	protected int mValue;
	
	public Integer(int aValue) {
		mType = Type.INT;
		mValue = aValue;
		mIsInitialized = true;
	}
	
	public Integer(int aValue, String aName, boolean aIsConst){
		this(aValue);
		mName = aName;
		mIsStorable = true;
		mIsConst = aIsConst;
	}
	
	public Integer(String aName, boolean aIsConst){
		mType = Type.INT;
		mName = aName;
		mIsConst = aIsConst;
		mIsInitialized = false;
	}
	

	@Override
	public Value add(Value rhs) throws ASMLSemanticException {
		switch(rhs.getType()){
			case Type.INT:	
				return new Integer(mValue + ((Integer)rhs).getValue());
			case Type.FLOAT:
				return new Float(mValue + ((Float)rhs).getValue());
			default:
				return super.add(rhs);
				
		}
	}

	@Override
	public Value divide(Value rhs) throws ASMLSemanticException {
		switch(rhs.getType()){
			case Type.INT:	
				return new Integer(mValue / ((Integer)rhs).getValue());
			case Type.FLOAT:
				return new Float(mValue / ((Float)rhs).getValue());
			default:
				return super.divide(rhs);
				
		}
	}

	@Override
	/*
	 * Zeroes are false, nonzeroes are true.
	 */
	public Value logic(Value rhs, String op) throws ASMLSemanticException {
		if (rhs.getType() == Type.INT){
			if (op.equals("||")){				
				if (mValue == 0 && ((Integer)rhs).getValue() == 0)
					return new Integer(0);
				else return new Integer(1);
			}
			else if (op.equals("&&")){
				if (mValue == 1 && ((Integer)rhs).getValue() == 1)
					return new Integer(1);
				else return new Integer(0);
			} 	
		}
		return super.logic(rhs, op);
	}

	@Override
	public Value mod(Value rhs) throws ASMLSemanticException {
		if (rhs.getType() == Type.INT){
			return new Integer(mValue % ((Integer)rhs).getValue());
		}
		return super.mod(rhs);
	}

	@Override
	public Value multiply(Value rhs) throws ASMLSemanticException {
		switch(rhs.getType()){
			case Type.INT:	
				return new Integer(mValue * ((Integer)rhs).getValue());
			case Type.FLOAT:
				return new Float(mValue * ((Float)rhs).getValue());
			case Type.FREQ:
				return new Frequency(mValue * ((Frequency)rhs).getValue());
			case Type.TIME:
				return new Time(mValue * ((Time)rhs).getValue());
			case Type.AMPL:
				return new Amplitude(mValue * ((Amplitude)rhs).getValue());
			case Type.WAVE:
				Wave tW = (Wave) rhs;
				return tW.multiply(this);
			default:
				return super.multiply(rhs);
			
		}
	}

	@Override
	public Value negate() throws ASMLSemanticException {
		return new Integer(-mValue);
	}

	@Override
	public Value not() throws ASMLSemanticException {
		if (mValue == 0) return new Integer(1);
		else return new Integer(0);
	}

	@Override
	public Value relate(Value rhs, String op) throws ASMLSemanticException {
		double tValue;
		switch(rhs.getType()){
			case Type.INT:	
				tValue = ((Integer)rhs).getValue();
				break;
			case Type.FLOAT:
				tValue = ((Float)rhs).getValue();
				break;
			default:
				return super.relate(rhs,op);
		}

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
		switch(rhs.getType()){
			case Type.INT:	
				return new Integer(mValue - ((Integer)rhs).getValue());
			case Type.FLOAT:
				return new Float(mValue - ((Float)rhs).getValue());
			default:
				return super.subtract(rhs);
			
		}
	}

	public int getValue() {
		return mValue;
	}

}
