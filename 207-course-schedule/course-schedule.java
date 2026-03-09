class Solution {
    public boolean canFinish(int V, int[][] pre) {
        List<List<Integer>> adj=new ArrayList<>();
        int indegree[]=new int[V];

        for(int i=0;i<V;i++) adj.add(new ArrayList<>());

        for(int edge[]:pre){
            int u=edge[0];
            int v=edge[1];
            adj.get(v).add(u);
            indegree[u]++;
        }

        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<V;i++){
            if(indegree[i]==0) q.offer(i);
        }

        while(!q.isEmpty()){
            int top=q.poll();
            for(int u:adj.get(top)){
                indegree[u]--;
                if(indegree[u]==0) q.offer(u);
            }
        }

        for(int i:indegree) if(i!=0) return false;

        return true;
    }
}