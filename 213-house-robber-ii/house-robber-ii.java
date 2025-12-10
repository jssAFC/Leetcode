class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp1=new int[nums.length-1];
        int[] dp2=new int[nums.length-1];
        
        int[] arr1=Arrays.copyOfRange(nums,0,n-1);
        // dp1[0]=arr1[0];
        int[] arr2=Arrays.copyOfRange(nums,1,n);
        // dp2[0]=arr2[0];

        return Math.max(solve(arr1,dp1),Math.max(solve(arr2,dp2),nums[0]));
    }

    public int solve(int[] arr,int[] dp){
        if(arr.length==0) return 0;
        dp[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            int fs=dp[i-1];
            int ss=arr[i];
            if(i>1) ss+=dp[i-2];
            dp[i]=Math.max(fs,ss);
        }

        return dp[dp.length-1];
    }
}