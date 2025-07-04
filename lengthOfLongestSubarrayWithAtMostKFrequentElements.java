class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int count = 0,len=0,l=0;
        Map<Integer,Integer> map=new HashMap<>();

        for (int r = 0; r < nums.length; r++) {
            int num=nums[r];
            map.put(num,map.getOrDefault(num,0)+1);
            while(l<=r && map.get(num)>k){
                int temp=nums[l];
                map.put(temp,map.get(temp)-1);
                l++;
            }
            len=Math.max(len,r-l+1);
        }
        return len;
    }
}