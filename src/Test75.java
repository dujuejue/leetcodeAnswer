public class Test75 {
    public void sortColors(int[] nums) {
        int start=0,end=nums.length-1;
        for(int i=0;i<nums.length;i++){
            //这里用while的原因就是判断交换后的是否还一样，还一样那接着换，因为位置start和end已经发生了变化，一直换到不一样或者到底
            while (nums[i]==2&&i<=end)swap(nums,i,end--);
            while (nums[i]==0&&i>=start)swap(nums,i,start++);
        }
    }

    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
