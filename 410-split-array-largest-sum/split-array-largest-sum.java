class Solution {
    public int splitArray(int[] nums, int k) {
        // Arrays.sort(nums);
        int n=nums.length;
        int lo=0,hi=0;
        int result=-1;

        for(int num:nums){
            lo=Math.max(lo,num);
            hi+=num;
        } 

        while(lo<=hi){
            int mid=(hi-lo)/2+lo;
            int count=0;
            int sum=0;
            for(int i:nums){
                sum+=i;
                if(sum>mid){
                    count++;
                    sum=i;
                }
            }

            count+=1;

            if(count<=k){
                result=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }

        } 

        return result;
    }
}