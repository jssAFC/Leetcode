class Solution {
    int[]dp;
    public int climbStairs(int n) {
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return climb(0,n);
    }

    public int climb(int i,int n){
        if(i==n) return dp[i]=1;
        if(i>n) return 0;
        if(dp[i]!=-1) return dp[i];
        return dp[i]=climb(i+1,n) + climb(i+2,n);
    }
}