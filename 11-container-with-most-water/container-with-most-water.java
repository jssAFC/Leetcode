class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int max=0;
        while(l<r){
            int left=height[l];
            int right=height[r];
            int min=Math.min(left,right);
            max=Math.max(max,(r-l)*min);

            if(left==right){
                l++;
                r--;
            }
            else if(left<right){
                l++;
            }
            else{
                r--;
            }
        }

        return max;
    }
}