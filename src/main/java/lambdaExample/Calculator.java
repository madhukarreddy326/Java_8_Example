package lambdaExample;

interface calc
{
    //void show();//1 comment
    void sum(int i);
}
public class Calculator {

    public static void main(String[] args) {

    //1 related comment below code
//      calc c =   () -> System.out.println("This method is the implementaion of the show() method");
//        c.show();
        calc c = (i) -> System.out.println("Sum value is : "+i);
        c.sum(2222);

    }

}
