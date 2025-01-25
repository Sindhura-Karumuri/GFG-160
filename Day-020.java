/*Strings Rotations of Each Other
Difficulty: EasyAccuracy: 43.83%Submissions: 240K+Points: 2
You are given two strings of equal lengths, s1 and s2. The task is to check if s2 is a rotated version of the string s1.*/
class Solution {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        String s=s1+s1;
        String str=s2;
        int n = s.length();
        int m = str.length();
        int[] arr = lpsArr(str);
        int i=0,j=0;
        while(i<n) {
            if(str.charAt(j)==s.charAt(i)) {
                j++;
                i++;
            }
            if(j==m) {
                return true;
            } else if(i<n && str.charAt(j)!=s.charAt(i)) {
                if(j!=0) {
                    j=arr[j-1];
                } else {
                    i++;
                }
            }
        }
        return false;
    }
    static int[] lpsArr(String str) {
        int n=str.length();
        int[] arr = new int[n];
        int l=0;
        arr[0]=0;
        int i=1;
        while(i<n) {
            if(str.charAt(i)==str.charAt(l)) {
                l++;
                arr[i] = l;
                i++;
            } else {
                if(l!=0) {
                    l=arr[l-1];
                } else {
                    arr[i]=0;
                    i++;
                }
            }
        }
        return arr;
    }
}
