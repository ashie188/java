import java.util.Arrays;

public class PlusOneArray {

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        // Example input
        int[] digits = {9, 9, 9};

        // Call function
        int[] output = plusOne(digits);

        // Print output
        System.out.println("Input : " + Arrays.toString(digits));
        System.out.println("Output: " + Arrays.toString(output));
    }
}
