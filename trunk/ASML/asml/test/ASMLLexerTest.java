package asml.test;

import org.antlr.runtime.*;

import junit.framework.TestCase;
import asml.ASMLLexer;

public class ASMLLexerTest extends TestCase {

	public ASMLLexerTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testNumber(){
		String testSeq = "12 12.3 .3 12Hz 12.3Hz 12ms "+
				"12.3ms 12.3a";
		String compare[] = {"12", "12.3", ".3", "12Hz", "12.3Hz", 
				"12ms",	"12.3ms", "12.3a"}; 
		generalTest(compare, testSeq, ASMLLexer.NUMBER);
	}
	
	public void testComment(){
		String testSeq = "/**/ /***/ /*as;klfjpo98w3-a8hwfjawoi*/"+
			"/*/**/ /*23209345__+WE))(WEEPLEFPE#S#FE*/ /*\t    */"+
			"/*/////////////////////*****/ /**//**/";
		String compare[] = {"/**/", "/***/", 
				"/*as;klfjpo98w3-a8hwfjawoi*/", "/*/**/", 
				"/*23209345__+WE))(WEEPLEFPE#S#FE*/", 
				"/*\t    */",
				"/*/////////////////////*****/", "/**/", "/**/"}; 
		generalTest(compare, testSeq, ASMLLexer.COMMENT);
	}
	
	public void testAddSub_OP(){
		String testSeq = "+ -";
		String compare[] = {"+", "-"}; 
		generalTest(compare, testSeq, ASMLLexer.ADDSUB_OP);
	}
	
	public void testMultDiv_OP(){
		String testSeq = "* /";
		String compare[] = {"*", "/"}; 
		generalTest(compare, testSeq, ASMLLexer.MULTDIV_OP);
	}
	
	public void testRel_OP(){
		String testSeq = "< > <= >= != == <<===";
		String compare[] = {"<", ">", "<=", ">=", "!=", "==", 
				"<", "<=", "=="}; 
		generalTest(compare, testSeq, ASMLLexer.REL_OP);
	}
	
	public void testLog_OP(){
		String testSeq = "&& ||";
		String compare[] = {"&&", "||"}; 
		generalTest(compare, testSeq, ASMLLexer.LOG_OP);
	}
	
	public void testType(){
		String testSeq = "ampl float freq int time wave";
		String compare[] = {"ampl", "float", "freq", "int", 
				"time", "wave"}; 
		generalTest(compare, testSeq, ASMLLexer.TYPE);
	}
	
	/*
	 * Good for testing a long string of tokens of the same type
	 * against their token type and a control sequence of known
	 * string values.  Compare expected lexemes to actual.
	 **/
	/* Template for calling function:
	 	String testSeq = "";
		String compare[] = {}; 
		generalTest(compare, testSeq, ASMLLexer);
	*/
	private void generalTest(String[] control, String testStr,
			int tokType){
		Lexer lex = createLexer(testStr);
		Token tok;
		
		int i = 0;
		while((tok = lex.nextToken()).getText()!= null){
			if(tok.getType() == ASMLLexer.WS)
				continue;
			assertEquals(control[i], tok.getText());
			assertEquals(tokType, tok.getType());
			
			i++;
		}
	}
	
	public void testSingletons(){
		String testStr = "= ; at const else end foreach fun if "+
			"include print return";
		String control[] = {"=", ";", "at", "const", "else", "end", 
				"foreach", "fun", "if",	"include", "print", "return"};
		int tokType[] = {ASMLLexer.ASSIGN, ASMLLexer.SEMI, 
				ASMLLexer.AT, ASMLLexer.CONST, ASMLLexer.ELSE, 
				ASMLLexer.END, ASMLLexer.FOREACH, ASMLLexer.FUN, 
				ASMLLexer.IF, ASMLLexer.INCLUDE, ASMLLexer.PRINT, 
				ASMLLexer.RETURN};
		
		Lexer lex = createLexer(testStr);
		Token tok;
		
		int i = 0;
		while((tok = lex.nextToken()).getText()!= null){
			if(tok.getType() == ASMLLexer.WS)
				continue;
			assertEquals(control[i], tok.getText());
			assertEquals(tokType[i], tok.getType());
			
			i++;
		}
	}

	private ASMLLexer createLexer(String input){
		CharStream stream = new ANTLRStringStream(input);
		return new ASMLLexer(stream);
	}
}
