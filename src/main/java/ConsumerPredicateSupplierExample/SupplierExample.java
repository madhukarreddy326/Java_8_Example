package ConsumerPredicateSupplierExample;

import java.util.Arrays;
import java.util.List;

public class SupplierExample //implements Supplier<String>
 {


    //This method is fromt he Interface Supplier
//    @Override
//    public String get() {
//        return "Hello Madhukar from RGP";
//    }

    public static void main(String[] args) {
       // Supplier<String> supplier = ()->  "Hello Madhukar from RGP";

       // System.out.println("The result is : "+supplier.get());

        //below is the stream example using the supplier

        //List<String> str = Arrays.asList("a","b");//this will give the a
        List<String> str = Arrays.asList();//this will give the a
        //System.out.println(str.stream().findAny().orElseGet(supplier));
        System.out.println(str.stream().findAny().orElseGet(()-> "This is from the defaule value"));

    }
}
