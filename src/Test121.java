public class Test121 {
    public int maxProfit(int[] prices) {
        if (prices==null||prices.length==0){
            return  0;
        }
        int max=Integer.MIN_VALUE;
        int minP=Integer.MAX_VALUE;
        for (int i=0;i<prices.length;i++){
            if (prices[i]<minP)minP=prices[i];
            max=Math.max(max,prices[i]-minP);
        }
        return max;
    }
}
