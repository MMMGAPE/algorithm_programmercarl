package BinaryTree;

public class CountCompleteTreeNodes222 {
    public int countNodes(TreeNode root) {
        return getCount(root);
    }
    public int getCount(TreeNode node){
        if (node == null) return 0;
        int leftCount = getCount(node.left);
        int rightCount = getCount(node.right);
        if (node.left==null&&node.right==null)
            return 1;
        else if (node.left!=null&&node.right==null)
            return leftCount+1;
        else if (node.left==null)
            return rightCount+1;
        else
            return leftCount+rightCount+1;
    }
}
