class Solution {

    public void solve(int[] nums, int target, List<Integer> list, List<List<Integer>> result, int i, int sum) {
        if(i==nums.length || sum>target ) return;
        if(sum==target){
            result.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[i]);
        sum+=nums[i];
        solve(nums,target,list,result,i,sum);
        list.remove(list.size()-1);
        sum-=nums[i];
        solve(nums,target,list,result,i+1,sum);

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        solve(candidates, target, new ArrayList<>(), result, 0, 0);
        return result;

    }
}