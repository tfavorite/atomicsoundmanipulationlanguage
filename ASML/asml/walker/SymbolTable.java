/**
 * 
 */
package asml.walker;
import java.util.HashMap;

/**
 * @author Frank A. Smith & Tim Favorite
 *
 */
public class SymbolTable {
	protected SymbolTable mParent = null;
	protected HashMap<String, Value> mST         = null;
	
	public SymbolTable(){
		mST = new HashMap<String, Value>();
	}
	
	public SymbolTable(SymbolTable aParent){
		this();
		mParent = aParent;
	}
	
	public void declare(Value aVal)throws ASMLSemanticException{
		if(mST.containsKey(aVal.mName))
			throw new ASMLSemanticException("Cannot re-declare value '"+ aVal.getName()+
					"' within the same scope.");
		mST.put(aVal.getName(), aVal);
	}
	
	public void update(String aName, Value aVal)throws ASMLSemanticException{
		if(mST.containsKey(aName))
			mST.put(aName, aVal);
		else{
			if(mParent == null)
				throw new ASMLSemanticException("Undeclared value '"+ aName +
					"'- cannot assign.");
			else
				mParent.update(aName, aVal);
		}
	}
	
	public void update(Value aVal)throws ASMLSemanticException{
		this.update(aVal.getName(), aVal);
	}
	
	public Value retrieve(String aName)throws ASMLSemanticException{
		if(mST.containsKey(aName))
			return mST.get(aName);
		
		if(mParent == null)
			throw new ASMLSemanticException("Undeclared value '"+ aName +
				"'- cannot assign.");
		else
			return mST.get(aName);
	}
}
