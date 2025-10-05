import java.util.Scanner;
import java.lang.Math;

public class udemy1 {

    public static void main(String[] args) {
        System.out.println("enter the coefficients a,b and c");

        System.out.println("the quadratic equation is ax*x+bx+c=0");


        
        Scanner r = new Scanner(System.in);
        float a = r.nextFloat();

        
        float b = r.nextFloat();
        float c = r.nextFloat();
        // let the roots be r1 and r2
        float det = b*b-(4*a*c);

       double r1=(-b+  Math.sqrt(det))/2*a;
       double r2=(-b- Math.sqrt(det))/2*a;

        

        System.out.println("The roots are " +r1+ " "   +r2);
        
        
    }
}
