package asml.walker;

/**
 * This class represents all semantic exceptions encountered while walking the ASML tree. Any
 * semantic error should throw this exception.
 * @author Frank Smith and Tim Favorite
 *
 */
public class ASMLSemanticException extends Exception{
	private static final long serialVersionUID = 1837430462181439821L;

	/** Constructs an ASMLSemanticException with the given message string. */
	public ASMLSemanticException(String msg){
		super(msg);
	}
}
