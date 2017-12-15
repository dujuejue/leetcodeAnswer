public class Test42 {
    public int trap(int[] nums){
        int a=0,b=nums.length-1;//因为存水需要有边，所以从两头找边
        int leftmax=0,rightmax=0;
        int max=0;
        while (a<=b){
            leftmax=Math.max(leftmax,nums[a]);
            rightmax=Math.max(rightmax,nums[b]);
            //这里是以最高点为界线，分左右，当一边先到达最高点就不会再移动
            if (leftmax<rightmax){
                max+=(leftmax-nums[a]);
                a++;
            }else {
                max+=(rightmax-nums[b]);
                b--;
            }
        }
        return max;
    }
}
