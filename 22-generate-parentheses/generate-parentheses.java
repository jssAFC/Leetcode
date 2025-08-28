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

    void solve(StringBuilder sb, int len, List<String> list) {
        if (sb.length() == len) {
            if (checkValid(sb.toString()) == true)
            list.add(sb.toString());
            return;
        }

        solve(sb.append("("), len, list);
        sb.setLength(sb.length() - 1);
        solve(sb.append(")"), len, list);
        sb.setLength(sb.length() - 1);
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        solve(sb, 2 * n, list);

        for (String s : list) {
            if (checkValid(s))
                result.add(s);
        }
        // return result;
        return list;
    }
}