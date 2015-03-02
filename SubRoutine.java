package jazmachine;

import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author Son
 */
public class SubRoutine {
    static Stack<Integer> stack = new Stack<Integer>();
    
    public static void push(int i) {
	stack.push(i);
    }
    
    public static int pop() {
	return stack.pop();
    }
}
