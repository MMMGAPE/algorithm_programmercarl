package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifferenceInBST530 {
    List<Integer> traversalList = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        int min = Integer.MAX_VALUE;
        traversalList.clear();
        LDR(root);
        for (int i = 1; i < traversalList.size(); i++) {
            int minus = traversalList.get(i)-traversalList.get(i-1);
            if (minus<min) min = minus;
        }
        return min;
    }
    public void LDR(TreeNode node){
        if (node == null) return;
        LDR(node.left);
        traversalList.add(node.val);
        LDR(node.right);
    }
}
