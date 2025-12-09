class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        dp[0]=nums[0];

        for(int i=1;i<nums.length;i++){
            int val1=dp[i-1];
            int val2=nums[i];
            if(i>1) val2+=dp[i-2];

            dp[i]=Math.max(val1,val2);
        }

        return dp[dp.length-1];
    }
}