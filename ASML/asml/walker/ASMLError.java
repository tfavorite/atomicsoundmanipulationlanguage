package asml.walker;

/**
 * 
 * @author Frank Smith and Tim Favorite
 *
 */
public class ASMLError extends Value {

	private String mValue;
	
	public ASMLError(String aValue){
		mValue = aValue;
	}
	
	public String getValue(){
		return mValue;
	}
}
