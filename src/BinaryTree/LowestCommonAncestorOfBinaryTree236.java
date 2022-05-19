package BinaryTree;

public class LowestCommonAncestorOfBinaryTree236 {
    TreeNode result;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (result!=null) return result;
        else {
            TreeNode left = lowestCommonAncestor(root.left,p,q);
            if (result!=null&&(result!=p||result!=q)) return result;
            TreeNode right = lowestCommonAncestor(root.right,p,q);
            boolean nodeIsTarget = root == p||root ==q;
            if (left!=null&&right!=null){
                result = root;
                return result;
            } else if (left!=null^right!=null){
                if (nodeIsTarget){
                    result = root;
                    return result;
                }else{
                    return left==null?right:left;
                }
            } else {
                if (nodeIsTarget) return root;
                else return null;
            }
        }
    }
}
