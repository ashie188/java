
public class DecodeWays {

    public int numDecodings(String s) {
        Integer[] dp = new Integer[s.length()];
        return helper(0, s, dp);
    }

    private int helper(int i, String s, Integer[] dp) {
        // Base case
        if (i == s.length()) return 1;

        // Invalid case
        if (s.charAt(i) == '0') return 0;

        // Already computed
        if (dp[i] != null) return dp[i];

        // Take single digit
        int ways = helper(i + 1, s, dp);

        // Take two digits
        if (i + 1 < s.length()) {
            int num = Integer.parseInt(s.substring(i, i + 2));
            if (num >= 10 && num <= 26) {
                ways += helper(i + 2, s, dp);
            }
        }

        return dp[i] = ways;
    }

    public static void main(String[] args) {
        DecodeWays obj = new DecodeWays();
        System.out.println(obj.numDecodings("226")); // Output: 3
    }
}