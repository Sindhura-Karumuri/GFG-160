Union of Arrays with Duplicates
Difficulty: EasyAccuracy: 42.22%Submissions: 415K+Points: 2
Given two arrays a[] and b[], the task is to find the number of elements in the union between these two arrays.

The Union of the two arrays can be defined as the set containing distinct elements from both arrays. If there are repetitions, then only one element occurrence should be there in the union.

  class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        Set<Integer> s = new HashSet<>();
        Arrays.stream(a).forEach(num->s.add(num));
        Arrays.stream(b).forEach(num->s.add(num));
        return s.size();
    }
}
