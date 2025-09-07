class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list,new ArrayList<>(),candidates,target,0);

        return list;
    }

    public void backtrack(List<List<Integer>> list, List<Integer> temp,int [] nums, int target,int index){
        if(target<0) return;
        if(target==0){
            list.add(new ArrayList<>(temp));
        }

        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(list,temp,nums,target-nums[i],i);
            temp.remove(temp.size()-1);
        }
    }
}