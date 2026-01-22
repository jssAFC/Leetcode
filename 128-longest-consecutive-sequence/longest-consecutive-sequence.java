class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();

        for(int i: nums) set.add(i);

        int maxLen=0;

        for(int num:set){
            if(!set.contains(num-1)){
                int len=1;
                while(set.contains(num+len)) len++;
                maxLen=Math.max(len,maxLen);
            }
        }

        return maxLen;
        
    }
}