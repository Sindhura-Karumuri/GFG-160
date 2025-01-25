Overlapping Intervals
Difficulty: MediumAccuracy: 57.41%Submissions: 92K+Points: 4
Given an array of Intervals arr[][], where arr[i] = [starti, endi]. The task is to merge all of the overlapping Intervals.

  class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // If there are no arr, return an empty list
        if (arr.length == 0) {
            return new ArrayList<>();
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> mergedarr = new ArrayList<>();
        int[] currentInterval = arr[0];
        mergedarr.add(currentInterval);
        for (int[] interval : arr) {
            int currentStart = currentInterval[0];
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];
            if (currentEnd >= nextStart) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = interval;
                mergedarr.add(currentInterval);
            }
        }
        return mergedarr;
    }
}
