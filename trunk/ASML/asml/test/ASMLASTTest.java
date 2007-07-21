package asml.test;

import junit.framework.TestCase;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import asml.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

public class ASMLASTTest extends TestCase {
	private ASMLParser        mParser;
	private ASMLLexer         mLexer;
	private ArrayList<String> mTestProgs;
	private ArrayList<String> mControlTrees;
	
	public ASMLASTTest(String name) {
		super(name);	
		mTestProgs    = new ArrayList<String>();
		mControlTrees = new ArrayList<String>();
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
	
/*	public void testSimple()throws RecognitionException{
		String prog = "fun wave main() end fun fun int b() end fun";
		
		ASMLLexer lexer = new ASMLLexer(new ANTLRStringStream(prog));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ASMLParser parser = new ASMLParser(tokens);
		ASMLParser.program_return r = parser.program();
		CommonTree t = (CommonTree)r.getTree();
		System.out.println(t.toStringTree());
	}*/
	
	public void testFunctions(){
		try {
			loadTestsAndResults("functions");
			Iterator<String> progsIter   = mTestProgs.iterator();
			Iterator<String> controlIter = mControlTrees.iterator();
			runTests(progsIter, controlIter);
		} catch (Exception e) {
			fail("problem loading test progs: "+e.getMessage());
		}
	}
	
	public void testExpressions(){
		try {
			loadTestsAndResults("expressions");
			Iterator<String> progsIter   = mTestProgs.iterator();
			Iterator<String> controlIter = mControlTrees.iterator();
			runTests(progsIter, controlIter);
		} catch (Exception e) {
			fail("problem loading test progs: "+e.getMessage());
		}
	}
	
	public void testDeclarations(){
		try {
			loadTestsAndResults("declarations");
			Iterator<String> progsIter   = mTestProgs.iterator();
			Iterator<String> controlIter = mControlTrees.iterator();
			runTests(progsIter, controlIter);
		} catch (Exception e) {
			fail("problem loading test progs: "+e.getMessage());
		}
	}
	
	protected void runTests(Iterator<String> aPrograms, 
			Iterator<String> aControl){
		
		int i = 1;
		CommonTree tCurTree;
		String tCurTreeVal;
		
		try {
			while (aPrograms.hasNext() && aControl.hasNext()) {
				setLexer(mLexer, aPrograms.next());
				setParser(mParser, mLexer);
				tCurTree = (CommonTree)mParser.program().getTree();
				tCurTreeVal = tCurTree.toStringTree(); 
				
				assertNotNull(tCurTreeVal);
				assertEquals("failed on program: "+ i, 
						aControl.next(), tCurTreeVal);
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
	
	private void setParser(Parser par, Lexer lex){
		par.reset();
		par.setTokenStream(new CommonTokenStream(lex));
	}

	private void loadTestsAndResults(String tag) throws Exception{
		BufferedReader in = new BufferedReader(
				new FileReader("asml\\test\\ASTPrograms.txt"));
		
		mTestProgs.clear();
		mControlTrees.clear();
		
		String line, progTemp = "";
		while((line = in.readLine())!= null){
			if((line.compareTo("") != 0) && 
					(line.charAt(0)=='@') && 
					(line.substring(1).compareTo(tag) == 0)){
				progTemp = "";
				//contTemp = "";
				while((line = in.readLine())!= null){
					if((line.compareTo("") == 0) || 
							((line.substring(0, 1).compareTo("/") == 0) && 
									line.substring(1,2).compareTo("/") == 0))
						continue;
					if(line.charAt(0)=='#'){ 
						if(progTemp.compareTo("")!=0){
							mTestProgs.add(progTemp);
							progTemp = "";
							mControlTrees.add(line.substring(1, line.length()));
						}//end if it's a program separator
					}//end if == #
					else if(line.charAt(0)=='@'){ //it's the next tag, we're done
						in.close();
						return;
					}//end if == @
					else //it is the line of a program
						progTemp += (" "+line);
				}//end while
			}//end if we are at our tag
		}//end while
		
		if(progTemp.compareTo("")!=0)
			mTestProgs.add(progTemp);
		in.close();
		
		if(mTestProgs.isEmpty() || mControlTrees.isEmpty())
			throw new Exception("no programs matched requested tag");
		
		if(mTestProgs.size() != mControlTrees.size())
			throw new Exception("unequal number of test programs and control strings");
	}
}
