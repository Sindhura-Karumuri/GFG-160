Smallest Positive Missing
Difficulty: MediumAccuracy: 25.13%Submissions: 389K+Points: 4
You are given an integer array arr[]. Your task is to find the smallest positive number missing from the array.

class Solution {
    // Function to find the smallest positive number missing from the array
   static int missingNumber(int[] arr) {
   int n = arr.length;
   boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] <= n)
                vis[arr[i] - 1] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (!vis[i - 1]) {
                return i;
            }
        }
        return n + 1;
    }
}
