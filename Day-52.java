Count Pairs whose sum is less than target
Difficulty: EasyAccuracy: 53.13%Submissions: 33K+Points: 2
Given an array arr[] and an integer target. You have to find the number of pairs in the array whose sum is strictly less than the target.

  class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int n = arr.length;
        int low = 0, high = n-1, c = 0;
        while(low<high) {
            if(arr[low]+arr[high]<target) {
                c+=(high-low);
                low++;
            } else{
                high--;
            }
        }
        return c;
    }
}
