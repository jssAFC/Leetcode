class Solution {
    int V;

    public boolean isBipartite(int[][] graph) {
        V = graph.length;
        int colors[] = new int[V];
        Arrays.fill(colors, -1);
        // int color = 0;

        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<V;i++){
            if(colors[i]==-1 && bfs(q,colors,graph,i)==false) return false;
        }

        return true;
    }

    public boolean bfs(Queue<Integer> q, int[] colors,int [][]graph,int i){
        q.offer(i);
        colors[i]=0;
         while(!q.isEmpty()){
            int top=q.poll();
            int color=colors[top];
            for(int u:graph[top]){
                if(colors[u]==-1){
                    colors[u]=1-color;
                    q.offer(u);
                }
                else{
                    if(colors[u]==color) return false;
                }
            }
        }
        return true;
    }

    
}