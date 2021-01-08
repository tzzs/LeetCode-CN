class Solution {
    // public int rob(int[] nums) {
    // return maxRob(nums, nums.length);
    // }

    // public int maxRob(int[] nums, int end) {
    // if (end == 0) {
    // return 0;
    // } else if (end == 1) {
    // return nums[0];
    // } else if (end == 2) {
    // return Math.max(nums[0], nums[1]);
    // } else {
    // return Math.max(maxRob(nums, end - 2) + nums[end - 1], maxRob(nums, end -
    // 1));
    // }
    // }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        } else if (n == 1)
            return nums[0];
        else if (n == 2)
            return Math.max(nums[0], nums[1]);
        else {
            int a = nums[0], b = Math.max(nums[0], nums[1]), c = 0;
            for (int i = 2; i < n; i++) {
                c = Math.max(a + nums[i], b);
                a = b;
                b = c;
            }
            return c;
        }
    }
}
