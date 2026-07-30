class Solution {
    int[][] dp;
    int max;
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i:nums) sum+=i;
        max=sum;
        dp=new int[nums.length][sum*2+1];

        for(int[] arr:dp) Arrays.fill(arr,-1); 

        return func(nums,0,0,target);
    }

    public int func(int[] nums,int i,int sum,int target){
        if(i==nums.length) return sum==target?1:0;

        if(dp[i][sum+max]!=-1) return dp[i][sum+max];

        System.out.println(sum);
        return dp[i][sum+max]=func(nums,i+1,sum+nums[i],target) + func(nums,i+1,sum-nums[i],target);
    }
}