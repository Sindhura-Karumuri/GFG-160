Search in a row-wise sorted matrix
Difficulty: EasyAccuracy: 51.77%Submissions: 37K+Points: 2
Given a row-wise sorted 2D matrix mat[][] of size n x m and an integer x, find whether element x is present in the matrix.
Note: In a row-wise sorted matrix, each row is sorted in itself, i.e. for any i, j within bounds, mat[i][j] <= mat[i][j+1].

  class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        for(int i=0;i<n;i++) {
            int low = 0, high = m-1;
            while(low<=high) {
                int mid = (low+high)/2;
                if(mat[i][mid] == x) {
                    return true;
                } else if(mat[i][mid]<x) {
                    low = mid+1;
                } else {
                    high = mid-1;
                }
            }
        }
        return false;
    }
}
