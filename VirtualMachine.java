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
public class VirtualMachine {
    public static void execute(ProgramType program) {
        int i = 0;
        while(i < program.getInstructionCount()) {
            CodeType code = program.getInstruction(i);
            System.out.println("Executing instruction " + i + " (" + code.instruction + ").");
            switch(code.instruction) {
                case "push":
                    MemoryOperations.push(code.parameter);
                    i++;
                    break;

                case "rvalue":
                    MemoryOperations.rvalue(code.parameter);
                    i++;
                    break;

                case "lvalue":
                    MemoryOperations.lvalue(code.parameter);
                    i++;
                    break;

                case "pop":
                    MemoryOperations.pop();
                    i++;
                    break;

                case ":=":
                    MemoryOperations.assign();
                    i++;
                    break;

                case "copy":
                    MemoryOperations.copy();
                    i++;
                    break;

                case "goto":
                    i = program.getLabel(code.parameter);
                    break;

                case "gofalse":
                    if(StackBank.popInteger() == 0) {
                        i = program.getLabel(code.parameter);
                    }
                    break;

                case "gotrue":
                    if(StackBank.popInteger() != 0) {
                        i = program.getLabel(code.parameter);
                    }
                    break;

                case "halt":
                    return;

                case "+":
                    ArithmeticOperations.add();
                    i++;
                    break;

                case "-":
                    ArithmeticOperations.subtract();
                    i++;
                    break;

                case "*":
                    ArithmeticOperations.multiply();
                    i++;
                    break;

                case "/":
                    ArithmeticOperations.divide();
                    i++;
                    break;

                case "div":
                    ArithmeticOperations.remainder();
                    i++;
                    break;

                case "&":
                    LogicalOperations.and();
                    i++;
                    break;

                case "!":
                    LogicalOperations.not();
                    i++;
                    break;

                case "|":
                    LogicalOperations.or();
                    i++;
                    break;

                case "<>":
                    RelationalOperations.notEqual();
                    i++;
                    break;

                case "<=":
                    RelationalOperations.lessOrEqual();
                    i++;
                    break;

                case ">=":
                    RelationalOperations.greaterOrEqual();
                    i++;
                    break;

                case "<":
                    RelationalOperations.less();
                    i++;
                    break;

                case ">":
                    RelationalOperations.greater();
                    i++;
                    break;

                case "=":
                    RelationalOperations.equal();
                    i++;
                    break;

                case "print":
                    OutputOperations.print();
                    i++;
                    break;

                case "show":
                    OutputOperations.show(code.parameter);
                    i++;
                    break;

                case "begin":
                    Memory.beginScope();
                    i++;
                    break;

                case "end":
                    Memory.changeScope();
                    i++;
                    break;

                case "return":
                    i = SubRoutine.pop();
                    Memory.endScope();
                    break;

                case "call":
                    SubRoutine.push(i + 1);
                    i = program.getLabel(code.parameter);
                    Memory.changeScope();
                    break;
            }
        }
    }
}
