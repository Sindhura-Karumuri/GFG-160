Count pairs with given sum
Difficulty: EasyAccuracy: 50.11%Submissions: 38K+Points: 2
Given an array arr[] and an integer target. You have to find numbers of pairs in array arr[] which sums up to given target.

  class Solution {

    int countPairs(int arr[], int target) {
        // Your code here
         HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i:arr)
        {
            if(map.containsKey(target-i))
            {
                count+=map.get(target-i);
            }
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return count;
    }
}
