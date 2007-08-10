package asml.test;

import java.util.ArrayList;

import junit.framework.TestCase;
import asml.walker.*;

/**
 * 
 * @author Frank Smith
 *
 */
public class FunctionRecordTest extends TestCase {
	FunctionRecord mFR = null;
	
	public FunctionRecordTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		
		ArrayList<Value> tFormalArgs = new ArrayList<Value>();
		tFormalArgs.add(new ASMLAmplitude("myAmpl"));
		tFormalArgs.add(new ASMLInteger("myInt"));
		tFormalArgs.add(new ASMLFrequency("myFreq"));
		
		mFR = new FunctionRecord(Type.FLOAT, "FRTest", tFormalArgs, null);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testConstructor(){
		Value tSymbol;
		String tNames[] = {"myAmpl", "myInt", "myFreq"};
		int tTypes[] = {Type.AMPL, Type.INT, Type.FREQ};
		
		for (int i = 0; i < tTypes.length; i++) {
			try {
				tSymbol = mFR.getSymbol(tNames[i]);
				assertEquals(tTypes[i], tSymbol.getType());
				assertFalse(tSymbol.isInitialized());
				assertTrue(tSymbol.isStorable());
				assertEquals(tNames[i], tSymbol.getName());
			} catch (ASMLSemanticException e) {
				fail(e.getMessage() + " on " + tNames[i]);
			}
		}		
		
		
		try {
			mFR.getSymbol("myWave");
			fail("No exception on query for missing symbol.");
		} catch (ASMLSemanticException e) {
			assertEquals("Undeclared value 'myWave'- cannot retrieve.",
					e.getMessage());
		}
		
		
		//test return type
		int i = 0;
		try {
			mFR.setRetVal(new ASMLFloat(5));
			i++;
			mFR.setRetVal(new ASMLInteger(5));
			fail("No exception on illegal set.");
		} catch (ASMLSemanticException e) {
			if(i == 0)
				fail(e.getMessage() + " on setting retVal to float (should work).");
			else
				assertEquals("Type mismatch, function with type 1 cannot return type 0",
						e.getMessage());
		}
	}

	public void testPassParamValue() {
		ArrayList<Value> tActualParams = new ArrayList<Value>();
		
		//pass params of wrong size (err)
		try {
			mFR.passParamValue(tActualParams);
			fail("No exception on params of wrong size.");
		} catch (ASMLSemanticException e) {
			assertEquals("Number of arguments in call differs from " +
					"number of arguments in function declaration.  Call to function FRTest.",
					e.getMessage());
		}
		
		//pass params with mismatched types
		tActualParams.add(new ASMLAmplitude(1, "actAmpl"));
		tActualParams.add(new ASMLInteger(2));
		tActualParams.add(new ASMLTime(3, "actTime"));

		try {
			mFR.passParamValue(tActualParams);
			fail("No exception on params of wrong type.");
		} catch (ASMLSemanticException e) {
			assertEquals("Type of actual argument does not match formal argument 'myFreq'.",
					e.getMessage());
		}	
		
		//pass params with an uninitialized value
		tActualParams.remove(2);
		tActualParams.add(new ASMLFrequency("actFreq"));
		
		try {
			mFR.passParamValue(tActualParams);
			fail("No exception on uninitialized param.");
		} catch (ASMLSemanticException e) {
			assertEquals("Cannot assign uninitialized actual argument to formal argument 'myFreq'.",
					e.getMessage());
		}
		
		//pass good params
		tActualParams.remove(2);
		tActualParams.add(new ASMLFrequency(3, "actFreq"));
		String tNames[] = {"myAmpl", "myInt", "myFreq"};
		int tTypes[] = {Type.AMPL, Type.INT, Type.FREQ};
		Value tSymbol;
		int i=0;
		
		try {
			mFR.passParamValue(tActualParams);	
			
			for (i = 0; i < tTypes.length; i++) {
				tSymbol = mFR.getSymbol(tNames[i]);
				
				assertEquals(tTypes[i], tSymbol.getType());
				assertTrue("i: "+i, tSymbol.isInitialized());
				assertTrue(tSymbol.isStorable());
				assertEquals(tNames[i], tSymbol.getName());
				
				switch (tTypes[i]) {
				case Type.AMPL:
					assertEquals(1.0, ((ASMLAmplitude)tSymbol).getValue());
					break;
				case Type.INT:
					assertEquals(2, ((ASMLInteger)tSymbol).getValue());
					break;
				case Type.FREQ:
					assertEquals(3.0, ((ASMLFrequency)tSymbol).getValue());
					break;
				}
			}			
		} catch (ASMLSemanticException e) {
			fail("Fail on " + i);
		}
	}

	public void testPassParamString() {
		ArrayList<String> tActualParams = new ArrayList<String>();
		
		//pass params of wrong size (err)
		try {
			mFR.passParamString(tActualParams);
			fail("No exception on params of wrong size.");
		} catch (ASMLSemanticException e) {
			assertEquals("Number of arguments in call differs from " +
					"number of arguments in function declaration.  Call to function FRTest.",
					e.getMessage());
		}
		
		//pass params with mismatched types
		tActualParams.add("1");
		tActualParams.add("2");
		tActualParams.add("actFreq");

		try {
			mFR.passParamString(tActualParams);
			fail("No exception on params of wrong type.");
		} catch (ASMLSemanticException e) {
			assertEquals("Type of actual argument does not match formal argument 'myFreq'.",
					e.getMessage());
		}
		
		//pass good params
		tActualParams.remove(2);
		tActualParams.add("3");
		String tNames[] = {"myAmpl", "myInt", "myFreq"};
		int tTypes[] = {Type.AMPL, Type.INT, Type.FREQ};
		Value tSymbol;
		int i=0;
		
		try {
			mFR.passParamString(tActualParams);	
			
			for (i = 0; i < tTypes.length; i++) {
				tSymbol = mFR.getSymbol(tNames[i]);
				
				assertEquals(tTypes[i], tSymbol.getType());
				assertTrue("i = "+i, tSymbol.isInitialized());
				assertTrue(tSymbol.isStorable());
				assertEquals(tNames[i], tSymbol.getName());
				
				switch (tTypes[i]) {
				case Type.AMPL:
					assertEquals(1.0, ((ASMLAmplitude)tSymbol).getValue());
					break;
				case Type.INT:
					assertEquals(2, ((ASMLInteger)tSymbol).getValue());
					break;
				case Type.FREQ:
					assertEquals(3.0, ((ASMLFrequency)tSymbol).getValue());
					break;
				}
			}			
		} catch (ASMLSemanticException e) {
			fail("Fail on " + i);
		}
	}

	public void testEnterAndExitScope() {
		//enter new scope and access things in higher scope
		Value tValue;
		String errPlace = "add";
		try {
			mFR.addSymbol(new ASMLInteger(5, "level0"));
			errPlace = "get same level";
			tValue = mFR.getSymbol("level0");
			assertEquals(5, ((ASMLInteger)tValue).getValue());
			
			errPlace = "enter scope";
			mFR.enterScope();
			errPlace = "get below";
			tValue = mFR.getSymbol("level0");
			assertEquals(5, ((ASMLInteger)tValue).getValue());
			
		} catch (ASMLSemanticException e) {
			fail("error at: " + errPlace);
		}
		
		//add things to new scope & access them
		errPlace = "add";
		try {
			mFR.addSymbol(new ASMLInteger(6, "level1"));
			errPlace = "get old";
			tValue = mFR.getSymbol("level0");
			assertEquals(5, ((ASMLInteger)tValue).getValue());
			
			errPlace = "get new";
			tValue = mFR.getSymbol("level1");
			assertEquals(6, ((ASMLInteger)tValue).getValue());
			
		} catch (ASMLSemanticException e) {
			fail("error at: " + errPlace);
		}		
		
		//try to access original things		
		//exit new scope and try to access new things (err)
		errPlace = "exit";
		try {
			mFR.exitScope();
			errPlace = "get old";
			tValue = mFR.getSymbol("level0");
			assertEquals(5, ((ASMLInteger)tValue).getValue());
			
			errPlace = "get new";
			tValue = mFR.getSymbol("level1");
			fail("No exception for missing symbol.");
			
		} catch (ASMLSemanticException e) {
			if(errPlace.equals("get new"))
				assertEquals("Undeclared value 'level1'- cannot retrieve.",
						e.getMessage());
			else
				fail("error at: " + errPlace + ": " + e.getMessage());
		}
	}

	public void testAddEditGet() {
		//add a duplicate value (err)
		try {
			mFR.addSymbol(new ASMLInteger("myInt"));
			fail("No exception thrown for adding duplicate.");
		} catch (ASMLSemanticException e) {
			assertEquals("Cannot re-declare value 'myInt' within the same scope.",
					e.getMessage());
		}
		
		//add a non-storable value
		try {
			mFR.addSymbol(new ASMLInteger(1));
			fail("No exception thrown for adding non-storable.");
		} catch (ASMLSemanticException e) {
			assertEquals("Cannot create entry for non-storable value.",
					e.getMessage());
		}		
		
		//update a non-existent value (err)
		try {
			mFR.editSymbol(new ASMLInteger(1, "nonExist"));
			fail("No exception thrown for updating non-existant.");
		} catch (ASMLSemanticException e) {
			assertEquals("Undeclared value 'nonExist'- cannot assign.",
					e.getMessage());
		}
		
		//updade a value with the wrong type (err)
		try {
			mFR.editSymbol(new ASMLInteger(1, "myFreq"));
			fail("No exception thrown for updating with type mismatch.");
		} catch (ASMLSemanticException e) {
			assertEquals("Type mismatch- cannot assign to 'myFreq'.",
					e.getMessage());
		}
		
		//update a value with an uninitialized value (err)
		try {
			mFR.editSymbol(new ASMLInteger("myInt"));
			fail("No exception thrown for updating with uninitialized value.");
		} catch (ASMLSemanticException e) {
			assertEquals("Cannot assign uninitialized value to 'myInt'.",
					e.getMessage());
		}
		
		//update a value in current scope
		try {
			Value tSymbol;
			mFR.editSymbol(new ASMLInteger(20, "myInt"));
			tSymbol = mFR.getSymbol("myInt");
			assertEquals(20, ((ASMLInteger)tSymbol).getValue());
			
			//update a value in a higher scope
			mFR.addSymbol(new ASMLTime(4, "myTime"));
			mFR.enterScope();
			mFR.editSymbol(new ASMLInteger(200, "myInt"));
			tSymbol = mFR.getSymbol("myInt");
			assertEquals(200, ((ASMLInteger)tSymbol).getValue());			
			
			//update a value in multiple scopes
			mFR.addSymbol(new ASMLTime(4, "myTime"));
			mFR.editSymbol(new ASMLTime(40, "myTime"));
			tSymbol = mFR.getSymbol("myTime");
			assertEquals(40.0, ((ASMLTime)tSymbol).getValue());
			
			mFR.exitScope();
			tSymbol = mFR.getSymbol("myTime");
			assertEquals(4.0, ((ASMLTime)tSymbol).getValue());
			tSymbol = mFR.getSymbol("myInt");
			assertEquals(200, ((ASMLInteger)tSymbol).getValue());			
		} catch (ASMLSemanticException e) {
			fail("should be legal operations: "+ e.getMessage());
		}		
	}
}
