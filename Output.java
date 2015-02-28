package jazmachine;

import static jazmachine.StackBank.stackbank;

/**
 *
 * @author Son
 */
public class Output {
    public static void Print() {
        System.out.println(stackbank.pop().toString());
    }
    
    public static void Show(String line) {
        System.out.println(line + "\n");
    }
}
