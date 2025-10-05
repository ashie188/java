public class pattern {
    
    public static void main(String[] args) {
       /* * for(int i=1;i<=5;i++)
        {
            int n=i;
            for(int j=1;j<=5;j++)
            {
                n=++n;
                System.out.print(n+" ");

            }

            System.out.println("");

        }/* */


        int n=5;
       /* * for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j+" ");

            }
            n=--n;

            System.out.println("");
        }
    }/* */

    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
            if(i>j)
            System.out.print("  ");
            else
            System.out.print("* ");

        }
        System.out.println("");
 
    }

   
    
}
}
