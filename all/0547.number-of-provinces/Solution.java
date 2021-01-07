class Solution {
    public void dfs(int[][] isConnected, boolean[] visited, int k) {
        int n = isConnected.length;
        for (int i = 0; i < n; i++) {
            if (isConnected[k][i] == 1 && !visited[i]) {
                visited[i] = true;
                dfs(isConnected, visited, i);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;

        boolean[] visited = new boolean[n];

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(isConnected, visited, i);
                count++;
            }
        }

        return count;
    }
}
