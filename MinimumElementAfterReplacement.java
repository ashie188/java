import java.util.*;

public class MinimumElementAfterReplacement {

    public static int digitSum(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public static int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            min = Math.min(min, digitSum(num));
        }

        return min;
    }

    public static void main(String[] args) {
        int[] nums = {10, 12, 13, 14};

        int result = minElement(nums);

        System.out.println("Minimum element after replacement: " + result);
    }
}