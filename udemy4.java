import java.util.Scanner;

class Udemy4 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();

        int i = str1.indexOf("@");

        String username= str1.substring(0,i);
        String domain= str1.substring(i);

        System.out.println(username);
        System.out.println(domain);





    }
}