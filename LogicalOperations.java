package jazmachine;

/**
 *
 * @author Son
 */
public class LogicalOperations {
    public static void and() {
		int y = StackBank.popInteger();
		int x = StackBank.popInteger();
		if(x != 0 && y != 0) {
			StackBank.push(1);
		} else {
			StackBank.push(0);
		}
    }

    public static void not() {
		int x = StackBank.popInteger();
		if(x == 0) {
			StackBank.push(1);
		} else {
			StackBank.push(0);
		}
    }

    public static void or() {
		int y = StackBank.popInteger();
		int x = StackBank.popInteger();
		if(x != 0 || y != 0) {
			StackBank.push(1);
		} else {
			StackBank.push(0);
		}
    }
}
