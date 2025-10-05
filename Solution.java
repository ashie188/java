import java.util.ArrayList;
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int wordslength=words[0].length();
        int totalwords=words.length;
        int maxstrlen=wordslength*totalwords;

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<s.length();i=i+maxstrlen){
            String str1=s.substring(i,i+(maxstrlen-1));
            for(int j=0;j<maxstrlen;j=j+wordslength){
                if(Arrays.asList(words).contains(str1.substring(j,j+(wordslength-1)))){
                    list.add(i);
                }
            }
        }
        return list;
    }
}