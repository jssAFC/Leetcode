class Solution {
    public int trap(int[] height) {
        int water=0;
        int left=0,right=height.length-1;
        int lmax=height[0];
        int rmax=height[right];
        while(left<right){
            if(height[left]<height[right]){
                lmax=Math.max(height[left],lmax);
                if(lmax-height[left]>0) water+=lmax-height[left];
                left++;
            }
            else{
                rmax=Math.max(height[right],rmax);
                if(rmax-height[right]>0) water+=rmax-height[right];
                right--;
            }
        }

        return water;

    }
}