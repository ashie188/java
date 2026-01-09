import java.util.*;

public class PermutationLocal {

    static List<List<Integer>> result = new ArrayList<>();

    public static void backtrack(int[] nums, boolean[] used, List<Integer> curr) {
        // Base case: permutation completed
        if (curr.size() == nums.length) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            used[i] = true;
            curr.add(nums[i]);

            backtrack(nums, used, curr);

            // Backtrack
            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        result.clear();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used, new ArrayList<>());
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> permutations = permute(nums);

        System.out.println("Permutations:");
        for (List<Integer> perm : permutations) {
            System.out.println(perm);
        }

        sc.close();
    }
}
