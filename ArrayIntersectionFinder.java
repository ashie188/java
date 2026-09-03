
import java.util.*;

public class ArrayIntersectionFinder {

    public static int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums1) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> commonElements = new ArrayList<>();

        for (int num : nums2) {

            if (frequency.containsKey(num) && frequency.get(num) > 0) {

                commonElements.add(num);
                frequency.put(num, frequency.get(num) - 1);

            }

        }

        int[] result = new int[commonElements.size()];

        for (int i = 0; i < commonElements.size(); i++) {
            result[i] = commonElements.get(i);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = intersect(nums1, nums2);

        System.out.println(Arrays.toString(result)); // [2, 2]
    }
}
