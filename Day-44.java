Find All Triplets with Zero Sum
Difficulty: MediumAccuracy: 50.36%Submissions: 55K+Points: 4
Given an array arr[], find all possible triplets i, j, k in the arr[] whose sum of elements is equals to zero. 
Returned triplet should also be internally sorted i.e. i<j<k.

  class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        List<List<Integer>> answer = new ArrayList<>();

        for (int i =0;i< arr.length;i++)
        {
            Map<Integer,List<Integer>> map = new HashMap<>();
            for (int j = i+1; j< arr.length;j++){
                int sum = (arr[i] + arr[j]) * -1;

                if(map.containsKey(sum)) {
                    for (int k : map.get(sum)) {
                        List<Integer> ans = new ArrayList<>(Arrays.asList(i,j,k));
                        Collections.sort(ans);
                        answer.add(ans);
                    }
                }
                map.putIfAbsent(arr[j],new ArrayList<>());
                map.get(arr[j]).add(j);
            }
        }
        
        return answer;
    }
}
