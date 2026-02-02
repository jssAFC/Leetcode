class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int lo=0;
        int hi=0,min=Integer.MAX_VALUE;
        for(int i:nums){
            hi+=i;
            lo=Math.max(lo,i);
        }

        while(lo<=hi){
            int maxSum=(hi-lo)/2+lo;

            int maxSubArrays=solve(nums,maxSum);

            if(maxSubArrays>k){
                lo=maxSum+1;
            }
            else{
                min=Math.min(min,maxSum);
                hi=maxSum-1;
            }
        }

        return min;
    }

    public int solve(int[] nums, int maxSum){
        int count=0;
        int sum=0;

        for(int i:nums){
            if(sum+i>maxSum){
                count++;
                sum=i;
            }
            else{
                sum+=i;
            }
        }
        count++;
        return count;
    }
}