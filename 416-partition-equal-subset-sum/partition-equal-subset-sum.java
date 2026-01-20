class Solution {
    int sum = 0;
    Boolean [][]dp;

    public boolean canPartition(int[] nums) {
        for (int i : nums)
            sum += i;
        if(sum%2!=0) return false;

        dp=new Boolean[nums.length][sum+1];

        return solve(0, nums, 0);
    }

    public boolean solve(int i, int[] nums, int currSum) {
        if(i==nums.length){
            if(currSum*2==sum) return true;
            return false;
        }

        if(dp[i][currSum]!=null) return dp[i][currSum];

        if(currSum*2==sum) return true;

        boolean take=solve(i+1,nums,currSum+nums[i]);
        boolean notTake=solve(i+1,nums,currSum);

        return dp[i][currSum]=take|| notTake;
    }
}