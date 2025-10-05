import java.lang.reflect.Array;

public class duplicate {
    public int b[];

    public Array duplicatenum(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j]){
                b=arr[i];
                } 
            }
        }
        return b;
        
    }
}

public class dupli {
    public static void main(String[] args)
    {
        duplicate obj=new duplicate();
        int a[]={1,2,3,2,4,3,5,6,7,5};
        System.out.println(obj.duplicatenum(a));
    }
}

