class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;

        int []ans=new int[n];
        int a[]=new int[n/2];
        int b[]=new int[n/2];

        int k=0,j=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                a[k++]=nums[i];
            } else{
                b[j++]=nums[i];
            }
        }

        k=0;
        j=0;
        for(int i=0;i<n;i++){
            if(i%2!=0){
                ans[i]=a[k++];
            } else{
                ans[i]=b[j++];
            }
        }

        return ans;
    }
}