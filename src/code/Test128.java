package code;import java.util.HashMap;
import java.util.Map;

public class Test128 {
    //我觉着可以把这个思路归为动态规划，用map来保存每次迭代的找到的每个边界点并存储他的序列长度，因为接下来去更改序列只与边界有关
    public int longestConsecutive(int[] nums) {
        int res=0;
        Map<Integer ,Integer>map=new HashMap<>();
        for (int i:nums){
            if (!map.containsKey(i)){
                //对于一个新值来说去查看他与已有边界点挨着没，如果没有就他自己成为一个边界点，有，就得到队列长度，可能左右是两个队列
                int left=map.containsKey(i-1)?map.get(i-1):0;
                int right=map.containsKey(i+1)?map.get(i+1):0;
                int sum=left+right+1;//这是就是这个值在此时的队列长度
                res=Math.max(res,sum);
                //去更新队列边界点
                map.put(i-left,sum);
                map.put(i+right,sum);
            }else continue;
        }
        return  res;
    }
}
