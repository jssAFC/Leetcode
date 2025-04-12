class Solution {
    public int maxProfit(int[] arr) {
        int min = arr[0];
        int minIndex = 0;
        int profit = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min) min=arr[i];
        profit=Math.max(profit,arr[i]-min);

        }


        return profit;

    }
}