class Solution {

    private List<int[]> bfsQueue;
    int[][] direction = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

    public int shortestBridge(int[][] grid) {
        int n=grid.length;

        boolean[] visited=new boolean[n];
        bfsQueue=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();

        boolean flag=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    flag=true;
                    dfs(i,j,grid,n);
                    break;
                }
            }
            if(flag) break;
        }

        int distance=0;

        while(!bfsQueue.isEmpty()){
            List<int[]> newBfs=new ArrayList<>();

            for(int[] pair:bfsQueue){
                int x=pair[0],y=pair[1];
                for(int[] newPair:direction){
                    int dirX=x+newPair[0];
                    int dirY=y+newPair[1];
                    if(dirX<0 || dirY<0 || dirX>=n || dirY>=n)
                        continue;
                    
                    if(grid[dirX][dirY]==1) return distance;

                    else if(grid[dirX][dirY]==0){
                        newBfs.add(new int[]{dirX,dirY});
                        grid[dirX][dirY]=-1;
                    }
                }

            }
                bfsQueue=newBfs;
                distance++;

        }
        
        return distance;


    }

    public void dfs(int x, int y, int[][] grid, int n) {
        if (x >= n || y >= n || x < 0 || y < 0 || grid[x][y] != 1)
            return;

        grid[x][y] = 2;
        bfsQueue.add(new int[] { x, y });

        for (int[] dir : direction) {
            int curX = x + dir[0];
            int curY = y + dir[1];
            dfs(curX, curY, grid, n);
        }
    }
}