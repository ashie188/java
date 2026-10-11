
public class SumOfSquares {

    public static int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += nums[i - 1] * nums[i - 1];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int result = sumOfSquares(nums);

        System.out.println(result);
    }
}
