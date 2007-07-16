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
		
		return suite;
	}

}
