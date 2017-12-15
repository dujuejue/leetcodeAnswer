public class Test41 {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        //这就只是把num放进nums[num-1]中，遇见了不符合这条规则的第一个数就是那个第一个缺少的正数
        while (i<nums.length){
            if (nums[i]==i+1||nums[i]<=0||nums[i]>=nums.length)i++;
            else if (nums[nums[i]-1]!=nums[i])swap(nums,nums[i]-1,i);
            else i++;
        }
        i=0;
        while (i<nums.length&&nums[i]==i+1)i++;
        return i+1;
    }

    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
