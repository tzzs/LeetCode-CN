class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        if (n > 1) {
            k = k % n;

            if (k != 0) {
                revert(nums, 0, n - k - 1);
                revert(nums, n - k, n - 1);
                revert(nums, 0, n - 1);
            }
        }

    }

    public void revert(int[] nums, int left, int right) {
        int n = nums.length;
        for (int i = left, j = right; i < j;) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j--;
        }
    }
}
