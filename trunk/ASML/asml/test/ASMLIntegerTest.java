package asml.test;

import junit.framework.TestCase;
import asml.walker.*;

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
		assertTrue(tInt.isInitialized());
		assertFalse(tInt.isStorable());
		
		//declared, undefined
		tInt = new ASMLInteger("test");
		assertEquals("test", tInt.getName());
		assertEquals(Type.INT, tInt.getType());
		assertFalse(tInt.isInitialized());
		assertTrue(tInt.isStorable());
		
		//declared, defined 
		tInt = new ASMLInteger(5, "test");
		assertEquals(5, tInt.getValue());
		assertEquals("test", tInt.getName());
		assertEquals(Type.INT, tInt.getType());
		assertTrue(tInt.isInitialized());
		assertTrue(tInt.isStorable());
	}
	
	public void testASMLIntegerValue(){
		
		ASMLInteger tInt;
		try {
			tInt = new ASMLInteger(new ASMLInteger(5, "test"));
			assertEquals(5, tInt.getValue());
			assertEquals("test", tInt.getName());
			assertEquals(Type.INT, tInt.getType());
			assertTrue(tInt.isInitialized());
			assertTrue(tInt.isStorable());
		} catch (ASMLSemanticException e1) {
			fail("Could not assign ASMLInteger");
		}


		//Illegal ops
		Value tNonInts[] = {
			new ASMLAmplitude(1), new ASMLFloat(1), new ASMLFrequency(1),
			new ASMLString("1"), new ASMLTime(1)};
		for(int i=0; i<tNonInts.length; i++)
			try {
				tInt = new ASMLInteger(tNonInts[i]);
				fail("No exception thrown for Non int Value #" + i);
			} catch (ASMLSemanticException e) {}
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
			
			//Waves
			//TODO test for waves
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
		Value tRHS, tResult;
		String tRHSType = "";

		String tOps[] = {"<", "<=", ">", ">=", "==", "!="};
		double compareF[] = {4.9, 5.0, 5.1};
		int tResult4[] = {0, 0, 1, 1, 0, 1};
		int tResult5[] = {0, 1, 0, 1, 1, 0};
		int tResult6[] = {1, 1, 0, 0, 0, 1};
		int tResults[][] = {tResult4, tResult5, tResult6};
		
		int i=-1, j=-1;
		
		//Legal operations
		try {
			//Integers
			tRHSType = "Integers";
			for(i=4; i<=6; i++){
				tRHS = new ASMLInteger(i);
				for(j=0; j<tOps.length; j++){
					tResult = mLHS.relate(tRHS, tOps[j]);
					assertNotNull(tResult);
					assertEquals(Type.INT, tResult.getType());
					assertEquals(tResults[i-4][j], ((ASMLInteger)tResult).getValue());
				}
			}
			
			//Floats
			tRHSType = "Floats";
			for(i=0; i<compareF.length; i++){
				tRHS = new ASMLFloat(compareF[i]);
				for(j=0; j<tOps.length; j++){
					tResult = mLHS.relate(tRHS, tOps[j]);
					assertNotNull(tResult);
					assertEquals(Type.INT, tResult.getType());
					assertEquals(tResults[i][j], ((ASMLInteger)tResult).getValue());
				}
			}			
		} catch (ASMLSemanticException e) {
			fail("Legal Ops throw Semantic Exception: " +
					tRHSType + " i: " + i + " j: " + j + 
					e.getMessage());
		}

		//Illegal operations
		Value tMismatches[] = {new ASMLAmplitude(1), new ASMLFrequency(1),
				new ASMLTime(1), new ASMLString(" times a lady")};
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
			tResult = mLHS.relate(new ASMLInteger(1), "q");
			fail("exception not thrown for bad op");
		} catch (ASMLSemanticException e) {
		}
	}

	public void testLogic() {
		Value tRHS, tResult;
		String tRHSType = "";

		//Legal operations
		try {
			tRHSType = "T && T";
			tRHS = new ASMLInteger(3);
			tResult = mLHS.logic(tRHS, "&&");
			assertNotNull(tResult);
			assertEquals(Type.INT, tResult.getType());
			assertEquals(1, ((ASMLInteger)tResult).getValue());

			tRHSType = "T && F";
			tRHS = new ASMLInteger(0);
			tResult = mLHS.logic(tRHS, "&&");
			assertNotNull(tResult);
			assertEquals(Type.INT, tResult.getType());
			assertEquals(0, ((ASMLInteger)tResult).getValue());
			
			tRHSType = "F && T";
			mLHS = new ASMLInteger(0);
			tRHS = new ASMLInteger(3);
			tResult = mLHS.logic(tRHS, "&&");
			assertNotNull(tResult);
			assertEquals(Type.INT, tResult.getType());
			assertEquals(0, ((ASMLInteger)tResult).getValue());

			tRHSType = "F && F";
			tRHS = new ASMLInteger(0);
			tResult = mLHS.logic(tRHS, "&&");
			assertNotNull(tResult);
			assertEquals(Type.INT, tResult.getType());
			assertEquals(0, ((ASMLInteger)tResult).getValue());

			tRHSType = "T || T";
			mLHS = new ASMLInteger(1);
			tRHS = new ASMLInteger(3);
			tResult = mLHS.logic(tRHS, "||");
			assertNotNull(tResult);
			assertEquals(Type.INT, tResult.getType());
			assertEquals(1, ((ASMLInteger)tResult).getValue());

			tRHSType = "T || F";
			tRHS = new ASMLInteger(0);
			tResult = mLHS.logic(tRHS, "||");
			assertNotNull(tResult);
			assertEquals(Type.INT, tResult.getType());
			assertEquals(1, ((ASMLInteger)tResult).getValue());
			
			tRHSType = "F || T";
			mLHS = new ASMLInteger(0);
			tRHS = new ASMLInteger(3);
			tResult = mLHS.logic(tRHS, "||");
			assertNotNull(tResult);
			assertEquals(Type.INT, tResult.getType());
			assertEquals(1, ((ASMLInteger)tResult).getValue());

			tRHSType = "F || F";
			tRHS = new ASMLInteger(0);
			tResult = mLHS.logic(tRHS, "||");
			assertNotNull(tResult);
			assertEquals(Type.INT, tResult.getType());
			assertEquals(0, ((ASMLInteger)tResult).getValue());
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
				tResult = mLHS.logic(tMismatches[i], "||");
				fail("exception not thrown for mismatch: " + i);
			} catch (ASMLSemanticException e) {
				numFails++;
			}
		}
		assertEquals(tMismatches.length, numFails);
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

	public void testAmplof() {
		//Illegal operations
		try {
			mLHS.amplof();
			fail("exception not thrown");
		} catch (ASMLSemanticException e) {}		
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
