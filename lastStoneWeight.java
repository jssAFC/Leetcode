class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<stones.length;i++){
            pq.offer(stones[i]);
        }

        while(pq.size()>1){
            int n1=pq.poll();
            int n2=pq.poll();
            int sum=n1-n2;

            pq.offer(sum);
        }

        return pq.peek();
    }
}