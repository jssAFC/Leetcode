class Solution {
    void solve(int i,int[] nums,List<List<Integer>> list,List<Integer> temp){

        if(i>=nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }

        solve(i+1,nums,list,temp);
        temp.add(nums[i]);
        solve(i+1,nums,list,temp);
        temp.remove(temp.size()-1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();

        solve(0,nums,list,temp);

        return list;

    }
}