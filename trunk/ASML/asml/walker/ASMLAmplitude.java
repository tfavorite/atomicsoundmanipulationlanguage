/**
 * 
 */
package asml.walker;

/**
 * @author Owner
 *
 */
public class ASMLAmplitude extends Value {
	
	protected double mValue;
	
	public ASMLAmplitude(double aValue) {
		mType = Type.AMPL;
		mValue = aValue;
		mIsInitialized = true;
	}
	
	public ASMLAmplitude(double aValue, String aName, boolean aIsConst){
		this(aValue);
		mName = aName;
		mIsStorable = true;
		mIsConst = aIsConst;
	}
	
	public ASMLAmplitude(String aName, boolean aIsConst){
		mType = Type.AMPL;
		mName = aName;
		mIsConst = aIsConst;
		mIsInitialized = false;
		mIsStorable = true;
	}
	

	@Override
	public Value add(Value rhs) throws ASMLSemanticException {
		if(rhs.getType() == Type.AMPL)
			return new ASMLAmplitude(mValue + ((ASMLAmplitude)rhs).getValue());
		if(rhs.getType() == Type.STRING)
			return new ASMLString(Double.toString(mValue) + "a" +
					((ASMLString)rhs).getValue());
		
		return super.add(rhs);
	}

	@Override
	public Value divide(Value rhs) throws ASMLSemanticException {
		switch(rhs.getType()){
			case Type.INT:	
				return new ASMLAmplitude(mValue / ((ASMLInteger)rhs).getValue());
			case Type.FLOAT:
				return new ASMLAmplitude(mValue / ((ASMLFloat)rhs).getValue());
			case Type.AMPL:
				return new ASMLAmplitude(mValue / ((ASMLAmplitude)rhs).getValue());
			default:
				return super.divide(rhs);
				
		}
	}

	@Override
	public Value multiply(Value rhs) throws ASMLSemanticException {
		switch(rhs.getType()){
			case Type.INT:	
				return new ASMLAmplitude(mValue * ((ASMLInteger)rhs).getValue());
			case Type.FLOAT:
				return new ASMLAmplitude(mValue * ((ASMLFloat)rhs).getValue());
			case Type.AMPL:
				return new ASMLAmplitude(mValue * ((ASMLAmplitude)rhs).getValue());
			default:
				return super.multiply(rhs);
			
		}
	}

	@Override
	public Value relate(Value rhs, String op) throws ASMLSemanticException {
		double tValue;
		if(rhs.getType() != Type.AMPL)
			return super.relate(rhs,op);

		tValue = ((ASMLAmplitude)rhs).getValue();
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
		if(rhs.getType() != Type.AMPL)
			return super.subtract(rhs);
			
		return new ASMLAmplitude(mValue - ((ASMLAmplitude)rhs).getValue());
	}
	
	public double getValue() {
		return mValue;
	}
}
