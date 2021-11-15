class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        if (len <= 1) {
            return 0;
        }

        if (len <= 2) {
            return Math.min(cost[0], cost[1]);
        }

        int m = 0, n = 0, tmp = 0;
        for (int i = 2; i < len; i++) {
            tmp = n;
            n = Math.min(m + cost[i - 2], n + cost[i - 1]);
            m = tmp;
        }
        return Math.min(m + cost[len - 2], n + cost[len - 1]);
    }
}
