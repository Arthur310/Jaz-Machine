package jazmachine;

import static jazmachine.StackBank.stackbank;

/**
 *
 * @author Son
 */
public class Logical {
    public static void AND() {
	boolean x = Boolean.parseBoolean(stackbank.pop().toString());
	boolean y = Boolean.parseBoolean(stackbank.pop().toString());
	stackbank.push(x && y);
    }

    public static void Negate() {
	boolean a = Boolean.parseBoolean(stackbank.pop().toString());
	stackbank.push(!a);
    }

    public static void OR() {
	boolean a = Boolean.parseBoolean(stackbank.pop().toString());
	boolean b = Boolean.parseBoolean(stackbank.pop().toString());
	stackbank.push(a || b);
    }
}
