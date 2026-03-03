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
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<v;i++){
            if(!visited[i]){
                count++;
                visited[i]=true;
                q.offer(i);
                bfs(i,adj,visited,q);
            }
        }
        
        return count;
    }

    public void bfs(int u,List<List<Integer>> adj,boolean[] visited,Queue<Integer> q){
        while(!q.isEmpty()){
            int top=q.poll();
            for(int v:adj.get(top)){
                if(!visited[v]){
                visited[v]=true;
                q.offer(v);
                }
            }
        }
    }
}