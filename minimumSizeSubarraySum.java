class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int l = 0, r = 0;
        int min = nums.length;
        boolean flag = false;
        while (r < nums.length) {
            sum += nums[r];
            while (sum >= target) {

                min = Math.min(r - l + 1, min);
                sum-=nums[l];
                l++;
                flag = true;
            }
            r++;
        }

        return (flag) ? min : 0;
    }
}