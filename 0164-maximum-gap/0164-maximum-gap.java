class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        Arrays.sort(nums);
        if (n < 2) {
            return 0;
        }
        for (int i = 1; i < n; i++) {
            int diff = nums[i] - nums[i -1];
            if (diff > max) {
                max = diff;
            }
        }
        return max;
    }
}