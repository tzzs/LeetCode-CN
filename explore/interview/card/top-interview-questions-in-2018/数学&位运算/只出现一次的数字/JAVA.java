class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i=0;i<nums.length;i++){
            res ^=nums[i];
        }
        return res;
    }
}

/**
 * 主要使用异或^来解决在这个问题
 * 异或 当两个数字不同时为1 ，相同时为0
 * 即出现两次的数字异或后都会变为0
 * 所有数字异或后就剩下了只出现一次的数字
 */