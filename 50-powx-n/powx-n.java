class Solution {
    public double myPow(double x, int n) {
        double res=1;
        long pow= n;

        if(pow<0) pow=-pow;
        
        if(n==0 || x==1) return 1;
        if(x==-1) return n%2==0?1:-1;
        while(pow>0){
            if((pow & 1)==1){
                res=res*x;
            }

            x=x*x;
            pow>>=1;
        }

        return n>0?res:1.0/res;
        // return res;
    }
}