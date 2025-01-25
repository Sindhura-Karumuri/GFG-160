Rotate by 90 degree
Difficulty: EasyAccuracy: 56.88%Submissions: 110K+Points: 2
Given a square matrix mat[][] of size n x n. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space. 

  class Solution {
    // Function to do transpose of mat.
    static void transpose(int mat[][]) {
        for (int i = 0; i < mat.length; i++)
            for (int j = i; j < mat[0].length; j++) {
                int temp = mat[j][i];
                mat[j][i] = mat[i][j];
                mat[i][j] = temp;
            }
    }
    static void reverseColumns(int mat[][]) {
        for (int i = 0; i < mat[0].length; i++)
            for (int j = 0, k = mat[0].length - 1; j < k; j++, k--) {
                int temp = mat[j][i];
                mat[j][i] = mat[k][i];
                mat[k][i] = temp;
            }
    }
    static void rotateby90(int mat[][]) {
        transpose(mat);
        reverseColumns(mat);
    }
}
