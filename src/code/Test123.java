package code;public class Test123 {
    public int maxProfit(int[] prices) {
        int hold1 = Integer.MIN_VALUE, hold2 = Integer.MIN_VALUE;
        int release1 = 0, release2 = 0;//假设我们最开始只有0块钱
        for (int i : prices) {
            release1 = Math.max(release1, hold1 + i);     //第一次卖出赚的钱
            hold1 = Math.max(hold1, -i);          //第一次花出去的钱，hold在release后面是，下一个i与这个hold进行对比
            release2 = Math.max(release2, hold2 + i);     // 第二次卖出时就说最后赚的所有钱
            hold2 = Math.max(hold2, release1 - i);  // 第二次买入时，从第一次赚的钱里面扣
        }
        return release2; ///Since release1 is initiated as 0, so release2 will always higher than release1.
    }
}
