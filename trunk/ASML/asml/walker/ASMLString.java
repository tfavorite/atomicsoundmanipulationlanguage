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
	
	public ASMLString(String aValue, String aName, boolean aIsStorable, boolean aIsConst){
		this(aValue);
		mName = aName;
		mIsStorable = aIsStorable;
		mIsConst = aIsConst;
	}

	public String getValue() {
		return mValue;
	}
}
