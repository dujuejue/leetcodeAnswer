import java.util.ArrayList;
import java.util.List;

public class Test119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result=new ArrayList<>();
        if (rowIndex<1)return result;
        result.add(1);
        for (int i=1;i<rowIndex;i++){
            int temp=1;
            for (int j=1;j<i;j++){
                int pre=result.get(j);
                result.set(j,temp+pre);
                temp=pre;
            }
            result.add(1);
        }
        return result;
    }
}
