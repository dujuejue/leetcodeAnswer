package code;public class Test63 {
    //这个分治是把问题分成一行一行的，因为是只有向下和向右的，得出最后一行就得出到达终点的路径数
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int width=obstacleGrid[0].length;
        //这里是把每一行的路径数数据向下传递，然后在处理那一行时再进行数据的修改
        int[]dp=new int[width];
        dp[0]=1;
        for (int[] row:obstacleGrid){
            for (int i=0;i<width;i++){
                if (row[i]==1){
                    dp[i]=0;
                }else if (i>0){
                    dp[i]+=dp[i-1];
                }
            }
        }
        return dp[width-1];
    }
}
