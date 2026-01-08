import java.util.*;

public class CombinationsLocal {

    List<List<Integer>> result = new ArrayList<>();

    public void recurse(int index, int n, int k, ArrayList<Integer> curr) {
        // Base case: when index goes beyond n
        if (index == n + 1) {
            if (curr.size() == k) {
                result.add(new ArrayList<>(curr)); // deep copy
            }
            return;
        }

        // Pick the current number
        curr.add(index);
        recurse(index + 1, n, k, curr);

        // Backtrack
        curr.remove(curr.size() - 1);

        // Not pick the current number
        recurse(index + 1, n, k, curr);
    }

    public List<List<Integer>> combine(int n, int k) {
        recurse(1, n, k, new ArrayList<>());
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        CombinationsLocal obj = new CombinationsLocal();
        List<List<Integer>> combinations = obj.combine(n, k);

        System.out.println("Combinations:");
        for (List<Integer> list : combinations) {
            System.out.println(list);
        }

        sc.close();
    }
}
