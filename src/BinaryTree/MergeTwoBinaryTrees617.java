package BinaryTree;

public class MergeTwoBinaryTrees617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1==null && root2==null){
            return null;
        }else {
            if (root1==null){
                TreeNode temp = root2;
                root2 = null;
                return temp;
            }else if (root2==null){
                return root1;
            }else{
                root1.val = root1.val+ root2.val;
            }
            if (root2.left!=null){
                root1.left = mergeTrees(root1.left,root2.left);
            }
            if (root2.right!=null){
                root1.right = mergeTrees(root1.right,root2.right);
            }
            return root1;
        }
    }
}
