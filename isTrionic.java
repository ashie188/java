class Solution {
    public boolean isTrionic(int[] nums) {
        if (nums.length < 3) return false;

        int i = 1;
        int n = nums.length;

        // Phase 1: strictly increasing
        boolean first = false;
        while (i < n && nums[i] > nums[i - 1]) {
            first = true;
            i++;
        }

        // Need at least one increase
        if (!first) return false;

        // Phase 2: strictly decreasing
        boolean second = false;
        while (i < n && nums[i] < nums[i - 1]) {
            second = true;
            i++;
        }

        if (!second) return false;

        // Phase 3: strictly increasing again
        boolean third = false;
        while (i < n && nums[i] > nums[i - 1]) {
            third = true;
            i++;
        }

        // Must finish array exactly after third phase
        return third && i == n;
    }
}
