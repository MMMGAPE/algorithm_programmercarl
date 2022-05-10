package BinaryTree;


import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRecursionTraversal<T>{
    enum traversalType{
        priority,intermediate,rear
    }

    public List<T> traversal(TreeNode<T> rootNode,traversalType traversalType){
        List<T> result = new ArrayList<>();
        switch (traversalType){
            case priority:
                preorder(rootNode,result);
            case intermediate:
        }

        return result;
    }

    public void preorder(TreeNode<T> node,List<T> result){
        if (node == null){
            return;
        }else{
            result.add(node.getValue());
            preorder(node.getLeftNode(),result);
            preorder(node.getRightNode(),result);
        }
    }

    public void intermediate(TreeNode<T> node,List<T> result){
        if (node == null){
            return;
        }else {
            intermediate(node.getLeftNode(),result);
            result.add(node.getValue());
            intermediate(node.getRightNode(),result);
        }
    }

    public void rear(TreeNode<T> node,List<T> result){
        if (node == null){
            return;
        }else {
            rear(node.getLeftNode(),result);
            rear(node.getRightNode(),result);
            result.add(node.getValue());
        }
    }




}
