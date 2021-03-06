package BinaryTree;

public class BalancedBinaryTree110 {
    public boolean isBalanced(TreeNode root) {
        if (root==null){
            return true;
        }else {
            return Math.abs(getDepth(root.left)-getDepth(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right);
        }

    }
    public int getDepth(TreeNode node){
        if (node == null) return 0;
        int leftDepth = getDepth(node.left);
        int rightDepth = getDepth(node.right);
        return Integer.max(leftDepth, rightDepth) + 1;
    }
}
