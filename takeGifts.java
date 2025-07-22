class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<gifts.length;i++){
            pq.offer(gifts[i]);
        }

        int i=0;
        while(i<k){
            pq.offer((int)(Math.sqrt(pq.poll())));
            i++;
        }

        long sum=0;
        while(!pq.isEmpty()){
            sum+=pq.poll();
        }


        return sum;


    }
}