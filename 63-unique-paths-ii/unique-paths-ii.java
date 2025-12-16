class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int prev[]=new int[n];
        int curr[]=new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    if (grid[i][j] == 1)
                        curr[j]=0;
                    else
                        curr[j] = 1;
                } else if (grid[i][j] == 1)
                    curr[j] = 0;

                else {
                    curr[j]=(j>=1)?prev[j]+curr[j-1]:prev[j];
                }
            }

            prev=curr;
        }

        return prev[n-1];

        // return grid[m - 1][n - 1];
    }
}