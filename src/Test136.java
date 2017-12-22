import java.util.Arrays;

public class Test136 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int twice=0,result=0;
        if (nums.length==1)return nums[0];
        if (nums[0]!=nums[1])return nums[0];
        if (nums[nums.length-1]!=nums[nums.length-2])return nums[nums.length-1];
        for (int i=1;i<nums.length-1;i++){
           if (nums[i]!=nums[i-1]&&nums[i]!=nums[i+1])result=nums[i];
        }
        return result;
    }
}
