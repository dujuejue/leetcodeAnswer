package code;import java.util.ArrayList;
import java.util.List;

public class Test120 {
    //这个方法是动态规划，从底向上，计算从底部到这个点的最短距离
    public int minimumTotal(List<List<Integer>> triangle) {
        //这里+1是因为在最底层时，假设有一个更低的底层
        int[] A=new int[triangle.size()+1];
        for (int i=triangle.size()-1;i>=0;i--){
            for (int j=0;j<triangle.get(i).size();j++){
                A[j]=Math.min(A[j],A[j+1])+triangle.get(i).get(j);
            }
        }
        return A[0];
    }
}
