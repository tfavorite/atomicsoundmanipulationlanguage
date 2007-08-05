package asml.test;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

import asml.*;
import asml.walker.*;
import junit.framework.TestCase;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class ASMLFunWalkerTest extends TestCase {

	public ASMLFunWalkerTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testProgram1() throws Exception{
		ASMLFunWalker tFWalk = createWalker("program 1");
		
		tFWalk.program();
		
		HashMap<String, FunctionRecord> tFunTable = tFWalk.getFunctionTable();
		
		assertEquals(3, tFunTable.size());
		
		//fun 1
		FunctionRecord tCurrRecord = tFunTable.get("fun1Args2");
		assertEquals(2, tCurrRecord.getNumArgs());
		assertNotNull(tCurrRecord.getBlockRt());
		
		ArrayList<Value> tActArgs = new ArrayList<Value>();
		try {
			tCurrRecord.passParamValue(tActArgs);
			fail("Should not have been able to pass empty arg list");
		} catch (ASMLSemanticException e) {	}
		
		tActArgs.add(new ASMLInteger(1));
		tActArgs.add(new ASMLFloat(2));
		tCurrRecord.passParamValue(tActArgs);
		try {
			tCurrRecord.setRetVal(new ASMLInteger(2));
			fail("Should not have been able to set return value to wrong type.");
		} catch (ASMLSemanticException e) {	}
		tCurrRecord.setRetVal(new ASMLAmplitude(2));
		
		//fun 2
		tCurrRecord = tFunTable.get("fun2Args3");
		assertEquals(3, tCurrRecord.getNumArgs());
		assertNotNull(tCurrRecord.getBlockRt());
		
		tActArgs.clear();
		try {
			tCurrRecord.passParamValue(tActArgs);
			fail("Should not have been able to pass empty arg list");
		} catch (ASMLSemanticException e) {	}
		
		tActArgs.add(new ASMLFrequency(1));
		tActArgs.add(new ASMLAmplitude(2));
		tActArgs.add(new ASMLTime(2));
		tCurrRecord.passParamValue(tActArgs);
		try {
			tCurrRecord.setRetVal(new ASMLInteger(2));
			fail("Should not have been able to set return value to wrong type.");
		} catch (ASMLSemanticException e) {	}
		tCurrRecord.setRetVal(new ASMLTime(2));
		
		//fun 3
		tCurrRecord = tFunTable.get("fun3Args0");
		assertEquals(0, tCurrRecord.getNumArgs());
		assertNotNull(tCurrRecord.getBlockRt());
		
		try {
			tCurrRecord.passParamValue(tActArgs);
			fail("Should not have been able to pass populated arg list");
		} catch (ASMLSemanticException e) {	}
		
		tActArgs.clear();
		tCurrRecord.passParamValue(tActArgs);
		try {
			tCurrRecord.setRetVal(new ASMLTime(2));
			fail("Should not have been able to set return value to wrong type.");
		} catch (ASMLSemanticException e) {	}
		tCurrRecord.setRetVal(new ASMLInteger(2));
	}
	
	private ASMLFunWalker createWalker(String aProgTag) throws Exception{
		String tProgram = getProgramString(aProgTag);
		
        ANTLRStringStream input = new ANTLRStringStream(tProgram);
        ASMLLexer lexer = new ASMLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ASMLParser parser = new ASMLParser(tokens);
        ASMLParser.program_return r = null;
        try {
			r = parser.program();
		} catch (RecognitionException e) {
			fail("Parse error: " + e.getMessage());
		}
		
		CommonTree t = (CommonTree)r.getTree();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
        nodes.setTokenStream(tokens);
        ASMLFunWalker walker = new ASMLFunWalker(nodes);
		
		return walker;
	}
	
	private String getProgramString(String aProgTag) throws Exception{
		String tProgram = "";
		BufferedReader in = new BufferedReader(
				new FileReader("asml\\test\\FunWalkerTest.txt"));
		
		String line = "";
		while((line = in.readLine())!= null){
			if((line.compareTo("") != 0) && 
					(line.charAt(0)=='@') && 
					(line.substring(1).compareTo(aProgTag) == 0)){
				while((line = in.readLine())!= null){
					if((line.compareTo("") == 0) || 
							((line.substring(0, 1).compareTo("/") == 0) && 
									line.substring(1,2).compareTo("/") == 0))
						continue;
					if(line.charAt(0)=='@'){ //it's the next aProgTag, we're done
						return tProgram;
					}//end if == @
					else //it is the line of a program
						tProgram += (" "+line);
				}//end while
			}//end if we are at our aProgTag
		}//end while
		

		in.close();
		
		if(tProgram.equals(""))
			throw new Exception("no programs matched requested aProgTag");
		
		return tProgram;
	}
}
