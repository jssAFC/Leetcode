class Solution {
    boolean checkValid(String sb) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == '(')
                st.push('(');
            else {
                if (!st.isEmpty() && st.peek() == '(')
                    st.pop();
                else
                    return false;
            }
        }

        return st.isEmpty() ? true : false;
    }

    void solve(StringBuilder sb, int len, List<String> list,int open,int close) {
        if (sb.length() == len) {
            // if (checkValid(sb.toString()) == true)
            if(open==close)
            list.add(sb.toString());
            return;
        }

        if (open < close || open>len)
            return;

        solve(sb.append("("), len, list, open + 1, close);
        sb.setLength(sb.length() - 1);
        solve(sb.append(")"), len, list, open, close + 1);
        sb.setLength(sb.length() - 1);
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int open = 0;
        int close = 0;
        solve(sb, 2 * n, list, open, close);

        // for (String s : list) {
        //     if (checkValid(s))
        //         result.add(s);
        // }
        // return result;
        return list;
    }
}