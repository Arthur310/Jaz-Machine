/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazmachine;

import java.util.Stack;

/**
 *
 * @author Son
 */
public class CodeType {
    String instruction = null;
    String parameter = null;

    CodeType() {}

    CodeType(String instruction) {
        this.instruction = instruction;
    }
    
    CodeType (String instruction, String parameter) {
        this.instruction = instruction;
        this.parameter = parameter;
    }    
}