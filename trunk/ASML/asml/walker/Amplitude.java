/**
 * 
 */
package asml.walker;

/**
 * @author Owner
 *
 */
public class Amplitude extends Value {
	
	protected double mValue;
	
	public Amplitude(double aValue) {
		mType = Type.AMPL;
		mValue = aValue;
		mIsInitialized = true;
	}
	
	public Amplitude(double aValue, String aName, boolean aIsStorable, boolean aIsConst){
		this(aValue);
		mName = aName;
		mIsStorable = aIsStorable;
		mIsConst = aIsConst;
	}
	
	public Amplitude(String aName, boolean aIsConst){
		mType = Type.AMPL;
		mName = aName;
		mIsConst = aIsConst;
		mIsInitialized = false;
	}
	

	@Override
	public Value add(Value rhs) throws ASMLSemanticException {
		if(rhs.getType() == Type.AMPL)
			return new Amplitude(mValue + ((Amplitude)rhs).getValue());
		
		return super.add(rhs);
	}

	@Override
	public Value divide(Value rhs) throws ASMLSemanticException {
		switch(rhs.getType()){
			case Type.INT:	
				return new Amplitude(mValue / ((Integer)rhs).getValue());
			case Type.FLOAT:
				return new Amplitude(mValue / ((Float)rhs).getValue());
			case Type.AMPL:
				return new Amplitude(mValue / ((Amplitude)rhs).getValue());
			default:
				return super.divide(rhs);
				
		}
	}

	@Override
	public Value multiply(Value rhs) throws ASMLSemanticException {
		switch(rhs.getType()){
			case Type.INT:	
				return new Amplitude(mValue * ((Integer)rhs).getValue());
			case Type.FLOAT:
				return new Amplitude(mValue * ((Float)rhs).getValue());
			case Type.AMPL:
				return new Amplitude(mValue * ((Amplitude)rhs).getValue());
			default:
				return super.multiply(rhs);
			
		}
	}

	@Override
	public Value relate(Value rhs, String op) throws ASMLSemanticException {
		double tValue;
		if(rhs.getType() != Type.AMPL)
			return super.relate(rhs,op);

		tValue = ((Amplitude)rhs).getValue();
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
		if(rhs.getType() != Type.AMPL)
			return super.subtract(rhs);
			
		return new Amplitude(mValue - ((Amplitude)rhs).getValue());
	}
	
	public double getValue() {
		return mValue;
	}
}
