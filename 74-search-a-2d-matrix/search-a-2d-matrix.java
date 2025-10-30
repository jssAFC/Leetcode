class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0,j=matrix.length-1;
        int len=matrix.length-1;
        int sublen=matrix[0].length-1;

        while(i<=j){
            int mid=i+(j-i)/2;

            if(target<=matrix[mid][sublen] && target>=matrix[mid][0]){
                for(int num:matrix[mid]) if(num==target) return true;
                return false;
            }

            else if(target>matrix[mid][sublen]) i=mid+1;
            else j=mid-1;

        }

        return false;
    }
}