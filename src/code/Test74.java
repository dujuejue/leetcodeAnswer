package code;public class Test74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean have=false;
        if(matrix.length==0)return have;
        int m=matrix.length,n=matrix[0].length;
        int start=0,end=m*n-1;
        while(start<=end){
            int mid=(start+end)/2;
            int row=mid/n,col=mid%n;
            if(col<0){
                col=n-1;
            }
            int value=matrix[row][col];
            if(value==target){
                have=true;
                break;
            }
            if(value>target){
                end=mid-1;
            }else start=mid+1;


        }
        return have;
    }
}
