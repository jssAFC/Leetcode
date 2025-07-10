class Solution {
    public int minBitFlips(int start, int goal) {
        int a=start,b=goal,count=0;
        while(a>0 || b>0){
            if(((a&1)^(b&1))==1) count++; 
            a=a>>1;
            b=b>>1;
        }

        return count;
    }
}