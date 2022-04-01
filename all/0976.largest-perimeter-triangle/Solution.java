class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        for (int i = n - 1; i >= 2; i--) {
            int a = nums[i], b = nums[i - 1], c = nums[i - 2];

            if (a < b + c)
                return a + b + c;
        }
        return 0;
    }
}
