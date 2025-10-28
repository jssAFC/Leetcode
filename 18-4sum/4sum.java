class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // Use a List directly instead of a Set for better performance
        List<List<Integer>> result = new ArrayList<>();
        
        if (nums == null || nums.length < 4) {
            return result;
        }

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            // SKIP DUPLICATES for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n - 2; j++) {
                // SKIP DUPLICATES for j
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue; 
                }

                int start = j + 1;
                int end = n - 1;

                while (start < end) {
                    // FIX 1: Use (long) to prevent overflow
                    long sum = (long)nums[i] + nums[j] + nums[start] + nums[end];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        
                        // FIX 2: Skip duplicates for start and end
                        while (start < end && nums[start] == nums[start + 1]) {
                            start++;
                        }
                        while (start < end && nums[end] == nums[end - 1]) {
                            end--;
                        }
                        
                        // Move both pointers
                        start++;
                        end--;
                        
                    } else if (sum > target) {
                        end--;
                    } else { // sum < target
                        start++;
                    }
                }
            }
        }
        return result;
    }
}