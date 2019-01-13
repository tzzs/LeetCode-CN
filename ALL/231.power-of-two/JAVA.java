class Solution {
    public boolean isPowerOfTwo(int n) {
        // 4ms
        // if (n < 1) {
        //     return false;
        // }
        // if (n == 1) {
        //     return true;
        // }
        // while (n > 2) {
        //     if (n % 2 != 0) {
        //         return false;
        //     } else {
        //         n /= 2;
        //     }
        // }
        // return true;
        if (n <= 0) {
            return false;
        }
        if ((n & (n - 1)) == 0) {
            return true;
        } else {
            return false;
        }
    }
}