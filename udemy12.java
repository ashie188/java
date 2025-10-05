public class udemy12 {
    int l;
    int b;
    int length;

    public int getlength()
    {
        return length;
    }

    public int setlength(int l)
    {
        length=l;
        return length;

    }
}

class test
{
    public static void main(String[] args)
    {
        int l;
        udemy12 obj= new udemy12();
        System.out.println(obj.setlength(25));
    
    }
}
