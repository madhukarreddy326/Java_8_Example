package lambdaExample;

interface calc
{
    //void show();//1 comment
    //void sum(int i); //2 comment
    int sum(int i,int j);
}
public class Calculator {

    public static void main(String[] args) {

    //1 related comment below code
//      calc c =   () -> System.out.println("This method is the implementaion of the show() method");
//        c.show();

        //2 is the related comment below code
//        calc c = (i) -> System.out.println("Sum value is : "+i);
//        c.sum(2222);

        //lambda exmple with parameter and return type example
        calc c = (i,j) -> i+j;
        System.out.println("The given sum value is : "+c.sum(20,20));
    }

}
