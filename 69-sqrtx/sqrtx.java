class Solution {
    public int mySqrt(int x) {
        int i;
        int res=1;
        if(x==0 || x==1) return x;
        for( i=1;i<=x;i++){
            if((long)i*i<=(long)x) res=i;
            else break;
        }

        return res;
    }
}