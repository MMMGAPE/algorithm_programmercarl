package BinaryTree.LevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
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
            Double sum = 0.0;
            for (Integer subNum:subList) {
                sum = sum+subNum;
            }
            result.add(sum/ (double) subList.size());
        }
        return result;
    }
}
