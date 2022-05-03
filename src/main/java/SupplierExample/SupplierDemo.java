package SupplierExample;

import java.util.function.Supplier;

public class SupplierDemo //implements Supplier<String>
{

    //Traditional Approach
    /*@Override
    public String get() {
        return "Hello Java World!..";
    }*/

    public static void main(String[] args) {
        //Traditional approach
       // Supplier<String> supplier = new SupplierDemo();
        //System.out.println(supplier.get());

        Supplier<String> supplier = ()-> "Hello Java World!..";
        System.out.println(supplier.get());

    }
}

