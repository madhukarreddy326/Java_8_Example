package ConsumerPredicateProducerExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
//below is the old style coding
//    @Override
//    public boolean test(Integer integer) {
//       if(integer %2 == 0)
//           return true;
//       else return false;
//    }

    public static void main(String[] args) {
        //Predicate<Integer> predicate = new PredicateExample();
        Predicate<Integer> predicate = (i)->i%2 == 0;
        System.out.println("Result is : "+predicate.test(4));//return true;
        System.out.println("Result is : "+predicate.test(5));//return false
        List<Integer> integer = Arrays.asList(1,2,3,4,5);
        integer.stream().filter(predicate).forEach(t -> System.out.println("Print Event: : "+t));


        //Stream example using the predicate
    }
}
