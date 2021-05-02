package debug;

public class PrintNumbers {

    public static void main(String[] args) {
        System.out.println("Print Numbers");
        printNumbers(5);
        System.out.println("End numbers");
    }

    private static void printNumbers(int n) {
        for(int i=0;i<=n;i++)
            System.out.println(i);
    }
}
