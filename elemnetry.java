class oduu
{
    public void two()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
               if(i==3&&j==5){
                System.out.print("2 ");
               }
               else if(i==2&&j==5){
                System.out.print(" ");
               }
               else if(i==3&&j==4){
                System.out.print(" ");
               }
               else if(i==3&&j==5){
                System.out.print(" ");
               }
               else if(i==4&&j==5)
               {
                System.out.print("  ");
               }
               else if(i==4&&j==2){
                System.out.print(" ");
               }
               if(i==4&&j==3){
                System.out.print(" ");
               }
                else if(i+j<6)
                {
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }

            }

            for(int k=1;k<=4;k++)
            {
                if(i==3&&k==1){
                    System.out.print(" ");
                   }
                else if(i==4&&k==2){
                    System.out.print(" ");
                   }
                else if(i==4&&k==3){
                    System.out.print(" ");
                   }
                else if(i>k)
                {
                    System.out.print("* ");
                }

            }
            System.out.println("");
        }
    }
}
    

public class elemnetry {
    public static void main(String[] args) {
        oduu obj=new oduu();
        obj.two();
    }
    
}
