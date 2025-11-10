class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=0;
        for(int i:piles) high=Math.max(i,high);
        int res=high;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            long hours=0;

            for(int i:piles){
                long val=(long)Math.ceil((double)i/mid);
                hours+=val;
            }

            if(hours<=(long)h){
            res=mid;
            high=mid-1;
            } 
            else low=mid+1;

        }

        return res;
    }
}