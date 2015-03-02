package jazmachine;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author Jordan
 */
public class Memory {
    private static Memory memory = new Memory();

    private Stack<Map<String, Integer>> maps = new Stack<Map<String, Integer>>();
    private Map<String, Integer> readMap = null;
    private Map<String, Integer> writeMap = null;

    private Memory() {
        Map<String, Integer> map = new HashMap<String, Integer>();

        maps.push(map);
        readMap = map;
        writeMap = map;
    }

    public static void beginScope() {
        Map<String, Integer> map = new HashMap<String, Integer>();

        memory.maps.push(map);
        memory.writeMap = map;
    }

    public static void changeScope() {
        memory.readMap = memory.writeMap;
    }

    public static void endScope() {
        memory.maps.pop();
        memory.writeMap = memory.maps.peek();
    }

    public static int get(String name) {
        Integer value = memory.readMap.get(name);
        return (value != null) ? value : 0;
    }

    public static void set(String name, int value) {
        memory.writeMap.put(name, value);
    }
}
