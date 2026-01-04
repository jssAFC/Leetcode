class Solution {
    List<String> columns=new ArrayList<>();
    public static  final int M=1000000007;
    int[][] dp;

    public void generateColumnStates(String curr,String prev,int l,int m){
        if(l==m){
            columns.add(curr);
            return;
        } 

        String[] colors = {"R", "G", "B"};

        for(String ch:colors){
            if(ch.equals(prev)) continue;

            generateColumnStates(curr+ch,ch,l+1,m);
        }

    }

    public int solve(int remCols,int prevIndex,int m){
        if (remCols==0) return 1;

        if(dp[remCols][prevIndex]!=-1) return dp[remCols][prevIndex];
        int ways=0;
        String prevState=columns.get(prevIndex);

        for(int i=0;i<columns.size();i++){
            if(i==prevIndex) continue;

            String currState=columns.get(i);

            boolean valid=true;

            for(int j=0;j<m;j++){
                if(prevState.charAt(j)==currState.charAt(j)){
                    valid=false;
                    break;
                }
            }

            if(valid){
                ways=(ways+solve(remCols-1,i,m))%M;
            }

        }

        return dp[remCols][prevIndex]=ways;
    }

    public int colorTheGrid(int m, int n) {
        generateColumnStates("","#",0,m);

        dp=new int[n+1][columns.size()+1];

        for(int []arr:dp) Arrays.fill(arr,-1);

        int result=0;

        for(int i=0;i<columns.size();i++){
            result=(result+solve(n-1,i,m))%M;
        }

        return result;
    }
}