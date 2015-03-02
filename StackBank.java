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
        return stackbank.peek();
    }

    public static int peekInteger() {
        Object top = peek();
        if(top instanceof Integer) {
            return (Integer)top;
        } else {
            throw new ProgramException("Stack expected rvalue, found lvalue.");
        }
    }

    public static String peekVariable() {
        Object top = peek();
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
