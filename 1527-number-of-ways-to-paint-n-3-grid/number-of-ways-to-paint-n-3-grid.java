class Solution {
    static final int M=1_000_000_007;
    long colors2=6;
    long colors3=6;

    public int numOfWays(int n) {
        for(int i=1;i<n;i++){
            long nextColor2= 3*colors2 + 2*colors3;
            long nextColor3= 2*colors2 + 2*colors3;
            colors2=nextColor2%M;
            colors3=nextColor3%M;
        }

        return (int)(colors2+colors3)%M;
    }
}