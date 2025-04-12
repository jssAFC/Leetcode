class Solution {
    public int[] twoSum(int[] arr, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int diff=target-arr[i];

            if(map.containsKey(diff)){
                return new int[] {i,map.get(diff)};
            }
            map.put(arr[i],i);
        }

        return null;
    }
}