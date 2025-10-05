public class duplicate {
    public int b[];

    public void duplicatenum(int[] arr)
    {
        for(int i=0;i<arr.length();i++)
        {
            for(int j=0;j<arr.length();j++)
            {
                if(arr[i]==arr[j]){
                return arr[i];
                }
            }
        }
        
    }
}

public class dupli{
    public static void main(String[] args)
    {
        duplicate obj=new duplicate();
        int a[]={1,2,3,2,4,3,5,6,7,5};
        obj.duplicatenum(a);
    }

}
