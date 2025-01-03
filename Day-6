Majority Element II
Difficulty: MediumAccuracy: 48.1%Submissions: 117K+Points: 4
You are given an array of integer arr[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array. 

class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int n = nums.length;
        int c1 = Integer.MIN_VALUE, c2 = Integer.MIN_VALUE;
        int cou1 = 0, cou2 = 0;
        for(int num:nums) {
            if(num == c1) {
                cou1++;
            } else if(num == c2) {
                cou2++;
            } else if(cou1 == 0) {
                c1 = num;
                cou1 = 1;
            } else if(cou2 == 0) {
                c2 = num;
                cou2 = 1;
            } else {
                cou1 --;
                cou2 --;
            }
        }
        cou1 = 0;
        cou2 = 0;
        for(int num : nums) {
            if(num == c1) cou1++;
            else if(num == c2) cou2++;
        }
        List<Integer> res = new ArrayList<>();
        if(cou1 > n / 3) res.add(c1);
        if(cou2 > n / 3) res.add(c2);
        Collections.sort(res);
        return res;
    }
}
