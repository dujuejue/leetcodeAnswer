package code;

import java.util.Arrays;

public class Test188 {
    public int maxProfit(int k, int[] prices) {
        if (k < 1 || prices.length < 2) {
            return 0;
        }

        if (k > prices.length / 2) {
            int sum = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] > prices[i - 1]) {
                    sum += prices[i] - prices[i - 1];
                }
            }
            return sum;
        } else {
            int[] buy = new int[k];
            int[] sell = new int[k];
            Arrays.fill(buy, Integer.MIN_VALUE);
            Arrays.fill(sell, 0);
            for (int price : prices) {
                for (int i = 0; i < k; i++) {
                    //这里相当于是用了两个动态规划来记录，buy[]是用来记录当前笔数最小成本的买入，
                    // sell[]就是记录当前笔数最大收益的
                    buy[i] = Math.max(buy[i], (i == 0 ? 0 : sell[i - 1]) - price);
                    sell[i] = Math.max(sell[i], buy[i] + price);
                }
            }
            return sell[k - 1];
        }
    }
}
