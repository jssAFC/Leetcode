class Solution {
    public int minEatingSpeed(int[] nums, int h) {
        int l=1;
        int r=Arrays.stream(nums).max().getAsInt();
        int n=nums.length;

        while(l<=r){
            int mid=l+(r-l)/2;
            int hrs=0;
            for(int i=0;i<n;i++){
                hrs+=Math.ceil((double)nums[i]/mid);
            }

            if(hrs<=h){
                r=mid-1;
            } else{
                l=mid+1;
            }
        }

        return l;
    }
}
