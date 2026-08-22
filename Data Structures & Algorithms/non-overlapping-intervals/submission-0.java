class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[1] - b[1]);
        int n = intervals.length;
        int end = intervals[0][1];
        int count = 0;
        for(int i=1;i<n;i++){
            int s = intervals[i][0];
            int e = intervals[i][1];
            if(s<end){
                count++;
            }
            else{
                end = e;
            }
        }
        return count;
    }
}
