class Solution {
    public int firstMissingPositive(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int num=1;

        while(true){
            if(map.getOrDefault(num,0)>0){
                num++;
            }
            else
            break;
        }
        return num;

    }
}