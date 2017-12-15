public class Test62 {
    //用每个数组项数值表示能到达他的路径数
    public int uniquePaths(int m, int n) {
        int[][] map = new int[m][n];
        //因为只能向右或者向下，所以map[i][0]和map[0][i]都只有一条路径到达
        for (int i=0;i<m;i++){
            map[i][0]=1;
        }
        for (int i=0;i<n;i++){
            map[0][i]=1;
        }
        // 因为只能向下和向右，所以达到某个数组项的路径只有通过他左边和上边，所以把能达到他左边和上边的路径数加在一起就是他的路径数了
        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                map[i][j]=map[i-1][j]+map[i][j-1];
            }
        }
        return map[m - 1][n - 1];
    }

}
