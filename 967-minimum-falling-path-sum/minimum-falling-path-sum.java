class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int[] prev=new int[n];
        int[] curr=new int[n];

        for(int i=0;i<n;i++)
            prev[i]=matrix[0][i];


        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int fs=(j-1<0)?Integer.MAX_VALUE:prev[j-1];
                int ss=prev[j];
                int ts=(j+1>=n)?Integer.MAX_VALUE:prev[j+1];

                curr[j]=matrix[i][j]+Math.min(fs,Math.min(ss,ts));
            }
prev = curr.clone();        }

        int min=prev[0];

        for(int i=0;i<n;i++)
            min=Math.min(prev[i],min);
        

        return min;
    }


}