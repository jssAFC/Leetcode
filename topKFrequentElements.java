class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            pq.add(e);
        }

        int i = 0;
        int[] arr = new int[k];
        while (i < k) {
            Map.Entry<Integer, Integer> entry = pq.poll();
            arr[i++] = entry.getKey();
        }

        return arr;

    }
}