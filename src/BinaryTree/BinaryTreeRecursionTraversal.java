package BinaryTree;


import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRecursionTraversal{
    enum traversalType{
        priority,intermediate,rear
    }

    public List<Integer> traversal(TreeNode rootNode, traversalType traversalType){
        List<Integer> result = new ArrayList<>();
        switch (traversalType){
            case priority:
                preorder(rootNode,result);
            case intermediate:
                intermediate(rootNode,result);
            case rear:
                rear(rootNode,result);
        }

        return result;
    }

    public void preorder(TreeNode node, List<Integer> result){
        if (node == null){
            return;
        }else{
            result.add(node.val);
            preorder(node.left,result);
            preorder(node.right,result);
        }
    }

    public void intermediate(TreeNode node, List<Integer> result){
        if (node == null){
            return;
        }else {
            intermediate(node.left,result);
            result.add(node.val);
            intermediate(node.right,result);
        }
    }

    public void rear(TreeNode node, List<Integer> result){
        if (node == null){
            return;
        }else {
            rear(node.left,result);
            rear(node.right,result);
            result.add(node.val);
        }
    }




}
