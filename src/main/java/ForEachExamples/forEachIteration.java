package main.java.ForEachExamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * forEachIteration and filter example
 */
public class forEachIteration {

    public static void main(final String args[])
    {
        final List<String> lst = new ArrayList<>();
        lst.add("aa");
        lst.add("bb");
        lst.add("cc");
        lst.add("mm");
        lst.add("nn");
        lst.add("madhukar");

        for(String s:lst)
        {
            if(s.startsWith("m"))
                System.out.println(s);
        }

        //with filter and streams to iterate
        lst.stream().filter(t->t.startsWith("m")).forEach(m->System.out.println(m));

        // // for(String ss:lst)
        // //     System.out.println(ss);
        // lst.stream().forEach(t ->System.out.println(t));

        Map<Integer,String> hm = new HashMap<>();
        hm.put(1,"abc");
        hm.put(2,"bcd");
        hm.put(3,"def");
        hm.put(4,"madhukar");
        

        hm.entrySet().stream().filter(k ->k.getKey()%2==0).forEach(obj ->System.out.println(obj));


        // hm.forEach((key,value) -> System.out.println(key+": "+value));

        // hm.entrySet().stream().forEach(key -> System.out.println(key));
        
    }
}