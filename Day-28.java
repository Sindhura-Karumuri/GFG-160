Number of occurrence
Difficulty: EasyAccuracy: 59.34%Submissions: 284K+Points: 2
Given a sorted array, arr[] and a number target, you need to find the number of occurrences of target in arr[]. 

  class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int c = 0;
        for(int i=0;i<arr.length;i++) 
          if(arr[i] == target)
            c++;
        return c;    
    }
}
