class Solution {

    static void reverse(int []nums,int i,int k){
        while(i<k){
            int temp=nums[i];
            nums[i]=nums[k];
            nums[k]=temp;
            i++;
            k--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
}