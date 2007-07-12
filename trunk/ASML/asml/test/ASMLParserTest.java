package asml.test;

import junit.framework.TestCase;
import asml.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;

import org.antlr.runtime.*;

public class ASMLParserTest extends TestCase {
	private ASMLParser mParser;
	private ASMLLexer  mLexer;
	
	public ASMLParserTest(String name) {
		super(name);		
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		
		mLexer = new ASMLLexer();
		mParser = new ASMLParser(new CommonTokenStream(mLexer));
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
		
		mLexer = null;
		mParser = null;
	}
	
	public void testSimple(){
		setLexer(mLexer, "fun int main() end fun");
		setParser(mParser, mLexer);
		
		try {
			mParser.program();		
			assertFalse("my assert false message",mParser.hasError);
		} catch (RecognitionException e) {
			fail(e.getMessage());
		}
	}
	
	public void testIfStmt(){	
		ArrayList<String> testProgs = new ArrayList<String>();
		try {
			//test good ifs
			testProgs = getTestProgs("if tests");
			Iterator<String> it = testProgs.iterator();	
			testPositive(it);
			
			//test bad ifs
			testProgs = getTestProgs("bad ifs");
			it = testProgs.iterator();	
			testNegative(it);			
		} catch (Exception e) {
			fail("problem loading test progs: "+e.getMessage());
		}				
	}
	
	public void testFunDecl(){	
		ArrayList<String> testProgs = new ArrayList<String>();
		try {								
			testProgs = getTestProgs("fun tests");
			Iterator<String> it = testProgs.iterator();	
			testPositive(it);
			
			testProgs = getTestProgs("bad funs");
			it = testProgs.iterator();	
			testNegative(it);
		} catch (Exception e) {
			fail("problem loading test progs: "+e.getMessage());
		}			
	}
	
	public void testWhileStmt(){
		ArrayList<String> testProgs = new ArrayList<String>();
		try {								
			testProgs = getTestProgs("good whiles");
			Iterator<String> it = testProgs.iterator();	
			testPositive(it);
			
			testProgs = getTestProgs("bad whiles");
			it = testProgs.iterator();	
			testNegative(it);
		} catch (Exception e) {
			fail("problem loading test progs: "+e.getMessage());
		}			
	}
	
	public void testForStmt(){
		ArrayList<String> testProgs = new ArrayList<String>();
		try {								
			testProgs = getTestProgs("good fors");
			Iterator<String> it = testProgs.iterator();	
			testPositive(it);
			
			testProgs = getTestProgs("bad fors");
			it = testProgs.iterator();	
			testNegative(it);
		} catch (Exception e) {
			fail("problem loading test progs: "+e.getMessage());
		}			
	}	
	
	public void testReturnStmt(){
		ArrayList<String> testProgs = new ArrayList<String>();
		try {								
			testProgs = getTestProgs("good returns");
			Iterator<String> it = testProgs.iterator();	
			testPositive(it);
			
			testProgs = getTestProgs("bad returns");
			it = testProgs.iterator();	
			testNegative(it);
		} catch (Exception e) {
			fail("problem loading test progs: "+e.getMessage());
		}			
	}	
	
	public void testExprs(){
		ArrayList<String> testProgs = new ArrayList<String>();
		try {								
			testProgs = getTestProgs("good exprs");
			Iterator<String> it = testProgs.iterator();	
			testPositive(it);
			
			testProgs = getTestProgs("bad exprs");
			it = testProgs.iterator();	
			testNegative(it);
		} catch (Exception e) {
			fail("problem loading test progs: "+e.getMessage());
		}			
	}
	
	private void testPositive(Iterator<String> it){
		int i = 1;
		try {
			while (it.hasNext()) {
				setLexer(mLexer, it.next());
				setParser(mParser, mLexer);
				mParser.program();
				assertFalse("failed on program: "+ i, mParser.hasError);
				i++;
			}			
		} catch (Exception e) {
			fail(e.getMessage());
		}	
	}
	
	private void testNegative(Iterator<String> it){
		int i = 1;
		try {
			while (it.hasNext()) {
				setLexer(mLexer, it.next());
				setParser(mParser, mLexer);
				mParser.program();
				assertTrue("failed on program: "+ i, mParser.hasError);
				i++;
			}			
		} catch (Exception e) {
			fail(e.getMessage());
		}	
	}
	
	private void setLexer(Lexer lex, String input){
		lex.reset();
		lex.setCharStream(new ANTLRStringStream(input));
	}
	
	private void setParser(Parser par, Lexer lex){
		par.reset();
		par.setTokenStream(new CommonTokenStream(lex));
	}
	
	private ArrayList<String> getTestProgs(String tag) 
			throws Exception{
		ArrayList<String> list = new ArrayList<String>();
		BufferedReader in = new BufferedReader(
				new FileReader("asml\\test\\TestPrograms.txt"));
		
		String line, temp = "";
		while((line = in.readLine())!= null){
			if((line.compareTo("") != 0) && 
					(line.charAt(0)=='@') && 
					(line.substring(1).compareTo(tag) == 0)){
				temp = "";
				while((line = in.readLine())!= null){
					if((line.compareTo("") == 0) ||
							(line.substring(0, 2).compareTo("//") == 0))
						continue;
					if(line.charAt(0)=='#'){ 
						if(temp.compareTo("")!=0){
							list.add(temp);
							temp = "";
						}//end if it's a program separator
					}//end if == #
					else if(line.charAt(0)=='@'){ //it's the next tag, we're done
						list.add(temp);
						in.close();
						return list;
					}//end if == @
					else //it is the line of a program
						temp += (" "+line);
				}//end while
			}//end if we are at our tag
		}//end while
		
		if(temp.compareTo("")!=0)
			list.add(temp);
		in.close();
		
		if(list.isEmpty())
			throw new Exception("no programs matched requested tag");
		
		return list;
	}
}