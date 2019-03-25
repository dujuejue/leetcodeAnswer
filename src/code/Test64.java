package code;public class Test64 {
    public int minPathSum(int[][] grid) {
        int width=grid[0].length;
        int[][] sumMin=new int[grid.length][width];
        sumMin[0][0]=grid[0][0];
        for (int i=1;i<width;i++){
            sumMin[0][i]=grid[0][i]+sumMin[0][i-1];
        }
        for (int i=1;i<grid.length;i++){
            sumMin[i][0]=grid[i][0]+sumMin[i-1][0];
        }

        for (int i=1;i<grid.length;i++){
            for (int j=1;j<width;j++){
                sumMin[i][j]=Math.min(sumMin[i-1][j],sumMin[i][j-1])+grid[i][j];
            }
        }

        return sumMin[grid.length-1][width-1];

    }
}
