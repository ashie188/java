import java.util.*;

public class MissingNumbersFinder {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        // Store all existing numbers in a HashSet
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            seen.add(num);
        }

        // Find numbers from 1 to n that are missing
        List<Integer> missing = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!seen.contains(i)) {
                missing.add(i);
            }
        }

        return missing;
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        // Function call
        List<Integer> missingNumbers = findDisappearedNumbers(nums);

        // Output
        System.out.println("Input array: " + Arrays.toString(nums));
        System.out.println("Missing numbers: " + missingNumbers);
    }
}
