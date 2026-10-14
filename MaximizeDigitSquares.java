
public class MaximizeDigitSquares {

    public static String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        while (sum >= 9) {
            result.append('9');
            sum -= 9;
            num--;
        }

        if (num > 0 && sum > 0) {
            result.append((char) ('0' + sum));
            num--;
        }

        while (num > 0) {
            result.append('0');
            num--;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int num = 2;
        int sum = 17;

        System.out.println(maxSumOfSquares(num, sum));
    }
}
