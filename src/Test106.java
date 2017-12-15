public class Test106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(postorder.length-1,0,inorder.length-1,inorder,postorder);
    }

    private TreeNode helper(int poststart,int instart,int inend,int[] inorder, int[] postorder){
        if (poststart<0||instart>inend)return null;
        TreeNode root=new TreeNode(postorder[poststart]);
        int index=0;
        for (int i=instart;i<=inend;i++){
            if (inorder[i]==postorder[poststart])index=i;
        }
        root.right=helper(poststart-1,index+1,inend,inorder,postorder);
        root.left=helper(poststart-inend+index-1,instart,index-1,inorder,postorder);
        return root;
    }
}
