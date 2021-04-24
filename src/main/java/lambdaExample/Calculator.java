package lambdaExample;

interface calc
{
    void show();
}
public class Calculator {

    public static void main(String[] args) {
      calc c =   () -> System.out.println("This method is the implementaion of the show() method");
      c.show();
    }

}
