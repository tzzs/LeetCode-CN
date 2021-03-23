
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            int k = Math.abs(nums[i]);
            nums[k - 1] = -Math.abs(nums[k - 1]);
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] > 0)
                list.add(i + 1);
        }
        return list;
    }
}
