package HashMapExamples;

import java.util.*;

public class SortHashMapByValueUsingLambda {
    public static void main(String[] args) {
        HashMap<String, Integer> hm  =new HashMap<String,Integer>();
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        Map<String,Integer>sortedMap = sortByValue(hm);

        for(Map.Entry<String,Integer> eachEntry: sortedMap.entrySet())
        {
            System.out.println("Key : "+eachEntry.getKey() +" Value is :  "+eachEntry.getValue());
        }

    }

    private static Map<String, Integer> sortByValue(HashMap<String, Integer> hm) {
        List<Map.Entry<String,Integer>> list = new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());
        Collections.sort(list,(i2,i1) -> i1.getValue().compareTo(i2.getValue()));
        HashMap<String,Integer> sortedMap = new LinkedHashMap<String,Integer>();
        for(Map.Entry<String,Integer> eachEntry:list)
        {
            sortedMap.put(eachEntry.getKey(),eachEntry.getValue());
        }
        return sortedMap;
    }
}

