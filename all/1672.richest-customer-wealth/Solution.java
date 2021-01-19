
class Solution {
    public int maximumWealth(int[][] accounts) {
        int MAX = 0;

        for (int[] account : accounts) {
            int count = 0;
            for (int a : account) {
                count += a;
            }
            if (count > MAX)
                MAX = count;
        }

        return MAX;
    }
}
