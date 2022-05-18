package BinaryTree;


import java.util.ArrayList;
import java.util.List;

public class FindModeInBinarySearchTree501 {
    int base ,counter,maxCounter;
    List<Integer> result = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        result.clear();
        LDR(root);
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }

    public void LDR(TreeNode node){
        if (node == null) return;
        LDR(node.left);
        updateCount(node.val);
        LDR(node.right);
    }

    public void updateCount(int val){
        if (val == base){
            ++counter;
        }else {
            counter = 1;
            base = val;
        }
        if (counter==maxCounter){
            result.add(val);
        }
        if (counter>maxCounter){
            result.clear();
            result.add(val);
            maxCounter = counter;
        }
    }
}
