package ConsumerExample;

import java.util.Arrays;
import java.util.List;

public class ConsumerTest1 {


    public static void main(String args[])
    {
        //below comented line is used when we enable the 16th line
        /*
        Consumer<Integer> consumer = i-> System.out.println("Printing : "+i);
        consumer.accept(10);
        */

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //below line is applicable to 11th line
        //list.stream().forEach(consumer);

        list.stream().forEach(i-> System.out.println("Printing : "+i));



    }
}
