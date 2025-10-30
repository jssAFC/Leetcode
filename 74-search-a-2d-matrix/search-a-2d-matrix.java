class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0,j=matrix.length-1;
        int len=matrix.length-1;
        int sublen=matrix[0].length-1;

        while(i<=j){
            int mid=i+(j-i)/2;

            if(target<=matrix[mid][sublen] && target>=matrix[mid][0]){
                int start=0,end=sublen;
                while(start<=end){
                    int mid2=start+(end-start)/2;
                    if(matrix[mid][mid2]==target) return true;
                    
                    if(matrix[mid][mid2]<target) start=mid2+1;
                    else end=mid2-1;
                }

                return false;
            }

            else if(target>matrix[mid][sublen]) i=mid+1;
            else j=mid-1;

        }

        return false;
    }
}