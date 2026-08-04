class Solution {
    int[][] dp;

    public int lengthOfLIS(int[] nums) {
        int max=0;
        dp=new int[nums.length][nums.length+1];
        
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }

        // for(int i=0;i<nums.length;i++){
            max=Math.max(max,func(0,-1,nums));
        // }

        return max;
    }

    public int func(int i,int prev,int[] nums){
        if(i>=nums.length) return 0;

        if(dp[i][prev+1]!=-1) return dp[i][prev+1];

        int take=0;
        if(prev==-1 || nums[i]>nums[prev]) take= 1+func(i+1,i,nums);

        return dp[i][prev+1]=Math.max(take,func(i+1,prev,nums));
    }
}