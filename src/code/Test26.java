package code;public class Test26 {
    public int removeDuplicates(int[] nums){
        int j=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=nums[j])nums[++j]=nums[i];
        }
        return j;
    }
}