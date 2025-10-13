class Solution {
    public String longestCommonPrefix(String[] str) {
        Arrays.sort(str);
        StringBuilder res=new StringBuilder();
        String word1=str[0],word2=str[str.length-1];

        for(int i=0;i<Math.min(word1.length(),word2.length());i++){
            if(word1.charAt(i)==word2.charAt(i)) res.append(word1.charAt(i));
            else break;
        }

        return res.toString();
    }
}