class Solution {
    void solve(int []nums, int i,List<Integer> temp, List<List<Integer>> result){
        if(i==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }

        solve(nums,i+1,temp,result);
        temp.add(nums[i]);
        solve(nums,i+1,temp,result);
        temp.remove(temp.size()-1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        solve(nums, 0, new ArrayList<>(), result);

        return result;
    }
}