
public class ArrayMaxSumSquares {

    public static long maxSum(int[] nums, int k) {
        int MOD = 1_000_000_007;
        int[] bitCount = new int[31];

        for (int num : nums) {
            for (int bit = 0; bit < 31; bit++) {
                if ((num & (1 << bit)) != 0) {
                    bitCount[bit]++;
                }
            }
        }

        long result = 0;

        for (int i = 0; i < k; i++) {
            long num = 0;

            for (int bit = 0; bit < 31; bit++) {
                if (bitCount[bit] > 0) {
                    num |= (1L << bit);
                    bitCount[bit]--;
                }
            }

            result = (result + num * num) % MOD;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 6, 5, 8};
        int k = 2;

        System.out.println(maxSum(nums, k));
    }
}
