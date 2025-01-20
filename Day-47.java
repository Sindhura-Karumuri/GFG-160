Longest Consecutive Subsequence
Difficulty: MediumAccuracy: 33.0%Submissions: 342K+Points: 4
Given an array arr[] of non-negative integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.

  class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
         Arrays.sort(arr);
        int count = 1;
        int temp = 1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+1==arr[i+1]){
                temp++;
            }else if(arr[i]==arr[i+1]){
                continue;
            }else{
                count=Math.max(count,temp);
                 temp=1;
            }
           count = Math.max(count,temp);
        }
        return count;
    }
}
