class ok {
    public void one()
    {
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=3;j++)
            {
                if (i==2 && j==3) 
                {
                    System.out.print("1 ");
                }
                else if(i+j>=4)
                {
                    System.out.print("* ");
                }
                
                else {
                    System.out.print(" ");
                }

            }
            for(int k=1;k<=3;k++)
            {
                if(i>k)
                {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }

    public void two()
    {
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if (i==2 && j==3) 
                {
                    System.out.print("* ");
                }
                else if(i+j>=4)
                {
                    System.out.print("* ");
                }
                
                else {
                    System.out.print(" ");
                }

            }
            for(int k=1;k<=3;k++)
            {
                if(i>k)
                {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}

public class pattern1{
    public static void main(String[] args) {

    ok obj=new ok();
    obj.one();
    }

}