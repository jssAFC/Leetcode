class Solution {
    public int countSquares(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;

        int[][]dp=new int[n+1][m+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(matrix[i-1][j-1]==0) continue;
                dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i][j-1]))+1;
            }
        }

        int sum=0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(dp[i][j]!=0) sum+=dp[i][j];
            }
        }

        return sum;
    }
}