class Solution {
    public int climbStairs(int n) {
        // if (n == 0)
        // return 0;
        // else if (n == 1)
        // return 1;
        // else if (n == 2)
        // return 2;
        // else {
        // return climbStairs(n - 2) + climbStairs(n - 1) + 3;
        // }

        // f(n) = f(n-1) + f(n-2)

        if (n <= 1)
            return 1;
        else if (n == 2)
            return 2;
        else {
            int a = 1, b = 1, c = a + b;
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }
}
