class Solution {
    public int maxDepth(String s) {

        int n=s.length();
        int len=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                count++;
                len=Math.max(len,count);
            } else if(s.charAt(i)==')'){
                count--;
            }
        }

        return len;
    }
}