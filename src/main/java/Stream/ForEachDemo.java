package Stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("rgp");
        list.add("mpl");
        list.add("vylpd");
        list.add("pngr");
        //traditional way of the iteration list
        for(String s:list)
            System.out.println(s);
        //Iteration using the stream
        System.out.println("Iteration of the list using the stream");
        list.stream().forEach( t->System.out.println(t));

        //Map Iteration using traditional and stream
        System.out.println("Map iteration using map.forEach");
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.forEach((key,value)-> System.out.println(key +":"+value));
        System.out.println("Map iteration using the stream and map.entrySet()");
        map.entrySet().stream().forEach(obj->System.out.println(obj));

        System.out.println("howforEach is working");
        Consumer<String> consumer = t->System.out.println(t);
        consumer.accept("madhukar from mpl");
        for(String s1:list)
            consumer.accept(s1);


    }

}
