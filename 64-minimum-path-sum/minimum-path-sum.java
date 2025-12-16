class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int [][]dp=new int[m][n];
        for(int i=0;i<m;i++)
            Arrays.fill(dp[i],-1);

        return solve(grid,dp,m,n,m-1,n-1);
    }

    public int solve(int[][] grid,int [][]dp,int m,int n,int i,int j){
        if(i<0 || j<0) 
            return Integer.MAX_VALUE;

        if(i==0 && j==0) return grid[i][j];
        if(dp[i][j]!=-1) return dp[i][j];

        return dp[i][j]=grid[i][j]+ Math.min(solve(grid,dp,m,n,i-1,j),solve(grid,dp,m,n,i,j-1));
    }
}