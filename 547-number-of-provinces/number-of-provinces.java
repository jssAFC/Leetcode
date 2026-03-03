class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj=new ArrayList<>();
        int v=isConnected.length;
        for(int i=0;i<v;i++) adj.add(new ArrayList<>());


        for(int i=0;i<v;i++){
            int nums[]=isConnected[i];
            for(int j=0;j<nums.length;j++){
                if(j!=i && nums[j]==1) adj.get(i).add(j);
            }   
        }

        boolean visited[]=new boolean[v];
        int count=0;

        for(int i=0;i<v;i++){
            if(!visited[i]){
                count++;
                dfs(i,adj,visited);
            }
        }
        
        return count;
    }

    public void dfs(int u,List<List<Integer>> adj,boolean[] visited){
        visited[u]=true;

        for(int v:adj.get(u)){
            if(!visited[v]) dfs(v,adj,visited);
        }
    }
}