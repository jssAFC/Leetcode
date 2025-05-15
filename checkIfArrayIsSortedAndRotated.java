class Solution {
    public boolean check(int[] nums) {
        int count=1;
        if(nums.length==1) return true;
        for(int i=1;i<nums.length*2;i++){
            if(nums[(i-1)%nums.length]<=nums[(i)%nums.length]) count++;
            else count=1;

            if(count==nums.length) return true;
        }

        return false;
    }
}