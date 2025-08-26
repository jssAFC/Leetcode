class Solution {
    public double calc(double x, long pow){
        if(pow==0) return 1;

        double res= calc(x,pow/2);

        if(pow%2==0) return res*res;
        return res*res*x;

    }
    public double myPow(double x, int n) {
        if(n==0 || x==1) return 1;
        long pow=n;
        if(n<0) pow=-pow;
        return n>0? calc(x,pow):1/calc(x,pow);

    }
}