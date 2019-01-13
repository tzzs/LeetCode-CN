class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int i = 0;
        for (int num : nums) {
            if (num != val) {
                nums[i++] = num;
            } else {
                len--;
            }
        }
        return len;
    }
}