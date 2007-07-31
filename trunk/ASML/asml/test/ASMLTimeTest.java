package asml.test;

import junit.framework.TestCase;
import asml.walker.*;

public class ASMLTimeTest extends TestCase {
	ASMLTime mLHS;
	
	public ASMLTimeTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		mLHS = new ASMLTime(5.0);
	}
	
	public void testConstructors(){
		ASMLTime tTime;
		
		//un-named value
		tTime = new ASMLTime(5.0);
		assertEquals(5.0, tTime.getValue());
		assertEquals(Type.TIME, tTime.getType());
		assertFalse(tTime.isConst());
		assertTrue(tTime.isInitialized());
		assertFalse(tTime.isStorable());
		
		//declared, undefined - set to const
		tTime = new ASMLTime("test", true);
		assertEquals("test", tTime.getName());
		assertEquals(Type.TIME, tTime.getType());
		assertTrue(tTime.isConst());
		assertFalse(tTime.isInitialized());
		assertTrue(tTime.isStorable());
		
		//declared, defined - set to !const
		tTime = new ASMLTime(5, "test", false);
		assertEquals(5.0, tTime.getValue());
		assertEquals("test", tTime.getName());
		assertEquals(Type.TIME, tTime.getType());
		assertFalse(tTime.isConst());
		assertTrue(tTime.isInitialized());
		assertTrue(tTime.isStorable());
	}

	public void testAdd() {
		Value tRHS, tResult;
		String tRHSType = "";
		
		try {
			//Times
			tRHSType = "Time rhs";
			tRHS = new ASMLTime(3.5);
			tResult = mLHS.add(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.TIME, tResult.getType());
			assertEquals(8.5, ((ASMLTime)tResult).getValue());
			
			//Strings
			tRHSType = "string rhs";
			tRHS = new ASMLString(" times a lady");
			tResult = mLHS.add(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.STRING, tResult.getType());
			assertEquals("5.0ms times a lady", ((ASMLString)tResult).getValue());
		} catch (ASMLSemanticException e) {
			fail("Legal Ops throw Semantic Exception: " +
					tRHSType + " " + e.getMessage());
		}
		
		//Illegal operations
		Value tMismatches[] = {
			new ASMLAmplitude(1), new ASMLFloat(1),
			new ASMLInteger(1), new ASMLFrequency(1)};
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
			//Times
			tRHSType = "time rhs";
			tRHS = new ASMLTime(3.5);
			tResult = mLHS.subtract(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.TIME, tResult.getType());
			assertEquals(1.5, ((ASMLTime)tResult).getValue());
		} catch (ASMLSemanticException e) {
			fail("Legal Ops throw Semantic Exception: " +
					tRHSType + " " + e.getMessage());
		}
		
		//Illegal operations
		Value tMismatches[] = {
			new ASMLAmplitude(1), new ASMLFloat(1), new ASMLString("1"),
			new ASMLInteger(1), new ASMLFrequency(1)};
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
			assertEquals(Type.TIME, tResult.getType());
			assertEquals(15.0, ((ASMLTime)tResult).getValue());
			
			//Floats
			tRHSType = "float rhs";
			tRHS = new ASMLFloat(3.0);
			tResult = mLHS.multiply(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.TIME, tResult.getType());
			assertEquals(15.0, ((ASMLTime)tResult).getValue());
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
			assertEquals(Type.TIME, tResult.getType());
			assertEquals(2.5, ((ASMLTime)tResult).getValue());
			
			//Floats
			tRHSType = "float rhs";
			tRHS = new ASMLFloat(2.0);
			tResult = mLHS.divide(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.TIME, tResult.getType());
			assertEquals(2.5, ((ASMLTime)tResult).getValue());
			
			//Times
			tRHSType = "time rhs";
			tRHS = new ASMLTime(2.0);
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
			new ASMLFrequency(1)};
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
			//Times
			for(i=0; i<compareF.length; i++){
				tRHS = new ASMLTime(compareF[i]);
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
				new ASMLInteger(1), new ASMLFrequency(1), 
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
			tResult = mLHS.relate(new ASMLTime(1), "q");
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
