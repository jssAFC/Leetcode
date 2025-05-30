class Solution {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sortColors(int[] nums) {

        int lo=0,mid=nums.length-1,hi=nums.length-1;
        while(lo<=mid){
            if(nums[mid]==1)mid--;
            else if(nums[mid]==0){
                swap(nums,lo,mid);
                lo++;
              
            }
            else{
                swap(nums,mid,hi);
                hi--;
                mid--;
            }

        }

    }
}