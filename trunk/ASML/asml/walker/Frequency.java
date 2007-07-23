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
	}
	
	public Frequency(double aValue, ASMLString aName, boolean aIsStorable, boolean aIsConst){
		this(aValue);
		mName = aName;
		mIsStorable = aIsStorable;
		mIsConst = aIsConst;
	}

	public double getValue() {
		return mValue;
	}
}
