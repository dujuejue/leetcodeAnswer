import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>());
        if (nums.length==0||nums==null)return result;
        Arrays.sort(nums);
        subset(result,new ArrayList<>(),nums,0);
        return result;
    }

    private void subset( List<List<Integer>> result,List<Integer> temp,int[] nums,int start){
        if (start==nums.length)return;
        else {
            for (int i=start;i<nums.length;i++){
                if (i>start&&nums[i]==nums[i-1])continue;
                temp.add(nums[i]);
                result.add(new ArrayList<>(temp));
                subset(result,temp,nums,i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
}
