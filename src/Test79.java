public class Test79 {
    public boolean exist(char[][] board, String word) {
        char[] w=word.toCharArray();
        //每个点都可能是起点
        for (int y=0;y<board.length;y++){
            for (int x=0;x<board[y].length;x++){
                if (recursion(board,y,x,w,0))return true;
            }
        }
        return false;
    }

    private boolean recursion(char[][] board,int y,int x,char[] w,int i){
        //这里是匹配碗整个字符串
        if (i==w.length)return true;
        //这里是对于x，y的范围限制
        if (y<0||x<0||y==board.length||x==board[y].length)return false;
        //这里判断是否能匹配上
        if (board[y][x]!=w[i])return false;
        //这里是为了防止重复使用
        board[y][x]^=256;
        boolean a=recursion(board,y-1,x,w,i+1)||recursion(board,y+1,x,w,i+1)
                ||recursion(board,y,x+1,w,i+1)||recursion(board,y,x-1,w,i+1);
        board[y][x]^=256;
        return a;
    }
}
