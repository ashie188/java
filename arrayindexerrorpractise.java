public class ArrayIndexErrorPractice {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Trying to access an element outside the bounds of the array
        int index = 10;
        try {
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index + " is out of bounds.");
        }
    }
}
