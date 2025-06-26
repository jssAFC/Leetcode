class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int l=0,r=n-1;
        int max=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(mid-1!=-1 && arr[mid]<arr[mid-1]){
                r=mid-1;
            } else if(mid+1!=n && arr[mid]<arr[mid+1]){
                l=mid+1;
            } else{
                max=mid;
                break;
            }
        }

        return max;
    }
}