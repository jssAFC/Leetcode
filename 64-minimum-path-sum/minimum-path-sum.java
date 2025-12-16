class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int [][]dp=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    dp[i][j]=grid[i][j];
                } else{
                    int up=Integer.MAX_VALUE;
                    int left=Integer.MAX_VALUE;

                    if(i>0) up=dp[i-1][j];
                    if(j>0) left=dp[i][j-1];

                    dp[i][j]=grid[i][j]+Math.min(up,left);
                }
            }
        }

        return dp[m-1][n-1];
    }

    public int solve(int[][] grid,int [][]dp,int m,int n,int i,int j){
        if(i<0 || j<0) 
            return Integer.MAX_VALUE;

        if(i==0 && j==0) return grid[i][j];
        if(dp[i][j]!=-1) return dp[i][j];

        return dp[i][j]=grid[i][j]+ Math.min(solve(grid,dp,m,n,i-1,j),solve(grid,dp,m,n,i,j-1));
    }
}