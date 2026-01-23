class Solution {
    public int isMountain(int[] nums,int ind){
        if(!(nums[ind]>nums[ind-1] && nums[ind]>nums[ind+1])) return 0;

        int len=1;
        int i=ind-1,j=ind+1;

        while(i>=0 && j<=nums.length-1){
            if(!(nums[i]<nums[i+1] && nums[j]<nums[j-1])) break;

            if(nums[i]<nums[i+1]){
                len++;
                i--;
            } 
            
            if(nums[j]<nums[j-1]){
                len++;
                j++;
            }
        }

        while(i>=0){
            if(!(nums[i]<nums[i+1])) break;

            if(nums[i]<nums[i+1]){
                len++;
                i--;
            } 
        }

        while(j<=nums.length-1){
            if(!(nums[j]<nums[j-1])) break;

            if(nums[j]<nums[j-1]){
                len++;
                j++;
            } 
        }

        return len;
    }

    public int longestMountain(int[] arr) {
        
        int maxlen=0;
        for(int i=1;i<arr.length-1;i++){
            maxlen=Math.max(maxlen,isMountain(arr,i));
        }

        return maxlen;
    }
}