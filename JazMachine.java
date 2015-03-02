/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazmachine;

/**
 *
 * @author Son
 */
public class JazMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Analyzer anlyz = new Analyzer();
        anlyz.ParseFile("demo.jaz");
        
    }
    
}
