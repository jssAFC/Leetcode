class Solution {
    private int[] parent;
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        parent=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }

        for(int[] edge:edges){
            int n1=edge[0];
            int n2=edge[1];
            int p1=find(n1-1);
            int p2=find(n2-1);

            if(p1==p2) return edge; 
            parent[p1]=p2;
        }

        return new int[]{};
    }

    private int find(int element){
        if(parent[element]!=element){
            parent[element]=find(parent[element]);
        }

        return parent[element];
    }
}