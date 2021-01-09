class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;

        List<String> list = new ArrayList<String>();

        if (n > 0) {
            int l = 0, r = 0;

            int index = 0;
            while (index < n) {

                l = index;
                r = index;

                while (index < n && nums[index] - nums[l] == index - l) {
                    r = index;
                    index++;
                }

                if (l == r) {
                    list.add(String.valueOf(nums[l]));
                } else {
                    list.add(nums[l] + "->" + nums[r]);
                }
            }
        }
        return list;
    }
}
