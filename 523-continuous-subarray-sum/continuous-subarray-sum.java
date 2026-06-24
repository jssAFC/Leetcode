class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int prefix = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            prefix += num;
            if (map.containsKey(prefix % k)) {
                if (i - map.get(prefix % k) >= 2)
                    return true;
            } else
                map.put(prefix % k, i);
        }

        return false;
    }
}