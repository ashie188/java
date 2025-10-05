public class cylinder 
{
    float r=5;
    float h=4;

    public double area()
    {
        return 2*(3.14*r*r)+(2*3.14*r*h);

    }

    public double surfacearea()
    {
        return 2*3.14*r*h;
    }

    public double volume()
    {
        return 3.14*r*r*r;
    }    
}

class test
{
    public static void main(String[] args) {
        cylinder c=new cylinder();
        
        System.out.println(c.area());
        System.out.println(c.surfacearea());
        System.out.println(c.volume());
    }
}
