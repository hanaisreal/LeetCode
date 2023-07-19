class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        //sort by end times
        //initializing variables
        //greedy approach
        //return result
        
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1])); //sort based on end times in ascending order. to prioritize meetings that end early
        
        int prev = 0;
        int count = 1; //store number of non-overlapping meetings found so far. 
        
        for(int i = 1; i < n; i++){ 
            if(intervals[i][0] >= intervals[prev][1]) {  //if the start time of the current interval is greater than or equal to the end time of the previous interval, it means the current interval does not overlap with the previous one. Thus, we can update prev to the current index i and increment count.
                prev = i;
                count++;
            }
        }
        
        return n - count;
        
    }
}