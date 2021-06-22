package FunctionIterfaceExample;

import java.util.function.Function;

public class FunctionInterfaceDemo {
    public static void main(String[] args) {
        Function<String,Integer> length = str -> str.length();
        int len = length.apply("Java programming Examples");
        System.out.println(len);
    }
}
