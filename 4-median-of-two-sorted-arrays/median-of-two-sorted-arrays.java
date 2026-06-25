class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         
        int n=nums1.length;
        int m=nums2.length;
        int nums[]=new int[m+n];
        int len=n+m;

        int i=0;
        while(i<n){
            nums[i]=nums1[i];
            i++;
        }

        while(i<n+m){
            nums[i]=nums2[i-n];
            i++;
        }

        Arrays.sort(nums);

        double result=0;

        if(nums.length%2==0){
            result+=nums[len/2]+nums[(len/2)-1];
            return result/2;
        }
        return (long)nums[len/2];
    }
}