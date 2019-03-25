package code;import java.util.ArrayList;
import java.util.List;

public class Test78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>());
        rollback(result,new ArrayList<>(),nums,0);
        return result;
    }

    private void rollback(List<List<Integer>> result,List<Integer> temp,int[] nums,int start){
        if (start==nums.length)return;
        else {
            for (int i=start;i<nums.length;i++){
                temp.add(nums[i]);
                result.add(new ArrayList<>(temp));
                rollback(result,temp,nums,i+1);
                temp.remove(temp.size()-1);
            }
        }
    }

}
