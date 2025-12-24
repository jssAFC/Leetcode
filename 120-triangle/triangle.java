class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> dp = new ArrayList<>();
        int m=triangle.size();
        for (int i = 0; i < m; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < triangle.get(i).size(); j++) {
                list.add(null);
            }
            dp.add(list);
        }

        for(int i=m-1;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                int val=triangle.get(i).get(j);
                if(i==m-1){
                    dp.get(i).set(j,val);
                } else{
                    int betterVal=triangle.get(i).get(j)+Math.min(dp.get(i+1).get(j),dp.get(i+1).get(j+1));
                    dp.get(i).set(j,betterVal);
                }
            }
        }

        
        return dp.get(0).get(0);

    }

    
}