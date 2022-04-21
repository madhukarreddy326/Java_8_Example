package PredicateDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemoUsingLambda {
    public static void main(String[] args) {
        Predicate<Integer> predicate = t->t%2==0;

        System.out.println(predicate.test(4));

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        list1.stream().filter(predicate).forEach(t -> System.out.println("Print Even : "+t));

    }
}
