package SupplierExample;

import java.util.function.Supplier;

public class SupplierExampleTest {
    public static void main(String[] args) {
        Supplier<Double> random = ()->Math.random();
        Double randomValue = random.get();
        System.out.println(randomValue);

    }

}
