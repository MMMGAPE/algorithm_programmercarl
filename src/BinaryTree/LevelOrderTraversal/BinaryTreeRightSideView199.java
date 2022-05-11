package BinaryTree.LevelOrderTraversal;

import java.util.*;

public class BinaryTreeRightSideView199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        List<List<Integer>> levelOrderResult = new ArrayList<>();
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
                levelOrderResult.add(subList);
            }
        }
        for (List<Integer> subList:levelOrderResult) {
            result.add(subList.get(subList.size()-1));
        }
        return result;
    }
}
