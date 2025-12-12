class Solution {

    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++) Arrays.fill(dp[i],-1);
        Integer paths = 0;
        return solve(arr, 0, 0, m, n, dp);

    }

    public int solve(int[][] arr, int i, int j, int m, int n, int[][] dp) {

        if (i < 0 || j < 0 || i >= m || j >= n || arr[i][j] == -1) {
            return 0;
        }


        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        
        if(dp[i][j]!=-1) return dp[i][j];
        arr[i][j] = -1;
        int val = solve(arr, i + 1, j, m, n, dp) +
                solve(arr, i, j + 1, m, n, dp);
        arr[i][j] = 0;

        return dp[i][j]=val;
    }
}