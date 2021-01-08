class NumArray {
    int[] count;

    public NumArray(int[] nums) {
        int n = nums.length, k = 0;
        count = new int[n];
        for (int i = 0; i < n; i++) {
            k += nums[i];
            count[i] = k;
        }
    }

    public int sumRange(int i, int j) {
        return count[j] - (i < 1 ? 0 : count[i - 1]);
    }
}

/**
 * 主要使用了区间相减的办法，a<b<c, b->c 等于 a->c的距离减去a->b的距离
 * 如果a为0，则不用减，直接去到c的距离即可
 */

/**
 * Your NumArray object will be instantiated and called as such: NumArray obj =
 * new NumArray(nums); int param_1 = obj.sumRange(i,j);
 */
