class Solution {
    List<List<Integer>> adj;
    public boolean canFinish(int V, int[][] pre) {
        adj = new ArrayList<>();
        int indegree[] = new int[V];

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        for (int edge[] : pre) {
            int u = edge[0];
            int v = edge[1];
            adj.get(v).add(u);
            indegree[u]++;
        }

        Queue<Integer> q = new LinkedList<>();

        boolean[] visited = new boolean[V];
        boolean[] inRecursion = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, visited, inRecursion))
                    return false;
            }
        }

        return true;
    }

    public boolean dfs(int i,boolean[] visited,boolean[] inRecursion){
        visited[i]=true;
        inRecursion[i]=true;

        for(int u:adj.get(i)){
            if(!visited[u] &&  dfs(u,visited,inRecursion)){
                return true;
            }
            else if(inRecursion[u]==true) return true;  
        }

        inRecursion[i]=false;
        return false;
    }
}