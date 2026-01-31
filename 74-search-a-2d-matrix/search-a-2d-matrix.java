class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;

        int lo = 0, hi = n - 1;
        int index=-1;
        while(lo<=hi){
            int mid=(hi-lo)/2+lo;

            if(matrix[mid][m-1]>=target && matrix[mid][0]<=target){
                index=mid;
                break;
            }
            else if(matrix[mid][m-1]>target) hi=mid-1;
            else lo=mid+1;
        }

        if(index==-1) return false;
        
        lo=0;
        hi=m-1;
        while(lo<=hi){
            int mid=(hi-lo)/2+lo;

            if(matrix[index][mid]==target) return true;
            else if(matrix[index][mid]>target) hi=mid-1;
            else lo=mid+1;
        }

        return false;
    }
}