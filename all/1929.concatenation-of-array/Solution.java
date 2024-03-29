class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;

        int[] ret = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ret[i] = nums[i];
            ret[i + n] = nums[i];
        }

        return ret;
    }
}
