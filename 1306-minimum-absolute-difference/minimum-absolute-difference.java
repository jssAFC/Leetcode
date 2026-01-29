class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        int min=Integer.MAX_VALUE,n=arr.length;
        List<List<Integer>> list=new ArrayList<>();

        Arrays.sort(arr);

        for(int i=0;i<n-1;i++){
            min=Math.min(min,Math.abs(arr[i]-arr[i+1]));
        }

        for(int i=0;i<n-1;i++){
            if(Math.abs(arr[i]-arr[i+1])==min){
                ArrayList<Integer> pair=new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i+1]);
                list.add(pair);
            }
        }

        // list.sort((a,b)->a.get(0)-b.get(0));

        return list;
        
    }
}