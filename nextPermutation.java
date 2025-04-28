class Solution {

    public void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public void nextPermutation(int[] nums) {
        // int no=nums[0];
        int pivot=nums[0];
        int pivot2=nums[0];
        int swapIndex=0;
        int swapIndex2=0;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]) {
                pivot=nums[i-1];
                swapIndex=i-1;
                break;
            }
        }

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>pivot){
                pivot2=nums[i];
                swapIndex2=i;
                break;
            }
        }

// case when next permutation is the starting number it self
        if(pivot==pivot2){

            Arrays.sort(nums);
            return;
        }

        swap(nums,swapIndex,swapIndex2);
        

       int i=swapIndex+1;
       int j=nums.length-1;
       while(i<=j){
        swap(nums,i++,j--);
       }

    }
}