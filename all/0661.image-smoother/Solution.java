class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length, n = img[0].length;
        int[][] ret = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0, num = 0;
                for (int a = -1; a <= 1; a++) {
                    for (int b = -1; b <= 1; b++) {
                        if (!(i + a < 0 || i + a >= m || j + b < 0 || j + b >= n)) {
                            count += img[i + a][j + b];
                            num++;
                        }
                    }
                }
                ret[i][j] = (int) Math.floor(count / num);
            }
        }
        return ret;
    }
}
