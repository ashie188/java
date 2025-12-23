import java.util.*;

public class MaxTwoEventsOptimized {

  public static int maxTwoEvents(int[][] events) {
    // sort by start time
    Arrays.sort(events, (a, b) -> a[0] - b[0]);

    // min-heap by end time
    PriorityQueue<int[]> pq = new PriorityQueue<>(
      (a, b) -> a[1] - b[1]
    );

    int max = 0;
    int best = 0;

    for (int[] e : events) {
      int start = e[0];
      int end = e[1];
      int val = e[2];

      // remove events that ended before this starts
      while (!pq.isEmpty() && pq.peek()[1] < start) {
        best = Math.max(best, pq.poll()[2]);
      }

      max = Math.max(max, best + val);
      pq.offer(e);
    }

    return max;
  }

  public static void main(String[] args) {
    int[][] events = {
      {1, 3, 4},
      {2, 4, 3},
      {3, 5, 1},
      {6, 7, 5}
    };

    System.out.println(maxTwoEvents(events));
  }
}
