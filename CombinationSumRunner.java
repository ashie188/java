import java.util.*;

public class CombinationSumRunner {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] candidates, int target, int index,
                                  List<Integer> current, List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0 || index == candidates.length) {
            return;
        }

        // Include the current element (can use unlimited times)
        current.add(candidates[index]);
        backtrack(candidates, target - candidates[index], index, current, result);
        current.remove(current.size() - 1);

        // Exclude the current element and move to next candidate
        backtrack(candidates, target, index + 1, current, result);
    }

    public static void main(String[] args) {

        // Example Input
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        System.out.println("Input: " + Arrays.toString(candidates) + ", Target = " + target);

        List<List<Integer>> output = combinationSum(candidates, target);

        System.out.println("Output: " + output);
    }
}
