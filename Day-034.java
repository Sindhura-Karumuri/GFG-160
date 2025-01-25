Allocate Minimum Pages
Difficulty: MediumAccuracy: 35.51%Submissions: 245K+Points: 4
You are given an array arr[] of integers, where each element arr[i] represents the number of pages in the ith book. You also have an integer k representing the number of students. The task is to allocate books to each student such that:

Each student receives atleast one book.
Each student is assigned a contiguous sequence of books.
No book is assigned to more than one student.
The objective is to minimize the maximum number of pages assigned to any student. In other words, out of all possible allocations, find the arrangement where the student who receives the most pages still has the smallest possible maximum.

  class Solution {
    // Function to check if the current minimum value is feasible or not.
    public static boolean isPossible(int[] arr, int n, int k, int curMin) {
        int studentsRequired = 1;
        int curSum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > curMin) return false;
            if (curSum + arr[i] > curMin) {
                studentsRequired++;
                curSum = arr[i];
                if (studentsRequired > k) return false;
            } else {
                curSum += arr[i];
            }
        }
        return true;
    }
    public static int findPages(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        if (n < k) return -1;
        for (int i = 0; i < n; i++) sum += arr[i];
        int start = 0;
        int end = sum;
        int ans = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (isPossible(arr, n, k, mid)) {
                ans = Math.min(ans, mid);
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
