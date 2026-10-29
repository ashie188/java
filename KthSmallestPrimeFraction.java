
import java.util.*;

public class KthSmallestPrimeFraction {

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            double first = (double) arr[a[0]] / arr[a[1]];
            double second = (double) arr[b[0]] / arr[b[1]];

            return Double.compare(first, second);
        });

        // Add the first fraction for every denominator.
        for (int j = 1; j < n; j++) {
            pq.offer(new int[]{0, j});
        }

        // Keep removing fractions until we reach the kth one.
        for (int i = 1; i < k; i++) {
            int[] current = pq.poll();

            int numeratorIndex = current[0];
            int denominatorIndex = current[1];

            // Move to the next numerator for this denominator.
            if (numeratorIndex + 1 < denominatorIndex) {
                pq.offer(new int[]{
                    numeratorIndex + 1,
                    denominatorIndex
                });
            }
        }

        int[] result = pq.poll();

        return new int[]{
            arr[result[0]],
            arr[result[1]]
        };
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int k = 3;

        KthSmallestPrimeFraction solution =
                new KthSmallestPrimeFraction();

        int[] answer = solution.kthSmallestPrimeFraction(arr, k);

        System.out.println(Arrays.toString(answer));
    }
}
