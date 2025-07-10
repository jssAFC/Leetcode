class Solution {
    public String breakPalindrome(String s) {
        int i=0,j=s.length()-1;
        StringBuilder str=new StringBuilder(s);
        if(s.length()<=1) return "";
        while(i<j){
            char ch=str.charAt(i);
            if(ch!='a'){
                str.setCharAt(i,'a');
                break;
            }

            i++;
            j--;
        }

        if(str.toString().equals(s)){
            str.setCharAt(str.length()-1,'b');
        }

        return str.toString();
    }
}