package com.rgp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListItertor {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("ba","ab","cb");
        ///list.stream().forEach(t->System.out.println(t));
        //list.stream().filter(t->t.startsWith("a")).forEach(t->System.out.println(t));

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"abc");
        map.put(2,"bca");
        map.put(3,"cab");
        map.put(4,"abcd");

        //map.forEach((key,value)->System.out.println("Key :"+key+" Value : "+value));
        map.entrySet().stream().forEach(obj -> System.out.println(obj));

    }
}
