package main.java.ForEachExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

/**
 * ForEachForArrayList
 */
public class ForEachForArrayList {

    public static void main(String args[])
    {
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        Consumer<Integer> action = System.out::println;

        al.forEach(action);
        
    }
}