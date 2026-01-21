public class showdown1 {
  public static long maximumSum(List<Long> a, long m) {
    // Write your code here
        long maxans=0;
        int n=1;
        while(n<a.size()){
            ArrayList<Long> window=new ArrayList<>();
            long currsum=0;
            for(int i=0;i<n;i++){
                window.add(a.get(i));
                currsum=0;
            }
            for(int j=n;j<a.size();j++){
                if(currsum%m>maxans){
                    maxans=currsum%m;
                }
                currsum=currsum-a.get(j-n);
                window.remove(0);
                currsum=currsum+a.get(j);
                window.add(a.get(j));
            }
            if(currsum%m>maxans){
                    maxans=currsum%m;
            }
            n++;
        }
        return maxans;
    } 
}
