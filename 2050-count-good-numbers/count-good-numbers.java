class Solution {
    public long power(long n, long p) {
        long m = (long) Math.pow(10, 9) + 7;
        n %= m;
        long result = 1;
        while (p > 0) {
            if ((p & 1) == 1) {
                result = (result * n) % m;
            }

            n = (n * n) % m;
            p >>= 1;
        }

        return result;
    }

    public int countGoodNumbers(long n) {
        long m = (long) Math.pow(10, 9) + 7;

        n = n;
        long even = ((n + 1) / 2) ;
        long odd = (n / 2) ;

        long total_even = power(5, even);
        long total_odd = power(4, odd);

        long result = (total_even * total_odd) % m;

        return (int)result;

    }
}