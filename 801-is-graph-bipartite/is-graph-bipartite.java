class Solution {
    int V;

    public boolean isBipartite(int[][] graph) {
        V = graph.length;
        int colors[] = new int[V];
        Arrays.fill(colors, -1);
        int color = 0;

        for(int i=0;i<V;i++){
            if(colors[i]==-1 && dfs(graph,colors,i,-1,1-color)==false) return false;
        }

        return true;
    }

    public boolean dfs(int[][] graph,int[] colors,int u, int parent,int color){
        colors[u]=color;

        for(int i:graph[u]){
            if(colors[i]==-1 && dfs(graph,colors,i,u,1-color)==false) return false;
            else if(i!=parent && colors[i]==colors[u]) return false;
        }

        return true;
    }
}