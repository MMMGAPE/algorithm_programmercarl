package BinaryTree.LevelOrderTraversal;

import java.util.*;

public class BinaryTreeLevelOrderTraversal_II107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root==null){
            return result;
        }else {
            queue.add(root);
            while(!queue.isEmpty()){
                List<Integer> subList = new ArrayList<>();
                int queueSize = queue.size();
                for (int i = 0; i < queueSize; i++) {
                    TreeNode queueTop = queue.poll();
                    if (queueTop.left!=null) queue.add(queueTop.left);
                    if (queueTop.right!=null) queue.add(queueTop.right);
                    subList.add(queueTop.val);
                }
                result.add(subList);
            }
        }
        Collections.reverse(result);
        return result;
    }
}
