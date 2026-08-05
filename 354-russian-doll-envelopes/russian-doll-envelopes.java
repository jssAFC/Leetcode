class Solution {
    int[] dp;
    int n;
    public int maxEnvelopes(int[][] envelopes) {
        n=envelopes.length;

        Arrays.sort(envelopes,(a,b)->{
            if(a[0]==b[0]) return b[1]-a[1];
            return a[0]-b[0];
        });
        
        // dp=new int[n][n+1];
        // dp=new int[n];
        // Arrays.fill(dp,1);

        // for(int i=1;i<n;i++){
        //     for(int j=0;j<i;j++){
        //         if(envelopes[i][0]>envelopes[j][0] && envelopes[i][1]>envelopes[j][1]){
        //             dp[i]=Math.max(dp[i],dp[j]+1);
        //         }
        //     }
        // }

        // int max=0;

        // for(int num:dp) max=Math.max(num,max);

        // return max;

        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=envelopes[i][1];
            System.out.println(nums[i]);
        }

        return solve(nums);

        // return solve(envelopes,0,-1);
    }

    public int solve(int[] nums){
        List<Integer> list=new ArrayList<>();
        list.add(nums[0]);

        for(int i=1;i<n;i++){
            int size=list.size();
            if(nums[i]>list.get(size-1)) list.add(nums[i]);
            else{
                int l=0,r=size-1;
                while(l<r){
                    int mid=(r-l)/2+l;
                    if(list.get(mid)<nums[i]) l=mid+1;
                    else r=mid;
                }

                list.set(l,nums[i]);
            }

            System.out.println(list.size());


        }

        return list.size();
    }

    // public int solve(int[][] envelopes,int i,int prev){
    //     if(i>=n) return 0;

    //     if(dp[i][prev+1]!=0) return dp[i][prev+1];

    //     int take=0;
    //     if(prev==-1 || envelopes[i][0]>envelopes[prev][0] && envelopes[i][1]>envelopes[prev][1])
    //         take=1+solve(envelopes,i+1,i);

    //     return dp[i][prev+1]=Math.max(take,solve(envelopes,i+1,prev));
    // }
}