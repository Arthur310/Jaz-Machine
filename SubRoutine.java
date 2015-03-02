package jazmachine;

import java.util.Stack;

/**
 *
 * @author Son
 */
public class SubRoutine {
    private static Stack<Integer> stack = new Stack<Integer>();
    
    public static void push(int i) {
		stack.push(i);
    }
    
    public static int pop() {
		return stack.pop();
    }
}
