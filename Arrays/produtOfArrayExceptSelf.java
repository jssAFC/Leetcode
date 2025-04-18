class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int pre=1,post=1;
        
        for(int i=0;i<nums.length;i++){
          arr[i]=pre;
          pre=pre*nums[i];
        }

        for(int i=nums.length-1;i>=0;i--){
           arr[i]=arr[i]*post;
           post=post*nums[i];
        }

      

        return arr;
    }
}