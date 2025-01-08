/*Find H-Index
Difficulty: MediumAccuracy: 53.4%Submissions: 31K+Points: 4
Given an integer array citations[], where citations[i] is the number of citations a researcher received for the ith paper. The task is to find the H-index.

H-Index is the largest value such that the researcher has at least H papers that have been cited at least H times*/

class Solution {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        // code here
        int n = citations.length;
        int[] arr = new int[n+1];
        for(int i=0;i<n;i++) {
            if(citations[i]>=n) {
                arr[n] += 1;
            } else {
                arr[citations[i]] += 1;
            }
        }
        int x = n;
        int a = arr[n];
        while(a<x) {
            x--;
            a += arr[x];
        }
        return x;
    }
}
