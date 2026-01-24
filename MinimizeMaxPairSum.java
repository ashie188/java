import java.util.*;

public class MinimizeMaxPairSum {
    public static void main(String[] args) {
        int[] nums1 = {3, 5, 2, 3};
        int[] nums2 = {3, 5, 4, 2, 4, 6};

        System.out.println(minPairSum(nums1)); // 7
        System.out.println(minPairSum(nums2)); // 8
    }

    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;
        int max = 0;

        while (left < right) {
            max = Math.max(max, nums[left] + nums[right]);
            left++;
            right--;
        }

        return max;
    }
}
