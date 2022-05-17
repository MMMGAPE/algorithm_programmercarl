package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree98 {
    List<Integer> treeValue = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        treeValue.clear();
        LDR(root);
        for (int i = 1; i < treeValue.size(); i++) {
            if (treeValue.get(i)<=treeValue.get(i-1)) return false;
        }
        return true;
    }
    public void LDR(TreeNode node) {
        if (node == null) {
            return;
        } else {
            LDR(node.left);
            LDR(node.right);
            treeValue.add(node.val);
        }
    }
}
