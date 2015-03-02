package jazmachine;

/**
 *
 * @author Son
 */
public abstract class ArithmeticOperations {
    public static void add() {
        int y = StackBank.popInteger();
        int x = StackBank.popInteger();
        StackBank.push(x + y);
    }
    
    public static void divide() {
        int y = StackBank.popInteger();
        int x = StackBank.popInteger();
        StackBank.push(x / y);
    }
    
    public static void multiply() {
        int y = StackBank.popInteger();
        int x = StackBank.popInteger();
        StackBank.push(x * y);
    }
    
    public static void remainder() {
        int y = StackBank.popInteger();
        int x = StackBank.popInteger();
        StackBank.push(x % y);
    }
    
    public static void subtract() {
        int y = StackBank.popInteger();
        int x = StackBank.popInteger();
        StackBank.push(x - y);  
    }
}
