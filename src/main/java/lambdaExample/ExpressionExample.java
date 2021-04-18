package main.java.lambdaExample;

@FunctionalInterface
interface MyFunctionalInterface{
    public String sayHello();
}
public class ExpressionExample {

    public static void main(String args[])
    {
        MyFunctionalInterface msg = () -> {
            return "Hello";
        };
        System.out.println(msg.sayHello());

    }
}

