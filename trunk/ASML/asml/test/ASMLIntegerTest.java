package asml.test;

import junit.framework.TestCase;
import asml.walker.*;

import javax.sound.sampled.AudioInputStream;

public class ASMLIntegerTest extends TestCase {
	ASMLInteger mLHS;

	public ASMLIntegerTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		mLHS = new ASMLInteger(5);
	}
	
	public void testConstructors(){
		ASMLInteger tInt;
		
		//un-named value
		tInt = new ASMLInteger(5);
		assertEquals(5, tInt.getValue());
		assertEquals(Type.INT, tInt.getType());
		assertFalse(tInt.isConst());
		assertTrue(tInt.isInitialized());
		assertFalse(tInt.isStorable());
		
		//declared, undefined - set to const
		tInt = new ASMLInteger("test", true);
		assertEquals("test", tInt.getName());
		assertEquals(Type.INT, tInt.getType());
		assertTrue(tInt.isConst());
		assertFalse(tInt.isInitialized());
		assertTrue(tInt.isStorable());
		
		//declared, defined - set to const
		tInt = new ASMLInteger(5, "test", true);
		assertEquals(5, tInt.getValue());
		assertEquals("test", tInt.getName());
		assertEquals(Type.INT, tInt.getType());
		assertTrue(tInt.isConst());
		assertTrue(tInt.isInitialized());
		assertTrue(tInt.isStorable());
		
	}

	public void testAdd() {
		Value tRHS, tResult;
		String tRHSType = "";
		
		//Legal operations
		try {
			//Integers
			tRHSType = "integer rhs";
			tRHS = new ASMLInteger(3);
			tResult = mLHS.add(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.INT, tResult.getType());
			assertEquals(8, ((ASMLInteger)tResult).getValue());
			
			//Floats
			tRHSType = "float rhs";
			tRHS = new ASMLFloat(3.5);
			tResult = mLHS.add(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.FLOAT, tResult.getType());
			assertEquals(8.5, ((ASMLFloat)tResult).getValue());
			
			//Strings
			tRHSType = "string rhs";
			tRHS = new ASMLString(" times a lady");
			tResult = mLHS.add(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.STRING, tResult.getType());
			assertEquals("5 times a lady", ((ASMLString)tResult).getValue());
		} catch (ASMLSemanticException e) {
			fail("Legal Ops throw Semantic Exception: " +
					tRHSType + " " + e.getMessage());
		}
		
		//Illegal operations
		Value tMismatches[] = {new ASMLAmplitude(1), new ASMLFrequency(1),
				new ASMLTime(1)};
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
		
		//TODO: test for waves
	}

	public void testSubtract() {
		Value tRHS, tResult;
		String tRHSType = "";

		//Legal operations
		try {
			//Integers
			tRHSType = "integer rhs";
			tRHS = new ASMLInteger(3);
			tResult = mLHS.subtract(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.INT, tResult.getType());
			assertEquals(2, ((ASMLInteger)tResult).getValue());
			
			//Floats
			tRHSType = "float rhs";
			tRHS = new ASMLFloat(3.5);
			tResult = mLHS.subtract(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.FLOAT, tResult.getType());
			assertEquals(1.5, ((ASMLFloat)tResult).getValue());
		} catch (ASMLSemanticException e) {
			fail("Legal Ops throw Semantic Exception: " +
					tRHSType + " " + e.getMessage());
		}

		//Illegal operations
		Value tMismatches[] = {new ASMLAmplitude(1), new ASMLFrequency(1),
				new ASMLTime(1), new ASMLString(" times a lady")};
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
	
		//TODO: test for waves
	}

	public void testMultiply() {
		Value tRHS, tResult;
		String tRHSType = "";

		//Legal operations
		try {
			//Integers
			tRHSType = "integer rhs";
			tRHS = new ASMLInteger(3);
			tResult = mLHS.multiply(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.INT, tResult.getType());
			assertEquals(15, ((ASMLInteger)tResult).getValue());
			
			//Floats
			tRHSType = "float rhs";
			tRHS = new ASMLFloat(1.5);
			tResult = mLHS.multiply(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.FLOAT, tResult.getType());
			assertEquals(7.5, ((ASMLFloat)tResult).getValue());
			
			//Ampls
			tRHSType = "ampl rhs";
			tRHS = new ASMLAmplitude(1.5);
			tResult = mLHS.multiply(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.AMPL, tResult.getType());
			assertEquals(7.5, ((ASMLAmplitude)tResult).getValue());
			
			//Freqs
			tRHSType = "freq rhs";
			tRHS = new ASMLFrequency(1.5);
			tResult = mLHS.multiply(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.FREQ, tResult.getType());
			assertEquals(7.5, ((ASMLFrequency)tResult).getValue());
			
			//Times
			tRHSType = "time rhs";
			tRHS = new ASMLTime(1.5);
			tResult = mLHS.multiply(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.TIME, tResult.getType());
			assertEquals(7.5, ((ASMLTime)tResult).getValue());
		} catch (ASMLSemanticException e) {
			fail("Legal Ops throw Semantic Exception: " +
					tRHSType + " " + e.getMessage());
		}

		//Illegal operations
		Value tMismatches[] = {new ASMLString(" times a lady")};
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

		//Legal operations
		try {
			//Integers
			tRHSType = "integer rhs";
			tRHS = new ASMLInteger(3);
			tResult = mLHS.divide(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.INT, tResult.getType());
			assertEquals(1, ((ASMLInteger)tResult).getValue());
			
			//Floats
			tRHSType = "float rhs";
			tRHS = new ASMLFloat(.5);
			tResult = mLHS.divide(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.FLOAT, tResult.getType());
			assertEquals(10.0, ((ASMLFloat)tResult).getValue());
		} catch (ASMLSemanticException e) {
			fail("Legal Ops throw Semantic Exception: " +
					tRHSType + " " + e.getMessage());
		}

		//Illegal operations
		Value tMismatches[] = {new ASMLAmplitude(1), new ASMLFrequency(1),
				new ASMLTime(1), new ASMLString(" times a lady")};
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

	public void testMod() {
		Value tRHS, tResult;
		String tRHSType = "";

		//Legal operations
		try {
			//Integers
			tRHSType = "integer rhs";
			tRHS = new ASMLInteger(3);
			tResult = mLHS.mod(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.INT, tResult.getType());
			assertEquals(2, ((ASMLInteger)tResult).getValue());
		} catch (ASMLSemanticException e) {
			fail("Legal Ops throw Semantic Exception: " +
					tRHSType + " " + e.getMessage());
		}

		//Illegal operations
		Value tMismatches[] = {new ASMLFloat(1), new ASMLAmplitude(1), 
				new ASMLFrequency(1), new ASMLTime(1), 
				new ASMLString(" times a lady")};
		int numFails = 0;
		for(int i=0; i<tMismatches.length; i++){
			try {
				tResult = mLHS.mod(tMismatches[i]);
				fail("exception not thrown for mismatch: " + i);
			} catch (ASMLSemanticException e) {
				numFails++;
			}
		}
		assertEquals(tMismatches.length, numFails);
	}

	public void testRelate() {
		fail("Not yet implemented");
	}

	public void testLogic() {
		fail("Not yet implemented");
	}

	public void testNot() {
		Value tResult;
		String tRHSType = "";

		try {
			tRHSType = "non-zero";
			tResult = mLHS.not();
			assertNotNull(tResult);
			assertEquals(Type.INT, tResult.getType());
			assertEquals(0, ((ASMLInteger)tResult).getValue());
			
			tRHSType = "zero";
			tResult = tResult.not();
			assertNotNull(tResult);
			assertEquals(Type.INT, tResult.getType());
			assertEquals(1, ((ASMLInteger)tResult).getValue());			
		} catch (ASMLSemanticException e) {
			fail("Legal Ops throw Semantic Exception: " +
					tRHSType + " " + e.getMessage());	
		}
	}

	public void testNegate() {
		Value tResult;
		String tRHSType = "";
		
		try {
			//Integers
			tRHSType = "integer rhs";
			tResult = mLHS.negate();
			assertNotNull(tResult);
			assertEquals(Type.INT, tResult.getType());
			assertEquals(-5, ((ASMLInteger)tResult).getValue());
		} catch (ASMLSemanticException e) {
			fail("Legal Ops throw Semantic Exception: " +
					tRHSType + " " + e.getMessage());
		}
	}
}
