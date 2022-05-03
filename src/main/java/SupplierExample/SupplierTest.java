package SupplierExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> supplier = ()->"Hello welcome to Java World!..";
                System.out.println(supplier.get());

                List<String> list1 = Arrays.asList("b","a");
                System.out.println(list1.stream().findAny().orElseGet(()->"Hello welcome to Java World!.."));

    }
}
