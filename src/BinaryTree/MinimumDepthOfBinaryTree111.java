package BinaryTree;

public class MinimumDepthOfBinaryTree111 {
    public int minDepth(TreeNodeSample root) {
        return getMinDepth(root);
    }
    public int getMinDepth(TreeNodeSample node){
        if (node == null) {
            return 0;
        }
        int leftDepth = minDepth(node.left);
        int rightDepth = minDepth(node.right);
        if (node.left == null) {
            return rightDepth + 1;
        }
        if (node.right == null) {
            return leftDepth + 1;
        }
        // 左右结点都不为null
        return Math.min(leftDepth, rightDepth) + 1;
    }
}
