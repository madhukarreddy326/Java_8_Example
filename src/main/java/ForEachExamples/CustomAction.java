package main.java.ForEachExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * CustomAction
 */
public class CustomAction {
    public static void main(String args[])
    {
        HashMap<String,Integer>hm = new HashMap<>();
        hm.put("A",1);
        hm.put("B",2);
        hm.put("C",3);
        Consumer<Map.Entry<String,Integer>> action = entry ->{
            System.out.println("  Key is ::"+entry.getKey()+"\tValue is ::"+entry.getValue());
                };
            hm.entrySet().forEach(action);

    }
}