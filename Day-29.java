Sorted and Rotated Minimum
Difficulty: EasyAccuracy: 40.57%Submissions: 140K+Points: 2
A sorted array of distinct elements arr[] is rotated at some unknown point, the task is to find the minimum element in it. 

class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        Arrays.sort(arr);
        return arr[0];
    }
}
