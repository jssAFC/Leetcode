class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int maxlen=0,presum=0;
        map.put(0,-1);

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) presum+=1;
            else presum-=1;

            if(map.containsKey(presum)) maxlen=Math.max(maxlen,i-map.get(presum));
            else map.put(presum,i);
        }

        return maxlen;
    }
}