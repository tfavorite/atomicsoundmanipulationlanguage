package asml.test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Test;

public class ASMLAllTests extends TestCase {

	public static Test suite () {
		TestSuite suite = new TestSuite("Automated tests for ASML");
		//$JUnit-BEGIN$
		suite.addTestSuite(ASMLLexerTest.class);
		suite.addTestSuite(ASMLParserTest.class);
		suite.addTestSuite(ASMLASTTest.class);
		suite.addTestSuite(ASMLFloatTest.class);
		suite.addTestSuite(ASMLIntegerTest.class);
		suite.addTestSuite(ASMLFrequencyTest.class);
		suite.addTestSuite(ASMLAmplitudeTest.class);
		suite.addTestSuite(ASMLTimeTest.class);
		suite.addTestSuite(ASMLStringTest.class);
		
		return suite;
	}

}