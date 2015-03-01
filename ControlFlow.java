package jazmachine;

import java.util.HashMap;

/**
 *
 * @author Son
 */
public class ControlFlow {
    static HashMap<String, Integer> hm = new HashMap<String, Integer>();
    
    public static void LabelLoc(String label, int position) {
	hm.put(label, position);
    }
	
    public static boolean CheckHM(String label) {
        boolean check = true;
        if (hm.isEmpty()) check = false;
        if (hm.containsValue(label)) check = true;
        return check;
    }
    
    public static int getLabel(String label) {
        return hm.get(label);
    }

}
