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
		suite.addTestSuite(ASMLFrequencyTest.class);
		suite.addTestSuite(ASMLAmplitudeTest.class);
		suite.addTestSuite(ASMLTimeTest.class);
		suite.addTestSuite(ASMLStringTest.class);
		suite.addTestSuite(SymbolTableTest.class);
		suite.addTestSuite(FunctionRecordTest.class);
		
		return suite;
	}
}
