class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int n = points.length;
        int min = 10001, ret = -1;
        for (int i = 0; i < n; i++) {
            int[] k = points[i];
            if (k[0] == x || k[1] == y) {
                int dis = Math.abs(k[0] - x) + Math.abs(k[1] - y);
                if (min > dis) {
                    min = dis;
                    ret = i;
                }
            }
        }
        return ret < 10001 ? ret : -1;
    }
}
