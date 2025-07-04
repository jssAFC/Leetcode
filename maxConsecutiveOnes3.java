class Solution {
    public int longestOnes(int[] nums, int k) {
        int len=0,l=0,r=0,count=0;
        while(r<nums.length){
            if(nums[r]==0){
                count++;
            }

            while(count>k){
                if(nums[l]==0) count--;
                l++;
            }

            len=Math.max(len,r-l+1);
            r++;
        }

        return len;
    }
}