Spirally traversing a matrix
Difficulty: MediumAccuracy: 35.2%Submissions: 303K+Points: 4
You are given a rectangular matrix mat[][] of size n x m, and your task is to return an array while traversing the matrix in spiral form.

  class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        int r = mat.length;
        int c = mat[0].length;
        ArrayList<Integer> output = new ArrayList<Integer>();
        int row = 0;
        int col = 0;
        while (row < r && col < c) {
            for (int i = col; i < c; i++) output.add(mat[row][i]);
            row++;
            for (int i = row; i < r; i++) output.add(mat[i][c - 1]);
            c--;
            if (row < r) {
                for (int i = c - 1; i >= col; --i) output.add(mat[r - 1][i]);
                r--;
            }
            if (col < c) {
                for (int i = r - 1; i >= row; --i) output.add(mat[i][col]);
                col++;
            }
        }
        return output;
    }
}
