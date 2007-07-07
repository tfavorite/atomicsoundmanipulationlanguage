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
	
/*	public void testConstant(){
		String testSeq = "12 12.3 .3 12Hz 12.3Hz 12ms "+
				"12.3ms 12.3a";
		String compare[] = {"12", "12.3", ".3", "12Hz", "12.3Hz", 
				"12ms",	"12.3ms", "12.3a"}; 
		generalTest(compare, testSeq, ASMLLexer.CONSTANT);
	}*/
	
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
	
/*	public void testAddSub_OP(){
		String testSeq = "+ -";
		String compare[] = {"+", "-"}; 
		generalTest(compare, testSeq, ASMLLexer.ADDSUB_OP);
	}
	
	public void testMultDiv_OP(){
		String testSeq = "* /";
		String compare[] = {"*", "/"}; 
		generalTest(compare, testSeq, ASMLLexer.MULTDIV_OP);
	}*/
	
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
	
	public void testString(){
		String testSeq = "\"this is a test\" \"13-49814jkdf'ks049q35\" "+
		"\"\t\n\r\" \"/*should not be a comment*/\" "+
		"\"double quotes: \\\"\" \"\" \"backslash: \\\\\" "+
		"\"3 backslashes: \\\\\\\\\\\\\" \"slash and quote: \\\\\\\"\" "+
		"\"quote and slash: \\\"\\\\\"";
		
		String compare[] = {"this is a test", 
				"13-49814jkdf'ks049q35", "\t\n\r",
				"/*should not be a comment*/", 
				"double quotes: \"", "","backslash: \\",
				"3 backslashes: \\\\\\", "slash and quote: \\\"",
				"quote and slash: \"\\"}; 
		
		generalTest(compare, testSeq, ASMLLexer.STRING);
	}
	
	public void testID(){
		String testSeq = "a abc123 _ _a _1 _abc123 A AbC123 "+
		"_AvengerzzRawkz _1a2b3C4D5e6 ifnot notif sandifwhich";
		String compare[] = {"a", "abc123", "_", "_a", "_1", 
				"_abc123", "A", "AbC123", "_AvengerzzRawkz", 
				"_1a2b3C4D5e6", "ifnot", "notif", "sandifwhich"}; 
		generalTest(compare, testSeq, ASMLLexer.ID);
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
			/*if(tok.getType() == ASMLLexer.WS)
				continue;*/
			assertNotNull(tok.getText());
			assertEquals(control[i], tok.getText());
			assertEquals(tokType, tok.getType());
			
			i++;
		}
	}
	
	public void testGarbage(){
		String testSeq = "~ ` . { [ ] } ^ @ \"";
		Lexer lex = createLexer(testSeq);
		Token tok;
		
		int i = 0;
		while((tok = lex.nextToken()).getText()!= null){
			/*if(tok.getType() == ASMLLexer.WS)
				continue;*/			
			i++;
		}
		assertTrue(i==0);
	}
	
	public void testSingletons(){
		String testStr = "= ; , at const else end for fun if "+
			"include print return while ( ) + - / * %";
		String control[] = {"=", ";", ",", "at", "const", "else", 
				"end", "for", "fun", "if", "include", "print", 
				"return", "while", "(", ")", "+", "-", "/", "*", 
				"%", "to"};
		int tokType[] = {ASMLLexer.ASSIGN, ASMLLexer.SEMI, 
				ASMLLexer.COMMA, ASMLLexer.AT, ASMLLexer.CONST, 
				ASMLLexer.ELSE, ASMLLexer.END, ASMLLexer.FOR, 
				ASMLLexer.FUN, ASMLLexer.IF, ASMLLexer.INCLUDE, 
				ASMLLexer.PRINT, ASMLLexer.RETURN, ASMLLexer.WHILE, 
				ASMLLexer.LPARENS, ASMLLexer.RPARENS, 
				ASMLLexer.ADD_OP, ASMLLexer.SUB_OP, 
				ASMLLexer.DIV_OP, ASMLLexer.MULT_OP, 
				ASMLLexer.MOD_OP, ASMLLexer.TO};
		
		Lexer lex = createLexer(testStr);
		Token tok;
		
		int i = 0;
		String errMsg;
		while((tok = lex.nextToken()).getText()!= null){
			/*if(tok.getType() == ASMLLexer.WS)
				continue;*/
			
			errMsg = "fail on token: \"" + tok.getText() + "\"";
			assertNotNull(tok.getText());
			assertEquals(control[i], tok.getText());
			assertEquals(errMsg, tokType[i], tok.getType());
			
			i++;
		}
	}

	private ASMLLexer createLexer(String input){
		CharStream stream = new ANTLRStringStream(input);
		return new ASMLLexer(stream);
	}
}
