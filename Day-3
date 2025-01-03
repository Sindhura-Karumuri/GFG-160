Reverse an Array
Difficulty: EasyAccuracy: 55.32%Submissions: 107K+Points: 2
You are given an array of integers arr[]. Your task is to reverse the given array.

class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        rev(0,arr,n);
    }
    public void rev(int i,int arr[],int n){
        if(i>=n/2) return;
        int tmp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = tmp;
        rev(i+1,arr,n);
    }
}
