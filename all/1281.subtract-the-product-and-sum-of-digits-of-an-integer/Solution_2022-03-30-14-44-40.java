class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, multiply = 1;
        while (n > 0) {
            int k = n % 10;
            sum += k;
            multiply *= k;
            n /= 10;
        }
        return multiply - sum;
    }
}
