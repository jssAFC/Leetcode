class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int n=nums.length,curr=0,result=0;

        for(int i=0;i<n;i++){
            curr+=nums[i];
            int target=curr-k;

            if(map.containsKey(target)){
                result+=map.get(target);
                
            }

            map.put(curr,map.getOrDefault(curr,0)+1);
        }

        return result;
    }
}