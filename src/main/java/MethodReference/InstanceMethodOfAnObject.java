package MethodReference;
@FunctionalInterface
interface MyInterface
{
    public void display();
}
public class InstanceMethodOfAnObject {

    public String myMethod()
    {

       System.out.println("Instance Method");
       return "Madhukar";
    }

    public static void main(String[] args) {

        InstanceMethodOfAnObject obj = new InstanceMethodOfAnObject();
        MyInterface ref = obj::myMethod;
         ref.display();


    }
}
