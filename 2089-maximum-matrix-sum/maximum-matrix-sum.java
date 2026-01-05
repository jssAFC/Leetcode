class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int neg=0;
        for(int arr[]:matrix){
            for(int i:arr){
                if(i<0){
                    neg++;
                }
            }
        }

        int min=Integer.MAX_VALUE;
        long sum=0;
        for(int arr[]:matrix){
            for(int i:arr){
                sum+=Math.abs(i);
                min=Math.min(min,Math.abs(i));
            }
        }

        // System.out.println(neg);
        // System.out.println(min);
        // System.out.println(neg);

        if(neg%2==0) return sum;
        return sum-2*min;
    }
}