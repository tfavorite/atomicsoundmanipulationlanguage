/**
 * 
 */
package asml.walker;

/**
 * @author Owner
 *
 */
public class Time extends Value {
	
	protected double mValue;
	
	public Time(double aValue) {
		mType = Type.TIME;
		mValue = aValue;
	}
	
	public Time(double aValue, ASMLString aName, boolean aIsStorable, boolean aIsConst){
		this(aValue);
		mName = aName;
		mIsStorable = aIsStorable;
		mIsConst = aIsConst;
	}

	public double getValue() {
		return mValue;
	}
}
