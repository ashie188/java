import java.util.Arrays;

public class MinimumBoxesCalculator {

  public static int minimumBoxes(int[] apple, int[] capacity) {
    Arrays.sort(capacity);

    int sum = 0;
    int count = 0;

    // sum of all apples
    for (int i = 0; i < apple.length; i++) {
      sum += apple[i];
    }

    // pick boxes with largest capacity first
    for (int j = capacity.length - 1; j >= 0; j--) {
      if (sum <= 0) {
        return count;
      }
      sum = sum - capacity[j];
      count++;
    }
    return count;
  }

  public static void main(String[] args) {
    int[] apple = {1, 3, 2};
    int[] capacity = {4, 3, 1, 5};

    int result = minimumBoxes(apple, capacity);
    System.out.println("Minimum boxes needed: " + result);
  }
}
