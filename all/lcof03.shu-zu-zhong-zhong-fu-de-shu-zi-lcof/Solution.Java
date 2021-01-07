
class Solution {
    public int findRepeatNumber(int[] nums) {
        int n = nums.length;
        
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < n ; i++) {
            if (hs.contains(nums[i])) return nums[i];
            else hs.add(nums[i]);
        }
        return 0;
    }
}
