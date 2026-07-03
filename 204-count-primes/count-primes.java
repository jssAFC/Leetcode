class Solution {
    public int countPrimes(int n) {
        boolean nums[] = new boolean[n];
        Arrays.fill(nums, true);

        for (int i = 2; i * i < n; i++) {
            if (nums[i] == true) {
                for (int j = i * i; j < n; j =j + i) {
                    nums[j] = false;
                }
            }
        }

        int count = 0;
        for (int i=2;i<n;i++)
            if (nums[i] == true)
                count++;

        return count;
    }
}