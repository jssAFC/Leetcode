class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0,r=0;
        int product=1,ans=0;
        if(k<=1) return 0;
        while(r<nums.length){
            product*=nums[r];
            while(l<nums.length && product>=k){
                product=product/nums[l];
                l++;
            }
 
            if(product<k) ans+=r-l+1;
            r++;
        }

        return ans;
    }
}