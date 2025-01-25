Maximum Product Subarray
Difficulty: MediumAccuracy: 18.09%Submissions: 421K+Points: 4
Given an array arr[] that contains positive and negative integers (may contain 0 as well). Find the maximum product that we can get in a subarray of arr[].

class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int maxProd = arr[0];
        int minProd = arr[0];
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(arr[i], maxProd * arr[i]);
            minProd = Math.min(arr[i], minProd * arr[i]);
            result = Math.max(result, maxProd);
        }
        return result;
    }
}
