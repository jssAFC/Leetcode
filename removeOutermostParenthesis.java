class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str=new StringBuilder();
        int count=0;
        // StringBuilder str=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(count==0){
                    count++;
                    continue;
                }
                str.append(ch);
                count++;
                
            } else{
                count--;
                if(count>0){
                    str.append(ch);
                }
            }
        }

        return str.toString();
    }
}