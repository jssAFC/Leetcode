class Solution {
    public int smallestNumber(int n) {
        while(true){
            String binary=Integer.toBinaryString(n);
            boolean flag=true;
            if(binary.indexOf('0')==-1) break;
            n++;
        }

        return n;
    }
}