class Solution {
    public int lengthOfLIS(int[] nums) {
        int max=0,n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]) dp[i]=Math.max(dp[j]+1,dp[i]);
            }
        }

        for(int num:dp) max=Math.max(num,max);

        return max;
        
    }
}