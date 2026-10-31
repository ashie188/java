
public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {

            // Calculate the sum of elements on the right.
            int rightSum = totalSum - leftSum - nums[i];

            // Check if both sides have equal sums.
            if (leftSum == rightSum) {
                return i;
            }

            // Add the current element to the left sum.
            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};

        FindPivotIndex solution = new FindPivotIndex();

        int answer = solution.pivotIndex(nums);

        System.out.println("Pivot Index: " + answer);
    }
}
