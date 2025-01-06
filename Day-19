Min Chars to Add for Palindrome
Difficulty: HardAccuracy: 46.79%Submissions: 78K+Points: 8
Given a string s, the task is to find the minimum characters to be added at the front to make the string palindrome.

class Solution {
    public static int minChar(String s) {
        // Write your code here
        String str = new StringBuilder(s).reverse().toString();
        String com = s+'#'+str;
        int[] arr = lpsArr(com);
        return s.length()-arr[arr.length-1];
    }
    private static int[] lpsArr(String str){
        int n = str.length(),l=0;
        int[] arr=new int[n];
        for(int i=1;i<n;) {
            if(str.charAt(i)==str.charAt(l)) {
                arr[i++] = ++l;
            } else if(l!=0) {
                l = arr[l-1];
            } else {
                arr[i++] = 0;
            }
        }
        return arr;
    }
}
