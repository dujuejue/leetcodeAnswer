package code;import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test39 {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list,new ArrayList<>(),nums,target,0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> temp,int[] nums,int remain,int start) {
        if (remain<0)return;
        else if (remain==0)list.add(new ArrayList<>(temp));//这里再次生成一个是因为这个temp还要接着使用
        else {
            for (int i=start;i<nums.length;i++){
                if(i > start && nums[i] == nums[i-1]) continue;
                temp.add(nums[i]);
                backtrack(list,temp,nums,remain-nums[i],i+1);//这里start输入i是因为这是个升序数组，在i前面的值肯定都试过了
                temp.remove(temp.size()-1);
            }
        }
    }

}
