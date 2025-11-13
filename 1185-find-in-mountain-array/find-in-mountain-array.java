/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {

    public int findPeak(MountainArray arr){
        int l=1,r=arr.length()-2;

        while(l<=r){
            int mid=(r-l)/2+l;
            int num=arr.get(mid);
            if(num>arr.get(mid-1) && num>arr.get(mid+1)) return mid;

            else if(arr.get(mid+1)>arr.get(mid-1)) l=mid+1;

            else r=mid-1;
        }

        return l;
    }


    public int findInMountainArray(int target, MountainArray arr) {
        int peak=findPeak(arr);
        System.out.println(peak);
        if(arr.get(peak)==target) return peak;
        int res=-1;

        int l=0,r=peak-1;
        while(l<=r){
            int mid=(l+r)/2;
            int num=arr.get(mid);
            if(num==target) return mid;
            else if(target>num) l=mid+1;
            else r=mid-1;
        }

        l=peak+1;
        r=arr.length()-1;

        while(l<=r){
            int mid=(l+r)/2;
            int num=arr.get(mid);
            if(num==target) return mid;
            else if(target>num) r=mid-1;
            else l=mid+1;
        }

        return -1;
    }
}