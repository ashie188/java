import java.util.*;

public class CombinationSumTwo {

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> results = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), results);
        return results;
    }

    private static void backtrack(int[] nums, int remain, int start, List<Integer> temp, List<List<Integer>> results) {
        if (remain == 0) {
            results.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue; // skip duplicates

            if (nums[i] > remain) break; // pruning

            temp.add(nums[i]);
            backtrack(nums, remain - nums[i], i + 1, temp, results);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ------------------ INPUT ------------------
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] candidates = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            candidates[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // ------------------ PROCESS ------------------
        List<List<Integer>> result = combinationSum2(candidates, target);

        // ------------------ OUTPUT ------------------
        System.out.println("\nUnique Combinations that sum to target:");
        System.out.println("[");
        for (List<Integer> comb : result) {
            System.out.println("  " + comb + ",");
        }
        System.out.println("]");
    }
}
