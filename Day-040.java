Search in a sorted Matrix
Difficulty: MediumAccuracy: 56.27%Submissions: 126K+Points: 4
Given a strictly sorted 2D matrix mat[][] of size n x m and a number x. Find whether the number x is present in the matrix or not.
Note: In a strictly sorted matrix, each row is sorted in strictly increasing order, and the first element of the ith row (i!=0) is greater than the last element of the (i-1)th row.

  class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int low = 0, high = n*m-1;
        while(low<=high) {
            int mid = low+(high-low)/2;
            if(mat[mid/m][mid%m] < x) {
                low=mid+1;
            } else if(mat[mid/m][mid%m] > x) {
                high = mid-1;
            } else {
                return true;
            }
        }
        return false;
    }
}
