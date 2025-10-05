import java.util.Scanner;
public class udemy3 {

    public static void main(String[] args)
    {
        System.out.println("enter the string");
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine(); 

        if(str.endsWith(".com"))
        {
            System.out.println("it is commercial website");
        }
        else if(str.endsWith(".gov"))
        {
            System.out.println("it is government website");
        }

        else if(str.endsWith(".net"))
        {
            System.out.println("it is network website");
        }
        else if(str.endsWith(".org"))
        {
            System.out.println("it is organisational website");
        }
    }
}
