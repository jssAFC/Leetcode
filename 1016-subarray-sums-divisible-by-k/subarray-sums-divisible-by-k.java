class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();

        map.put(0,1);
        int res=0,curr=0;
        for(int i=0; i<nums.length;i++){      
            curr+=nums[i];
            if(curr<000 ) curr=curr%k+k;
            int target=curr%k;

            if(map.containsKey(target)){
                res+=map.get(target);
            }

            map.put(target,map.getOrDefault(target,0)+1);
        }

        return res;
    }
}