class Solution {
    public int search(int[] nums, int target) {

        int left = 0, right = nums.length - 1;
        // if(nums.length==1) return nums[0]==target;
        while (left <= right) {

            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;

            if (nums[left] <= nums[mid]) {
                if (target < nums[left] || target > nums[mid])
                    left = mid + 1;
                else
                    right = mid - 1;
            }

            else {
                if (target > nums[right] || target < nums[mid+1])
                    right = mid - 1;
                else
                    left = mid + 1;
            }

        }

        return -1;
    }
}