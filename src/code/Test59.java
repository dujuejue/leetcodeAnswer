package code;public class Test59 {
    public int[][] generateMatrix(int n) {
        int[][] result=new int[n][n];
        if (n==0){
            return result;
        }
        int rowBegain=0,rowEnd=n-1;
        int colBegain=0,colEnd=n-1;
        int num=1;
        while (rowBegain<=rowEnd&&colBegain<=colEnd){
            //toRight
            for (int i=colBegain;i<=colEnd;i++){
                result[rowBegain][i]=num++;
            }
            rowBegain++;

            //toDown
            for (int i=rowBegain;i<=rowEnd;i++){
                result[i][colEnd]=num++;
            }
            colEnd--;

            //toLeft
            if (rowBegain<=rowEnd){
                for (int i=colEnd;i>=colBegain;i--){
                    result[rowEnd][i]=num++;
                }
                rowEnd--;
            }

            //toUp
            if (colBegain<=colEnd){
                for (int i=rowEnd;i>=rowBegain;i--){
                    result[i][colBegain]=num++;
                }
                colBegain++;
            }
        }
        return result;
    }
}
