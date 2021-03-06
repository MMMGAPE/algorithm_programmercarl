package BinaryTree;

public class MaximumDepthOfBinaryTree104 {
    public int maxDepth(TreeNode root) {
        if (root==null)return 0;
        else return treeMaxDepth(root,1);
    }
    public int treeMaxDepth(TreeNode root, int treeDepth){
        if (root==null||(root.left == null && root.right ==null)){
            return treeDepth;
        }else{
            treeDepth++;
            return Integer.max(treeMaxDepth(root.left,treeDepth),treeMaxDepth(root.right,treeDepth));
        }
    }
}
