package BinaryTree;

public class InvertBinaryTree226 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode invertTree(TreeNode root) {
        if (root!=null){
            invert(root);
        }
        return root;
    }
    public void invert(TreeNode node){
        if (node.left!=null){
            invert(node.left);
        }
        if (node.right!=null){
            invert(node.right);
        }
        TreeNode medium = node.left;
        node.left = node.right;
        node.right = medium;
    }
}


