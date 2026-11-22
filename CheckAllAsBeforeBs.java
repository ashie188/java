
public class CheckAllAsBeforeBs {

    public static boolean checkString(String s) {
        boolean foundB = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') {
                foundB = true;
            } 
            else if (foundB) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aaabbb";
        boolean result = checkString(s);
        System.out.println(result);
    }
}
