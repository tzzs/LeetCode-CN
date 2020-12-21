class Solution {
    public int hammingDistance(int x, int y) {
        int k = x ^ y, count = 0;
        while (k != 0) {
            count += k % 2 == 1 ? 1 : 0;
            k /= 2;
        }
        return count;
    }
}