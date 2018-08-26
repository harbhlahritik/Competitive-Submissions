/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        int len = intervals.size();
        if(intervals.get(len-1).end < newInterval.start){
            intervals.add(newInterval);
            return intervals;
        }
        if(intervals.get(0).start > newInterval.end){
            intervals.add(0, newInterval);
            return intervals;
        }
        for(int i = 0;i < len;i++){
            if(intervals.get(i).end > newInterval.start && intervals.get(i).start < newInterval.start){
                intervals.get(i).end = newInterval.end;
            }
            if(intervals.get(i).start > newInterval.start && intervals.get(i).end > newInterval.end){
                intervals.get(i).start = newInterval.start;
            }
            if(intervals.get(i).start < newInterval.start && intervals.get(i).end > newInterval.end){
                continue;
            }
            if(intervals.get(i).start > newInterval.start && intervals.get(i).end < newInterval.end){
                intervals.get(i).start = newInterval.start;
                intervals.get(i).end = newInterval.end;
            }
        }
        for(int i = 0;i+1 < len;){
            if(intervals.get(i+1).start > intervals.get(i).start && intervals.get(i+1).start < intervals.get(i).end){
                if(intervals.get(i+1).end > intervals.get(i).end)
                    intervals.get(i).end = intervals.get(i+1).end;
                intervals.remove(i+1);
                len--;
            }
            if(intervals.get(i+1).start < intervals.get(i).start){
                if(intervals.get(i+1).end > intervals.get(i).end){
                    intervals.get(i).end = intervals.get(i+1).end;
                    intervals.get(i).start = intervals.get(i+1).start;
                } else {
                    intervals.get(i).start = intervals.get(i+1).start;
                }
                intervals.remove(i+1);
                len--;
            }
            i++;
        }
        return intervals;
    }
}
