class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length, i = 0;

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (i = 0; i < n; i++) {
            if (hm.containsKey(target - nums[i]))
                break;
            hm.put(nums[i], i);
        }

        return new int[] { hm.get(target - nums[i]), i };
    }
}
