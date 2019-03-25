package code;public class Test88 {
    public void merge(int A[], int m, int B[], int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while (i>=0&&j>=0){
            if (A[i]>B[j])
                A[k--]=A[i--];
            else
                A[k--]=B[j--];
        }
        //这是因为是往A里面插入，出现这种情况的就是B里面有比A小的，A排序完了，B还没插入完
        while (j>=0)
            A[k--]=B[j--];
    }
}
