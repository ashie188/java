import java.util.Scanner;

public class ration 
{
 
    private int itemno;
    private String name;
    private float price;
    private int quantity;

    public int getitemno()
    {
        return itemno;
    }

    public String getname()
    {
        return name;
    }

    public float getprice()
    {
        return price;
    }

    public float setprice(int p)
    {
        price=p;
        return price;
    }
    public int getquantity()
    {
        return quantity;
    }

    public int setquantity(int q)
    {
        quantity=q;
        return quantity;
    }

    public ration(int i, String str)
    {
        itemno=i;
        name=str;
        
        price=255;
        quantity=5;

    }

    public ration(int i, String str,float p)
    {
        itemno=i;
        name=str;
        
        price=p;
        quantity=5;

    }

    public ration(int i, String str, float p,int q)
    {
        itemno=i;
        name=str;
        
        price=p;
        quantity=q;

    }
    public void print()
    {
        System.out.println("itenmo is " +itemno);
        System.out.println("name is " +name);
        System.out.println("price is " +price);
        System.out.println("quantity is " +quantity);
    }
}

class ashie
{
   

    public static void main(String[] args)
    {
       int a;
       String str1;
       float f; 

       System.out.println("enter no. of items");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();


       for(int i=0;i<n;i++)
       {
        System.out.println("enter the itemno");
        a=sc.nextInt();

        sc.nextLine();

        System.out.println("enter the name");
        str1=sc.nextLine();

        System.out.println("enter the price");
        f=sc.nextFloat();

        ration obj=new ration(a, str1, f);
        obj.print();
       }
       
    
       
    }
}
