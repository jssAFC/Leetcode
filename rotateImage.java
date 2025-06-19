class Solution {
    public void rotate(int[][] matrix) {
        int edge=matrix.length;

        int top=0;
        int bottom=edge-1;

        while(top<bottom){
            for(int col=0;col<edge;col++){
                int temp=matrix[top][col];
                matrix[top][col]=matrix[bottom][col];
                matrix[bottom][col]=temp;
            }
            top++;
            bottom--;
        }

        for(int i=0;i<edge;i++){
            for(int j=i+1;j<edge;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

       

    }
}