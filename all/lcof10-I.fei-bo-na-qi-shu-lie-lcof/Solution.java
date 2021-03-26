
class Solution {
    int[] array = new int[101];

    public int fib(int n) {
        if (array[n] != 0)
            return array[n];

        long res = 0;
        if (n == 0) {
            res = 0;
        } else if (n == 1) {
            res = 1;
        } else {
            res = fib(n - 1) + fib(n - 2);
        }
        res %= (Math.pow(10, 9) + 7);
        array[n] = (int) res;

        return (int) res;
    }
}
