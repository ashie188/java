public class product 
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

    public product(int i, String str)
    {
        itemno=i;
        name=str;
        
        price=255;
        quantity=5;

    }

    public product(int i, String str,float p)
    {
        itemno=i;
        name=str;
        
        price=p;
        quantity=5;

    }

    public product(int i, String str, float p,int q)
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

class rohit
{
    public static void main(String[] args)
    {
        product obj=new product(25, "kaaju",100);
        obj.print();
    }
}



     



