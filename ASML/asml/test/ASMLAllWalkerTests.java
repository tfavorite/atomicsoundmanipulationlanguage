package asml.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ASMLAllWalkerTests extends TestCase {
	
	public static Test suite () {
		TestSuite suite = new TestSuite("Automated tests for ASML");
		//$JUnit-BEGIN$
		suite.addTestSuite(ASMLFloatTest.class);
		suite.addTestSuite(ASMLIntegerTest.class);
		
		return suite;
	}
}
