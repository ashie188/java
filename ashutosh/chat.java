import java.util.Scanner;

public class MixedFraction {

    static void showMixedFraction(int a, int b) {
        int quotient = b / a; 
        int remainder = b % a; 
        System.out.println("Mixed Fraction: " + quotient + " " + remainder + "/" + a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the denominator (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the numerator (b): ");
        int b = scanner.nextInt();

        scanner.close();

        showMixedFraction(a, b);
    }
}
