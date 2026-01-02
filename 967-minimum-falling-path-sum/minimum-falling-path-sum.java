class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++)
            dp[0][i]=matrix[0][i];

            
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int fs=(j-1<0)?Integer.MAX_VALUE:dp[i-1][j-1];
                int ss=dp[i-1][j];
                int ts=(j+1>=n)?Integer.MAX_VALUE:dp[i-1][j+1];

                dp[i][j]=matrix[i][j]+Math.min(fs,Math.min(ss,ts));

                System.out.println(dp[i][j]);
            }
        }

        int min=dp[n-1][0];

        for(int i=0;i<n;i++)
            min=Math.min(dp[n-1][i],min);
        

        return min;
    }

    public int solve(int i, int j, int[][] mat, int[][] dp, int n) {
        if (j >= n || j < 0)
            return Integer.MAX_VALUE;

        if (i == n - 1)
            return dp[i][j] = mat[i][j];

        if (dp[i][j] != -1)
            return dp[i][j];

        return dp[i][j] = mat[i][j] + Math.min(solve(i + 1, j - 1, mat, dp, n),
                Math.min(solve(i + 1, j, mat, dp, n), solve(i + 1, j + 1, mat, dp, n)));
    }
}