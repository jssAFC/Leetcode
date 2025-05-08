class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int arr[]=new int[nums1.length+nums2.length];
        int index=0;
        for(int i=0;i<nums1.length;i++){
            arr[index]=nums1[i];
            index++;
        }

        for(int i=0;i<nums2.length;i++){
            arr[index]=nums2[i];
            index++;
        }

        Arrays.sort(arr);

        int mid=arr.length/2;
            // System.out.println(arr[mid]+" "+arr[mid-1]);
        if(arr.length%2==0){
            return (double)(arr[mid]+arr[mid-1])/2;
        } else{
            return (double)arr[mid];
        }


    }
}