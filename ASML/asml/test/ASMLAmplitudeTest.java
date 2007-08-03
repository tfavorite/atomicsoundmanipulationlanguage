package asml.test;

import asml.walker.ASMLAmplitude;
import asml.walker.ASMLFloat;
import asml.walker.ASMLFrequency;
import asml.walker.ASMLInteger;
import asml.walker.ASMLSemanticException;
import asml.walker.ASMLString;
import asml.walker.ASMLTime;
import asml.walker.Type;
import asml.walker.Value;
import junit.framework.TestCase;

public class ASMLAmplitudeTest extends TestCase {
	ASMLAmplitude mLHS;
	
	public ASMLAmplitudeTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		mLHS = new ASMLAmplitude(5.0);
	}
	
	public void testConstructors(){
		ASMLAmplitude tAmp;
		
		//un-named value
		tAmp = new ASMLAmplitude(5.0);
		assertEquals(5.0, tAmp.getValue());
		assertEquals(Type.AMPL, tAmp.getType());
		assertTrue(tAmp.isInitialized());
		assertFalse(tAmp.isStorable());
		
		//declared, undefined 
		tAmp = new ASMLAmplitude("test");
		assertEquals("test", tAmp.getName());
		assertEquals(Type.AMPL, tAmp.getType());
		assertFalse(tAmp.isInitialized());
		assertTrue(tAmp.isStorable());
		
		//declared, defined
		tAmp = new ASMLAmplitude(5, "test");
		assertEquals(5.0, tAmp.getValue());
		assertEquals("test", tAmp.getName());
		assertEquals(Type.AMPL, tAmp.getType());
		assertTrue(tAmp.isInitialized());
		assertTrue(tAmp.isStorable());
	}

	public void testAdd() {
		Value tRHS, tResult;
		String tRHSType = "";
		
		try {
			//Amplitudes
			tRHSType = "Amplitude rhs";
			tRHS = new ASMLAmplitude(3.5);
			tResult = mLHS.add(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.AMPL, tResult.getType());
			assertEquals(8.5, ((ASMLAmplitude)tResult).getValue());
			
			//Strings
			tRHSType = "string rhs";
			tRHS = new ASMLString(" times a lady");
			tResult = mLHS.add(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.STRING, tResult.getType());
			assertEquals("5.0a times a lady", ((ASMLString)tResult).getValue());
		} catch (ASMLSemanticException e) {
			fail("Legal Ops throw Semantic Exception: " +
					tRHSType + " " + e.getMessage());
		}
		
		//Illegal operations
		Value tMismatches[] = {
			new ASMLTime(1), new ASMLFloat(1),
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
			//Amplitudes
			tRHSType = "amplitude rhs";
			tRHS = new ASMLAmplitude(3.5);
			tResult = mLHS.subtract(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.AMPL, tResult.getType());
			assertEquals(1.5, ((ASMLAmplitude)tResult).getValue());
		} catch (ASMLSemanticException e) {
			fail("Legal Ops throw Semantic Exception: " +
					tRHSType + " " + e.getMessage());
		}
		
		//Illegal operations
		Value tMismatches[] = {
			new ASMLTime(1), new ASMLFloat(1), new ASMLString("1"),
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
			assertEquals(Type.AMPL, tResult.getType());
			assertEquals(15.0, ((ASMLAmplitude)tResult).getValue());
			
			//Floats
			tRHSType = "float rhs";
			tRHS = new ASMLFloat(3.0);
			tResult = mLHS.multiply(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.AMPL, tResult.getType());
			assertEquals(15.0, ((ASMLAmplitude)tResult).getValue());	
			
			//Amplitudes
			tRHSType = "amplitude rhs";
			tRHS = new ASMLAmplitude(3.0);
			tResult = mLHS.multiply(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.AMPL, tResult.getType());
			assertEquals(15.0, ((ASMLAmplitude)tResult).getValue());
		} catch (ASMLSemanticException e) {
			fail("Legal Ops throw Semantic Exception: " +
					tRHSType + " " + e.getMessage());
		}
		
		//Illegal operations
		Value tMismatches[] = {
			new ASMLString("1"), new ASMLTime(1), new ASMLFrequency(1)};
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
			assertEquals(Type.AMPL, tResult.getType());
			assertEquals(2.5, ((ASMLAmplitude)tResult).getValue());
			
			//Floats
			tRHSType = "float rhs";
			tRHS = new ASMLFloat(2.0);
			tResult = mLHS.divide(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.AMPL, tResult.getType());
			assertEquals(2.5, ((ASMLAmplitude)tResult).getValue());
			
			//Amplitudes
			tRHSType = "Amplitude rhs";
			tRHS = new ASMLAmplitude(2.0);
			tResult = mLHS.divide(tRHS);
			assertNotNull(tResult);
			assertEquals(Type.AMPL, tResult.getType());
			assertEquals(2.5, ((ASMLAmplitude)tResult).getValue());
		} catch (ASMLSemanticException e) {
			fail("Legal Ops throw Semantic Exception: " +
					tRHSType + " " + e.getMessage());
		}
		
		//Illegal operations
		Value tMismatches[] = {
			new ASMLTime(1), new ASMLString("1"),
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
			//Amplitudes
			for(i=0; i<compareF.length; i++){
				tRHS = new ASMLAmplitude(compareF[i]);
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
		Value tMismatches[] = {new ASMLTime(1), new ASMLFloat(1),
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
			tResult = mLHS.relate(new ASMLAmplitude(1), "q");
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
