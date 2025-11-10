class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=0, r=0;
        for (int weight : weights) {
            l = Math.max(weight, l);
            r += weight;
        }

        int result = l;

        while (l <= r) {
            int mid = (l + r) / 2;

            int sum = 0, day = 0;

            for (int i : weights) {
                if (sum + i > mid) {
                    day++;
                    sum = i;
                } else {
                    sum += i;
                }
            }
            day++;

            if (day <= days) {
                result = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return result; 
    }
}