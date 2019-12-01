package main.java.ForEachExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * ForEachForMap
 */
public class ForEachForMap {

    public static void main(String args[])
    {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("chennai",1);
        hm.put("sbc",2);
        hm.put("hyd",3);
        Consumer<Map.Entry<String,Integer>> action = System.out::println;
        hm.entrySet().forEach(action);
        Consumer<String> action1 = System.out::println;
        hm.keySet().forEach(action1);

        Consumer<Integer> values = System.out::println;
        hm.values().forEach(values);
    }
}