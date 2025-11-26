class Solution {
    public int myAtoi(String s) {
        int i = 0;
        boolean positive = true;
        long num = 0;
        while (i < s.length() && s.charAt(i) == ' ')
            i++;
        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if (s.charAt(i) == '-')
                positive = false;
            i++;
        }

        while (i < s.length() && s.charAt(i) == '0')
            i++;

        if (i < s.length() && !Character.isDigit(s.charAt(i)))
            return 0;

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit=s.charAt(i)-'0';

            if(positive && (Integer.MAX_VALUE - digit)/10<num) return Integer.MAX_VALUE;
            else if((Integer.MIN_VALUE + digit)/10>-num) return Integer.MIN_VALUE;
            num = num * 10 + (digit);
            i++;
        }

        

        return positive?(int) num:(int)-num;
    }
}