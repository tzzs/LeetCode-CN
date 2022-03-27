class Solution {
    public boolean hasAlternatingBits(int n) {
        int k = n % 2;
        n /= 2;
        while (n > 0) {
            if (k + n % 2 != 1) {
                return false;
            }
            k = n % 2;
            n /= 2;
        }
        return true;
    }
}
