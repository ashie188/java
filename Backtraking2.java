import java.util.*;

public class Main {

    // Function to generate all subsets using backtracking
    public static void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        // Base case: if we've considered all elements
        if (index == nums.length) {
            result.add(new ArrayList<>(current));  // Add a copy of current subset
            return;
        }

        // Choice 1: Exclude current element
        generateSubsets(nums, index + 1, current, result);

        // Choice 2: Include current element
        current.add(nums[index]);
        generateSubsets(nums, index + 1, current, result);

        // Backtrack: remove last added element before going back
        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();

        generateSubsets(nums, 0, new ArrayList<>(), result);

        // Print all subsets
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
