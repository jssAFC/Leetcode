class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=-1,end=-1;
        int []res=new int[2];
        Arrays.fill(res,-1);

        int i=0,j=nums.length-1;

        while(i<=j){
            int mid=(j-i)/2+i;
            if(nums[mid]==target){
                start=mid;
                end=mid;
            }
            
            if(nums[mid]>=target) j=mid-1;
            else i=mid+1;
        }

        i=0;
        j=nums.length-1;
        
        while(i<=j){
            int mid=(j-i)/2+i;
            if(nums[mid]==target){
                end=mid;
                System.out.println(mid);
            }
            
            if(nums[mid]>target) j=mid-1;
            else i=mid+1;
        }
        

        return new int[]{start,end};
    }
}