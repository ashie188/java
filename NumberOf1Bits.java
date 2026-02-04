import java.util.*;

public class NumberOf1Bits {

    // Approach 1: Brian Kernighan Algorithm (Best)
    public static int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            n = n & (n - 1);   // removes lowest set bit
            count++;
        }

        return count;
    }

    // For testing
    public static void main(String[] args) {

        int n1 = 11;         // 1011
        int n2 = 128;        // 10000000
        int n3 = 2147483645; // large number

        System.out.println("Input: " + n1 + " -> Output: " + hammingWeight(n1));
        System.out.println("Input: " + n2 + " -> Output: " + hammingWeight(n2));
        System.out.println("Input: " + n3 + " -> Output: " + hammingWeight(n3));
    }
}
