class Solution {
       public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void nextPermutation(int[] nums) {
        int swap1=0,swap2=0;
        int n1=nums[0],n2=nums[0];

        int n=nums.length;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                swap1=i-1;
                n1=nums[i-1];
                break;
            }
        }


        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[swap1]){
                swap2=i;
                n2=nums[i];
                break;
            }
        }

        if(nums[swap1]==nums[swap2]){
            Arrays.sort(nums);
            return;
        }

        swap(nums,swap1,swap2);

        int i=swap1+1;
        int j=n-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }

    }
}