class Solution {
    private int dp[][];
    public int longestCommonSubsequence(String text1, String text2) {
        dp=new int[text1.length()][text2.length()];
        for(int[] arr:dp) Arrays.fill(arr,-1);
        return solve(text1,text2,text1.length()-1,text2.length()-1);
    }

    public int solve(String text1, String text2, int i,int j){
        if(i<0 || j<0) return 0;

        if(dp[i][j]!=-1) return dp[i][j];

        char ch1=text1.charAt(i);
        char ch2=text2.charAt(j);

        if(ch1==ch2){
            return dp[i][j]=1+ solve(text1,text2,i-1,j-1);
        }

        int one=solve(text1,text2,i,j-1);
        int two=solve(text1,text2,i-1,j);

        return dp[i][j]=Math.max(one,two);
    }
}