class Solution {
    public String longestCommonPrefix(String[] str) {
        for(int i=0;i<str[0].length();i++){
            for(String s:str){
                if(i==s.length() || str[0].charAt(i)!=s.charAt(i))
                return s.substring(0,i);
            }
        }

        return str[0];
    }
}