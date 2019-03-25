package code;import java.util.ArrayList;
import java.util.List;

public class Test94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if (root==null)return result;
        inorder(result,root);
        return  result;
    }

    private void inorder(List<Integer> result,TreeNode root){
        if (root.left!=null)
            inorder(result,root.left);
        result.add(root.val);
        if (root.right!=null)
            inorder(result,root.right);
    }
}
