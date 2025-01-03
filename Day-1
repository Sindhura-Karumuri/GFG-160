Second Largest
Difficulty: EasyAccuracy: 26.72%Submissions: 924K+Points: 2
Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.
class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int lar = -1, secLar = -1;
        for(int i:arr) {
            if(i>lar) {
                secLar = lar;
                lar = i;
            }
            if(i>secLar && i<lar) 
                secLar = i;
        }
        return secLar;
    }
}
