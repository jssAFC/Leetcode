class Solution {
    public String clearDigits(String s) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                res.deleteCharAt(res.length()-1);
            } 
            else res.append(s.charAt(i));
        }

        return res.toString();
    }
}