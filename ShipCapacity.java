
public class ShipCapacity {

  public static int shipWithinDays(int[] weights, int days) {

    int low = 0;
    int high = 0;

    for (int weight : weights) {
      low = Math.max(low, weight);
      high += weight;
    }

    while (low < high) {
      int mid = low + (high - low) / 2;

      int requiredDays = 1;
      int currentWeight = 0;

      for (int weight : weights) {
        if (currentWeight + weight > mid) {
          requiredDays++;
          currentWeight = weight;
        } else {
          currentWeight += weight;
        }
      }

      if (requiredDays <= days) {
        high = mid;
      } else {
        low = mid + 1;
      }
    }

    return low;
  }

  public static void main(String[] args) {

    int[] weights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int days = 5;

    int result = shipWithinDays(weights, days);

    System.out.println("Minimum ship capacity: " + result);
  }
}
