class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int area=0;
        while(left<right){
            int h=Math.min(height[left],height[right]);
            int b=right-left;
            area=Math.max(area,h*b);

            if(height[left]>height[right])
            right--;
            else
            left++;
        }

        return area;
    }
}