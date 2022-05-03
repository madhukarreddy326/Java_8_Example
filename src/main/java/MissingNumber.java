public class MissingNumber {

    public static void main(String[] args) {
        int N=5;
        int a[]= {1,2,4,5};
        //int a[]={1,2,3,4,5};
        int missing=a[0];
        for(int i=0;i<a.length;i++)
            if (a[i] != missing)
                continue;
            else
                missing = a[i + 1];
        System.out.println("Missing is :"+missing);


    }

}
