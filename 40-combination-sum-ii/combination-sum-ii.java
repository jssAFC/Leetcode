class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        solve(candidates, target, result, new ArrayList<>(), 0);
        return result;

    }

    public void solve(int[] nums, int target, List<List<Integer>> result, List<Integer> list, int index) {
        if(target==0) {
            result.add(new ArrayList<>(list));
        }

        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]) continue;
            if(nums[i]>target) break;
            list.add(nums[i]);
            solve(nums,target-nums[i],result,list,i+1);
            list.remove(list.size()-1);
        }
        
    }
}