
class Solution2 {
    public int findRepeatNumber(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i != nums[i]) {

                if (nums[i] == nums[nums[i]])
                    return nums[i];

                int tmp = nums[i];
                nums[i] = nums[tmp];
                nums[tmp] = tmp;
            }
        }

        return 0;
    }
}
