package code;

public class Test189 {
    public void rotate(int[] nums, int k) {
        int a;
        int length = nums.length;
        for (int i = 0; i < k; i++) {
            a = nums[length - 1];
            for (int j = length - 2; j >= 0; j--) {
                nums[j + 1] = nums[j];
            }
            nums[0] = a;
        }
    }
}
