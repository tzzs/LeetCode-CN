class Solution {
    public int subtractProductAndSum(int n) {
        int multiple = 1, plus = 0;

        while (n > 0) {
            int k = n % 10;
            n = n / 10;

            multiple *= k;
            plus += k;
        }
        return multiple-plus;
    }
}
