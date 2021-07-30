/*
48.Rotate Image
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
DO NOT allocate another 2D matrix and do the rotation.

Yun-Chi Hsiao
Jul.30th.2021
*/

public class RotateImage {

    public void rotate(int[][] matrix) {

        int m = matrix.length;

        for (int i = 0; i < m; i ++) {
            for (int j = m-1; j >=i ; j--) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        int leftColumn = 0;
        int rightColumn = m -1;
        while (leftColumn < rightColumn) {

            for (int i = 0; i < m; i ++){
                int temp = matrix[i][leftColumn];
                matrix[i][leftColumn] = matrix[i][rightColumn];
                matrix[i][rightColumn] = temp;
            }

            leftColumn++;
            rightColumn--;
        }
    }
}
