/**
 * 
 */
package asml.walker;

/**
 * @author Owner
 *
 */
public class Float extends Value {

	protected double mValue;
	
	public Float(double aValue) {
		mType = Type.FLOAT;
		mValue = aValue;
		mIsInitialized = true;
	}
	
	public Float(double aValue, String aName, boolean aIsStorable, boolean aIsConst){
		this(aValue);
		mName = aName;
		mIsStorable = aIsStorable;
		mIsConst = aIsConst;
	}
	
	public Float(String aName, boolean aIsConst){
		mType = Type.FLOAT;
		mName = aName;
		mIsConst = aIsConst;
		mIsInitialized = false;
	}
	

	@Override
	public Value add(Value rhs) throws ASMLSemanticException {
		switch(rhs.getType()){
			case Type.INT:	
				return new Float(mValue + ((Integer)rhs).getValue());
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
				return new Float(mValue / ((Integer)rhs).getValue());
			case Type.FLOAT:
				return new Float(mValue / ((Float)rhs).getValue());
			default:
				return super.add(rhs);
				
		}
	}

	@Override
	public Value multiply(Value rhs) throws ASMLSemanticException {
		switch(rhs.getType()){
			case Type.INT:	
				return new Float(mValue * ((Integer)rhs).getValue());
			case Type.FLOAT:
				return new Float(mValue * ((Float)rhs).getValue());
			case Type.FREQUENCY:
				return new Frequency(mValue * ((Frequency)rhs).getValue());
			case Type.TIME:
				return new Time(mValue * ((Time)rhs).getValue());
			case Type.AMPLITUDE:
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
		return new Float(-mValue);
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
				return new Float(mValue - ((Integer)rhs).getValue());
			case Type.FLOAT:
				return new Float(mValue - ((Float)rhs).getValue());
			default:
				return super.subtract(rhs);
			
		}
	}

	public double getValue() {
		return mValue;
	}

}
