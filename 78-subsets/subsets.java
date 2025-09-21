class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();

        solve(nums,0,list,new ArrayList<>());
        return list;
    }

    public void solve(int[] nums,int i,List<List<Integer>> list,List<Integer> temp){
        if(i==nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }

        solve(nums,i+1,list,temp);
        temp.add(nums[i]);
        solve(nums,i+1,list,temp);
        temp.remove(temp.size()-1);
    }
}