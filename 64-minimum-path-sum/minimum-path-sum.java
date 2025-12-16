class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int prev[] = new int[n];
        int curr[] = new int[n];

        Arrays.fill(prev,Integer.MAX_VALUE);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0)
                    curr[j] = grid[i][j];
                else {

                    int top = prev[j];
                    int left = Integer.MAX_VALUE;
                    if (j > 0)
                        left = curr[j - 1];
                    curr[j] = grid[i][j] + Math.min(top, left);
                }
            }

            prev = curr;
        }

        return prev[n - 1];
    }

}