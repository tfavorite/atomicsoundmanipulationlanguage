/**
 * 
 */
package asml;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.ArrayList;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;


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
			error("Insufficient arguments to run an ASML program");
		
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
		
		if (tProgramFile.equals("")) error("No program file was specified.");
		if (tInputFile.equals("")) error("No input file was specified.");
		if (tOutputFile.equals("")) tOutputFile = tInputFile;
		
		checkFileName(".asml", tProgramFile);
		checkFileName(".wav", tInputFile);
		checkFileName(".wav", tOutputFile);
		
		try {
			FileInputStream f = new FileInputStream(tProgramFile);
		} catch (FileNotFoundException e) {
			System.out.println("couldn't find it");
		}
		
		
		callASML(tProgramFile);
	}
	
	private static void callASML(String programFile) {
		ANTLRFileStream input = null;
		
		//exit the program if it's a bad input file
		try {
			input = new ANTLRFileStream(programFile);
		} catch (IOException e) {
			error(e.getMessage());
		}
		
		ASMLLexer lex = new ASMLLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lex);
		ASMLParser par = new ASMLParser(tokens);	
		ASMLParser.program_return AST = null;
		
		//exit the program if there is a syntax error.
		try {
			AST = par.program();
		} catch (RecognitionException e) {
			error("Syntax Error: " + e.getMessage());
		}
		
        CommonTree t = (CommonTree)AST.getTree();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
        nodes.setTokenStream(tokens);
        ASMLWalker walker = new ASMLWalker(nodes);
        
        //exit the program if there is a syntax error
        try {
			walker.program();
		} catch (RecognitionException e) {
			error("Semantic Error: " + e.getMessage());
		}        
	}

	private static void error(String msg){
		System.err.println(msg);
		System.err.println("Usage: \n"+
				"-p: this specifies the *.asml program that is being run.  Required.\n" +
				"-i: this specifies the *.wav input file.  This file is accessible through the 'input'\n"+
				"  	keyword in the program's main() function.  Required.\n" +
				"-o: this specifies the *.wave output file.  If this is not specified, it\n" + 
				"  	defaults to the specified input file.\n" +
				"unmarked arguments: will be taken in order and must conform to the argument list for\n" +
				"  	the program's main() function. ");
		System.exit(-1);
	}
	
	private static void checkFileName(String extension, String fileName){
		if (!fileName.endsWith(extension)) 
			error("File " + fileName + " is not of type ." + extension);
	}

}
