/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazmachine;

import java.util.List;
import jazmachine.Analyzer.CodeType;

/**
 *
 * @author Son
 */
public class JazMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	try {
	        Analyzer anlyz = new Analyzer();
	        List<CodeType> source = anlyz.ParseFile("demo.jaz");
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
}
