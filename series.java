import java.util.Scanner;

public class series {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        System.out.println("enter the first term");
        int a=sc.nextInt();

        System.out.println("enter the common difference");
        int d=sc.nextInt();

        System.out.println("enter the no. of terms");
        int n=sc.nextInt();

        int A[]=new int[n];

        A[0]=a;

        for(int i=1;i<n;i++)
        {
            A[i]=A[i-1]+d;

        }

        for(int x:A)
        {
            System.out.print(x+" ");

        }
    }
}
