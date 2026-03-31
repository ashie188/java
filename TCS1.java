import java.util.*;

public class TCS1 {
  public int maxsequencesum(int[] arr){
    int n=arr.length;
    int sum=0;
    ArrayList<Integer> list=new ArrayList<>();
    list.add(arr[0]);
    for(int i=1;i<n;i++){
      if(list.get(list.size()-1)>=0){
        if(arr[i]>=0){
          if(arr[i]>list.get(list.size()-1)){
            list.remove(list.size()-1);
            list.add(arr[i]);
          }
        }else{
          list.add(arr[i]);
        }
      }else{
        if(arr[i]>0){
          list.add(arr[i]);
        }else{
          if(arr[i]>list.get(list.size()-1)){
            list.remove(list.size()-1);
            list.add(arr[i]);
          }
        }
      }
    }
    for(int k=0;k<list.size();k++){
      sum+=list.get(k);
    }
    return sum;
  }
  public static void main(String[] args){
    int[] arr={21, 12, 13, -21, -2};
    TCS1 obj=new TCS1();
    System.out.println(obj.maxsequencesum(arr));
  }
}