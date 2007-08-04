package asml.test;

import junit.framework.TestCase;
import asml.walker.*;

public class SymbolTableTest extends TestCase {
	private SymbolTable mParent = null;
	private SymbolTable mChild  = null;

	public SymbolTableTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		mParent = new SymbolTable();
		mChild = new SymbolTable(mParent);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		mParent = null;
		mChild  = null;
	}

	public void testDeclare() {
		//Non storable arg
		ASMLInteger tNonStore = new ASMLInteger(1);
		try {
			mParent.declare(tNonStore);
			fail("No error on non-storable declaration");
		} catch (ASMLSemanticException e) {
			assertEquals("Cannot create entry for non-storable value.",
					e.getMessage());
		}
		
		//Good declare
		ASMLInteger tGood = new ASMLInteger(1, "good");
		try {
			mParent.declare(tGood);
			ASMLInteger tVerify = (ASMLInteger)mParent.retrieve("good");
			assertEquals(tGood, tVerify);
		} catch (ASMLSemanticException e) {
			fail("Good Declare failed.  Error: " + e.getMessage());
		}
		
		//Duplicate Declare
		try {
			mParent.declare(tGood);
			fail("No error on duplicate declaration");
		} catch (ASMLSemanticException e) {
			assertEquals("Cannot re-declare value 'good' within the same scope.",
					e.getMessage());
		}
		
		//Declare duplicate in Child
		try {
			mChild.declare(tGood);
			ASMLInteger tVerify = (ASMLInteger)mChild.retrieve("good");
			assertEquals(tGood, tVerify);
		} catch (ASMLSemanticException e) {
			fail("Good Declare failed.  Error: " + e.getMessage());
		}		
	}

	public void testUpdateStringValue() {
		//Non storable arg
		ASMLInteger tNonStore = new ASMLInteger(1);
		try {
			mParent.update("test", tNonStore);
			fail("No error on non-storable declaration");
		} catch (ASMLSemanticException e) {
			assertEquals("Cannot create entry for non-storable value.",
					e.getMessage());
		}
		
		//value not in table (parent) (err)
		ASMLInteger tPUSIP = new ASMLInteger(1, "PUSIP");
		try {
			mParent.update("PUSIP", tPUSIP);
			fail("no error for updating non-existent symbol.");
		} catch (ASMLSemanticException e) {
			assertEquals("Undeclared value 'PUSIP'- cannot assign.",
					e.getMessage());
		}
		
		//value not in table (child) (err)
		try {
			mChild.update("PUSIP", tPUSIP);
			fail("no error for updating non-existent symbol.");
		} catch (ASMLSemanticException e) {
			assertEquals("Undeclared value 'PUSIP'- cannot assign.",
					e.getMessage());
		}
		
		//parent update, symbol in parent
		try {
			mParent.declare(tPUSIP);
			mParent.update("PUSIP", new ASMLInteger(2, "PUSIP"));
			assertEquals(2, ((ASMLInteger)mParent.retrieve("PUSIP")).getValue());
		} catch (ASMLSemanticException e) {
			fail("This should be legal.");
		}
		
		//update a value with an uninitialized value (err)
		try {
			mParent.update("PUSIP", new ASMLInteger("PUSIP"));
			fail("No exception thrown for updating with uninitialized value.");
		} catch (ASMLSemanticException e) {
			assertEquals("Cannot assign uninitialized value to 'PUSIP'.",
					e.getMessage());
		}
		
		//child update, symbol in parent
		try {
			mChild.update("PUSIP", new ASMLInteger(3, "PUSIP"));
			assertEquals(3, ((ASMLInteger)mParent.retrieve("PUSIP")).getValue());
		} catch (ASMLSemanticException e) {
			fail("This should be legal.");
		}
		
		//parent update, symbol in child (err)
		ASMLInteger tCUSIC = new ASMLInteger(1, "CUSIC");
		try {
			mChild.declare(tCUSIC);
		} catch (ASMLSemanticException e) {
			fail("This should be legal.");
		}
		
		try {
			mParent.update("CUSIC", new ASMLInteger(2, "CUSIC"));
			fail("no error for updating non-existent symbol.");
		} catch (ASMLSemanticException e) {
			assertEquals("Undeclared value 'CUSIC'- cannot assign.",
					e.getMessage());
		}
		
		//child update, symbol in child
		try {
			mChild.update("CUSIC", new ASMLInteger(2, "CUSIC"));
			assertEquals(2, ((ASMLInteger)mChild.retrieve("CUSIC")).getValue());
		} catch (ASMLSemanticException e) {
			fail("This should be legal.");
		}
		
		//parent update, symbol in both
		ASMLInteger tPUSIB = new ASMLInteger(1, "PUSIB");
		try {
			mParent.declare(tPUSIB);
			mChild.declare(tPUSIB);
			mParent.update("PUSIB", new ASMLInteger(2, "PUSIB"));
			assertEquals(2, ((ASMLInteger)mParent.retrieve("PUSIB")).getValue());
			assertEquals(1, ((ASMLInteger)mChild.retrieve("PUSIB")).getValue());
		} catch (ASMLSemanticException e) {
			fail("This should be legal.");
		}
		
		//child update, symbol in both
		try {
			mChild.update("PUSIB", new ASMLInteger(3, "PUSIB"));
			assertEquals(2, ((ASMLInteger)mParent.retrieve("PUSIB")).getValue());
			assertEquals(3, ((ASMLInteger)mChild.retrieve("PUSIB")).getValue());
		} catch (ASMLSemanticException e) {
			fail("This should be legal.");
		}
		
		//update to wrong type (err)
		try {
			mParent.update("PUSIP", new ASMLFloat(2, "PUSIP"));
			fail("no error for updating non-existent symbol.");
		} catch (ASMLSemanticException e) {
			assertEquals("Type mismatch- cannot assign to 'PUSIP'.",
					e.getMessage());
		}
	}

	public void testUpdateValue() {
		//Non storable arg
		ASMLInteger tNonStore = new ASMLInteger(1);
		try {
			mParent.update(tNonStore);
			fail("No error on non-storable declaration");
		} catch (ASMLSemanticException e) {
			assertEquals("Cannot create entry for non-storable value.",
					e.getMessage());
		}
		
		//value not in table (parent) (err)
		ASMLInteger tPUSIP = new ASMLInteger(1, "PUSIP");
		try {
			mParent.update(tPUSIP);
			fail("no error for updating non-existent symbol.");
		} catch (ASMLSemanticException e) {
			assertEquals("Undeclared value 'PUSIP'- cannot assign.",
					e.getMessage());
		}
		
		//value not in table (child) (err)
		try {
			mChild.update(tPUSIP);
			fail("no error for updating non-existent symbol.");
		} catch (ASMLSemanticException e) {
			assertEquals("Undeclared value 'PUSIP'- cannot assign.",
					e.getMessage());
		}
		
		//parent update, symbol in parent
		try {
			mParent.declare(tPUSIP);
			mParent.update(new ASMLInteger(2, "PUSIP"));
			assertEquals(2, ((ASMLInteger)mParent.retrieve("PUSIP")).getValue());
		} catch (ASMLSemanticException e) {
			fail("This should be legal.");
		}
		
		//update a value with an uninitialized value (err)
		try {
			mParent.update(new ASMLInteger("PUSIP"));
			fail("No exception thrown for updating with uninitialized value.");
		} catch (ASMLSemanticException e) {
			assertEquals("Cannot assign uninitialized value to 'PUSIP'.",
					e.getMessage());
		}
		
		//child update, symbol in parent
		try {
			mChild.update(new ASMLInteger(3, "PUSIP"));
			assertEquals(3, ((ASMLInteger)mParent.retrieve("PUSIP")).getValue());
		} catch (ASMLSemanticException e) {
			fail("This should be legal.");
		}
		
		//parent update, symbol in child (err)
		ASMLInteger tCUSIC = new ASMLInteger(1, "CUSIC");
		try {
			mChild.declare(tCUSIC);
		} catch (ASMLSemanticException e) {
			fail("This should be legal.");
		}
		
		try {
			mParent.update(new ASMLInteger(2, "CUSIC"));
			fail("no error for updating non-existent symbol.");
		} catch (ASMLSemanticException e) {
			assertEquals("Undeclared value 'CUSIC'- cannot assign.",
					e.getMessage());
		}
		
		//child update, symbol in child
		try {
			mChild.update(new ASMLInteger(2, "CUSIC"));
			assertEquals(2, ((ASMLInteger)mChild.retrieve("CUSIC")).getValue());
		} catch (ASMLSemanticException e) {
			fail("This should be legal.");
		}
		
		//parent update, symbol in both
		ASMLInteger tPUSIB = new ASMLInteger(1, "PUSIB");
		try {
			mParent.declare(tPUSIB);
			mChild.declare(tPUSIB);
			mParent.update(new ASMLInteger(2, "PUSIB"));
			assertEquals(2, ((ASMLInteger)mParent.retrieve("PUSIB")).getValue());
			assertEquals(1, ((ASMLInteger)mChild.retrieve("PUSIB")).getValue());
		} catch (ASMLSemanticException e) {
			fail("This should be legal.");
		}
		
		//child update, symbol in both
		try {
			mChild.update(new ASMLInteger(3, "PUSIB"));
			assertEquals(2, ((ASMLInteger)mParent.retrieve("PUSIB")).getValue());
			assertEquals(3, ((ASMLInteger)mChild.retrieve("PUSIB")).getValue());
		} catch (ASMLSemanticException e) {
			fail("This should be legal.");
		}
		
		//update to wrong type (err)
		try {
			mParent.update(new ASMLFloat(2, "PUSIP"));
			fail("no error for updating non-existent symbol.");
		} catch (ASMLSemanticException e) {
			assertEquals("Type mismatch- cannot assign to 'PUSIP'.",
					e.getMessage());
		}
	}

	public void testRetrieve() {
		//value not in table		
		try {
			mParent.retrieve("CUSIC");
			fail("no error for retrieving non-existent symbol.");
		} catch (ASMLSemanticException e) {
			assertEquals("Undeclared value 'CUSIC'- cannot retrieve.",
					e.getMessage());
		}
		
		//value in parent - get from parent
		ASMLInteger tInParent = new ASMLInteger(1, "inParent");
		try {
			mParent.declare(tInParent);
			assertEquals(1, ((ASMLInteger)mParent.retrieve("inParent")).getValue());
			//value in parent - get from child
			assertEquals(1, ((ASMLInteger)mChild.retrieve("inParent")).getValue());
		} catch (ASMLSemanticException e) {
			fail("This should be legal.");
		}
		
		//value in child - get from parent (err)
		ASMLInteger tInChild = new ASMLInteger(9, "inChild");		
		try {
			mChild.declare(tInChild);
			mParent.retrieve("inChild");
			fail("no error for retrieving non-existent symbol.");
		} catch (ASMLSemanticException e) {
			assertEquals("Undeclared value 'inChild'- cannot retrieve.",
					e.getMessage());
		}
		
		//value in child - get from child
		try {
			assertEquals(9, ((ASMLInteger)mChild.retrieve("inChild")).getValue());
		} catch (ASMLSemanticException e) {
			fail("This should be legal.");
		}
		
		//value in both - get from parent
		//value in both - get from child
		try {
			mParent.declare(new ASMLInteger(6, "inBoth"));
			mChild.declare(new ASMLInteger(4, "inBoth"));
			assertEquals(6, ((ASMLInteger)mParent.retrieve("inBoth")).getValue());
			assertEquals(4, ((ASMLInteger)mChild.retrieve("inBoth")).getValue());
		} catch (ASMLSemanticException e) {
			fail("This should be legal.");
		}
	}

}
