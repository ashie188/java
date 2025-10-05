abstract class shape
{
    abstract void area();
    abstract void perimeter();
}

class circle extends shape
{
    int r;
    public void area()
    {
        r=5;
        System.out.println("area is "+3.14*r*r);
    }
    
   public void perimeter()
    {
        System.out.println("perimeter is "+2*3.14*r);

    }
}


class rectangle extends shape
{
    int l=5;
    int b=5;

    public void area()
    {
        System.out.println("area is "+l*b);
    }

    public void perimeter()
    {
        System.out.println("perimeter is "+2*(l+b));

    }

}


public class abstract1
{
    public static void main(String[] args) {
        circle c=new circle();
        c.area();
        c.perimeter();
        
        System.out.println("dynamic method display");
        
        shape s=new rectangle();
        s.area();
        s.perimeter();
    
    }
    
}


