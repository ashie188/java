import java.util.*;

public class StringAddition {

    public static String addStrings(String num1, String num2) {

        StringBuilder ans = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while(i >= 0 || j >= 0 || carry != 0) {

            int sum = carry;

            if(i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }

            if(j >= 0)
            {
                sum += num2.charAt(j) - '0';
                j--;
            }

            ans.append(sum % 10);
            carry = sum / 10;
        }

        return ans.reverse().toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String num1 = sc.next();
        String num2 = sc.next();

        System.out.println(addStrings(num1, num2));

        sc.close();
    }
}