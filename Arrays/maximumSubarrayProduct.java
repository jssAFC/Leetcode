class Solution {
    public int maxProduct(int[] nums) {
        int min=nums[0],max=nums[0];
        int maxProduct=nums[0];
        for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            int maxv=max*curr;
            int minv=min*curr;
            max=Math.max(Math.max(curr,minv),maxv);
            min=Math.min(Math.min(curr,minv),maxv);

            maxProduct=Math.max(max,maxProduct);
        }

        return maxProduct;
    }
}