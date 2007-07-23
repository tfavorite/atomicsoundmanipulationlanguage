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
	}
	
	public Amplitude(double aValue, ASMLString aName, boolean aIsStorable, boolean aIsConst){
		this(aValue);
		mName = aName;
		mIsStorable = aIsStorable;
		mIsConst = aIsConst;
	}

	public double getValue() {
		return mValue;
	}
}
