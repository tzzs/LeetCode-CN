
class Solution {
    int k = (int) Math.pow(10, 9) + 7;

    public int numWays(int n) {
        int a = 1, b = 1;

        if (n < 2)
            return 1;

        for (int i = 2; i <= n; i++) {
            b = a + b;
            a = b - a;

            if (b > k)
                b -= k;
        }

        return b;
    }
}
