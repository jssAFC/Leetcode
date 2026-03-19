class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums) set.add(i);
        int max=0;
        for(int i:set){
            if(!set.contains(i-1)){
                int temp=1;
                while(set.contains(i+temp)){
                    temp++;
                }
                    max=Math.max(max,temp);
            }
        }

        return max;
    }
}