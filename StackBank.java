/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazmachine;
import java.util.HashMap;
import java.util.Stack;
/**
 *
 * @author Son
 */
public class StackBank {
    static Stack<Object> stackbank = new Stack<Object>();
    static HashMap<String, Integer> hm = new HashMap<String, Integer>();
    
    public static void push(Object o) {
	stackbank.push(o);
    }
	
    public static void rvalue(String var) {
        stackbank.push(var);
    }
	
    public static void lvalue(String var) {
    	stackbank.push(var);
    }
	
    public static Object pop() {
	return stackbank.pop();
    }
	
    public static Object peek() {
	return stackbank.peek();
    }
    
    public static void assign() {
	int i = Integer.parseInt(stackbank.pop().toString());
	String u = stackbank.pop().toString();
        put(u, i);
    }
	
    public static void copy() {
	stackbank.push(stackbank.peek());
    }
    
    public static void put(String var) {
	hm.put(var, null);
    }
	
    public static void put(String var, int value) {
	hm.put(var, value);
    }
	
    public static int get(String var) {
	return hm.get(var);
    }

    public static boolean contains(String var) {
	return hm.containsKey(var);
    }
}
