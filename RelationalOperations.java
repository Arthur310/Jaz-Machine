package jazmachine;

/**
 *
 * @author Son
 */
public class RelationalOperations {        
    public static void equal() {
		int y = StackBank.popInteger();
		int x = StackBank.popInteger();
        if(x == y) {
        	StackBank.push(1);
        } else {
        	StackBank.push(0);
        }
    }
    
    public static void greater() {
		int y = StackBank.popInteger();
		int x = StackBank.popInteger();
        if(x > y) {
        	StackBank.push(1);
        } else {
        	StackBank.push(0);
        }
    }
    
    public static void greaterOrEqual() {
		int y = StackBank.popInteger();
		int x = StackBank.popInteger();
        if(x >= y) {
        	StackBank.push(1);
        } else {
        	StackBank.push(0);
        }
    }
    
    public static void less() {
		int y = StackBank.popInteger();
		int x = StackBank.popInteger();
        if(x < y) {
        	StackBank.push(1);
        } else {
        	StackBank.push(0);
        }
    }
    
    public static void lessOrEqual() {
		int y = StackBank.popInteger();
		int x = StackBank.popInteger();
        if(x <= y) {
        	StackBank.push(1);
        } else {
        	StackBank.push(0);
        }
    }

    public static void notEqual() {
		int y = StackBank.popInteger();
		int x = StackBank.popInteger();
        if(x != y) {
        	StackBank.push(1);
        } else {
        	StackBank.push(0);
        }
    }
}
