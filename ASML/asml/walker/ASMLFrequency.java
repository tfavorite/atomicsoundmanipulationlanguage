/**
 * 
 */
package asml.walker;

/**
 * @author Owner
 *
 */
public class ASMLFrequency extends Value {
	
	protected double mValue;
	public ASMLFrequency(double aValue) {
		mType = Type.FREQ;
		mValue = aValue;
		mIsInitialized = true;
	}
	
	public ASMLFrequency(double aValue, String aName, boolean aIsStorable, boolean aIsConst){
		this(aValue);
		mName = aName;
		mIsStorable = aIsStorable;
		mIsConst = aIsConst;
	}
	
	public ASMLFrequency(String aName, boolean aIsConst){
		mType = Type.FREQ;
		mName = aName;
		mIsConst = aIsConst;
		mIsInitialized = false;
	}
	

	@Override
	public Value add(Value rhs) throws ASMLSemanticException {
		if(rhs.getType() == Type.FREQ)
			return new ASMLFrequency(mValue + ((ASMLFrequency)rhs).getValue());
		
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

	public double getValue() {
		return mValue;
	}
}
