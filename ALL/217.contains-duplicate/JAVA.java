class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hset = new HashSet<>();
        for (int num : nums) {
            if (!hset.contains(num)) {
                hset.add(num);
            } else {
                return true;
            }
        }
        return false;
    }
}