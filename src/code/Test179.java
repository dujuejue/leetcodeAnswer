package code;

public class Test179 {
    public String largestNumber(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (!compare(nums[j], nums[j + 1])) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        String res = "";
        for (int t : nums) {
            res += String.valueOf(t);
        }
        if (res.charAt(0) == '0') {
            return "0";
        }
        return res;
    }

    // a + b > b + a ? true : false
    public boolean compare(int a, int b) {
        String str1 = String.valueOf(a) + String.valueOf(b);
        String str2 = String.valueOf(b) + String.valueOf(a);
        return str1.compareTo(str2) > 0 ? true : false;
    }
}
