public class udemy7 {

    public static void main(String[] args)

    {
       /* * int A[]={1,2,3,8,4,6,7,10,15,4};
 
        int max=15;
        int smax=A[0];

        for(int i=1;i<A.length;i++)
        {
            if(smax<=A[i] && A[i]!=max)
            {
                smax=A[i];
                
            }

        }

        System.out.println("second maximun number is "+smax); 
       //* */ 


      /* * int B[]={1,4,5,8,3,5,9,10,2};
       int temp= B[0];

       for(int i=1;i<B.length;i++)
       {
        B[i-1]=B[i];
       }

       B[B.length-1]=temp;

      for(int j=0;j<B.length;j++)
      {
       System.out.println(B[j]);
      }
      /* */


     /* * int C[]= new int[8];
       C[0]=1;
       C[1]=4;
       C[2]=6;
       C[3]=2;
       C[4]=8;
       C[5]=15;

      for(int i=5;i>=2;i--)
      {
        C[i+1]=C[i];

      }
      C[2]=15;

      for(int x: C)
      {
        System.out.println(x);
      } /* */



      
      /*int D[]={1,2,3,4,5,6};
      int E[]=new int[6];

      
      
        for(int i=D.length-1;i>=0;i--)
        {
          for(int j=0;j<E.length;j++)
          {
            E[j]=D[i];
          }
        }

        for(int j=0;j<E.length;j++)
        {
          System.out.println(E[j]);
        }

        // wrong code , we can not delete the elements of array only we can traverse the array
       /* */
    }
}    

