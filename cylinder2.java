public class cylinder2 
{
    private int radius;
    private int height;

    public int getradius()
    {
        return radius;

    }

    public int setradius(int r)
    {
        radius=r;
        return radius;

    }
    
    public int getheight() 
    {
        return height;
    }
    
    public int setheight(int h)
    {
        height=h;
        return height;

    }

    public cylinder2()
    {
        radius=1;
        height=1;
    }
    public cylinder2(int r)
    {
        radius=r;
        height=1;
    }

    public cylinder2(int r,int h)
    {
        radius=r;
        height=h;
        
    }

    public double surfacearea()
    {
        return 4*3.14*radius*height;
    }

}

class test
{
    public static void main(String[] args) 
    {
        cylinder2 obj=new cylinder2(10,5);

        System.out.println("surfacearea "+obj.surfacearea());
    }
}
