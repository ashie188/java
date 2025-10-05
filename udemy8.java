//import java.util.Scanner;

public class udemy8 {

    static int gcd( int m , int   n)
    {
        for(int i=0;i<n;i++)
        {
            if(m>n)
            {
                m=m-n;
            }
            else if(m<n)
            {
                n=n-m;
            }
            else if(m==n)
            {
                return m;
                
            }

        }
        return m;
    }
    
    public static void main(String[] args)
     {
        int a=35,b=25;
       int c= gcd(a,b);
       System.out.println(c);
     }

}
  
  
  
  
    /* * static void prime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                System.out.println(n+ " is not a prime number");
                
            }
            
        }
        System.out.println(n+" is a prime number");
    }

    public static void main(String[] args)
    {
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();

        prime(a);
    }/* */
    

