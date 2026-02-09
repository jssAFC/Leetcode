class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses,(a,b)->a[1]-b[1]);
        int time=0;

        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);

        for(int[] c:courses){
            time+=c[0];
            pq.add(c[0]);
            if(time>c[1]) time-=pq.poll();
        }

        return pq.size();

    }
}