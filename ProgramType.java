/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazmachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jordan
 */
public class ProgramType {
    private List<CodeType> instructions = new ArrayList<CodeType>();;
    private Map<String, Integer> labels = new HashMap<String, Integer>();

    public void addInstruction(CodeType instruction) {
        instructions.add(instruction);
    }

    public void addLabel(String label, int position) {
        if(labels.containsKey(label)) {
            throw new ProgramException("Label cannot be defined more than once: " + label);
        }
        labels.put(label, position);
    }

    public CodeType getInstruction(int position) {
        return instructions.get(position);
    }

    public int getInstructionCount() {
        return instructions.size();
    }

    public int getLabel(String label) {
        Integer position = labels.get(label);
        if(position == null) {
            throw new ProgramException("Undefined label: " + label);
        }
        return position;
    }
}
