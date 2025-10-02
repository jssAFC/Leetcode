class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int len=nums.length/3;

        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i:nums)
            map.put(i,map.getOrDefault(i,0)+1);
        
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            int key=e.getKey();
            int val=e.getValue();

            if(val>len) list.add(key);
        }

        return list;
    }
}