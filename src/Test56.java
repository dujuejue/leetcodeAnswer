import java.util.ArrayList;
import java.util.List;

public class Test56 {
    public List<Interval> merge(List<Interval> intervals) {
        //当长度小于等于1时，肯定没有重合
        if (intervals.size()<=1){
            return intervals;
        }
        //用lambda来对列表进行排序，用start作为标准
        intervals.sort((i1,i2)->Integer.compare(i1.start,i2.start));
        List<Interval> result=new ArrayList<>();
        //每个新区间的起止点
        int start=intervals.get(0).start;
        int end=intervals.get(0).end;
        for (Interval interval:intervals){
            //判断区间是否重合
            if (interval.start<=end){
                end=Math.max(interval.end,end);
            }else {
                //没有重合就把这个区间添加进去，并且重新设置start和end
                result.add(new Interval(start,end));
                start=interval.start;
                end=interval.end;
            }
        }
        //添加最后一个区间
        result.add(new Interval(start,end));
        return result;
    }
}
