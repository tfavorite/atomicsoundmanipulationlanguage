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
		assertFalse(tFreq.isConst());
		assertTrue(tFreq.isInitialized());
		assertFalse(tFreq.isStorable());
		
		//declared, undefined - set to const
		tFreq = new ASMLFrequency("test", true);
		assertEquals("test", tFreq.getName());
		assertEquals(Type.FREQ, tFreq.getType());
		assertTrue(tFreq.isConst());
		assertFalse(tFreq.isInitialized());
		assertTrue(tFreq.isStorable());
		
		//declared, defined - set to !const
		tFreq = new ASMLFrequency(5, "test", false);
		assertEquals(5.0, tFreq.getValue());
		assertEquals("test", tFreq.getName());
		assertEquals(Type.FREQ, tFreq.getType());
		assertFalse(tFreq.isConst());
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
		fail("Not yet implemented");
	}

	public void testMultiply() {
		fail("Not yet implemented");
	}

	public void testDivide() {
		fail("Not yet implemented");
	}

	public void testRelate() {
		fail("Not yet implemented");
	}

	public void testMod() {
		fail("Not yet implemented");
	}

	public void testLogic() {
		fail("Not yet implemented");
	}

	public void testNot() {
		fail("Not yet implemented");
	}

	public void testNegate() {
		fail("Not yet implemented");
	}

	public void testAmplof() {
		fail("Not yet implemented");
	}

	public void testAtValue() {
		fail("Not yet implemented");
	}

	public void testAtValueValue() {
		fail("Not yet implemented");
	}

}
