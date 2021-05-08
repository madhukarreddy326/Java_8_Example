package HashMapExamples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapUsingStreams {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        // enter data into hashmap
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        Map<String,Integer> sortedMap = sortByValue(hm);

        for(Map.Entry<String,Integer> eachEntry: sortedMap.entrySet())
        {
            System.out.println("Key :  "+eachEntry.getKey()+" Value is : "+eachEntry.getValue());
        }
    }

    private static Map<String, Integer> sortByValue(HashMap<String, Integer> hm) {
        HashMap<String,Integer> temp = hm.entrySet()
                .stream()
                .sorted((i2,i1) -> i1.getValue().compareTo(i2.getValue())) //.sorted((i2,i1) -> i1.getValue().compareTo(i2.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2) ->e1, LinkedHashMap::new));
        return temp;

    }
}
