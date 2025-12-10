class Solution {
    public int rob(int[] nums) {
        int[] dp1=new int[nums.length-1];
        int[] dp2=new int[nums.length-1];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        int val1 = solve(nums.length-2,Arrays.copyOfRange(nums, 0, nums.length - 1),dp1);
        int val2 = solve(nums.length-2,Arrays.copyOfRange(nums, 1, nums.length),dp2);
        int val3=nums[0];

        return Math.max(val1,Math.max(val2,val3));
    }

    public int solve(int i,int []nums,int[] dp){
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        int fs=solve(i-2,nums,dp)+nums[i];
        int ss=solve(i-1,nums,dp);

        return dp[i]=Math.max(fs,ss);
    }
}