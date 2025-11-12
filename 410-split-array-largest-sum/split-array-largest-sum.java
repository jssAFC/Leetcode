class Solution {
    public int splitArray(int[] nums, int k) {
        int l = Arrays.stream(nums).max().getAsInt();
        int r = Arrays.stream(nums).sum();

        int result = r;

        while (l < r) {
            int mid = (r - l) / 2 + l;
            int sum = 0, limit = 0;

            for (int i : nums) {
                if (sum + i > mid) {
                    limit++;
                    sum = i;
                } else {
                    sum += i;
                }
            }

            limit++;
            if (limit <= k) {
                result = mid;
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return result;
    }
}