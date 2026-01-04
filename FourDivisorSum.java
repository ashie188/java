import java.util.*;

class FourDivisorSum {

    public int sumFourDivisors(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int totalSum = 0;

        for (int num : nums) {
            int currSum = 0;

            for (int j = 1; j * j <= num; j++) {
                if (num % j == 0) {
                    int d1 = j;
                    int d2 = num / j;

                    set.add(d1);
                    currSum += d1;

                    if (d1 != d2) {   // avoid double count for perfect square
                        set.add(d2);
                        currSum += d2;
                    }
                }

                if (set.size() > 4) {
                    break;
                }
            }

            if (set.size() == 4) {
                totalSum += currSum;
            }

            set.clear();
        }

        return totalSum;
    }

    // -------- MAIN METHOD --------
    public static void main(String[] args) {
        FourDivisorSum obj = new FourDivisorSum();

        int[] nums = {21, 4, 7};
        int result = obj.sumFourDivisors(nums);

        System.out.println("Sum of divisors of numbers having exactly 4 divisors: " + result);
    }
}
