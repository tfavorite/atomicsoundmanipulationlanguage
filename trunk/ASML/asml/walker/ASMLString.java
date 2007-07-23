/**
 * 
 */
package asml.walker;

/**
 * @author Owner
 *
 */
public class ASMLString extends Value {
	protected ASMLString mValue;
	public ASMLString(ASMLString aValue) {
		mType = Type.STRING;
		mValue = aValue;
	}
	
	public ASMLString(ASMLString aValue, ASMLString aName, boolean aIsStorable, boolean aIsConst){
		this(aValue);
		mName = aName;
		mIsStorable = aIsStorable;
		mIsConst = aIsConst;
	}

	public ASMLString getValue() {
		return mValue;
	}
}
