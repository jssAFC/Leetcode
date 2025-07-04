class Solution {
    static public int[] sortedSquares(int[] nums) {
        int l = 0, r = nums.length - 1;
        int res[] = new int[nums.length];
        int k = 0;
        while (l <= r) {
            int n1 = nums[l] * nums[l];
            int n2 = nums[r] * nums[r];
            if (n1 > n2) {
                res[k] = n1;
                l++;
            } else {
                res[k] = n2;
                r--;
            }
            k++;
        }

        int left = 0;
        int right = res.length - 1;
        while (left < right) {
            int temp = res[left];
            res[left] = res[right];
            res[right] = temp;
            left++;
            right--;
        }

        return res;
    }
}