class Solution {
    int[] dp;
    public int rob(int[] nums) {
        if(nums.length<2) return nums[0];

        dp=new int[nums.length];
        Arrays.fill(dp,-1);

        return func(0,nums);
    }

    public int func(int i,int[]nums){
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        return dp[i]=Math.max(nums[i] + func(i+2,nums),func(i+1,nums));
    }
}