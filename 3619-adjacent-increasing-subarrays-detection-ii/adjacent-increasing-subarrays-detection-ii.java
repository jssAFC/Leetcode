class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int prevRun=0;
        int currRun=1;

        int k=0;

        for(int i=1;i<nums.size();i++){
            if(nums.get(i-1)<nums.get(i)){
                currRun++;
            } else{
                prevRun=currRun;
                currRun=1;
            }

            k=Math.max(k,currRun/2);
            k=Math.max(k,Math.min(currRun,prevRun));

        }

        return k;
    }
}