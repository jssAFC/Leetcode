class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result=new ArrayList<>();

        solve(result,new ArrayList<>(),k,n,1);

        return result;
    }

    void solve(List<List<Integer>> result,List<Integer> temp,int k,int n,int index){
        if(temp.size()==k && n==0){
            result.add(new ArrayList<>(temp));
            return;
        }

        if(n<0 || temp.size()==k) return;

        for(int i=index;i<10;i++){
            if(i>n) break;


            temp.add(i);
            solve(result,temp,k,n-i,i+1);
            temp.remove(temp.size()-1);
        }
    }
}