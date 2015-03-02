package jazmachine;

/**
 *
 * @author Jordan
 */
public abstract class MemoryOperations {
    public static void assign() {
        int i = StackBank.popInteger();
        String u = StackBank.popVariable();
        Memory.set(u, i);
    }
    
    public static void copy() {
        StackBank.push(StackBank.peek());
    }

    public static void lvalue(String parameter) {
        StackBank.push(parameter.trim());
    }

    public static void pop() {
        StackBank.pop();
    }

    public static void push(String parameter) {
        StackBank.push(Integer.parseInt(parameter.trim()));
    }

    public static void rvalue(String parameter) {
        StackBank.push(Memory.get(parameter.trim()));
    }
}
