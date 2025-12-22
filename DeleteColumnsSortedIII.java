import java.util.*;

class DeleteColumnsSortedIII {
    public static int minDeletionSize(String[] strs) {
        int rows = strs.length;
        int cols = strs[0].length();

        int[] dp = new int[cols];
        int max = 0;

        for (int j = 0; j < cols; j++) {
            dp[j] = 1; // each column alone is valid
            for (int i = 0; i < j; i++) {
                boolean valid = true;

                for (int r = 0; r < rows; r++) {
                    if (strs[r].charAt(i) > strs[r].charAt(j)) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    dp[j] = Math.max(dp[j], dp[i] + 1);
                }
            }
            max = Math.max(max, dp[j]);
        }

        return cols - max;
    }

    public static void main(String[] args) {
        // Example 1
        String[] strs1 = {"babca", "bbazb"};
        System.out.println(minDeletionSize(strs1)); // Output: 3

        // Example 2
        String[] strs2 = {"edcba"};
        System.out.println(minDeletionSize(strs2)); // Output: 4

        // Example 3
        String[] strs3 = {"ghi", "def", "abc"};
        System.out.println(minDeletionSize(strs3)); // Output: 0
    }
}
