class Solution {
    int n;
    int[][] dp;
    public int bestTeamScore(int[] scores, int[] ages) {
        n=scores.length;
        int[][] arr=new int[n][2];

        for(int i=0;i<n;i++){
            arr[i]=new int[]{ages[i],scores[i]};
        }

        Arrays.sort(arr,(a,b)->{
            if(a[0]==b[0]) return a[1]-b[1];
            return a[0]-b[0];
        });

        dp = new int[n][n+1];

        for(int[] dp1:dp)
        Arrays.fill(dp1,-1);
        
        int max=0;
        // for(int i=0;i<n;i++){
        //     max=Math.max(max,func(arr,i,-1));
        // }

        return func(arr,0,-1);

        // return max; 

    }

    public int func(int[][] arr,int i,int prev){
        if(i>=n) return 0;
        if(dp[i][prev+1]!=-1) return dp[i][prev+1];

        int take=0;

        
        if(prev==-1  || arr[i][1]>=arr[prev][1]){
            take=arr[i][1]+func(arr,i+1,i);
        }
        // else if(arr[i][0]==arr[prev+1][0]) return arr[i][1]+func(arr,i+1,i);

        return dp[i][prev+1]=Math.max(take,func(arr,i+1,prev));
    }

}