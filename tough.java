import java.util.Scanner;

public class tough {
    
    public static void main(String[] args)
    {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String str="";
        int r;

        

        while(n>0)
        {  
            r=n%10;
            n=n/10;

            str= str+r;
        }

        for(int i=str.length()-1;i>=0;i--)
        {
            char c= str.charAt(i);
            switch (c) {
                case '0':System.out.println("zero");
                    
                    break;
                case '1':System.out.println("one");
                    
                    break;
                case '2':System.out.println("two");
                    
                    break;
                case '3':System.out.println("three");
                    
                    break;
                case '4':System.out.println("four");
                    
                    break;
                case '5':System.out.println("five");
                    
                    break;
                case '6':System.out.println("six");
                    
                    break;
                case '7':System.out.println("seven");
                    
                    break;
                case '8':System.out.println("eight");
                    
                    break;
                case '9':System.out.println("nine");
                    
                    break;
            
                default:
                    break;
            }
        }
    }
}
