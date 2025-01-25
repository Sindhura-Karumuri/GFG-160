Move All Zeroes to End
Difficulty: EasyAccuracy: 45.51%Submissions: 268K+Points: 2
You are given an array arr[] of non-negative integers. Your task is to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements. The operation must be performed in place, meaning you should not use extra space for another array.

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n = arr.length;
        int index = 0;
        for(int i=0;i<n;i++) {
            if(arr[i]!=0) {
                arr[index++] = arr[i];
            }
        }
        while(index<n) {
            arr[index++] = 0;
        }
    }
}
