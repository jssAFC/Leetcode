class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();

        for(int i=1;i<=numRows;i++){
            Integer num[]=new Integer[i];
            Arrays.fill(num,1);

            for(int j=1;j<i-1;j++){
                num[j]=res.get(i-2).get(j-1)+res.get(i-2).get(j);
            }
            res.add(Arrays.asList(num));
        }

        return res;
    }
}