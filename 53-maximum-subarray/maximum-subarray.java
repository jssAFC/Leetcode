class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE,sum=0;
        int i=0,j=0;

        while(j<nums.length){
            sum+=nums[j];
            max=Math.max(sum,max);

            while(i<=j && sum<0){
                sum-=nums[i];
                i++;
            }

            j++;
        }

        return max;
    }
}