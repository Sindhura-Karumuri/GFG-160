Search in Rotated Sorted Array
Difficulty: MediumAccuracy: 37.64%Submissions: 252K+Points: 4
Given a sorted and rotated array arr[] of distinct elements, the task is to find the index of a target key. Return -1 if the key is not found.

  class Solution {
    int search(int[] arr, int key) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] >= arr[lo]) {
                if (key >= arr[lo] && key < arr[mid]) hi = mid - 1;
                else
                    lo = mid + 1;
            }
            else {
                if (key > arr[mid] && key <= arr[hi]) lo = mid + 1;
                else
                    hi = mid - 1;
            }
        }
        return -1;
    }
}
