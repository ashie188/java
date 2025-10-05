public class call {
    String name;
    int rollno;
    String course;
    int m1,m2,m3;
    int add;
    int average;

    public int total()
    {
         add=m1+m2+m3;
        return add;
    }

    public int average()
    {
         average= add/3;
        return average;
    }

    public void grade()
    {
        if(average<40)
        {
            System.out.println("F");
        }
        else if(average>=40 && average<60)
        {
            System.out.println("D");
        }
        else if(average>=60 && average<=80)
        {
            System.out.println("A");
        }
    }
    
}

public class marksheet
{
    
    
    
}
