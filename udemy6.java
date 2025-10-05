import java.util.Scanner;

public class udemy6 {
    public static void main(String[] args)
    {
        System.out.println("enter the two values");
        Scanner sc = new Scanner(System.in);

        int x=sc.nextInt();
        int y= sc.nextInt();

        System.out.println("enter the number");
        int n=sc.nextInt();

        switch (n) {
            case 1:System.out.println("addition");
                   n= x+y;
                   System.out.println("addition is " +n);
                   break;
            case 2:System.out.println("substration");
                   n= x-y;
                   System.out.println("substraction is " +n);
                   break;
            case 3:System.out.println("multiplication");
                   n= x*y;
                   System.out.println("multiplication is " +n);
                   break;
            case 4:System.out.println("division");
                   n= x/y;
                   System.out.println("division is " +n);
                   break;
        
            
        
            default:
                break;
        }
    }
}
