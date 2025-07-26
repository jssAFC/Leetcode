class Solution {
    private void solve(List<List<Integer>> result,List<Integer> tempList,int[]nums){
        if(tempList.size()==nums.length){
            result.add(new ArrayList<>(tempList));
        } else {
            for(int i=0;i<nums.length;i++){
                if(tempList.contains(nums[i])) continue;
                tempList.add(nums[i]);
                solve(result,tempList,nums);
                tempList.remove(tempList.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
       
        solve(list,new ArrayList<>(),nums);

        return list;
    }
}