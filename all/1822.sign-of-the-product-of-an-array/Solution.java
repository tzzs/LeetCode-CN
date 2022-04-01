class Solution {
    public int arraySign(int[] nums) {
        int ret = 1;
        for (int k : nums) {
            if (k == 0)
                return 0;
            else if (k < 0)
                ret *= -1;
        }

        return ret;
    }
}
