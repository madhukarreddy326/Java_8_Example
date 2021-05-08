package HashMapExamples;

import java.util.*;

public class SortHashMapByValueExample {


    public static void main(String[] args) {
        var hm = new HashMap<String,Integer>();
        hm.put("Math",98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        System.out.println("Hash Map is values before sorting: "+hm);
        Map<String,Integer> sortedMap = sortByValue(hm);
        for(Map.Entry<String,Integer> oneRecord : sortedMap.entrySet())
                {
        System.out.println("Key = "+oneRecord.getKey() + " Value is : "+oneRecord.getValue());
        }

    }

    private static Map<String, Integer> sortByValue(HashMap<String, Integer> hm) {
        List<Map.Entry<String,Integer>> list = new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<String,Integer>>() {
            public int compare(Map.Entry<String,Integer>o1,Map.Entry<String,Integer>o2){
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        var sortedMap = new LinkedHashMap<String,Integer>();
        for(Map.Entry<String,Integer> aa: list)
        {
            sortedMap.put(aa.getKey(),aa.getValue());
        }
        return sortedMap;

    }
}
