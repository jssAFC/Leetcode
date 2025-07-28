class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            int []arr=new int[i+1];
            Arrays.fill(arr,1);

            for(int j=1;j<i;j++){
                List<Integer> l=list.get(i-1);
                int n1=l.get(j-1);
                int n2=l.get(j);
                arr[j]=n1+n2;
            }

            List<Integer> temp=new ArrayList<>();
            for(int k:arr) temp.add(k);
            list.add(temp);
        }

        return list;
        
    }
}