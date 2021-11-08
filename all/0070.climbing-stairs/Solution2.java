public class Solution2 {
    public int climbStairs(int n) {
        int x = 1, y = 2;
        if (n < 3) {
            return n;
        } else {
            for (int i = 3; i <= n; i++) {
                y += x;
                x = y - x;
            }
        }
        return y;
    }

}
