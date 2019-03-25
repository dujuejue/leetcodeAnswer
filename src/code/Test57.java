package code;import java.util.ArrayList;
import java.util.List;

public class Test57 {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result=new ArrayList<>();
        int i=0;
        while (i<intervals.size()&&intervals.get(i).end<newInterval.start)result.add(intervals.get(i++));
        int start=newInterval.start;
        int end=newInterval.end;
        while (i<intervals.size()&&intervals.get(i).start<=newInterval.end){
            start=Math.min(start,intervals.get(i).start);
            end=Math.max(end,intervals.get(i).end);
            i++;
        }
        result.add(new Interval(start,end));
        while (i<intervals.size())result.add(intervals.get(i++));
        return result;
    }
}
