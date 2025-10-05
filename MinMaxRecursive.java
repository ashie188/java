public class MinMaxRecursive {
    public static int findMax(int[] arr, int n) {
        if (n == 1) return arr[0];
        return Math.max(arr[n - 1], findMax(arr, n - 1));
    }

    public static int findMin(int[] arr, int n) {
        if (n == 1) return arr[0];
        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 8, 2, 6, 4};
        int max = findMax(arr, arr.length);
        int min = findMin(arr, arr.length);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
