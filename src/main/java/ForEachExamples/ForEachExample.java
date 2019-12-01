package main.java.ForEachExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

/**
 * ForEachExample
 */
public class ForEachExample {

    public static void main(String args[])
    {
        ArrayList <Integer> numbers = new ArrayList<>(Arrays.asList(1,3,4,5,2,4,44,88));
        Consumer<Integer> action = System.out::println;
        numbers.stream().filter(n ->(n%2==0)).forEach(action);

    }
}