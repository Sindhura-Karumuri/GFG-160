Intersection of Two arrays with Duplicate Elements
Difficulty: EasyAccuracy: 61.4%Submissions: 27K+Points: 2
Given two integer arrays a[] and b[], you have to find the intersection of the two arrays. Intersection of two arrays is said to be elements that are common in both arrays. The intersection should not have duplicate elements and the result should contain items in any order.

class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        ArrayList<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<a.length;i++) {
            if(!h.containsKey(a[i])) {
                h.put(a[i],i);
            }
        }
        for(int i=0;i<b.length;i++) {
            if(h.containsKey(b[i])) {
                if(!l.contains(b[i]))
                    l.add(b[i]);
            }
        }
        return l;
    }
}

  
