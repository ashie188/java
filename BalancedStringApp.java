import java.util.*;

public class BalancedStringApp {

    public static int minDeletionsToBalance(String s) {
        int bCount = 0;
        int deletions = 0;

        for (char c : s.toCharArray()) {
            if (c == 'b') {
                bCount++;
            } else { // 'a'
                deletions = Math.min(deletions + 1, bCount);
            }
        }

        return deletions;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string containing only a and b: ");
        String s = sc.nextLine();

        int result = minDeletionsToBalance(s);

        System.out.println("Minimum deletions needed: " + result);

        // Test examples
        System.out.println("\nSample Tests:");
        System.out.println("aababbab -> " + minDeletionsToBalance("aababbab")); // 2
        System.out.println("bbaaaaabb -> " + minDeletionsToBalance("bbaaaaabb")); // 2

        sc.close();
    }
}
