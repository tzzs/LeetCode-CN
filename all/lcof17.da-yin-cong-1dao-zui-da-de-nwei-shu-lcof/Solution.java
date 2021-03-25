class Solution {
    public int[] printNumbers(int n) {
        n = (int) Math.pow(10, n);
        int[] list = new int[n - 1];

        for (int i = 1; i < n; i++) {
            list[i - 1] = i;
        }

        return list;
    }
}
