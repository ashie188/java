

public class marksheet1 {
    String name;
    int rollno;
    String course;
    int m1,m2,m3;
    int add;
    int avg;

    public int total(int m1,int m2,int m3)
    {
         add=m1+m2+m3;
        return add;
    }

    public int average()
    {
         avg= add/3;  
        return avg;
    }

    public void grade(int n)
    {
        if(n<40)
        {
            System.out.println("F");
        }
        else if(n>=40 && n<60)
        {
            System.out.println("D");
        }
        else if(n>=60 && n<90)
        {
            System.out.println("B");
        }
        else if(n>=90)
        {
            System.out.println("A");
        }

    } 
    
}

 class call5
{
    public static void main(String[] args) 
    {
        marksheet1 obj=new marksheet1();
        System.out.println(obj.total(80,85,90));
        int a=(obj.average());
        System.out.println(a);

        obj.grade(a);
    }    
}
