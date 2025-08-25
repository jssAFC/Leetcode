class Solution {

    public double solve(double x, int n) {
        if (n == 0)
            return 1.0;

        double res=solve(x,n/2);

        if(n%2==0){
            return res*res;
        }

        return res*res*x; 

        
    }

    public double myPow(double x, int n) {
        if(n==0 || x==1) return 1;
        // if(x==1) return 1;
        if(x==-1) return n%2==0?1:-1;
        
        int pow=n;
        return (n>0)?solve(x,pow):1/solve(x,pow);

        // return 
    }
}