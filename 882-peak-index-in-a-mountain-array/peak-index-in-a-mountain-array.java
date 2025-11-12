class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max=0;
        int l=1,r=arr.length-2;

        while(l<=r){
            int mid=(l+r)/2;

            max=arr[mid]>arr[max]?mid:max;

                 if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                    return mid;
                 }
                 else if(arr[mid-1]>arr[mid+1]){
                    r=mid-1;
                 }
                 else{
                    l=mid+1;
                 }
                 
        }

        return max;

    }
}