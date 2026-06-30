class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:tasks){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            pq.offer(new int[]{entry.getKey(),entry.getValue()});
        }

        int count=0;
        while(!pq.isEmpty()){
            
            int[] top=pq.poll();
            if(top[1]==0) continue;
            if(top[1]==1) return -1;
            if(top[1]%3==0) pq.offer(new int[]{top[0],top[1]-3});
            else pq.offer(new int[]{top[0],top[1]-2});

            
            count++;
        }

        return pq.isEmpty()?count:-1;
    }
}