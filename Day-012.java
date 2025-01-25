Max Circular Subarray Sum
Difficulty: HardAccuracy: 29.37%Submissions: 142K+Points: 8
Given an array of integers arr[] in a circular fashion. Find the maximum subarray sum that we can get if we assume the array to be circular.

class Solution {
    // Function to find maximum circular subarray sum
    public int circularSubarraySum(int arr[]) {
        int n = arr.length;
        int maxSum = kadane(arr);
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
            arr[i] = -arr[i];
        }
        int minSum = kadane(arr);
        int circularMax = totalSum + minSum;
        return circularMax == 0 ? maxSum : Math.max(maxSum, circularMax);
    }
    private int kadane(int arr[]) {
        int maxSum = arr[0], currentSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}

