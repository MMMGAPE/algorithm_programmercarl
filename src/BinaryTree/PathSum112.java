package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class PathSum112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        List<Integer> sumList = new ArrayList<>();
        getSumList(root,sumList,0);
        return sumList.contains(targetSum);
    }
    public void getSumList(TreeNode node, List<Integer> sumList, int perSum){
        if(node!=null){
            perSum = perSum+node.val;
            if (node.left!=null){
                getSumList(node.left,sumList,perSum);
            }
            if (node.right!=null){
                getSumList(node.right,sumList,perSum);
            }
            if (node.left==null&&node.right==null){
                sumList.add(perSum);
            }
        }
    }

}
