class Solution {
    public int[] searchRange(int[] nums, int target) {
        int j=0;
        int []res=new int[2];
        Arrays.fill(res,-1);

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target && j==0){
                res[j++]=i;
                res[j]=i;
            }
            else if(nums[i]==target) res[j]=i;
        }

        return res;
    }
}