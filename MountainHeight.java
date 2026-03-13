import java.util.*;

public class MountainHeight {

    public static long maxHeight(long time, int workerTime) {

        long left = 0;
        long right = 100000;
        long ans = 0;

        while (left <= right) {

            long mid = (left + right) / 2;

            long requiredTime = (long) workerTime * mid * (mid + 1) / 2;

            if (requiredTime <= time) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {

        long left = 0;
        long right = (long)1e18;
        long ans = right;

        while (left <= right) {

            long mid = (left + right) / 2;

            long totalHeight = 0;

            for (int t : workerTimes) {

                totalHeight += maxHeight(mid, t);

                if (totalHeight >= mountainHeight)
                    break;
            }

            if (totalHeight >= mountainHeight) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int mountainHeight = 4;
        int[] workerTimes = {2,1,1};

        long result = minNumberOfSeconds(mountainHeight, workerTimes);

        System.out.println("Minimum Seconds: " + result);
    }
}