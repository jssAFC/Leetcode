class Solution {
    public int subarraySum(int[] nums, int k) {
        // HashMap<Integer,Integer> map=new HashMap<>();

        HashMap<Integer,Integer> map=new HashMap<>();

        int count=0,sum=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int target=sum-k;
            if(map.containsKey(target)){
                count+=map.get(target);
                // map.put(target,map.get(target)+1);
            }

            map.put(sum,map.getOrDefault(sum,0)+1);
        } 

        return count;
    }
}