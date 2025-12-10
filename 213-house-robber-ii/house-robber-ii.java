class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        
        int[] arr1=Arrays.copyOfRange(nums,0,n-1);
        int[] arr2=Arrays.copyOfRange(nums,1,n);

        return Math.max(solve(arr1),Math.max(solve(arr2),nums[0]));
    }

    public int solve(int[] arr){
        if(arr.length==0) return 0;
        int prev1=0,prev2=0;
        for(int i=0;i<arr.length;i++){
            int curr=arr[i]+prev2;

            curr=Math.max(curr,prev1);

            prev2=prev1;
            prev1=curr;
        }

        return prev1;

        // return dp[dp.length-1];
    }
}