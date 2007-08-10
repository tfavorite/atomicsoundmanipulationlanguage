package asml.test;

import junit.framework.TestCase;
import asml.walker.*;

/**
 * 
 * @author Frank Smith
 *
 */
public class ASMLStringTest extends TestCase {
	ASMLString mLHS;
	
	public ASMLStringTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		mLHS = new ASMLString("right hand side: ");
	}
	
	public void testConstructor() throws ASMLSemanticException{
		ASMLString tString;
		
		//unnamed value
		tString = new ASMLString("test");
		assertEquals("test", tString.getValue());
		assertEquals(Type.STRING, tString.getType());
		assertTrue(tString.isInitialized());
		assertFalse(tString.isStorable());
		
		//"copy" constructor
		try {
			tString = new ASMLString(new ASMLString("test 2"));
			assertEquals("test 2", tString.getValue());
			assertEquals(Type.STRING, tString.getType());
			assertTrue(tString.isInitialized());
			assertFalse(tString.isStorable());
		} catch (ASMLSemanticException e) {
			fail(e.getMessage());
		}
		
		//copy constructor that should throw exceptions
		Value tMismatches[] = {new ASMLFloat(1), new ASMLAmplitude(1), 
				new ASMLFrequency(1), new ASMLTime(1), new ASMLInteger(1),};
		
		int numFails = 0;
		for(int i=0; i<tMismatches.length; i++){
			try {
				tString = new ASMLString(tMismatches[i]);
				fail("exception not thrown for mismatch: " + i);
			} catch (ASMLSemanticException e) {
				numFails++;
			}
		}
		assertEquals(tMismatches.length, numFails);
	}

	public void testAdd() {
		Value tResult;
		Value tRHS[] = {new ASMLFloat(1), new ASMLAmplitude(1), new ASMLFrequency(1), 
				new ASMLTime(1), new ASMLInteger(1), new ASMLString("test")};
		
		for(int i=0; i<tRHS.length; i++){
			try {
				tResult = mLHS.add(tRHS[i]);
				assertNotNull(tResult);
				assertEquals(Type.STRING, tResult.getType());
				
				switch(tRHS[i].getType()){
				case Type.AMPL:
					assertEquals("right hand side: 1.0a", ((ASMLString)tResult).getValue());
					break;
				case Type.FLOAT:
					assertEquals("right hand side: 1.0", ((ASMLString)tResult).getValue());
					break;
				case Type.FREQ:
					assertEquals("right hand side: 1.0Hz", ((ASMLString)tResult).getValue());
					break;
				case Type.INT:
					assertEquals("right hand side: 1", ((ASMLString)tResult).getValue());
					break;
				case Type.STRING:
					assertEquals("right hand side: test", ((ASMLString)tResult).getValue());
					break;
				case Type.TIME:
					assertEquals("right hand side: 1.0ms", ((ASMLString)tResult).getValue());
					break;
				}
			} catch (ASMLSemanticException e) {
				fail("on " + i + ".  " + e.getMessage());
			}
		}
	}

	public void testSubtract() {
		//Illegal operations
		Value tMismatches[] = {new ASMLFloat(1), new ASMLAmplitude(1), 
				new ASMLFrequency(1), new ASMLTime(1), 
				new ASMLString(" times a lady"), new ASMLInteger(1),};
		int numFails = 0;
		for(int i=0; i<tMismatches.length; i++){
			try {
				mLHS.subtract(tMismatches[i]);
				fail("exception not thrown for mismatch: " + i);
			} catch (ASMLSemanticException e) {
				numFails++;
			}
		}
		assertEquals(tMismatches.length, numFails);
	}

	public void testMultiply() {
		//Illegal operations
		Value tMismatches[] = {new ASMLFloat(1), new ASMLAmplitude(1), 
				new ASMLFrequency(1), new ASMLTime(1), 
				new ASMLString(" times a lady"), new ASMLInteger(1),};
		int numFails = 0;
		for(int i=0; i<tMismatches.length; i++){
			try {
				mLHS.multiply(tMismatches[i]);
				fail("exception not thrown for mismatch: " + i);
			} catch (ASMLSemanticException e) {
				numFails++;
			}
		}
		assertEquals(tMismatches.length, numFails);
	}

	public void testDivide() {
		//Illegal operations
		Value tMismatches[] = {new ASMLFloat(1), new ASMLAmplitude(1), 
				new ASMLFrequency(1), new ASMLTime(1), 
				new ASMLString(" times a lady"), new ASMLInteger(1),};
		int numFails = 0;
		for(int i=0; i<tMismatches.length; i++){
			try {
				mLHS.divide(tMismatches[i]);
				fail("exception not thrown for mismatch: " + i);
			} catch (ASMLSemanticException e) {
				numFails++;
			}
		}
		assertEquals(tMismatches.length, numFails);
	}

	public void testMod() {
		//Illegal operations
		Value tMismatches[] = {new ASMLFloat(1), new ASMLAmplitude(1), 
				new ASMLFrequency(1), new ASMLTime(1), 
				new ASMLString(" times a lady"), new ASMLInteger(1),};
		int numFails = 0;
		for(int i=0; i<tMismatches.length; i++){
			try {
				mLHS.mod(tMismatches[i]);
				fail("exception not thrown for mismatch: " + i);
			} catch (ASMLSemanticException e) {
				numFails++;
			}
		}
		assertEquals(tMismatches.length, numFails);
	}

	public void testRelate() {
		//Illegal operations
		Value tMismatches[] = {new ASMLFloat(1), new ASMLAmplitude(1), 
				new ASMLFrequency(1), new ASMLTime(1), 
				new ASMLString(" times a lady"), new ASMLInteger(1),};
		int numFails = 0;
		for(int i=0; i<tMismatches.length; i++){
			try {
				mLHS.relate(tMismatches[i],"<=");
				fail("exception not thrown for mismatch: " + i);
			} catch (ASMLSemanticException e) {
				numFails++;
			}
		}
		assertEquals(tMismatches.length, numFails);
	}

	public void testLogic() {
		//Illegal operations
		Value tMismatches[] = {new ASMLFloat(1), new ASMLAmplitude(1), 
				new ASMLFrequency(1), new ASMLTime(1), 
				new ASMLString(" times a lady"), new ASMLInteger(1),};
		int numFails = 0;
		for(int i=0; i<tMismatches.length; i++){
			try {
				mLHS.logic(tMismatches[i], "||");
				fail("exception not thrown for mismatch: " + i);
			} catch (ASMLSemanticException e) {
				numFails++;
			}
		}
		assertEquals(tMismatches.length, numFails);
	}

	public void testNot() {
		//Illegal operations
		try {
			mLHS.not();
			fail("exception not thrown");
		} catch (ASMLSemanticException e) {	}
	}

	public void testNegate() {
		//Illegal operations
		try {
			mLHS.negate();
			fail("exception not thrown");
		} catch (ASMLSemanticException e) {	}
	}

	public void testAmplof() {
		//Illegal operations
		try {
			mLHS.amplof();
			fail("exception not thrown");
		} catch (ASMLSemanticException e) {	}
	}

	public void testAtValue() {
		//Illegal operations
		Value tMismatches[] = {new ASMLFloat(1), new ASMLAmplitude(1), 
				new ASMLFrequency(1), new ASMLTime(1), 
				new ASMLString(" times a lady"), new ASMLInteger(1),};
		int numFails = 0;
		for(int i=0; i<tMismatches.length; i++){
			try {
				mLHS.at(tMismatches[i]);
				fail("exception not thrown for mismatch: " + i);
			} catch (ASMLSemanticException e) {
				numFails++;
			}
		}
		assertEquals(tMismatches.length, numFails);
	}

	public void testAtValueValue() {
		//Illegal operations
		Value tMismatches[] = {new ASMLFloat(1), new ASMLAmplitude(1), 
				new ASMLFrequency(1), new ASMLTime(1), 
				new ASMLString(" times a lady"), new ASMLInteger(1),};
		int numFails = 0;
		for(int i=0; i<tMismatches.length; i++){
			try {
				mLHS.at(tMismatches[i], tMismatches[i]);
				fail("exception not thrown for mismatch: " + i);
			} catch (ASMLSemanticException e) {
				numFails++;
			}
		}
		assertEquals(tMismatches.length, numFails);
	}

}
