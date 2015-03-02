/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazmachine;

import java.util.List;

/**
 *
 * @author Son
 */
public class ProgramGenerator {
    public static ProgramType compile(List<CodeType> list) {
        ProgramType result = new ProgramType();

        for(CodeType code : list) {
            if(code.instruction.equals("label")) {
                result.addLabel(code.parameter, result.getInstructionCount());
            } else {
                result.addInstruction(code);
            }
        }

        return result;
    }
}
