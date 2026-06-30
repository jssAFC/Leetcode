class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int pile:piles) pq.offer(pile);

        while(k>0){
            int top=pq.poll();
            pq.offer((int)Math.ceil((float)top/2));
            k--;
        }

        int total=0;
        while(!pq.isEmpty()) total+=pq.poll();

        return total;
    }
}