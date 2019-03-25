package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//这个在数据量很大时会出现运行时间很长的问题
public class Test18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>>result=new ArrayList<>();
        Arrays.sort(nums);
        backTarce(result,new ArrayList<>(),0,4,target,nums);
        return result;
    }

    private void backTarce(List<List<Integer>>result,List<Integer>temp,int start,int end,int target,int[] nums){
        if (start>nums.length||end<0)return;
        else if (target==0&&end==0)result.add(new ArrayList<>(temp));
        else {
            for (int i=start;i<nums.length;i++){
                if (i>start&&nums[i-1]==nums[i])continue;
                temp.add(nums[i]);
                backTarce(result,temp,i+1,end-1,target-nums[i],nums);
                temp.remove(temp.size()-1);
            }
        }
    }
}
