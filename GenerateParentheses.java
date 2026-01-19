import java.util.*;

public class GenerateParentheses {

    public static void main(String[] args) {
        int n = 3;   // change input here
        GenerateParentheses obj = new GenerateParentheses();
        List<String> result = obj.generateParenthesis(n);

        System.out.println("Output:");
        for (String s : result) {
            System.out.println(s);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(0, 0, n, new StringBuilder(), result);
        return result;
    }

    private void backtrack(int open, int close, int n, StringBuilder sb, List<String> result) {
        // base case
        if (sb.length() == 2 * n) {
            result.add(sb.toString());
            return;
        }

        // add '(' if possible
        if (open < n) {
            sb.append('(');
            backtrack(open + 1, close, n, sb, result);
            sb.deleteCharAt(sb.length() - 1); // backtrack
        }

        // add ')' if valid
        if (close < open) {
            sb.append(')');
            backtrack(open, close + 1, n, sb, result);
            sb.deleteCharAt(sb.length() - 1); // backtrack
        }
    }
}
