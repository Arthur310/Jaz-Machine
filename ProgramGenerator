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
public class ProgramGenerator {
    void ParseIns (List<CodeType> list) {
        for (int j = 0; j < list.size(); j++) {
            if ((list.get(j).instruction.equals("label") || (list.get(j).instruction.equals("halt")))) 
                ControlFlow.LabelLoc(list.get(j).parameter, j);
        }
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).instruction.equals("goto")) {
                if (ControlFlow.CheckHM(list.get(i).parameter)) i = ControlFlow.getLabel(list.get(i).parameter) + 1;
                else i = ControlFlow.getLabel("halt");
            } else if (list.get(i).instruction.equals("gotrue")) {
                if (ControlFlow.CheckHM(list.get(i).parameter)) {
                    if (Integer.parseInt(StackBank.pop().toString()) > 0)
                        i = ControlFlow.getLabel(list.get(i).parameter) + 1;
                } else i = ControlFlow.getLabel("halt");
            } else if (list.get(i).instruction.equals("gofalse")) {
                if (ControlFlow.CheckHM(list.get(i).parameter)) {
                    if (Integer.parseInt(StackBank.pop().toString()) == 0)
                        i = ControlFlow.getLabel(list.get(i).parameter) + 1;
                } else i = ControlFlow.getLabel("halt");
            } else if (list.get(i).instruction.equals("call")) {
                if (ControlFlow.CheckHM(list.get(i).parameter)) {
                    i = ControlFlow.getLabel(list.get(i).parameter) + 1;
                    SubRoutine.push(i);
                } else i = ControlFlow.getLabel("halt");
            } else if (list.get(i).instruction.equals("return")) {
                i = SubRoutine.pop() + 1;
            }
            
            if (list.get(i).instruction.equals("halt")) break;
            else if (list.get(i).instruction.equals("push")) StackBank.push(list.get(i).parameter);
            else if (list.get(i).instruction.equals("rvalue")) StackBank.rvalue(list.get(i).parameter);
            else if (list.get(i).instruction.equals("lvalue")) StackBank.lvalue(list.get(i).parameter);
            else if (list.get(i).instruction.equals("pop")) StackBank.pop();
            else if (list.get(i).instruction.equals(":=")) StackBank.assign();
            else if (list.get(i).instruction.equals("copy")) StackBank.copy();
            else if (list.get(i).instruction.equals("+")) Arithmetic.plus();
            else if (list.get(i).instruction.equals("-")) Arithmetic.subtract();
            else if (list.get(i).instruction.equals("*")) Arithmetic.multiply();
            else if (list.get(i).instruction.equals("/")) Arithmetic.divide();
            else if (list.get(i).instruction.equals("div")) Arithmetic.remainder();
            else if (list.get(i).instruction.equals("&")) Logical.AND();
            else if (list.get(i).instruction.equals("!")) Logical.Negate();
            else if (list.get(i).instruction.equals("|")) Logical.OR();
            else if (list.get(i).instruction.equals("<>")) Relational.Equal();
            else if (list.get(i).instruction.equals("<=")) Relational.LessOrEqual();
            else if (list.get(i).instruction.equals(">=")) Relational.GreaterOrEqual();
            else if (list.get(i).instruction.equals("<")) Relational.Less();
            else if (list.get(i).instruction.equals(">")) Relational.Greater();
            else if (list.get(i).instruction.equals("=")) Relational.Same();
            else if (list.get(i).instruction.equals("print")) Output.Print();
            else if (list.get(i).instruction.equals("show")) Output.Show(list.get(i).parameter);
        }
    }
}
