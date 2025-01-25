Add Binary Strings
Difficulty: MediumAccuracy: 23.25%Submissions: 91K+Points: 4
Given two binary strings s1 and s2 consisting of only 0s and 1s. Find the resultant string after adding the two Binary Strings.

class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        s1 = trimLeadingZeroes(s1);
        s2 = trimLeadingZeroes(s2);
        int n = s1.length();
        int m = s2.length();
        if(n<m) {
            return addBinary(s2,s1);
        }
        int j=m-1;
        int c=0;
        StringBuilder res = new StringBuilder();
        for(int i=n-1;i>=0;i--) {
            int b1=s1.charAt(i)-'0';
            int sum=b1+c;
            if(j>=0) {
                int b2=s2.charAt(j)-'0';
                sum+=b2;
                j--;
            }
            int b=sum%2;
            c=sum/2;
            res.append((char)(b+'0'));
        }
        if(c>0) 
          res.append('1');
          return res.reverse().toString();
    }
    static String trimLeadingZeroes(String s) {
        int one = s.indexOf('1');
        return (one==-1)?"0":s.substring(one);
    }
}
