class Solution {
    int sum;
    Boolean[][] dp;

    public boolean canPartition(int[] nums) {
        sum=0;
        for(int i:nums) sum+=i;
        if(sum%2!=0) return false;

        dp=new Boolean[nums.length][sum+1];

        return func(0,0,nums);
    }

    public boolean func(int i,int curr,int[] nums){
        if(i>=nums.length || curr>sum/2) return false;

        if(dp[i][curr]!=null) return dp[i][curr];
        if(curr==sum/2) return true;
        // if(curr>sum/2) return false;

        return dp[i][curr]=func(i+1,curr+nums[i],nums) || func(i+1,curr,nums);

    }
}