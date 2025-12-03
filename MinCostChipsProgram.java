import java.util.*;

public class MinCostChipsProgram {

    public static int minCostToMoveChips(int[] position) {

        // Build frequency map (your original logic)
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int p : position) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        // Find all positions with maximum frequency
        int maxFreq = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int pos = e.getKey();
            int freq = e.getValue();

            if (freq > maxFreq) {
                maxFreq = freq;
                list.clear();
                list.add(pos);
            } else if (freq == maxFreq) {
                list.add(pos);
            }
        }

        int mincost = Integer.MAX_VALUE;

        // Try moving all chips to each candidate position (same as your approach)
        for (int curr : list) {
            int cost = 0;  // IMPORTANT: reset cost for each candidate
            int currParity = Math.abs(curr) % 2;

            for (int p : position) {
                if (p == curr) continue;

                int pParity = Math.abs(p) % 2;

                // If parity differs → cost 1, else 0
                if (currParity != pParity) {
                    cost += 1;
                }
            }

            mincost = Math.min(mincost, cost);
        }

        return mincost;
    }

    // ---------------- MAIN METHOD ----------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of chips: ");
        int n = sc.nextInt();

        int[] position = new int[n];

        // Input positions
        System.out.println("Enter chip positions:");
        for (int i = 0; i < n; i++) {
            position[i] = sc.nextInt();
        }

        // Call function
        int result = minCostToMoveChips(position);

        // Output result
        System.out.println("Minimum cost to move chips = " + result);
    }
}
