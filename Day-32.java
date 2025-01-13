K-th element of two Arrays
Difficulty: MediumAccuracy: 37.4%Submissions: 311K+Points: 4
Given two sorted arrays a[] and b[] and an element k, the task is to find the element that would be at the kth position of the combined sorted array.

  class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
         int arr[]=new int[a.length+b.length];
        int lena=a.length;
        int lenb=b.length;
        if(a.length<=0  ){
            return  0;
        }
        if(b.length<=0){
            return 0;
        }
        
        System.arraycopy(a,0,arr,0,lena);
        System.arraycopy(b,0,arr,lena,lenb);
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i==k-1){
                return arr[i];
            }
        }
        return -1;
    }
}
