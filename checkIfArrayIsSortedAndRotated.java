class Solution {
    public boolean check(int[] nums) {
        int count=0;
        if(nums.length==1) return true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]) count++;
        }
        if(nums[nums.length-1]>nums[0]) count++;

        if(count<=1) return true;
        return false;
    }
}