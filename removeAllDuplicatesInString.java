class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans=new StringBuilder();

        ans.append(s.charAt(0));
        int i=1;
        while(i<s.length()){
            if(ans.length()>0 && s.charAt(i)==ans.charAt(ans.length()-1)){
                ans.deleteCharAt(ans.length()-1);
            } else{
                ans.append(s.charAt(i));
            }
            i++;
        }

        return ans.toString();
    }
}