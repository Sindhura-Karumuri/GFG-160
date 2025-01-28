Product array puzzle
Difficulty: EasyAccuracy: 33.46%Submissions: 272K+Points: 2
Given an array, arr[] construct a product array, res[] where each element in res[i] is the product of all elements in arr[] except arr[i]. Return this resultant array, res[].
Note: Each element is res[] lies inside the 32-bit integer range.

  class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n=arr.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int res[]=new int[n];
        left[0]=arr[0];
        right[n-1]=arr[n-1];
        for(int i=1;i<n-1;i++){
            left[i]=left[i-1]*arr[i];
            right[n-i-1]=right[n-i]*arr[n-i-1];
        }
        res[0]=right[1];
        res[n-1]=left[n-2];
        for(int i=1;i<n-1;i++){
            res[i]=left[i-1]*right[i+1];
        }
        return res;
    }
}
