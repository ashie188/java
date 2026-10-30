
public class ArrangingCoins {

    public int arrangeCoins(int n) {
        long low = 1;
        long high = n;
        int result = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            // Total coins required to complete mid rows.
            long requiredCoins = mid * (mid + 1) / 2;

            if (requiredCoins <= n) {
                result = (int) mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 8;

        ArrangingCoins solution = new ArrangingCoins();

        int answer = solution.arrangeCoins(n);

        System.out.println("Complete rows: " + answer);
    }
}
