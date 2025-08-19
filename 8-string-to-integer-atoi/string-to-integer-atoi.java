class Solution {
    private long result=0;
    boolean flag=false;

    public void solve(int i,String s,int n){
        if(i>=n || s.charAt(i)<'0' || s.charAt(i)>'9') return;
        int digit=s.charAt(i)-'0';

        if((Integer.MAX_VALUE / 10 < result || Integer.MAX_VALUE / 10 == result && Integer.MAX_VALUE % 10 < digit)){
            flag=true;
            return;
        }
        result=result*10+digit;

        System.out.println(result);

        solve(i+1,s,n);

    }
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        // if(n==0) return 0;
        int num = 0;
        while (i<n && s.charAt(i) == ' ')
            i++;
        if (i == n)
            return num;

        int sign = 1;

        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = s.charAt(i) == '+' ? 1 : -1;
            i++;
        }

        solve(i,s,n);

        if(flag==true){
            return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }
        return sign * (int)result;

    }
}