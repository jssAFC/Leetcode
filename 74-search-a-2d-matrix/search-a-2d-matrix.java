class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;

        int lo = 0, hi = n - 1;

        while (lo <= hi) {
            int mid = (hi - lo) / 2 + lo;

            if ( matrix[mid][0]<= target && matrix[mid][m - 1] >= target) {
                int i = 0, j = m - 1;

                while (i <= j) {
                    int mid2 = (j - i) / 2 + i;

                    if (matrix[mid][mid2] == target)
                        return true;
                    else if (matrix[mid][mid2] > target)
                        j = mid2 - 1;
                    else
                        i = mid2 + 1;
                }

                return false;
            } else if (matrix[mid][m - 1] < target)
                lo = mid + 1;

            else
                hi = mid - 1;
        }

        return false;
    }
}