import java.util.*;

public class SortParityIIProgram {

    public static int[] sortArrayByParityII(int[] nums) {
        int j, temp;

        for (int i = 0; i < nums.length; i++) {

            // even index → should contain even number
            if (i % 2 == 0) {
                if (nums[i] % 2 != 0) {
                    j = i + 1;
                    while (j < nums.length) {
                        if (nums[j] % 2 == 0) {
                            temp = nums[i];
                            nums[i] = nums[j];
                            nums[j] = temp;
                            break;
                        }
                        j++;
                    }
                }

            // odd index → should contain odd number
            } else {
                if (nums[i] % 2 == 0) {
                    j = i + 1;
                    while (j < nums.length) {
                        if (nums[j] % 2 != 0) {
                            temp = nums[i];
                            nums[i] = nums[j];
                            nums[j] = temp;
                            break;
                        }
                        j++;
                    }
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Function call
        int[] result = sortArrayByParityII(nums);

        // Output result
        System.out.println("Array after sorting by Parity II:");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
