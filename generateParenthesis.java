class Solution {
    boolean checkValid(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(') count++;
            if(ch==')') count--;
            if(count<0) return false;
        }
        if(count==0) return true;
        return false;
    }


    void solve(int open,int close,int n,List<String> res,String str){
        if(str.length()==2*n){
            if(checkValid(str)){
                res.add(str);
            }
            return;
        }
        
        if(open<n)
        solve(open+1,close,n,res,str+"(");
        if(close<=open)
        solve(open,close+1,n,res,str+")");
    }


    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        String str="";

        solve(0,0,n,res,str);

        return res;
    }
}