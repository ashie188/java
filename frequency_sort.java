public class frequency_sort {
    public void sort(String text){
        
        String[] a=text.split("");
        for(int k=0;k<text.length();k++){
        int b[]=a[k].count;
        }
        for(int i=0;i<text.length();i++){
            String x=b[i];
            for(int j=i+1;j<text.length();j++){
                if(x<b[j]){
                    int temp=x;
                    x=b[i];
                    b[i]=temp;
                }
            }

        }

        for(int i=0;i<b.length();i++){ 
            System.out.println(b[i]);

        }

    }

    public static void main(String[] args){
        frequency_sort obj=new frequency_sort();
        obj.sort("sggsietnanded");
    }
    
}
