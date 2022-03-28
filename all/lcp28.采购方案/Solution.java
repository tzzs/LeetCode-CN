class Solution {
    public int purchasePlans(int[] nums, int target) {
        int n = nums.length;

        Arrays.sort(nums);

        int l = 0, r = n - 1, ret = 0;
        while (l < r) {
            if (nums[l] + nums[r] > target)
                r--;
            else {
                ret = (int) ((ret + r - l) % (1e9 + 7));
                l++;
            }
        }

        return ret;
    }
}
