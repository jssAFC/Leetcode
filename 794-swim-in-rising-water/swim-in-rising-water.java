class Solution {
    int n;
    int[][] directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
    boolean[][] visited;

    private boolean reachable(int[][] grid, int i, int j, int mid) {
        if (i < 0 || i >= n || j < 0 || j >= n ||visited[i][j] || grid[i][j] > mid)
            return false;

        if (i == n - 1 && j == n - 1)
            return true;

        visited[i][j]= true;

        for (int[] dir : directions) {
            int new_i = dir[0]+i;
            int new_j = dir[1]+j;

            if (reachable(grid, new_i, new_j, mid))
                return true;
        }

        return false;
    }

    public int swimInWater(int[][] grid) {
        n = grid.length;
        int l = 0, r = n * n - 1;

        int result = 0;

        while (l <= r) {
            int mid = (l + r) / 2;
            visited=new boolean[n][n];

            if (reachable(grid, 0, 0, mid)) {
                result = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return result;
    }
}