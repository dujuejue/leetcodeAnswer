public class Test105 {
    //不更改两个遍历数组，只通过索引来进行递归
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return  helper(0,0,inorder.length-1,preorder,inorder);
    }

    private TreeNode helper(int prestart,int instart,int inend,int[] preorder, int[] inorder){
        //prestart的判断主要针对右子树，后一个条件针对左右子树
        if (prestart>preorder.length-1||instart>inend)return  null;
        //这是这次递归范围内的根节点
        TreeNode treeNode=new TreeNode(preorder[prestart]);
        //记录这次的根节点在中序遍历中的位置
        int index=0;
        for (int i=instart;i<=inend;i++){
            if (preorder[prestart]==inorder[i])index=i;
        }
        //中序根节点的左边就是他的左子树，右边就是右子树，前序中第一个值就是根节点，下一个值就是左子树的根节点，根节点和左子树后第一个值就是右子树的根节点
        treeNode.left=helper(prestart+1,instart,index-1,preorder,inorder);
        treeNode.right=helper(prestart+1+index-instart,index+1,inend,preorder,inorder);
        return treeNode;
    }

}
