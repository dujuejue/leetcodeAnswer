package code;import java.util.ArrayList;
import java.util.List;

public class Test54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>  res=new ArrayList<>();
        int rowBegain=0,rowEnd=matrix.length-1;
        int colBegain=0,colEnd=matrix[0].length-1;
        while (rowBegain<=rowEnd&&colBegain<=colEnd){
            //right
            for (int i=colBegain;i<=colEnd;i++){
                res.add(matrix[rowBegain][i]);
            }
            rowBegain++;

            //down
            for (int i=rowBegain;i<=rowEnd;i++){
                res.add(matrix[i][colEnd]);
            }
            colEnd--;

            //left
            if (rowBegain<=rowEnd){
                for (int i=colEnd;i>=colBegain;i--){
                    res.add(matrix[rowEnd][i]);
                }
                rowEnd--;

            }

            //up
            if (colBegain<=colEnd){
                for (int i=rowEnd;i>=rowBegain;i--){
                    res.add(matrix[i][colBegain]);
                }
                colBegain++;
            }

        }


        return res;
    }
}
