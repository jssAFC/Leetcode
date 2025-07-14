class Solution {
    private void solve(int i,int[] arr, int target, List<List<Integer>> ans,List<Integer> temp){
        if(i==arr.length){
            if(target==0) ans.add(new ArrayList<>(temp));
            return;
        }

        if(arr[i]<=target){
            temp.add(arr[i]);
            solve(i,arr,target-arr[i],ans,temp);
            temp.remove(temp.size()-1);
        }

        solve(i+1,arr,target,ans,temp);
    }


    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(0,arr,target,ans,new ArrayList<>());
        return ans;
    }
}