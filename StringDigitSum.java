
import java.util.Scanner;

public class StringDigitSum {

    public static String digitSum(String s, int k) {

        while (s.length() > k) {

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < s.length(); i += k) {

                int sum = 0;

                for (int j = i; j < Math.min(i + k, s.length()); j++) {
                    sum += s.charAt(j) - '0';
                }

                result.append(sum);
            }

            s = result.toString();
        }

        return s;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        String answer = digitSum(s, k);

        System.out.println("Final String: " + answer);

        sc.close();
    }
}
