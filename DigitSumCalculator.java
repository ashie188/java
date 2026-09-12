public class DigitSumCalculator {

public static int addDigits(int num) {

if (num == 0) {
return 0;
}

return 1 + (num - 1) % 9;
}

public static void main(String[] args) {

int num1 = 38;
int num2 = 0;
int num3 = 12345;

System.out.println(addDigits(num1)); // 2
System.out.println(addDigits(num2)); // 0
System.out.println(addDigits(num3)); // 6
}
}