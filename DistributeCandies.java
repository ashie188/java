
import java.util.*;

public class DistributeCandies {

    public int distributeCandies(int[] candyType) {
        Set<Integer> types = new HashSet<>();

        // Store all different candy types.
        for (int candy : candyType) {
            types.add(candy);
        }

        int maxCandies = candyType.length / 2;
        int uniqueTypes = types.size();

        // Alice can eat at most n/2 different types.
        return Math.min(uniqueTypes, maxCandies);
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};

        DistributeCandies solution = new DistributeCandies();

        int answer = solution.distributeCandies(candyType);

        System.out.println("Maximum different candy types: " + answer);
    }
}
