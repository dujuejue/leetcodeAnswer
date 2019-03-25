package code;public class Test81 {
    public boolean search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if (nums[mid]==target)return true;
            //先判断中间值在哪一块的有序区间，然后判断目标值是否在有序区间来判断start，end的移动,这里用或来进行两次判断是因为来避免重复值引起的问题
            if (nums[end]<nums[mid]||nums[start]<nums[mid]){
                if (target>=nums[start]&&target<nums[mid])end=mid-1;
                else start=mid+1;
            }else if (nums[end]>nums[mid]||nums[start]>nums[mid]){
                if (target<=nums[end]&&target>nums[mid])start=mid+1;
                else end=mid-1;
            }else end--;//这里else表明的情况是nums[start]=nums[mid]=nums[end]，说明有重复值，这里end直接自减来排除重复值
        }
        return false;
    }
}
