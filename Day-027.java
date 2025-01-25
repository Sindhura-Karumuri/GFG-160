MMerge Without Extra Space
Difficulty: MediumAccuracy: 32.01%Submissions: 282K+Points: 4
Given two sorted arrays a[] and b[] of size n and m respectively, the task is to merge them in sorted order without using any extra space. Modify a[] so that it contains the first n elements and modify b[] so that it contains the last m elements.

  class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int size = a.length + b.length;
        int []arr = new int[size];
        int index1=0;
        System.arraycopy(a,0,arr,0,a.length);
        System.arraycopy(b,0,arr,a.length,b.length);
        Arrays.sort(arr);
        for(int i = 0;i<a.length;i++){
            a[i] = arr[i];
        }
        for(int i = a.length;i<arr.length;i++){
            b[index1]=arr[i];
            index1++;
        }
    }
}
