class Solution {
    List<List<Integer>> list;
    public boolean possibleBipartition(int n, int[][] dislikes) {
        // int V=dislikes.length;

        list=new ArrayList<>();
        for(int i=0;i<=n;i++) list.add(new ArrayList<>());

        for(int edge[]:dislikes){
            int u=edge[0],v=edge[1];
            list.get(u).add(v);
            list.get(v).add(u);
        }

        int colors[]=new int[n+1];
        Arrays.fill(colors,-1);

        for(int i=1;i<=n;i++){
            if(colors[i]==-1 && dfs(i,colors,list,0)==false) return false; 
        }

        return true;
    }

    public boolean dfs(int i,int[] colors,List<List<Integer>> list,int color){
        colors[i]=color;

        for(int u:list.get(i)){
            if(colors[u]==-1 && dfs(u,colors,list,1-color)==false) return false;
            else if(colors[u]==color) return false;
        }
        
        return true;
    }
}