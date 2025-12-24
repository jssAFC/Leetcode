class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int m=triangle.size();
        int minval=0;

        for(int i=m-2;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                int val=triangle.get(i).get(j);
  
                    int betterVal=triangle.get(i).get(j)+Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1));
                    triangle.get(i).set(j,betterVal);
                
            }
        }

        
        return triangle.get(0).get(0);

    }

    
}