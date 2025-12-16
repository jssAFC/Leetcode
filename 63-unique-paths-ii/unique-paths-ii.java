class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int dp[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    if (grid[i][j] == 1)
                        grid[i][j] = 0;
                    else
                        grid[i][j] = 1;
                } else if (grid[i][j] == 1)
                    grid[i][j] = 0;

                else {
                    int up = 0, left = 0;
                    if (j > 0)
                        left = grid[i][j - 1];
                    if (i > 0)
                        up = grid[i - 1][j];
                    grid[i][j] = up + left;
                }
            }
        }

        return grid[m - 1][n - 1];
    }
}