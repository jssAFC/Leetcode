class Solution {
    private long m = (long) Math.pow(10, 9) + 7;
    
    public long power(long n, long p) {
        if(p==0) return 1;
        long result=power(n,p/2);
        if(p%2==0) {
            return (result*result) % m;
        }

        return (result*result*n)%m;


    }

    public int countGoodNumbers(long n) {
        

        long even = ((n + 1) / 2) ;
        long odd = (n / 2) ;

        long total_even = power(5, even);
        long total_odd = power(4, odd);

        long result = (total_even * total_odd) % m;

        return (int)result;

    }
}