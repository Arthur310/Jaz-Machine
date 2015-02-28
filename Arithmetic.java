package jazmachine;

import static jazmachine.StackBank.stackbank;

/**
 *
 * @author Son
 */
public class Arithmetic {
    public static void plus() {
        int x = Integer.parseInt(stackbank.pop().toString());
        int y = Integer.parseInt(stackbank.pop().toString());
        String result = Integer.toString(x+y);
        stackbank.push(result);
    }
    
    public static void subtract() {
        int x = Integer.parseInt(stackbank.pop().toString());
        int y = Integer.parseInt(stackbank.pop().toString());
        String result = Integer.toString(y-x);
        stackbank.push(result);        
    }
    
    public static void multiply() {
        int x = Integer.parseInt(stackbank.pop().toString());
        int y = Integer.parseInt(stackbank.pop().toString());
        String result = Integer.toString(x*y);
        stackbank.push(result); 
    }
    
    public static void divide() {
        int x = Integer.parseInt(stackbank.pop().toString());
        int y = Integer.parseInt(stackbank.pop().toString());
        String result = Integer.toString(y/x);
        stackbank.push(result); 
    }
    
    public static void remainder() {
        int x = Integer.parseInt(stackbank.pop().toString());
        int y = Integer.parseInt(stackbank.pop().toString());
        String result = Integer.toString(y%x);
        stackbank.push(result); 
    }   
}
