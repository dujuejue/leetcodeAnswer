import java.util.Stack;

public class Test84 {
    public int largestRectangleArea(int[] height) {
        int len=height.length;
        int maxArea=0;
        //让stack保持一个增序的关系
        Stack<Integer> stack=new Stack<>();
        int i=0;
        while (i<=len){
            //这里让i=len是为了最后能用0这个最小值来让stack里面的能计算面积
            int h=(i==len?0:height[i]);
            //这里在stack为空还有当值大于等于堆的顶部那个值时，把当前值也推进去，再去判断下一个
            if (stack.isEmpty()||h>=height[stack.peek()]){
                stack.push(i);
                i++;
            }else {//当当前值小于等于顶部值，这时就把顶部值当做最大区域的最矮值，来计算面积
                int top=stack.pop();
                //x轴长度就是当前值-1表示这个值目前的距离再减去现在的堆顶部值的x，当堆为空时，只有一端的原因就是表示目前为止这个值是最低的，要整个数组的长度去乘以这个值
                maxArea=Math.max(maxArea,height[top]*(stack.isEmpty()?i:i-stack.peek()-1));
            }

        }
        return maxArea;
    }
}
