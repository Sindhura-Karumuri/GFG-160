Search in a Row-Column sorted matrix
Difficulty: EasyAccuracy: 41.62%Submissions: 165K+Points: 2
Given a 2D integer matrix mat[][] of size n x m, where every row and column is sorted in increasing order and a number x, the task is to find whether element x is present in the matrix.

  class Solution {
    
    static boolean find(int arr[], int k){
        int n=arr.length;
        int l=0;
        int r=n-1;
        
        while(l<=r){
            int mid=(l+r)>>1;
            if(arr[mid]==k){
                return true;
            }else if(arr[mid]>k){
                r=mid-1;
            }else {
                l=mid+1;
            }
        }
        
        return false;
    }
    
    
    
    public static boolean matSearch(int arr[][], int x) {
        int n=arr.length;
        
        if(n==1){
            return find(arr[0], x);
        }
        
        
        for(int i=0;i<n;i++){
             if(arr[i][0]<=x && arr[i][arr[0].length-1]>=x){
                if(find(arr[i], x))return true;
            }
        }
        
        return false;
    }
}
