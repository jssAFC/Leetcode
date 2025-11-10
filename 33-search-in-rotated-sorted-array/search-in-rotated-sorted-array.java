class Solution {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;

        
        while(l<r){
            int mid=(l+r)/2;

            if(nums[mid]==target) return mid;

            if(nums[l]<nums[mid]){
                if(nums[l]<=target && nums[mid]>=target){
                    r=mid;
                }
                else{
                    l=mid+1;
                }
            } else{
                if(nums[mid+1]<=target && nums[r]>=target){
                    l=mid+1;
                }
                else{
                    r=mid;
                }
            }
        }

        if(nums[l]==target) return l;
        return -1;
    }
}