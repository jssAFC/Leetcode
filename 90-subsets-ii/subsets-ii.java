class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        solve(nums, 0, list, new ArrayList<>());

        Set<List<Integer>> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        return list;
    }

    public void solve(int[] nums, int i, List<List<Integer>> result, List<Integer> temp) {
        if (i == nums.length) {
            // if(!result.contains(temp))
            result.add(new ArrayList<>(temp));
            return;
        }

        solve(nums, i + 1, result, temp);
        temp.add(nums[i]);
        solve(nums, i + 1, result, temp);
        temp.remove(temp.size() - 1);
    }
}