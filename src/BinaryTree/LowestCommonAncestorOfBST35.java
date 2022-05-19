package BinaryTree;


public class LowestCommonAncestorOfBST35 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p||root==q||root==null){
            return root;
        }
        if (p.val<root.val&&q.val>root.val||q.val<root.val&&p.val>root.val){
            return root;
        }
        if (p.val<root.val&&q.val<root.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        else if (p.val>root.val&&q.val>root.val)
            return lowestCommonAncestor(root.right,p,q);
        else return null;
    }
}
