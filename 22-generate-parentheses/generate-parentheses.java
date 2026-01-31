class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        solve(list,"",0,0,n);
        return list;
    }

    public void solve(List<String> list,String s,int left,int right,int n){
        if(s.length()==n*2 && left==right){
            list.add(s);
            return;
        }

        
        if(left<n){
            solve(list,s+"(",left+1,right,n);
        }
        if(right<left){
            solve(list,s+")",left,right+1,n);
        }
    }
}