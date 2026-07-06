class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] nums = new boolean[right + 1];
        Arrays.fill(nums, true);
        nums[1]=false;

        for (int i = 2; i * i <= right; i++) {
            for (int j = i * i; j <= right; j += i) {
                nums[j] = false;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (nums[i] == true)
                list.add(i);
        }

        int diff = Integer.MAX_VALUE;
        int result[] = new int[] { -1, -1 };
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) - list.get(i) < diff) {
                diff = list.get(i + 1) - list.get(i);
                result[0] = list.get(i);
                result[1] = list.get(i + 1);
            }
        }

        return result;

    }
}