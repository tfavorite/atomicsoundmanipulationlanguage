/**
 * 
 */
package asml.walker;

/**
 * @author Owner
 *
 */
public class ASMLString extends Value {
	protected String mValue;
	
	public ASMLString(String aValue) {
		mType = Type.STRING;
		mValue = aValue;
	}
	
	public Value add(Value rhs) throws ASMLSemanticException{
		switch(rhs.getType()){
		case Type.AMPL:
			return new ASMLString(mValue + Double.toString(((ASMLAmplitude)rhs).getValue()) + "a");
		case Type.FLOAT:
			return new ASMLString(mValue + Double.toString(((ASMLFloat)rhs).getValue()));
		case Type.FREQ:
			return new ASMLString(mValue + Double.toString(((ASMLFrequency)rhs).getValue()) + "Hz");
		case Type.INT:
			return new ASMLString(mValue + Integer.toString(((ASMLInteger)rhs).getValue()));
		case Type.STRING:
			return new ASMLString(mValue + ((ASMLString)rhs).getValue());
		case Type.TIME:
			return new ASMLString(mValue + Double.toString(((ASMLTime)rhs).getValue()) + "ms");
		default:
			return super.add(rhs);
		}
	}

	public String getValue() {
		return mValue;
	}
}
