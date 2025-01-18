Two Sum - Pair with Given Sum
Difficulty: EasyAccuracy: 30.61%Submissions: 344K+Points: 2
Given an array arr[] of positive integers and another integer target. Determine if there exists two distinct indices such that the sum of there elements is equals to target.
  
  class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
         Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        for(int num : arr){
            int complement = target-num;
            
            if(map.containsKey(complement) && (complement != num || map.get(complement) > 1)){
                return true;
            }
        }
        
        return false;
    }
}
