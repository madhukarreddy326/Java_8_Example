package ConsumerPredicateSupplierExample;

import java.util.List;

public class ConsumerExample{

    public static void main(String[] args)
    {
//        Consumer<Integer> consumer = t -> System.out.println("Printing : "+t);
//
//        consumer.accept(100);

        //Stream example with the help of Consumer
        List<Integer> list = List.of(10,20,30,40);
        list.stream().forEach( t -> System.out.println("Printing : "+t));
    }
}
