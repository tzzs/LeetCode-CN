public class Solution2 {
    // public void moveZeroes(int[] nums) {
    // int n = nums.length;

    // if (n > 2) {
    // int i = 0, j = i + 1;

    // while (i < n && j < n) {
    // while (i < n - 1 && nums[i] != 0) {
    // i++;
    // }

    // j = i + 1;
    // while (j < n - 1 && nums[j] == 0) {
    // j++;
    // }

    // swap(nums, i, j);

    // i++;
    // j++;
    // }

    // }

    // }

    // public void swap(int[] nums, int left, int right) {
    // int tmp = nums[left];
    // nums[left] = nums[right];
    // nums[right] = tmp;
    // }

    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if (n > 1) {
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i] != 0) {
                    nums[j++] = nums[i];
                }
            }

            for (int i = j; i < n; i++) {
                nums[i] = 0;
            }
        }
    }
}
