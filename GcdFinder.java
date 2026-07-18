import java.util.*;

public class GcdFinder {

    public static int findGCD(int[] nums) {

        int smallest = nums[0];
        int largest = nums[0];

        for(int num : nums) {

            if(num < smallest)
                smallest = num;

            if(num > largest)
                largest = num;
        }

        while(largest != 0) {

            int temp = largest;
            largest = smallest % largest;
            smallest = temp;
        }

        return smallest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(findGCD(nums));

        sc.close();
    }
}