public class student {
    
    int rollno;
    String name;
    String department;
    String subject;
    
    public int getrollno()
    {
        return rollno;
    }

    public String getname()
    {
        return name;
    }

    public String getdepartment()
    {
        return department;
    }

    public String getsubject()
    {
        return subject;
    }

    public String setsubject(String str)
    {
        subject=str;
        return subject;
    }

    public student(int roolno,String name,String department,String subject)
    {
        this.rollno=rollno;
        this.name=name;
        this.department=department;
        this.subject=subject;
    }
    public void print()
    {
        System.out.println(rollno);
        System.out.println(name);
        System.out.println(department);
        System.out.println(subject);
    }
}

class test
{
    public static void main(String[] args) 
    {
        student A[]=new student[2];

        A[0]=new student(1, "ashie", "It", "math3");
        A[1]=new student(2,"agasthya","Cs","math4");
        
        for(int x:A[])
        {
            System.out.println(A);

        }
    
    }
}
