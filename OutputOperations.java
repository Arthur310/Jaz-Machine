package jazmachine;

import java.io.PrintStream;

/**
 *
 * @author Son
 */
public class OutputOperations {
	public static PrintStream out = System.out;

    public static void print() {
        out.println(StackBank.peekInteger());
    }
    
    public static void show(String parameter) {
        out.println(parameter);
    }
}
