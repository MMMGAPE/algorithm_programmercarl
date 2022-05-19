package BinaryTree;

public class InsertIntoBST701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode target = new TreeNode(val);
        if (root==null) return target;
        TreeNode node = root;
        while (true){
            if (node.val>val){
                if (node.left==null){
                    node.left = target;
                    break;
                } else
                    node = node.left;
            }else{
                if (node.right==null){
                    node.right = target;
                    break;
                }else
                    node = node.right;
            }
        }
        return root;
    }
}
