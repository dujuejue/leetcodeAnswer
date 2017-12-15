public class Test53 {
    public static int maxSubArray(int[] A) {
        int maxSoFar=A[0], maxEndingHere=A[0];
        for (int i=1;i<A.length;++i){
            //这里就是包含A[i]时的最大值
            maxEndingHere= Math.max(maxEndingHere+A[i],A[i]);
            //记录加上A[i]后值有没有变大
            maxSoFar=Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
