class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ret = new int[n];

        int l = 0, r = n - 1, cur = n - 1;

        while (l <= r) {
            int ls = nums[l] * nums[l];
            int rs = nums[r] * nums[r];

            if (ls < rs) {
                ret[cur--] = rs;
                r--;
            } else {
                ret[cur--] = ls;
                l++;
            }
        }

        return ret;
    }
}
