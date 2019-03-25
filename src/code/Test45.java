package code;import java.util.ArrayList;
import java.util.List;
//这是贪心算法
public class Test45 {
    public int jump(int[] nums) {
        int jumps=0,curEnd=0,curFarthest=0;
        for (int i=0;i<nums.length-1;i++){
            //记录目前最大值
            curFarthest=Math.max(curFarthest,i+nums[i]);
            //当达到目前最远点时启动跳跃，跳到最远处
            if (curEnd==i){
                jumps++;
                curEnd=curFarthest;
            }
        }
        return jumps;
    }
}
