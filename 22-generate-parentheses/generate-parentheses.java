class Solution {
    public void solve(List<String> result, StringBuilder sb, int open, int close, int len) {
        if (open > len / 2 || close > open)
            return;
        if (sb.length() == len) {
            result.add(sb.toString());
            return;
        }

        solve(result, sb.append("("), open + 1, close, len);
        sb.setLength(sb.length() - 1);
        solve(result, sb.append(")"), open, close + 1, len);
        sb.setLength(sb.length() - 1);

    }

    public List<String> generateParenthesis(int n) {
        int open = 0, close = 0;
        List<String> result = new ArrayList();
        StringBuilder sb = new StringBuilder();

        solve(result, sb, open, close, 2 * n);

        return result;
    }
}