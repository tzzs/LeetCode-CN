class Solution {
    public int tribonacci(int n) {
        int x = 0, y = 1, z = 1;
        if (n < 1)
            return 0;
        else if (n < 3)
            return 1;
        else {
            for (int i = 3; i <= n; i++) {
                z = x + y + z;
                y = z - x - y;
                x = z - x - y;
            }
        }

        return z;
    }
}
