class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n = s.length();
        int[] preSum = new int[n];
        for (int i = 0, sum = 0; i < n; i++) {
            if (s.charAt(i) == '*') {
                sum++;
            }
            preSum[i] = sum;
        }

        int[] left = new int[n];
        int[] right = new int[n];

        // 保存当前位置右侧的蜡烛，从右往左遍历
        for (int i = n - 1, k = -1; i >= 0; i--) {
            if (s.charAt(i) == '|') {
                k = i;
            }
            right[i] = k;
        }

        // 保存当前位置左侧的蜡烛，从左往右遍历
        for (int i = 0, k = 0; i < n; i++) {
            if (s.charAt(i) == '|') {
                k = i;
            }
            left[i] = k;
        }

        int resLen = queries.length;
        int[] res = new int[resLen];

        for (int i = 0; i < resLen; i++) {
            int x = right[queries[i][0]], y = left[queries[i][1]];
            res[i] = x == -1 || y == -1 || x == y ? 0 : preSum[x] - preSum[y];
        }
        return res;
    }
}
