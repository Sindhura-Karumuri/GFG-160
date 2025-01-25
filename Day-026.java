Non-overlapping Intervals
Difficulty: MediumAccuracy: 51.92%Submissions: 32K+Points: 4
Given a 2D array intervals[][] of representing intervals where intervals [i] = [starti, endi ]. Return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

  class Solution {
    static int minRemoval(int intervals[][]) {
        // code here
        int cou = 0;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int x = intervals[0][1];
        for(int i=1;i<intervals.length;i++) {
            if(intervals[i][0]<x) {
                cou++;
                x = Math.min(intervals[i][1],x);
            } else {
                x = intervals[i][1];
            }
        }
        return cou;
    }
}
