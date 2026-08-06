class Solution {
    int n,m;
    int[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        n=text1.length();
        m=text2.length();

        dp=new int[n+1][m+1];

        for(int[] arr:dp) Arrays.fill(arr,-1);

        return solve(text1,text2,0,0);
    }

    public int solve(String text1,String text2,int i,int j){
        if(i>=n || j>=m) return 0;

        if(dp[i][j]!=-1) return dp[i][j];

        char ch1=text1.charAt(i);
        char ch2=text2.charAt(j);

        if(ch1==ch2){
            return 1+solve(text1,text2,i+1,j+1);
        }

        return dp[i][j]=Math.max(solve(text1,text2,i+1,j),solve(text1,text2,i,j+1));
    }
}