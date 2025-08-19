class Solution {
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

        while (i < n) {
            char ch = s.charAt(i);
            int digit = ch - '0';
            if (ch < '0' || ch > '9')
                break;
            if (Integer.MAX_VALUE / 10 < num || Integer.MAX_VALUE / 10 == num && Integer.MAX_VALUE % 10 < digit) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = num * 10 + digit;

            i++;
        }

        return sign * num;

    }
}