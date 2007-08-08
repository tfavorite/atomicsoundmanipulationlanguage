package asml.test;

import junit.framework.TestCase;
import asml.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.RewriteEmptyStreamException;

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
	
	public void testPrintStmt(){
		ArrayList<String> testProgs = new ArrayList<String>();
		try {								
			testProgs = getTestProgs("good prints");
			Iterator<String> it = testProgs.iterator();	
			testPositive(it);
			
			testProgs = getTestProgs("bad prints");
			it = testProgs.iterator();	
			testNegative(it);
		} catch (Exception e) {
			fail("problem loading test progs: "+e.getMessage());
		}			
	}			
	
	public void testInclude(){
		ArrayList<String> testProgs = new ArrayList<String>();
		try {								
			testProgs = getTestProgs("good includes");
			Iterator<String> it = testProgs.iterator();	
			testPositive(it);
			
			testProgs = getTestProgs("bad includes");
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
	
	public void testDecls(){
		ArrayList<String> testProgs = new ArrayList<String>();
		try {								
			testProgs = getTestProgs("good decls");
			Iterator<String> it = testProgs.iterator();	
			testPositive(it);
			
			testProgs = getTestProgs("bad decls");
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
			fail("failed on program: "+ i + ": " + e.getMessage());
		}	
	}
	
	private void testNegative(Iterator<String> it){
		int i = 1;
		try {
			while (it.hasNext()) {
				setLexer(mLexer, it.next());
				setParser(mParser, mLexer);
				assertFalse("has error not refreshed on program "+i, mParser.hasError);
				try {
					mParser.program();
					fail("exception not thrown for program: "+i);
				} catch (RewriteEmptyStreamException e) {
					/* This happens sometimes now that the AST has been made.
					 * Do Nothing: Hopefully hasError has already been thrown*/
					System.out.println("Program " + i + " encountered an AST related problem");
				} catch (RecognitionException re){}
				assertTrue("failed on program: "+ i, mParser.hasError);
				i++;
			}			
		} catch (Exception e) {
			fail("failed on program: "+ i + ": " + e.getMessage());
		}	
	}
	
	private void setLexer(Lexer lex, String input){
		lex.reset();
		lex.setCharStream(new ANTLRStringStream(input));
	}
	
	private void setParser(ASMLParser par, Lexer lex){
		par.reset();
		par.setHasError(false);
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
							((line.substring(0, 1).compareTo("/") == 0) && 
									line.substring(1,2).compareTo("/") == 0))
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
