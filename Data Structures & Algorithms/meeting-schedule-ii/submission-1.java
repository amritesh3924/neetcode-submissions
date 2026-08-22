/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int n = intervals.size();
        int start[] = new int[n];   // all meeting start times
        int end[] = new int[n];     // all meeting end times

        // split intervals into separate start/end arrays
        for(int i=0;i<n;i++){
            start[i] = intervals.get(i).start;
            end[i] = intervals.get(i).end;
        }
        // sort independently so we can sweep through
        // "next meeting to start" vs "next meeting to end"
        Arrays.sort(start);
        Arrays.sort(end);

        int startptr = 0,endptr = 0;    // pointers into start[] and end[]
        int result = 0,max = 0;         // result = rooms in use right now, max = peak rooms

        while(startptr < n){
            if(start[startptr] >= end[endptr]){
                //if no meeting overlaps ----> release the room
                result--;
                endptr++;   // move to the next meeting that will end
            }
            // allocate a room for the meeting starting now
            result++;
            startptr++;
            // track the highest number of rooms used at any point
            max = Math.max(max,result);
        }
        return max;
    }
}
