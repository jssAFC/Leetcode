class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int neg=0;
        int min=Integer.MAX_VALUE;
        long sum=0;

        for(int arr[]:matrix){
            for(int i:arr){
                if(i<0){
                    neg++;
                }
                sum+=Math.abs(i);
                min=Math.min(min,Math.abs(i));
            }
        }


        if(neg%2==0) return sum;
        return sum-2*min;
    }
}