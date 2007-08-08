/**
 * 
 */
package asml;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import asml.walker.ASMLControl;
import asml.walker.FunctionRecord;


/**
 * This class acts as the loader for the ASML language.  You call this class and feed it the
 * program and the input data and it will spit out the right results.
 * @author Frank A. Smith and Tim Favorite
 *
 */
public class ASML {

	/**
	 * @param args 
	 * -p: this specifies the *.asml program that is being run.  Required.
	 * -i: this specifies the *.wav input file.  This file is accessible through the "input"
	 * 	keyword in the program's main() function.  Required.
	 * -o: this specifies the *.wav output file.  If this is not specified, it 
	 * 	defaults to the specified input file.
	 * unmarked arguments: will be taken in order and must conform to the argument list for
	 * 	the program's main() function. 
	 */
	public static void main(String[] args) {
		if(args.length < 4)
			error("Insufficient arguments to run an ASML program", true);
		
		ArrayList<String> tUnspecdArgs = new ArrayList<String>();
		String tProgramFile = "";
		String tInputFile = "";
		String tOutputFile = "";
		String previousArg = "";
		
		for(int i=0; i<args.length; i++){
			if(args[i].equals("-p") || args[i].equals("-i") || args[i].equals("-o")) 
				previousArg = args[i];
			else {
				if (previousArg.equals("-p")){
					tProgramFile = args[i];
					previousArg = "";
				} else if (previousArg.equals("-i")){
					tInputFile = args[i];
					previousArg = "";
				} else if (previousArg.equals("-o")){
					tOutputFile = args[i];
					previousArg = "";
				} else tUnspecdArgs.add(args[i]);
			}
		}
		
		if (tProgramFile.equals("")) error("No program file was specified.", true);
		if (tInputFile.equals("")) error("No input file was specified.", true);
		if (tOutputFile.equals("")) tOutputFile = tInputFile;
		
		checkFileName(".asml", tProgramFile);
		checkFileName(".wav", tInputFile);
		checkFileName(".wav", tOutputFile);
		
		try {
			callASML(tProgramFile, tInputFile, tOutputFile, tUnspecdArgs);
		} catch (RecognitionException e) {
			error(e.getMessage(), false);
		}
	}
	
	private static void callASML(String programFile, String inputFile, String outputFile,
			ArrayList<String> unspecdArgs) throws RecognitionException {
		ANTLRFileStream input = null;
		
		//exit the program if it's a bad input file
		try {
			input = new ANTLRFileStream(programFile);
		} catch (IOException e) {
			error(e.getMessage(), true);
		}
		
        //Lexer
        ASMLLexer lexer = new ASMLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        //Parser and AST construction
        ASMLParser parser = new ASMLParser(tokens);
        ASMLParser.program_return result = parser.program();
        CommonTree t = (CommonTree)result.getTree();

        CommonTreeNodeStream nodes=new CommonTreeNodeStream(t);
        
        //Function Identification
        ASMLFunWalker f_walker = new ASMLFunWalker(nodes);
        f_walker.program();
        
        HashMap<String, FunctionRecord> tFunMap = f_walker.getFunctionTable();

        //Interperter
        nodes=new CommonTreeNodeStream(t);
        ASMLWalker e_walker = new ASMLWalker(nodes);
        ASMLControl control = new ASMLControl(tFunMap,
        		unspecdArgs, inputFile, outputFile, e_walker);
        e_walker.setControl(control);
        e_walker.program();       
	}

	private static void error(String msg, boolean aPrintMsg){
		if(aPrintMsg){
			System.err.println(msg);
			System.err.println("Usage: \n"+
					"-p: this specifies the *.asml program that is being run.  Required.\n" +
					"-i: this specifies the *.wav input file.  This file is accessible through the 'input'\n"+
					"  	keyword in the program's main() function.  Required.\n" +
					"-o: this specifies the *.wav output file.  If this is not specified, it\n" + 
					"  	defaults to the specified input file.\n" +
					"unmarked arguments: will be taken in order and must conform to the argument list for\n" +
					"  	the program's main() function. ");
		}
		System.exit(-1);
	}
	
	private static void checkFileName(String extension, String fileName){
		if (!fileName.endsWith(extension)) 
			error("File " + fileName + " is not of type ." + extension, true);
	}

}
