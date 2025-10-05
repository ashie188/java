import java.util.Scanner;

public class armstrongnumber {

    public static void main(String[] args) {
        
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int orginalvalue=n;
        int sum=0;

        while(n>0)
        {
            int r= n%10;
            sum=sum+r*r*r;

            n=n/10;
        }

        if(sum==orginalvalue)
        {
            System.out.println("it is a armstrong number");
        }

        else
        {
            System.out.println("it is not a armstrong number");
        }
    }
}    
