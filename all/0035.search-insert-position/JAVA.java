class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            if (target <= nums[i]) {
                return i;
            }
        }
        return l;
    }
}
// 二分法