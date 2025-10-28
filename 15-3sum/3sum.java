class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Set<List<Integer>> set=new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int target = nums[i] + nums[j] + nums[k];
                if (target == 0) {
                    set.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
                    j++;
                }

                else if (target > 0) {
                    k--;
                }

                else {
                    j++;
                }

            }
        }

        return new ArrayList<>(set);
    }
}