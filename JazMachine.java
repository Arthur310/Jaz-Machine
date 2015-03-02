/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazmachine;

import java.io.PrintStream;
import java.util.List;

/**
 *
 * @author Son
 */
public class JazMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length < 2) {
            System.err.println("Required parameters: <infile> <outfile>");
            return;
        }

        String inFile = args[0];
        String outFile = args[1];

    	try {
	        List<CodeType> source = Analyzer.parseFile(inFile);
            ProgramType program = ProgramGenerator.compile(source);

            try(PrintStream output = new PrintStream(outFile)) {
                OutputOperations.out = output;
                VirtualMachine.execute(program);
            }
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
}
