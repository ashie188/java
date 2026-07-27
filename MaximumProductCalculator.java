public class MaximumProductCalculator {

public static int maxProduct(int[] nums) {

int first = 0;
int second = 0;

for (int value : nums) {

if (value >= first) {
second = first;
first = value;
}
else if (value > second) {
second = value;
}

}

return (first - 1) * (second - 1);
}

public static void main(String[] args) {

int[] nums1 = {3, 4, 5, 2};
int[] nums2 = {1, 5, 4, 5};
int[] nums3 = {3, 7};

System.out.println(maxProduct(nums1)); // 12
System.out.println(maxProduct(nums2)); // 16
System.out.println(maxProduct(nums3)); // 12
}
}