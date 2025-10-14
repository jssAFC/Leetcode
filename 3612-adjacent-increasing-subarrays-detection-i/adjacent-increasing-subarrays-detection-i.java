import java.util.List;

class Solution {

    /**
     * A helper function to check if a subarray is strictly increasing.
     * @param nums  The original list.
     * @param start The starting index of the subarray to check.
     * @param k     The length of the subarray.
     * @return true if the subarray is strictly increasing, false otherwise.
     */
    private boolean isIncreasing(List<Integer> nums, int start, int k) {
        // We check up to the second-to-last element of the subarray.
        for (int i = start; i < start + k - 1; i++) {
            if (nums.get(i) >= nums.get(i + 1)) {
                return false; // If any element is not smaller than the next, it fails.
            }
        }
        return true;
    }

    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        // To have two adjacent subarrays of length k, the list must have at least 2*k elements.
        if (nums.size() < 2 * k) {
            return false;
        }

        // We loop through all possible starting positions for the *first* subarray.
        // The loop stops when there isn't enough room left for a full 2*k block.
        for (int i = 0; i <= nums.size() - (2 * k); i++) {
            
            // Check if the first subarray (starting at i) is increasing.
            boolean firstIsIncreasing = isIncreasing(nums, i, k);
            
            // If the first is increasing, then check the second (adjacent) one.
            if (firstIsIncreasing) {
                // The adjacent subarray starts at i + k.
                boolean secondIsIncreasing = isIncreasing(nums, i + k, k);

                // If both are increasing, we have found our pair!
                if (secondIsIncreasing) {
                    return true;
                }
            }
        }

        // If we finish the entire loop without finding a valid pair, none exists.
        return false;
    }
}