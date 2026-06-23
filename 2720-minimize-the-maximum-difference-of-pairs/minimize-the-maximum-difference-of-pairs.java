class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);

        if(p==0) return 0;

        int n = nums.length - 1;
        int min = Integer.MAX_VALUE, max = nums[n] - nums[0];
     
        for (int i = 0; i < n; i++)
            min = Math.min(min, nums[i + 1] - nums[i]);

        int result = -1;

        while (min <= max) {
            int mid = (max - min) / 2 + min;
            int validPairs = 0;
            int maxDiffPair = 0;
            int i=0;
            while(i<n){
                int diff = nums[i + 1] - nums[i];
                if (diff <= mid) {
                    maxDiffPair = Math.max(maxDiffPair, diff);
                    validPairs++;
                    i++;
                }
                i++;
            }

            if (validPairs >= p) {
                result = maxDiffPair;
                max = mid - 1;
            } else {
                min = mid + 1;
            }

        }
        return result;

    }
}