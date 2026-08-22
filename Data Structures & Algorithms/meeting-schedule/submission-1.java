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
    public boolean canAttendMeetings(List<Interval> intervals) {
        intervals.sort((a, b) -> Integer.compare(a.start, b.start));    //sorts the ArrayList
        for(int i=0;i<intervals.size()-1;i++){
            //start and end denotes the starting and end time of the meeting
            if(intervals.get(i+1).start < intervals.get(i).end){    
                return false;
            }
        }
        return true;
    }
}
