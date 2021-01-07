class Solution {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1])
                nums[count++] = nums[i];
        }
        return count;
    }
}
