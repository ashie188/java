import java.util.Scanner;

class sample{
    int a[]={1,2,3,4,5};
    int b[]=new int[5];
    
    public void rot(){
        System.out.println("enter the value from which the array is rotated");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        for(int j=0;j<=4;j++)
        {
            a[j]=b[j];

        }

        for(int i=0;i<=4;i++)
        {
            
        }
        
    }
}

public class ROTATE{
    public static void main(String[] args) {
        sample obj=new sample();
        obj.rot();
    }
}