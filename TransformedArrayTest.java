import java.util.*;

public class TransformedArrayTest {

    public static int[] constructTransformedArray(int[] nums) {
        int[] result = new int[nums.length];
        int steps = 0;
        int remaining = 0;
        int diff = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[i] = nums[i];

            } else if (nums[i] > 0) {

                steps = nums[i] % nums.length;
                remaining = nums.length - (i + 1);

                if (remaining < steps) {
                    diff = (steps - remaining);
                    result[i] = nums[diff - 1];
                } else {
                    result[i] = nums[i + steps];
                }

            } else {

                int num = Math.abs(nums[i]);
                steps = num % nums.length;

                if (i < steps) {
                    diff = steps - i;
                    result[i] = nums[nums.length - diff];
                } else {
                    result[i] = nums[i - steps];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] test1 = {3, -2, 1, 1};
        int[] test2 = {2, -1, 1, 2, 2};
        int[] test3 = {0, 0, 0};
        int[] test4 = {1, 2, 3, 4};

        runTest(test1);
        runTest(test2);
        runTest(test3);
        runTest(test4);
    }

    public static void runTest(int[] nums) {
        System.out.println("Input : " + Arrays.toString(nums));

        int[] ans = constructTransformedArray(nums);

        System.out.println("Output: " + Arrays.toString(ans));
        System.out.println("--------------------------------");
    }
}
