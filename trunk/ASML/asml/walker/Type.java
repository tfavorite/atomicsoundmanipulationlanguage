/**
 * 
 */
package asml.walker;

/**
 * A simple way for us to keep track of values of the different types
 * in implementing the ASML walker.
 * @author Frank A. Smith & Tim Favorite
 *
 */
public final class Type {
	public static final int INT    = 0;
	public static final int FLOAT  = 1;
	public static final int AMPL   = 2;
	public static final int FREQ   = 3;
	public static final int TIME   = 4;
	public static final int WAVE   = 5;
	public static final int STRING = 6;
	public static final int ERROR = -1;
	
	public static int getType(String typeStr){
		if (typeStr.equals("int")) return INT;
		else if(typeStr.equals("float")) return FLOAT;
		else if(typeStr.equals("ampl")) return AMPL;
		else if(typeStr.equals("freq")) return FREQ;
		else if(typeStr.equals("time")) return TIME;
		else if(typeStr.equals("wave")) return WAVE;
		return ERROR;
	}
}
