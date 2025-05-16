class Solution {
    public void moveZeroes(int[] nums) {
        int k=0,i=0;
        while(i<nums.length){
            if(nums[i]!=0){
                int temp=nums[k];
                nums[k]=nums[i];
                nums[i]=temp;
                k++;
            }
            i++;
        }
    }
}