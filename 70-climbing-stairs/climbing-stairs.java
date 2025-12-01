class Solution {
    public int climbStairs(int n) {
        int curr=1,prev=0;
        int res=0;
        while(n!=0){
            res=curr+prev;
            prev=curr;
            curr=res;
            n--;
        }

        return res;
    }
}