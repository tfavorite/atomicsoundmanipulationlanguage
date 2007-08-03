package asml.test;

import junit.framework.TestCase;
import asml.walker.*;

public class ASMLFrequencyTest extends TestCase {
	ASMLFrequency mLHS;
	
	public ASMLFrequencyTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		mLHS = new ASMLFrequency(5.0); 
	}
	
	public void testConstructors(){
		ASMLFrequency tFreq;
		
		//un-named value
		tFreq = new ASMLFrequency(5.0);
		assertEquals(5.0, tFreq.getValue());
		assertEquals(Type.FREQ, tFreq.getType());
		assertTrue(tFreq.isInitialized());
		assertFalse(tFreq.isStorable());
		
		//declared, undefined
		tFreq = new ASMLFrequency("test");
		assertEquals("test", tFreq.getName());
		assertEquals(Type.FREQ, tFreq.getType());
		assertFalse(tFreq.isInitialized());
		assertTrue(tFreq.isStorable());
		
		//declared, defined
		tFreq = new ASMLFrequency(5, "test");
		assertEquals(5.0, tFreq.getValue());
		assertEquals("test", tFreq.getName());
		assertEquals(Type.FREQ, tFreq.getType());
		assertTrue(tFreq.isInitialized());
		assertTrue(tFreq.isStorable());		
	}

	public void testAdd() {
		Value tRHS, tResult;
		String tRHSType = "";
		
		try {
			//Frequencies
			tRHSType = "frequency rhs";
			tRHS = new ASMLFrequency(3.5);
			tResult = mLHS.add(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.FREQ, tResult.getType());
			assertEquals(8.5, ((ASMLFrequency)tResult).getValue());
			
			//Strings
			tRHSType = "string rhs";
			tRHS = new ASMLString(" times a lady");
			tResult = mLHS.add(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.STRING, tResult.getType());
			assertEquals("5.0Hz times a lady", ((ASMLString)tResult).getValue());
		} catch (ASMLSemanticException e) {
			fail("Legal Ops throw Semantic Exception: " +
					tRHSType + " " + e.getMessage());
		}
		
		//Illegal operations
		Value tMismatches[] = {
			new ASMLAmplitude(1), new ASMLFloat(1),
			new ASMLInteger(1), new ASMLTime(1)};
		int numFails = 0;
		for(int i=0; i<tMismatches.length; i++){
			try {
				tResult = mLHS.add(tMismatches[i]);
				fail("exception not thrown for mismatch: " + i);
			} catch (ASMLSemanticException e) {
				numFails++;
			}
		}
		assertEquals(tMismatches.length, numFails);
	}

	public void testSubtract() {
		Value tRHS, tResult;
		String tRHSType = "";
		
		try {
			//Frequencies
			tRHSType = "frequency rhs";
			tRHS = new ASMLFrequency(3.5);
			tResult = mLHS.subtract(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.FREQ, tResult.getType());
			assertEquals(1.5, ((ASMLFrequency)tResult).getValue());
		} catch (ASMLSemanticException e) {
			fail("Legal Ops throw Semantic Exception: " +
					tRHSType + " " + e.getMessage());
		}
		
		//Illegal operations
		Value tMismatches[] = {
			new ASMLAmplitude(1), new ASMLFloat(1), new ASMLString("1"),
			new ASMLInteger(1), new ASMLTime(1)};
		int numFails = 0;
		for(int i=0; i<tMismatches.length; i++){
			try {
				tResult = mLHS.subtract(tMismatches[i]);
				fail("exception not thrown for mismatch: " + i);
			} catch (ASMLSemanticException e) {
				numFails++;
			}
		}
		assertEquals(tMismatches.length, numFails);
	}

	public void testMultiply() {
		Value tRHS, tResult;
		String tRHSType = "";
		
		try {
			//Integers
			tRHSType = "integer rhs";
			tRHS = new ASMLInteger(3);
			tResult = mLHS.multiply(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.FREQ, tResult.getType());
			assertEquals(15.0, ((ASMLFrequency)tResult).getValue());
			
			//Floats
			tRHSType = "float rhs";
			tRHS = new ASMLFloat(3.0);
			tResult = mLHS.multiply(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.FREQ, tResult.getType());
			assertEquals(15.0, ((ASMLFrequency)tResult).getValue());
		} catch (ASMLSemanticException e) {
			fail("Legal Ops throw Semantic Exception: " +
					tRHSType + " " + e.getMessage());
		}
		
		//Illegal operations
		Value tMismatches[] = {
			new ASMLAmplitude(1), new ASMLString("1"),
			new ASMLTime(1), new ASMLFrequency(1)};
		int numFails = 0;
		for(int i=0; i<tMismatches.length; i++){
			try {
				tResult = mLHS.multiply(tMismatches[i]);
				fail("exception not thrown for mismatch: " + i);
			} catch (ASMLSemanticException e) {
				numFails++;
			}
		}
		assertEquals(tMismatches.length, numFails);
	}

	public void testDivide() {
		Value tRHS, tResult;
		String tRHSType = "";
		
		try {
			//Integers
			tRHSType = "integer rhs";
			tRHS = new ASMLInteger(2);
			tResult = mLHS.divide(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.FREQ, tResult.getType());
			assertEquals(2.5, ((ASMLFrequency)tResult).getValue());
			
			//Floats
			tRHSType = "float rhs";
			tRHS = new ASMLFloat(2.0);
			tResult = mLHS.divide(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.FREQ, tResult.getType());
			assertEquals(2.5, ((ASMLFrequency)tResult).getValue());
			
			//Frequencies
			tRHSType = "frequency rhs";
			tRHS = new ASMLFrequency(2.0);
			tResult = mLHS.divide(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.FLOAT, tResult.getType());
			assertEquals(2.5, ((ASMLFloat)tResult).getValue());
		} catch (ASMLSemanticException e) {
			fail("Legal Ops throw Semantic Exception: " +
					tRHSType + " " + e.getMessage());
		}
		
		//Illegal operations
		Value tMismatches[] = {
			new ASMLAmplitude(1), new ASMLString("1"),
			new ASMLTime(1)};
		int numFails = 0;
		for(int i=0; i<tMismatches.length; i++){
			try {
				tResult = mLHS.divide(tMismatches[i]);
				fail("exception not thrown for mismatch: " + i);
			} catch (ASMLSemanticException e) {
				numFails++;
			}
		}
		assertEquals(tMismatches.length, numFails);
	}

	public void testRelate() {
		Value tRHS, tResult;

		String tOps[] = {"<", "<=", ">", ">=", "==", "!="};
		double compareF[] = {4.9, 5.0, 5.1};
		int tResult4[] = {0, 0, 1, 1, 0, 1};
		int tResult5[] = {0, 1, 0, 1, 1, 0};
		int tResult6[] = {1, 1, 0, 0, 0, 1};
		int tResults[][] = {tResult4, tResult5, tResult6};
		
		int i=-1, j=-1;
		
		//Legal operations
		try {
			//Frequencies
			for(i=0; i<compareF.length; i++){
				tRHS = new ASMLFrequency(compareF[i]);
				for(j=0; j<tOps.length; j++){
					tResult = mLHS.relate(tRHS, tOps[j]);
					assertNotNull(tResult);
					assertEquals(Type.INT, tResult.getType());
					assertEquals(tResults[i][j], ((ASMLInteger)tResult).getValue());
				}
			}			
		} catch (ASMLSemanticException e) {
			fail("Legal Ops throw Semantic Exception:" + " i: " + i + " j: " + j + 
					e.getMessage());
		}

		//Illegal operations
		Value tMismatches[] = {new ASMLAmplitude(1), new ASMLFloat(1),
				new ASMLInteger(1), new ASMLTime(1), 
				new ASMLString(" times a lady")};
		int numFails = 0;
		for(i=0; i<tMismatches.length; i++){
			try {
				tResult = mLHS.relate(tMismatches[i], "<");
				fail("exception not thrown for mismatch: " + i);
			} catch (ASMLSemanticException e) {
				numFails++;
			}
		}
		assertEquals(tMismatches.length, numFails);
		
		try {
			tResult = mLHS.relate(new ASMLFrequency(1), "q");
			fail("exception not thrown for bad op");
		} catch (ASMLSemanticException e) {
		}
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