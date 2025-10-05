public class rough{

    int a;
    int b;
    int c;
    float dvd;



   void show()
    {
        a=2;
        b=3;
        dvd=a/b;
    }

}

class output{
    public static void main(String[] args)
    {
    rough obj=new rough();
    obj.show();
    System.out.print(" value is: obj.dvd");
    }
}