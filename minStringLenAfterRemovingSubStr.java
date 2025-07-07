class Solution {
    public int minLength(String s) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='B'){
                if(!res.isEmpty() && res.charAt(res.length()-1)=='A'){
                    res.deleteCharAt(res.length()-1);
                    continue;
                }  
            }
            else if(ch=='D'){
                if(!res.isEmpty() && res.charAt(res.length()-1)=='C'){
                    res.deleteCharAt(res.length()-1);
                    continue;
                }  
            }

            res.append(ch);
        }

        return res.length();
    }
}