import java.util.Scanner;

public class udemy2 {

   
   public static void main(String[] args)
    {
         System.out.println("enter the string");
        Scanner sc= new Scanner(System.in);

        String radix=sc.nextLine(); 

        if(radix.matches("[01]+"))
        {
            System.out.println("it is binary");
        }

        else if(radix.matches("[1-7]+"))
        {
            System.out.println("it is octal");
        }
        else if(radix.matches("[0-F]+"))
        {
            System.out.println("it is hexadecimal");
        }
    }
    
}

