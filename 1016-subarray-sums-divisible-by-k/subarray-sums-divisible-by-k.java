class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int presum=0,count=0;
        map.put(0,1);

        for(int i=0;i<nums.length;i++){
            presum+=nums[i];
            if(presum<0) presum=(presum%k)+k;

            if(map.containsKey(presum%k)){
                count+=map.get(presum%k);
            }

            map.put(presum%k,map.getOrDefault(presum%k,0)+1);
        }

        return count;
    }
}