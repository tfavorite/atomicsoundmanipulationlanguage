/**
 * 
 */
package asml.walker;

/**
 * @author Owner
 *
 */
public class ASMLFloat extends Value {

	protected double mValue;
	
	public ASMLFloat(double aValue) {
		mType = Type.FLOAT;
		mValue = aValue;
		mIsInitialized = true;
	}
	
	public ASMLFloat(double aValue, String aName, boolean aIsStorable, boolean aIsConst){
		this(aValue);
		mName = aName;
		mIsStorable = aIsStorable;
		mIsConst = aIsConst;
	}
	
	public ASMLFloat(String aName, boolean aIsConst){
		mType = Type.FLOAT;
		mName = aName;
		mIsConst = aIsConst;
		mIsInitialized = false;
	}
	

	@Override
	public Value add(Value rhs) throws ASMLSemanticException {
		switch(rhs.getType()){
			case Type.INT:	
				return new ASMLFloat(mValue + ((ASMLInteger)rhs).getValue());
			case Type.FLOAT:
				return new ASMLFloat(mValue + ((ASMLFloat)rhs).getValue());
			default:
				return super.add(rhs);
				
		}
	}

	@Override
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

	@Override
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
				Wave tW = (Wave) rhs;
				return tW.multiply(this);
			default:
				return super.multiply(rhs);
			
		}
	}

	@Override
	public Value negate() throws ASMLSemanticException {
		return new ASMLFloat(-mValue);
	}

	@Override
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

	@Override
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

	public double getValue() {
		return mValue;
	}

}
