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
public class StackBank {
    private static Stack<Object> stackbank = new Stack<Object>();
    
    public static Object peek() {
        return pick(0);
    }

    public static int peekInteger() {
        return pickInteger(0);
    }

    public static String peekVariable() {
        return pickVariable(0);
    }

    public static Object pick(int position) {
        return stackbank.get(stackbank.size() - 1 - position);
    }

    public static int pickInteger(int position) {
        Object top = pick(position);
        if(top instanceof Integer) {
            return (Integer)top;
        } else {
            throw new ProgramException("Stack expected rvalue, found lvalue.");
        }
    }

    public static String pickVariable(int position) {
        Object top = pick(position);
        if(top instanceof String) {
            return (String)top;
        } else {
            throw new ProgramException("Stack expected lvalue, found rvalue.");
        }
    }

    public static Object pop() {
        return stackbank.pop();
    }
    
    public static int popInteger() {
        int result = peekInteger();
        stackbank.pop();
        return result;
    }

    public static String popVariable() {
        String result = peekVariable();
        stackbank.pop();
        return result;
    }

    public static void push(Object value) {
        stackbank.push(value);
    }
}
