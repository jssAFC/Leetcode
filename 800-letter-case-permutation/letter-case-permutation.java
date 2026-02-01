class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> list=new ArrayList<>();

        solve(list,s,0,"");
        return list;
    }

    public void solve(List<String> list,String s,int i,String res){
        if(res.length()==s.length()){
            list.add(res);
            return;
        }

        if(i>=s.length()) return;

        char ch=s.charAt(i);
        solve(list,s,i+1,res+ch);

        if(!Character.isDigit(ch)){
            char n=Character.isUpperCase(ch)?Character.toLowerCase(ch):Character.toUpperCase(ch);
            solve(list,s,i+1,res+n);
        }


    }
}