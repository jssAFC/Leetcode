class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        boolean rowImpacted = false;
        boolean colImpacted = false;

        for (int j = 0; j < col; j++) {
            if (matrix[0][j] == 0) {
                rowImpacted = true;
                break;
            }
        }

        for (int i = 0; i < row; i++) {
            if (matrix[i][0] == 0) {
                colImpacted = true;
                break;
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }

        for (int j = 0; j < col; j++) {
            if (rowImpacted == true)
                matrix[0][j] = 0;
        }

        for (int i = 0; i < row; i++) {
            if (colImpacted == true)
                matrix[i][0] = 0;
        }

    }
}ro