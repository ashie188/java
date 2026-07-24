public class FindMissingNumber {

    public static int missingNumber(int[] nums) {

        int n = nums.length;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int value : nums) {
            arraySum += value;
        }

        return totalSum - arraySum;
    }

    public static void main(String[] args) {

        int[] nums1 = {3, 0, 1};
        int[] nums2 = {0, 1};
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println(missingNumber(nums1)); // 2
        System.out.println(missingNumber(nums2)); // 2
        System.out.println(missingNumber(nums3)); // 8
    }
}