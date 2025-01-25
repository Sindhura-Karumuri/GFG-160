Search Pattern (KMP-Algorithm)
Difficulty: MediumAccuracy: 45.04%Submissions: 100K+Points: 4
Given two strings, one is a text string txt and the other is a pattern string pat. The task is to print the indexes of all the occurrences of the pattern string in the text string. Use 0-based indexing while returning the indices. 

class Solution {
    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        ArrayList<Integer>a = new ArrayList<>();
        int n = txt.length();
        int m = pat.length();
        int[] arr = new int[m];
        lps(pat,arr);
        int i=0,j=0;
        while(i<n) {
            if(txt.charAt(i)==pat.charAt(j)) {
               i++;j++;
               if(j==m) {
                  a.add(i-j);
                  j=arr[j-1];
                }
            } else {
                if(j!=0) j=arr[j-1];
                else i++;
            }
        }
        return a;
    }
   static void lps(String pat,int[] arr) {
       int length=0;
       arr[0] = 0;
       int i=1;
       while(i<pat.length()) {
           if(pat.charAt(i)==pat.charAt(length)) {
           length++;
           arr[i]=length;
           i++;
       } else {
           if(length!=0){
               length = arr[length-1];
           } else {
               arr[i]=0;
               i++;
               }
            }
        }
    }
}
