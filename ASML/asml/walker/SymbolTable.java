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
		if(!aVal.isStorable())
			throw new ASMLSemanticException("Cannot create entry for non-storable value.");
			
		if(mST.containsKey(aVal.mName))
			throw new ASMLSemanticException("Cannot re-declare value '"+ aVal.getName()+
					"' within the same scope.");
		mST.put(aVal.getName(), aVal);
	}
	
	public void update(String aName, Value aVal)throws ASMLSemanticException{
		if(!aVal.isStorable())
			throw new ASMLSemanticException("Cannot create entry for non-storable value.");
		if(!aVal.isInitialized())
			throw new ASMLSemanticException("Cannot assign uninitialized value to '" + aName +"'.");
		
		if(mST.containsKey(aName)){
			if(mST.get(aName).getType() != aVal.getType())
				throw new ASMLSemanticException("Type mismatch- cannot assign to '"+
						aName + "'.");
			mST.put(aName, aVal);
		}
		else{
			if(mParent == null)
				throw new ASMLSemanticException("Undeclared value '"+ aName +
					"'- cannot assign.");
			else
				mParent.update(aName, aVal);
		}
	}
	
	public void update(Value aVal)throws ASMLSemanticException{
		if(!aVal.isStorable())
			throw new ASMLSemanticException("Cannot create entry for non-storable value.");
		
		this.update(aVal.getName(), aVal);
	}
	
	public Value retrieve(String aName)throws ASMLSemanticException{
		if(mST.containsKey(aName))
			return mST.get(aName);
		
		if(mParent == null)
			throw new ASMLSemanticException("Undeclared value '"+ aName +
				"'- cannot retrieve.");
		else
			return mParent.retrieve(aName);
	}
}
