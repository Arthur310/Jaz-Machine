package jazmachine;

import static jazmachine.StackBank.stackbank;

/**
 *
 * @author Son
 */
public class Relational {        
    public static void Equal() {
        int result = 0;
	int x = Integer.parseInt(stackbank.pop().toString());
	int y = Integer.parseInt(stackbank.pop().toString());
        if (x!=y) result = 1;
        stackbank.push(x);
        stackbank.push(y);
	stackbank.push(result);
    }
    
    public static void LessOrEqual() {
        int result = 0;
	int x = Integer.parseInt(stackbank.pop().toString());
	int y = Integer.parseInt(stackbank.pop().toString());
        if (x<=y) result = 1;
        stackbank.push(x);
        stackbank.push(y);
	stackbank.push(result);
    }  
    
    public static void GreaterOrEqual() {
        int result = 0;
	int x = Integer.parseInt(stackbank.pop().toString());
	int y = Integer.parseInt(stackbank.pop().toString());
        if (x>=y) result = 1;
        stackbank.push(x);
        stackbank.push(y);
	stackbank.push(result);
    }
    
    public static void Less() {
        int result = 0;
	int x = Integer.parseInt(stackbank.pop().toString());
	int y = Integer.parseInt(stackbank.pop().toString());
        if (x<y) result = 1;
        stackbank.push(x);
        stackbank.push(y);
	stackbank.push(result);
    }
    
    public static void Greater() {
      int result = 0;
	int x = Integer.parseInt(stackbank.pop().toString());
	int y = Integer.parseInt(stackbank.pop().toString());
        if (x>y) result = 1;
        stackbank.push(x);
        stackbank.push(y);
	stackbank.push(result);
    }
    
    public static void Same() {
      int result = 0;
	int x = Integer.parseInt(stackbank.pop().toString());
	int y = Integer.parseInt(stackbank.pop().toString());
        if (x==y) result = 1;
        stackbank.push(x);
        stackbank.push(y);
	stackbank.push(result);
    }
    
    
    
    
    
    
    
    
}
