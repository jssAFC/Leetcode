class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1,k=0;
        while(i<nums.length){
            if(nums[k]!=nums[i]){
                k++;
                nums[k]=nums[i];
            }

            i++;
        }

        return k+1;


    }
}