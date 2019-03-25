package code;import java.util.ArrayList;
import java.util.List;

public class Test118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        if (numRows<1)return  result;
        result.add(new ArrayList<>());
        result.get(0).add(1);
        for (int i=1;i<numRows;i++){
            List<Integer> cur=new ArrayList<>();
            cur.add(1);
            List<Integer> pre=result.get(i-1);
            for (int j=1;j<i;j++){
                cur.add(pre.get(j)+pre.get(j-1));
            }
            cur.add(1);
            result.add(cur);
        }
        return result;
    }
}
