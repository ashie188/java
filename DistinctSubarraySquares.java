
import java.util.HashSet;
import java.util.Set;

public class DistinctSubarraySquares {

    public static int sumCounts(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            Set<Integer> distinct = new HashSet<>();

            for (int j = i; j < n; j++) {
                distinct.add(nums[j]);

                int count = distinct.size();
                sum += count * count;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};

        System.out.println(sumCounts(nums));
    }
}
