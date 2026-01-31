class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> list = new ArrayList<>();

        solve(s, list, 0, "");
        return list;
    }

    public void solve(String s, List<String> list, int i, String str) {
        if (str.length() == s.length()) {
            list.add(str);
            return;
        }

        char ch = s.charAt(i);
        if (!Character.isDigit(ch)) {
            char toggled = Character.isLowerCase(ch) ? Character.toUpperCase(ch) : Character.toLowerCase(ch);

            solve(s, list, i + 1, str + toggled);
        }

        solve(s, list, i + 1, str + ch);

    }
}