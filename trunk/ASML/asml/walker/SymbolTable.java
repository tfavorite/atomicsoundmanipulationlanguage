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
	protected HashMap mST = null;
	
	public SymbolTable(){
		mST = new HashMap();
	}
	
	public SymbolTable(SymbolTable aParent){
		this();
		mParent = aParent;
	}
	
	public void Declare(Value aVal)throws ASMLSemanticException{
		
	}
	
	public void Update(Value aVal)throws ASMLSemanticException{
		
	}
	
	public void Retrieve(String aName)throws ASMLSemanticException{
		
	}
}
