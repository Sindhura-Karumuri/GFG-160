Kadane's Algorithm
Difficulty: MediumAccuracy: 36.28%Submissions: 1MPoints: 4
Given an integer array arr[]. You need to find the maximum sum of a subarray.

class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
        int size=arr.length;
        int max=Integer.MIN_VALUE,max_ending=0;
        for(int i=0;i<size;i++){
            max_ending+=arr[i];
            if(max<max_ending)
            max=max_ending;
            if(max_ending<0)
            max_ending=0;
        }
        return max;
    }
}
