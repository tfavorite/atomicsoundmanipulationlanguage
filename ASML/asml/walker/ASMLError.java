package asml.walker;

public class ASMLError extends Value {

	private String mValue;
	
	public ASMLError(String aValue){
		mValue = aValue;
	}
	
	public String getValue(){
		return mValue;
	}
}
