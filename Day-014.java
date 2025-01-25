Implement Atoi
Difficulty: MediumAccuracy: 32.58%Submissions: 249K+Points: 4
Given a string s, the objective is to convert it into integer format without utilizing any built-in functions. Refer the below steps to know about atoi() function.

Cases for atoi() conversion:

Skip any leading whitespaces.
Check for a sign (‘+’ or ‘-‘), default to positive if no sign is present.
Read the integer by ignoring leading zeros until a non-digit character is encountered or end of the string is reached. If no digits are present, return 0.
If the integer is greater than 231 – 1, then return 231 – 1 and if the integer is smaller than -231, then return -231.

class Solution {
    public int myAtoi(String s) {
        // Your code here
        int i=0, x=1, res=0;
        int n = s.length();
        while(i<n && s.charAt(i)==' ') {
            i++;
        }
        if(i<n && s.charAt(i)=='+' || s.charAt(i)=='-') {
            x = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))) {
            int dig = s.charAt(i) - '0';
            if(res > (Integer.MAX_VALUE - dig) / 10) {
                return (x==1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res*10+dig;
            i++;
        }
        return res*x;
    }
}
