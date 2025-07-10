class Solution {
    public int hammingWeight(int n) {
        int count=0;
        // while(n>0){
        //     if((n & 1)==1) count++;
        //     n>>1;
        // }

        //  Brian kernighan algorithm
        // while(n>0){
        //     n=n&(n-1);
        //     count++;
        // }

        

        return Integer.bitCount(n);
    }
}