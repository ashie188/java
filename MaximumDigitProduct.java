public class MaximumDigitProduct {

    public static int maxProduct(int n) {

        int first = 0;
        int second = 0;

        while (n > 0) {

            int currentDigit = n % 10;

            if (currentDigit >= first) {
                second = first;
                first = currentDigit;
            } else if (currentDigit > second) {
                second = currentDigit;
            }

            n /= 10;
        }

        return first * second;
    }

    public static void main(String[] args) {

        int n1 = 31;
        int n2 = 22;
        int n3 = 124;

        System.out.println(maxProduct(n1)); // 3
        System.out.println(maxProduct(n2)); // 4
        System.out.println(maxProduct(n3)); // 8
    }
}