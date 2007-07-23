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
	}
	
	public Float(double aValue, ASMLString aName, boolean aIsStorable, boolean aIsConst){
		this(aValue);
		mName = aName;
		mIsStorable = aIsStorable;
		mIsConst = aIsConst;
	}

	public double getValue() {
		return mValue;
	}

}
